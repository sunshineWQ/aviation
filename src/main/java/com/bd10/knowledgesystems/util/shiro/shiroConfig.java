package com.bd10.knowledgesystems.util.shiro;

import com.bd10.knowledgesystems.dao.users.UserDao;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author 王青
 * @version V1.0
 * @Project: demo-shiro
 * @Package com.bd10.demoshiro.util
 * @date 2020/3/7 15:43 星期六
 */
@Configuration
public class shiroConfig {

    @Bean
    public SecurityManager  securityManager(){
        DefaultWebSecurityManager securityManager=new DefaultWebSecurityManager();
        securityManager.setRealm(realm());
        return  securityManager;
    }

    @Bean
    public Realm  realm(){
//        SimpleAccountRealm  simpleAccountRealm=new SimpleAccountRealm();
//        simpleAccountRealm.addAccount("ceshi","123456");
//        return  simpleAccountRealm;
        return  new com.bd10.knowledgesystems.util.shiro.Realm();
    }
    @Bean
    public ShiroFilterFactoryBean  shiroFilterFactoryBean(){
        ShiroFilterFactoryBean  shiroFilterFactoryBean=new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(securityManager());
        //配置拦截器
        Map<String,String> filterChainMap=new LinkedHashMap<>();
        //配置不会被拦截的链接
        filterChainMap.put("*/static/**","anon");


        //上面两个，都是常用写法，写在前面
        //具体的过滤顺序，再下面，按顺序写，一般，通配范围大的写后面
        //  authc:所有url都必须通过认证，anon: 所有的url 都不用认证就能访问
       filterChainMap.put("/login","anon");

        shiroFilterFactoryBean.setLoginUrl("/init");
        //配置退出的拦截器
        filterChainMap.put("/logout","logout");
        //这里，我们设置，网站上所有的功能，都得登录了才可以使用
        //登录页面和功能本身，应该所有人都可以用，可以像注释中那么使用，也可以直接使用
        //可以设置登录成功的跳转页面，我们这儿有那个springmvc 去控制
        shiroFilterFactoryBean.setSuccessUrl("/queryAllRegulations");
        //设置未授权的页面
        //shiroFilterFactoryBean.setUnauthorizedUrl("/msq");
        filterChainMap.put("/addAdmin","roles[高级管理员]");
        filterChainMap.put("/**","authc");
        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainMap);
        return shiroFilterFactoryBean;
    }
}
