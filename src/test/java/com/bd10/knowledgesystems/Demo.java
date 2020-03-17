package com.bd10.knowledgesystems;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.realm.text.IniRealm;
import org.apache.shiro.subject.Subject;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author 王青
 * @version V1.0
 * @Project: knowledge-systems
 * @Package com.bd10.knowledgesystems
 * @date 2020/3/6 09:35 星期五
 */
@SpringBootTest
    public class Demo {
      IniRealm  iniRealm=new IniRealm("classpath:user.ini");

      @Test
      public   void   testIni(){
          DefaultSecurityManager   securityManager=new DefaultSecurityManager();
          securityManager.setRealm(iniRealm);
          SecurityUtils.setSecurityManager(securityManager);
          Subject  subject=SecurityUtils.getSubject();
          UsernamePasswordToken  token=new UsernamePasswordToken("zhangsan","111");
          subject.login(token);
          System.out.println(subject.isAuthenticated());
      }



    }
