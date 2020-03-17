package com.bd10.knowledgesystems.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 王青
 * @version V1.0
 * @Project: 处理全局异常
 * @Package com.bd10.knowledgesystems.util
 * @date 2020/2/25 15:36 星期二
 */
@ControllerAdvice
    public class GlobalExceptionHandler {

    private static  final Logger logger= LoggerFactory.getLogger(GlobalExceptionHandler.class);
    /**
     * 处理自定义的异常
     * @param request
     * @param e
     * @return
     */
    @ExceptionHandler(value = HDKSException.class)
    @ResponseBody
    public ResultBody  bizExceptionDeal(HttpServletRequest  request,HDKSException e){
        System.out.println("发生业务异常");
        return ResultBody.error(e.getErrorCode(),e.getErrorMsg());
    }

    /**
     *处理空指针异常
     * @param request
     * @param e
     * @return
     */
    @ExceptionHandler(value = NullPointerException.class)
    @ResponseBody
    public  ResultBody  NPExceptionDeal(HttpServletRequest request,NullPointerException e){
        System.out.println("发生空指针异常");
        System.out.println(e);
        return   ResultBody.error(e.getMessage());
    }


    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public   ResultBody  ExceptionDeal(HttpServletRequest  request,Exception  e){
        System.out.println("发生未知异常");
        System.out.println(e);
        return ResultBody.error(e.getMessage());
    }

    }
