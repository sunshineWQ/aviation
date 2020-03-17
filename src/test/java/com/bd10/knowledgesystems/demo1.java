package com.bd10.knowledgesystems;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.realm.jdbc.JdbcRealm;
import org.apache.shiro.subject.Subject;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author 王青
 * @version V1.0
 * @Project: knowledge-systems
 * @Package com.bd10.knowledgesystems
 * @date 2020/3/6 23:28 星期五
 */
@SpringBootTest
    public class demo1 {

        DruidDataSource  dataSource=new DruidDataSource();
    {
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/aviation?characterEncoding=utf8&characterSetResults=utf8&autoReconnect=true&failOverReadOnly=false");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
    }
    @Test
    public  void  testJdbc(){
        JdbcRealm  jdbcRealm=new JdbcRealm();
        jdbcRealm.setDataSource(dataSource);
        jdbcRealm.setPermissionsLookupEnabled(true);
        String  sql="SELECT user_password FROM `user`  WHERE  user_id =?";
        jdbcRealm.setAuthenticationQuery(sql);
        DefaultSecurityManager  securityManager=new DefaultSecurityManager();
        securityManager.setRealm(jdbcRealm);
        SecurityUtils.setSecurityManager(securityManager);
        Subject  subject=SecurityUtils.getSubject();
        UsernamePasswordToken token=new UsernamePasswordToken("1","123456");
        subject.login(token);
        System.out.println(subject.isAuthenticated());

    }
    }

