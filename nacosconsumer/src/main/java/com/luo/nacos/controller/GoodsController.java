package com.luo.nacos.controller;

import com.luo.nacos.service.GoodsServcie;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodsController {

    @Reference
    GoodsServcie goodsServcie;

    @RequestMapping("getGood")
    public Object getGoods(){
      return   goodsServcie.getGoods(1);
    }
}
