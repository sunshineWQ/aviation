package com.bd10.knowledgesystems.util;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author 王青
 * @version V1.0
 * @Project: knowledge-systems
 * @Package com.bd10.knowledgesystems.util
 * @date 2020/2/24 19:28 星期一
 */
@ControllerAdvice
public class MyExceptionHandler {
    @ExceptionHandler(value = NullPointerException.class)
    public  String exceptionHandler(NullPointerException  e){
        System.out.println("enter1.....");
        System.out.println(e);
        return "error";
    }

    /**
     * 该方法需要返回一个ModelAndView:  目的是可以让我们封装异常信息以及试图的指定
     * 参数exception  e  :将产生的异常对象注入到方法中
     * @param e
     * @return
     */
    @ExceptionHandler(value = RuntimeException.class)
    public ModelAndView exceptionHandler(RuntimeException  e){
        System.out.println("enter2.....");
        System.out.println(e);
        ModelAndView mv = new ModelAndView();
        //error是静态资源根目录下的error.ftl模版的视图名称
        mv.setViewName("error");
        mv.addObject("e", e);
        return mv;

    }
    @ExceptionHandler(value = Exception.class)
    public  String exceptionHandler(Exception  e){
        System.out.println("enter.3....");
        System.out.println(e);
        return "error";
    }

}
