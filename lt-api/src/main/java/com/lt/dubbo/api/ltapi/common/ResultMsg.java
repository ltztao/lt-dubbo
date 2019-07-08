package com.lt.dubbo.api.ltapi.common;
import java.io.Serializable;

public class ResultMsg<T> implements Serializable {

    private int code;
    private T data;
    private String msg;

    public final static ResultMsg SUCCESS = new ResultMsg(0,"success");

    public final static ResultMsg FAILURE = new ResultMsg(-1,"error");

    public static ResultMsg ERROR(String msg) {
        return new ResultMsg(-1, msg);
    }

    public static ResultMsg SUCCESS(Object obj){
        return new ResultMsg<Object>(0, obj, "success");
    }

    public ResultMsg() {
    }

    public ResultMsg(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResultMsg(int code, T data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
