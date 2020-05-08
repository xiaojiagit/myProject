package org.mySelfBank.entity.vo;


import java.util.HashMap;
import java.util.Map;

public class Message {

    //返回体提示
    private String message = new String();
    //是否成功  true:成功  false:失败
    private Boolean success =false;
    //返回参数
    private Object obj ;
    //返回参数
    private Object data ;
    //返回参数
    private Map<String,Object> result = new HashMap<>();
    //返回状态  1：成功  0：失败
    private Integer status = 0;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Map<String, Object> getResult() {
        return result;
    }

    public void setResult(Map<String, Object> result) {
        this.result = result;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

	@Override
	public String toString() {
		return "Message [message=" + message + ", success=" + success + ", obj=" + obj + ", data=" + data + ", result="
				+ result + ", status=" + status + "]";
	}
    
    
}
