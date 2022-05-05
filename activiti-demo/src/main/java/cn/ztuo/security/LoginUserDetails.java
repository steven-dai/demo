package cn.ztuo.security;

import cn.ztuo.mbg.model.SysRole;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 登录用户信息
 * 
 * @author ztuo
 */
@Data
public class LoginUserDetails implements UserDetails {

    private static final long serialVersionUID = 1L;

    private JwtTokenUser tokenUser;

    public LoginUserDetails(JwtTokenUser tokenUser) {
        this.tokenUser = tokenUser;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
        List<SysRole> roles = tokenUser.getRoles();
        for (SysRole role : roles) {
            authorities.add(new SimpleGrantedAuthority(role.getRoleCode()));
        }
        return authorities;
    }

    @Override
    public String getPassword() {
        return tokenUser.getPassword();
    }

    @Override
    public String getUsername() {
        return tokenUser.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return tokenUser.isValidStatus();
    }
}