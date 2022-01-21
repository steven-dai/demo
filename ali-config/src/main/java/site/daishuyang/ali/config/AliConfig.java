package site.daishuyang.ali.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import site.daishuyang.ali.bean.AliInfo;

import java.util.List;

/**
 * @author steven
 * @date 2022-01-19 17:36
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "config")
public class AliConfig {

    /**
     * 阿里云配置
     * @author steven
     * @date 2022/1/19 19:08
     */
    private List<AliInfo> aliInfos;

    /**
     * Des密钥
     * @author steven
     * @date 2022/1/19 19:07
     */
    public static final String DES_KEY = "key";
}


