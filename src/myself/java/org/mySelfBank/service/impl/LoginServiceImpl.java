package org.mySelfBank.service.impl;

import com.alibaba.fastjson.JSONObject;
import org.mySelfBank.dao.BankUserMapper;
import org.mySelfBank.entity.BankUser;
import org.mySelfBank.entity.BankUserExample;
import org.mySelfBank.entity.vo.Message;
import org.mySelfBank.service.LoginService;
import org.mySelfBank.util.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private BankUserMapper bankUserMapper;

    @Override
    public Message Login(JSONObject json){
        System.out.println("进入到impl了");
        Message message=new Message();
        String loginName=json.getString("loginName");
        String passWord=json.getString("passWord");
        String verificationCode=json.getString("verificationCode");

        BankUserExample bankUserExample=new BankUserExample();
        bankUserExample.createCriteria().andLoginNameEqualTo(loginName).andPassWordEqualTo(MD5.getMd5(passWord))
                .andDeleteFlagEqualTo("0");
        List<BankUser> bankUserList = bankUserMapper.selectByExample(bankUserExample);
        BankUser bankUser=null;
        if(bankUserList.size()>0){
            bankUser=bankUserList.get(0);
        }else{
            message.setMessage("账号密码错误");
            message.setSuccess(false);
        }
        return  message;
    }
}
