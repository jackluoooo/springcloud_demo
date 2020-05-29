package com.luo.feignclient.service;

import com.luo.feignclient.client.NacosClientFeign;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

/**
 * @description:
 * @author: ljx
 * @create: 2020/05/27 16:46
 */
@Service
public class SayHiService {
    @Resource
    NacosClientFeign nacosClientFeign;

    public String sayHi(String name){
        return nacosClientFeign.sayHi(name);
    }
}