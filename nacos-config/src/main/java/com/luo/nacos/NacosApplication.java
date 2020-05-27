package com.luo.nacos;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.concurrent.TimeUnit;


@SpringBootApplication
public class NacosApplication {
//    @NacosInjected
//    private NamingService namingService;
//
//    @Value("${server.port}")
//    private int serverPort;
//
//    @Value("${spring.application.name}")
//    private String applicationName;
//
//    @PostConstruct
//    public void registerInstance() throws NacosException {
//        namingService.registerInstance(applicationName, "127.0.0.1", serverPort);
//    }

    @Value(value = "${hengboy.name:}")
    private String userName;
    /**
     * 读取hengboy.age配置信息
     */
    @Value(value = "${hengboy.age:}")
    private String userAge;

    public static void main(String[] args) throws Exception{
        Logger logger = LoggerFactory.getLogger(NacosApplication.class);
        ConfigurableApplicationContext applicationContext = SpringApplication.run(NacosApplication.class, args);
//        while (true) {
//            //当动态配置刷新时，会更新到 Enviroment中，因此这里每隔一秒中从Enviroment中获取配置
//            String userName = applicationContext.getEnvironment().getProperty("hengboy.name");
//            String userAge = applicationContext.getEnvironment().getProperty("hengboy.age");
//            logger.info("配置信息，名称：{}，年龄：{}", userName, userAge);
//            TimeUnit.SECONDS.sleep(1);
//        }
    }

}
