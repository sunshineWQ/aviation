package com.bd10.knowledgesystems.controller.management;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 王青
 * @version V1.0
 * @Project: knowledge-systems
 * @Package com.bd10.knowledgesystems.controller.management
 * @date 2020/3/9 18:36 星期一
 */
@Controller
public class TestShiro {

    @RequestMapping("/login")
    public   String   login(String admin_phone, String admin_password, Model  model){
        System.out.println("login"+admin_phone);
        System.out.println("login"+admin_password);
        UsernamePasswordToken  token=new UsernamePasswordToken(admin_phone,admin_password);
        Subject subject= SecurityUtils.getSubject();

        try{
         subject.login(token);
            System.out.println(subject.isAuthenticated());
        }catch (UnknownAccountException  uae){
             model.addAttribute("msg","账户不存在");
        }catch (IncorrectCredentialsException  ice){
            model.addAttribute("msg","密码不正确");
        }catch (AuthenticationException  ae){
            model.addAttribute("msg","状态不正常");
        }
       if(subject.isAuthenticated()){
           System.out.println("这是controller,验证成功");
           model.addAttribute("uname",admin_password);
            return  "redirect:/queryAllRegulations";
        }else {
            token.clear();
            return "login";
       }
    }
}
