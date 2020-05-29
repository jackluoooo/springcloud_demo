package com.luo.feignclient.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "service-provider")
public interface NacosClientFeign {
    @RequestMapping(value = "/echo/{string}", method = RequestMethod.GET)
    String sayHi(@PathVariable String string);
}
