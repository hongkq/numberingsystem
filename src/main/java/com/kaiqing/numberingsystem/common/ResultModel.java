package com.kaiqing.numberingsystem.common;


import java.util.Map;

/**
 * 创建返回前端的model
 */
public class ResultModel {
    private int errocde; //返回码
    private String errmsg; //返回消息
    private Map<String,Object> data; //数据源

    public int getErrocde() {
        return errocde;
    }

    public void setErrocde(int errocde) {
        this.errocde = errocde;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }
}
