package com.example.mmentity.common;

import lombok.Getter;

import java.io.Serializable;

/**
 * @author: xu gang feng
 * @create: 2019-11-05 16:20
 */
@Getter
public class R<T> implements Serializable {

    private static final long serialVersionUID = 8345292607427170179L;
    private static final int OK = 0;
    private static final int FAIL = 1;
    private static final int UNAUTHORIZED = 2;

    private T data;
    private int status = OK;
    private String msg = "";

    public static R isOk(){
        return new R();
    }

    public static R isFail(){
        return new R().status(FAIL);
    }

    public static R isFail(Throwable e){
        return isFail().msg(e);
    }

    public R msg(Throwable e){
        this.setMsg(e.toString());
        return this;
    }

    public R data(T data){
        this.setData(data);
        return this;
    }

    public R status(int status){
        this.setStatus(status);
        return this;
    }

    public R (){

    }

    public void setData(T data) {
        this.data = data;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
