package cn.ztuo.security;

import io.jsonwebtoken.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * JwtToken生成的工具类
 * </p>
 * <p>
 * JWT token的格式：header.payload.signature
 * </p>
 * <p>
 * header的格式（算法、token的类型）： {"alg": "HS512","typ": "JWT"}
 * </p>
 * <p>
 * payload的格式（用户名、创建时间、生成时间）：{"sub":"wang","created":1489079981393,"exp":1489684781}
 * </p>
 * <p>
 * signature的生成算法：HMACSHA512(base64UrlEncode(header) + "."
 * +base64UrlEncode(payload),secret)
 * </p>
 * 
 * @author ztuo
 */
@Slf4j
@Component
public class JwtTokenUtil {

    private static final String CLAIM_KEY_USERNAME = "sub";

    private static final String CLAIM_KEY_CREATED = "created";

    public static final String TOKEN_HEADER = "Authorization";

    public static final String TOKEN_HEAD = "Bearer";

    public static final String SECRET = "sddffr342547y6hbdff";

    public static final Long EXPIRATION = 604800L;

    /**
     * 根据用户信息生成token
     */
    public String generateToken(UserDetails userDetails) {
        Map<String, Object> claims = new HashMap<>(2);
        claims.put(CLAIM_KEY_USERNAME, userDetails.getUsername());
        claims.put(CLAIM_KEY_CREATED, new Date());
        return generateToken(claims);
    }

    /**
     * 从token中获取登录用户名
     */
    public String getUserNameFromToken(String token) {
        Claims claims = getClaimsFromToken(token);
        return claims.getSubject();
    }

    /**
     * 验证token是否还有效
     *
     * @param token       客户端传入的token
     * @param userDetails 从数据库中查询出来的用户信息
     */
    //public boolean validateToken(String token, UserDetails userDetails) {
    //    String username = getUserNameFromToken(token);
    //    return username.equals(userDetails.getUsername()) && !isTokenExpired(token);
    //}

    /**
     * 验证token是否还有效
     * @param token       客户端传入的token
     */
    public boolean validateToken(String token) {
        try {
            Jwts.parser().setSigningKey(SECRET).parseClaimsJws(token);
            return true;
        } catch (Exception ex) {
            log.error("Invalid JWT signature - {}", ex.getMessage());
        }
        return false;
    }

    /**
     * 当原来的token没过期是可以刷新
     *
     * @param oldToken 带tokenHead的token
     */
    public String refreshHeadToken(String oldToken) {
        String token = oldToken.substring(TOKEN_HEAD.length());
        if (canRefresh(token)) {
            Claims claims = getClaimsFromToken(token);
            claims.put(CLAIM_KEY_CREATED, new Date());
            return generateToken(claims);
        }
        return null;
    }

    /**
     * 判断token是否已经失效
     */
    private boolean isTokenExpired(String token) {
        Date expiredDate = getExpiredDateFromToken(token);
        return expiredDate.before(new Date());
    }

    /**
     * 从token中获取过期时间
     */
    private Date getExpiredDateFromToken(String token) {
        Claims claims = getClaimsFromToken(token);
        return claims.getExpiration();
    }

    /**
     * 判断token是否可以被刷新
     */
    private boolean canRefresh(String token) {
        return !isTokenExpired(token);
    }

    /**
     * 根据负责生成JWT的token
     */
    private String generateToken(Map<String, Object> claims) {
        return Jwts.builder().setClaims(claims).setExpiration(generateExpirationDate())
                .signWith(SignatureAlgorithm.HS512, SECRET).compact();
    }

    /**
     * 从token中获取JWT中的负载
     */
    private Claims getClaimsFromToken(String token) {
        return  Jwts.parser().setSigningKey(SECRET).parseClaimsJws(token).getBody();
    }

    /**
     * 生成token的过期时间
     */
    private Date generateExpirationDate() {
        return new Date(System.currentTimeMillis() + EXPIRATION * 1000);
    }

}
