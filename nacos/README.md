# Nacos

## 1 启动服务端
https://nacos.io/zh-cn/docs/quick-start.html

## 2 配置客户端
### 2.1 添加依赖
```xml
<dependency>
    <groupId>com.alibaba.boot</groupId>
    <artifactId>nacos-config-spring-boot-starter</artifactId>
    <version>0.2.7</version>
</dependency>
```
### 2.2 配置文件
```properties
# nacos配置中心
nacos.config.bootstrap.enable=true
# 主配置 命名空间
nacos.config.namespace=@nacos.namespace@
# 主配置 服务器地址
nacos.config.server-addr=127.0.0.1:8848
# 主配置 data-id
nacos.config.data-id=${spring.application.name}
# 主配置 group-id
nacos.config.group=spring
# 主配置 配置文件类型
nacos.config.type=yaml
# 主配置 开启自动刷新
nacos.config.auto-refresh=true
```
### 2.3 注入配置
```
@NacosValue(value = "${name:ztuo}",autoRefreshed = true)
```

## 3 服务注册发现
### 3.1 添加依赖
```xml
<dependency>
    <groupId>com.alibaba.boot</groupId>
    <artifactId>nacos-discovery-spring-boot-starter</artifactId>
    <version>0.2.7</version>
</dependency>
```
### 3.2 配置Nacos server
```properties
# nacos 注册中心
nacos.discovery.auto-register=true
nacos.discovery.namespace=@nacos.namespace@
nacos.discovery.server-addr=127.0.0.1:8848
nacos.discovery.register.service-name=${spring.application.name}
nacos.discovery.register.group-name=spring
```
### 3.3 获取服务
@NacosInjected 注入Nacos的NamingService
```java
@NacosInjected
private NamingService namingService;
```