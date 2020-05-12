package org.mySelfBank.controller;

import com.alibaba.fastjson.JSONObject;
import org.mySelfBank.entity.BankUser;
import org.mySelfBank.entity.vo.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/loginC")
public class LoginController {

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
        BankUser bankUser=new BankUser();


        return message;
    }
}
