package com.aib.exception;

import com.aib.bean.BaseBean;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class Exception {
    @ExceptionHandler(value = RuntimeException.class)
    private BaseBean<Object> handleException() {
        BaseBean<Object> baseBean = new BaseBean<>();
        baseBean.setMsg("服务器异常");
        baseBean.setCode(-1);
        return baseBean;
    }
}
