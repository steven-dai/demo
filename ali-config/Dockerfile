# 添加 openjdk 8 镜像来源
FROM openjdk:8-jre

# 添加 Spring Boot 包
ADD ./ali-config-1.0.jar app.jar

# 执行启动命令
ENTRYPOINT ["java","-jar","/app.jar"]