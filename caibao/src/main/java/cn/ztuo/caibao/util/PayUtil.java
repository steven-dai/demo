package cn.ztuo.caibao.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;

import java.security.MessageDigest;
import java.util.*;

/**
 * @author steven
 * @date 2022-06-11 14:43
 */
@Slf4j
public class PayUtil {

    /**
     * 使用md5算法进行加密
     * @param target 要加密的字符串
     * @param charset 编码（请设置为UTF-8)
     * @return 加密后的字符串
     */
    public static String encryptWithMD5(String target,String charset) {
        String md5Str = null;
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            md5.reset();
            byte[] bytes = md5.digest(charset==null?target.getBytes():target.getBytes(charset));
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : bytes) {
                int bt = b & 0xff;
                if (bt < 16) {
                    stringBuffer.append(0);
                }
                stringBuffer.append(Integer.toHexString(bt));
            }
            md5Str = stringBuffer.toString();
        } catch (Exception ex) {
            log.info("encrypt error,target:" + target, ex);
        }
        return md5Str;
    }

    /**
     * 对params中的参数进行排序后生成签名串
     * @param params 参与签名的参数map
     * @param key 签名要用到的加密串
     * @return
     */
    public static String MD5Sign(Map<String,Object> params, String key) {
        StringBuffer sb = new StringBuffer();
        //排序
        List<Map.Entry<String, Object>> infoIds = new ArrayList<>(params.entrySet());
        Collections.sort(infoIds, (o1, o2) -> (o1.getKey()).compareTo(o2.getKey()));
        //对参数数组进行按key升序排列,然后拼接，最后调用5签名方法
        int size  = infoIds.size();
        for(int i = 0; i < size; i++) {
            //不为空，为空的不参与签名
            if(!StringUtils.isEmpty(infoIds.get(i).getValue())) {
                sb.append(infoIds.get(i).getKey() + "=" + infoIds.get(i).getValue() + "&");
            }
        }
        String newStrTemp = sb +"key="+key.trim();
        //获取sign_method
        String sign = encryptWithMD5(newStrTemp,"UTF-8");
        return sign;
    }

    public static void main(String[] args) {
        Map<String,Object> params = new HashMap<>();
        params.put("barcode","123123123123");
        params.put("local_order_no","localorderno123123123123");
        params.put("app","zyptestapp");
        params.put("operator_id","axgdfdafd34124");
        params.put("amount","100");
        params.put("un_discount_amount","");
        params.put("timestamp","1460512556270");
        params.put("subject","这是一笔支付订单");
        params.put("goods_list","");
        String sign = MD5Sign(params,"thisistestkey");
        System.out.println(sign);
    }
}
