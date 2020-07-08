package org.kzMall.payment.pay.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject; 

@RestController
public class TestController {
	
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public JSONObject  test() {
    	JSONObject result=new  JSONObject(true);
    	result.put("message", "Hello world new");
        System.out.println("测试！");
        System.out.println("测试！");


    	return  result;
    }   
}
