package com.register.demo.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.register.demo.models.UserBean;
import java.lang.reflect.Method;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.register.demo.repositories.UserRepository;


@Controller
public class RegController {

  @Autowired
  private UserRepository userRepository;

  //注册接口
  @PostMapping(path = "/register")
  //由于请求都是放在body里，所以需要定义一个JSONObject类型的变量去接收请求
  public @ResponseBody JSONObject reg(@RequestBody JSONObject body){
    int id = body.getIntValue("id");
    String name = body.getString("name");
    String email = body.getString("email");
    int phone = body.getIntValue("phone");
    String pwd = body.getString("pwd");

    //实例化UserBean类，调用成员变量
    UserBean n = new UserBean();
    n.setId(id);
    n.setName(name);
    n.setEmail(email);
    n.setPhone(phone);
    n.setPwd(pwd);

    JSONObject response_msg = new JSONObject();
    response_msg.put("Status code", 200);
    response_msg.put("message", "注册成功");

    return response_msg;

    /***
     *     JSONObject reg_json = body.getJSONObject("n");
     *     UserBean n = (UserBean)JSONObject.toJavaObject(reg_json, UserBean.class);
     *     userRepository.save(n);
     */



  }
//解析请求
//JSONArray values = body.getJSONArray("body");




}

