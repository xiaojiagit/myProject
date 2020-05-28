package org.mySelfBank.service;

import com.alibaba.fastjson.JSONObject;
import org.mySelfBank.entity.vo.Message;

public interface LoginService {

    Message Login(JSONObject jsonObject);

}
