package com.example.demo01.controller;

import com.example.demo01.domain.ServerSettings;
import com.example.demo01.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@RestController
public class GetController {

    private Map<String,Object> params = new HashMap<>();

//    @RequestMapping(path = "/{city_id}/{user_id}", method = RequestMethod.GET)
//    public Object findUser(@PathVariable("city_id") String cityId, @PathVariable("user_id") String userId){
//        params.clear();
//
//        params.put("cityId", cityId);
//        params.put("userId", userId);
//
//        return params;
//    }

    @GetMapping("/api/{city_id}/{user_id}")
    public Object findUser1(@PathVariable("city_id") String cityId, @PathVariable("user_id") String userId){
        params.clear();

        params.put("cityId", cityId);
        params.put("userId", userId);

        return params;
    }

    @GetMapping("/get/page")
    public Object pageUser(@RequestParam(defaultValue = "0",name = "page",required = true) int from,
                           int size){
         params.clear();
         params.put("from", from);
         params.put("size", size);
         System.out.println("热加载");
         //System.out.println("热加载2");
         //System.out.println("热加载4");
         return params;
    }


    @RequestMapping(path = "/save/user")
    public Object saveUser(@RequestBody User user){

        params.clear();
        params.put("user", user);

        return params;
    }

    @Autowired
    private ServerSettings serverSettings;

    @RequestMapping(path = "/test_pro")
    public Object testPro(){

        return serverSettings;
    }

    @GetMapping("/api/login")
    public Object login(){

        params.clear();
        params.put("uername", "filter");

        return params;
    }

    @RequestMapping("/api2/test/account")
    public Object account(){

        System.out.println("controller ....");
        params.put("account","123");
        return params;
    }

}
