package cn.ztuo.security;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * 用于配置不需要保护的资源路径
 *
 * @author ztuo
 * @since 2019/11/19.
 */
@Data
@Component
@ConfigurationProperties(prefix = "ignored")
public class IgnoreUrlsConfig {

    private List<String> urls = new ArrayList<>();
}
