package com.qingcheng.controller;

import com.qingcheng.entity.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class BaseExceptionHandler {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result erro(Exception e){
        System.out.println("调用了公共异常处理类");
        e.printStackTrace();
        return new Result(1,e.getMessage());
    }
}
