package org.mySelfBank.controller;

import com.alibaba.fastjson.JSONObject;
import org.mySelfBank.dao.BankUserMapper;
import org.mySelfBank.entity.BankUser;
import org.mySelfBank.entity.BankUserExample;
import org.mySelfBank.entity.vo.Message;
import org.mySelfBank.service.LoginService;
import org.mySelfBank.util.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/loginC")
public class LoginController {

    @Autowired
    private LoginService loginService;

    /**
    * @Title 登录接口
    * @Author jiaruiqiang
    * @Description //TODO
    * @Date 16:43 2020/5/8
    * @Param
    * @return
    **/
    @RequestMapping(value = "/Login", method = RequestMethod.POST)
    @ResponseBody
    public Message Login(@RequestBody JSONObject json, HttpServletRequest request){
        Message message=new Message();
        System.out.println("进入到后台了");
        message=loginService.Login(json);

        return message;
    }
}
