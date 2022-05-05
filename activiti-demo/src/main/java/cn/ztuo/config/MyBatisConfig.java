package cn.ztuo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Mybatis 配置类
 * @author steven
 * @date 2022/3/25 14:21
 */
@Configuration
@EnableTransactionManagement
@MapperScan({ "cn.ztuo.mbg.mapper", "cn.ztuo.dao" })
public class MyBatisConfig {
}
