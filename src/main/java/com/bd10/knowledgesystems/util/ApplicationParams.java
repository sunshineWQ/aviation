package com.bd10.knowledgesystems.util;
import com.bd10.knowledgesystems.dao.others.WebDao;
import org.springframework.stereotype.Component;
import org.springframework.web.context.ServletContextAware;

import javax.annotation.Resource;
import javax.servlet.ServletContext;

/**
 * @author 王青
 * @version V1.0
 * @Project: knowledge-systems
 * @Package com.bd10.knowledgesystems.util
 * @date 2020/2/24 16:12 星期一
 */
@Component
public class ApplicationParams   implements ServletContextAware{
    //如果不是static  最后拿到是对象的属性

    public   static   String  apikey="123456";
    @Resource
    private WebDao webDao;
    @Override
    public void setServletContext(ServletContext servletContext) {
     String web_title=webDao.queryWebSeting().getWeb_title();
     servletContext.setAttribute("web_title",web_title);
    }
}
