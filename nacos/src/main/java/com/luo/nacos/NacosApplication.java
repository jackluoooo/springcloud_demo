package com.luo.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
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

    public static void main(String[] args) {
        SpringApplication.run(NacosApplication.class, args);
    }

}
