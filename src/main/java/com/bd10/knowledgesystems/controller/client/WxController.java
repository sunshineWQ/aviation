package com.bd10.knowledgesystems.controller.client;

import com.alibaba.fastjson.JSON;
import com.bd10.knowledgesystems.model.entity.*;
import com.bd10.knowledgesystems.model.vo.RegulationVo;
import com.bd10.knowledgesystems.service.laws.ClauseService;
import com.bd10.knowledgesystems.service.laws.RegulationsService;
import com.bd10.knowledgesystems.service.others.ConsultService;
import com.bd10.knowledgesystems.service.users.UserService;
import com.bd10.knowledgesystems.util.UserAgentUtils;
import cz.mallat.uasparser.UserAgentInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * @author 王青
 * @version V1.0
 * @Project: knowledge-systems
 * @Package com.bd10.knowledgesystems.controller.management
 * @date 2020/2/19 21:32 星期三
 */
@RestController
public class WxController {
    @Resource
    private UserService userService;
    @Resource
    private RegulationsService regulationsService;
    @Resource
    private ClauseService clauseService;
    @Resource
    private ConsultService consultService;

    @RequestMapping("/Wxlogin")
    public   void    Wxlogin(@RequestParam("user_phone") String user_phone,
                             @RequestParam("user_password") String  user_password,
                             HttpServletRequest  request, HttpServletResponse   response, HttpSession  session) throws IOException {
        response.setContentType("application/json;charset=utf-8");
        String  ua=request.getHeader("User-Agent");//解析这个请求是什么设备发过来的
        System.out.println(ua);
        String sessionId = request.getSession().getId();
        System.out.println("ssss"+sessionId);
       //带着用户登录的设备信息进行登录
        UserAgentInfo  userAgentInfo= UserAgentUtils.uaSparser.parse(ua);//用来封装请求头的信息
        String type=userAgentInfo.getDeviceType();
        System.out.println(type);
        Object[]loginResult=userService.login(user_phone,user_password,type);

        Result  result=new Result();

        if(loginResult==null){
            result.setCode(2001);
            result.setMessage("登录失败");
      }else {
            result.setCode(1001);
            result.setMessage("登录成功");
            result.setData(loginResult);
            result.setSeesionId(sessionId);
        }
       response.getWriter().print(JSON.toJSONString(result));
    }


    @RequestMapping("/queryRegualtion1")
    public   void  queryRegualtion(@RequestParam("classify_foreign_key2") int classify_foreign_key,HttpServletResponse  response) throws IOException {
     /* int classify_foreign_key=  Integer.parseInt(classify_foreign_key2);*/
        System.out.println(classify_foreign_key);
        List<RegulationVo> regulationName=regulationsService.queryRegulationByType(classify_foreign_key);
        response.setContentType("application/json;charset=utf-8");
        System.out.println(classify_foreign_key+"++++++++++++++++");
        System.out.println(JSON.toJSONString(regulationName));
        PrintWriter out=response.getWriter();
        out.print(JSON.toJSONString(regulationName));
    }
 //查询法规下的所有目录
    @RequestMapping("/WxqueryAllDirectory")
    public void WxqueryAllDirectory(HttpServletResponse  response) throws IOException {
        List<Directory>directoryList=regulationsService.queryAllDirectory(1);
        response.setContentType("application/json;charset=utf-8");
        PrintWriter out=response.getWriter();
        out.print(JSON.toJSONString(directoryList));
    }

    //查询目录下的条款
    @RequestMapping("/WxqueryAClause")
        public void WxqueryAClause(int  directory_foreign_key,HttpServletResponse  response) throws IOException {
        response.setContentType("application/json;charset=utf-8");
        PrintWriter out=response.getWriter();
       List<Clause>clauses=clauseService.queryClauseByDirectory_id(directory_foreign_key);
        out.print(JSON.toJSONString(clauses));
    }

    //管理端注册
    @PostMapping("/WxRegisterUser")
    public   void WxRegisterUser(@RequestBody User user, HttpServletResponse  response) throws IOException {
        response.setContentType("application/json;charset=utf-8");
        PrintWriter out=response.getWriter();
        String flag="";
        if(userService.RegisterUser(user)){
          flag="true";
       }else{
            flag="false";
        }
        out.print(flag);
    }
    //根据条款的id  查询条款的详细内容
    @RequestMapping("/queryClauseDetailById")
    public void queryClauseDetailById(int clause_id,HttpServletResponse  response) throws IOException {
        response.setContentType("application/json;charset=utf-8");
        System.out.println("++++++++"+clause_id);
        Clause content=clauseService.queryClauseDetailById(clause_id);
        System.out.println(content+"+++++++++++");

        response.getWriter().print(JSON.toJSONString(content));
    }

    //管理端添加咨询

    @RequestMapping("/WxaddConsoult")
    public   void  addConsoult(@RequestBody consult consoult, HttpServletResponse  response) throws IOException {
        response.setContentType("application/json;charset=utf-8");
        String flag="";
     if(consultService.addConsult(consoult)){
         flag="true";
     }else {
         flag="false";
     }
     response.getWriter().print(flag);
    }
}
