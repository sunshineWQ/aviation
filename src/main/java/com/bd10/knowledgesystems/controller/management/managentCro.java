package com.bd10.knowledgesystems.controller.management;

import com.alibaba.fastjson.JSON;
import com.bd10.knowledgesystems.api.ManagementApi;
import com.bd10.knowledgesystems.model.dto.Abouts;
import com.bd10.knowledgesystems.model.dto.FeedBack;
import com.bd10.knowledgesystems.model.dto.SmtpEmail;
import com.bd10.knowledgesystems.model.entity.*;
import com.bd10.knowledgesystems.model.vo.ConclauseVo;
import com.bd10.knowledgesystems.model.vo.RegulationClasueVo;
import com.bd10.knowledgesystems.model.vo.RegulationTypeVo;
import com.bd10.knowledgesystems.model.vo.RegulationVo;
import com.bd10.knowledgesystems.service.laws.ClauseService;
import com.bd10.knowledgesystems.service.laws.RegulationsService;
import com.bd10.knowledgesystems.service.others.*;
import com.bd10.knowledgesystems.service.users.UserService;
import com.bd10.knowledgesystems.util.ApplicationParams;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * @author 王青
 * @version V1.0
 * @Project: knowledge-system
 * @Package com.bd10.knowledgesystem.controller.management
 * @date 2020/2/11 17:47 星期二
 */
@Controller
public class managentCro  {
    @Resource
   private NoteService noteService;
    @Resource
    private AboutusService aboutusService;
    @Resource
    private FeedBackService feedBackService;
    @Resource
    private ConsultService consultService;
    @Resource
    private UserService userService;
    @Resource
    private WebSetService webSetService;
    @Resource
    private ServiceHttpService  serviceHttpService;
    @Resource
    private  SmtpEmailService   smtpEmailService;
    @Resource
    private RegulationsService regulationsService;
    @Resource
    private ClauseService clauseService;
    @Resource
    private ServletContext  servletContext;
   private static Logger LOGGER = LoggerFactory.getLogger(managentCro.class);
    @RequestMapping("/init")
    public   String   init(){
        LOGGER.info("有人登录了");
        LOGGER.error("yourendenglul");
        LOGGER.warn("yourendengliaaaaa");
        return "login";
    }


//    @ApiOperation(value = "根据手机号和密码登录",notes = "成功跳转法规页面，失败返回登录页面")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "admin_phone",value = "admin_phone",dataType = "String",example = "17723090197"),
//            @ApiImplicitParam(name = "admin_password",value = "admin_password",dataType = "String",example = "888888")
//    })
//    @RequestMapping("/login")
//    public   String    login(@RequestParam("admin_phone") String admin_phone,
//                             @RequestParam("admin_password") String  admin_password,
//                             Model  model){
//      Admin user=userService.login(admin_phone,admin_password);
//
//        System.out.println(admin_password+"+++++++++++++++++");
//       if(user!=null){
//           model.addAttribute("msg",user.getAdmin_name());
//           return "redirect:/queryAllRegulations";
//       }else {
//           model.addAttribute("msg","手机号或密码错误");
//           return  "login";
//       }
//    }
  //法规列表页面的初始化
  @ApiOperation(value = "法规列表初始化页面",notes ="查询所有法规")

    @RequestMapping("/queryAllRegulations")
    public  String queryAllRegulations(Model  model  ){
    List<RegulationVo>allRegulations = regulationsService.queryAllRegulations();
    if(allRegulations!=null){
        model.addAttribute("allRegulations",allRegulations);
        return "aviation-list";
    }else {
        return "login";
    }
  }
  //初始化条款列表
  @ApiOperation(value = "初始化条款列表页面",notes = "成功跳转法规页面，失败返回登录页面")
  @ApiImplicitParams({
          @ApiImplicitParam(name = "admin_phone",value = "admin_phone",dataType = "String",example = "17723090197"),
          @ApiImplicitParam(name = "admin_password",value = "admin_password",dataType = "String",example = "888888")
  })
    @RequestMapping("/initClause")
    public  String initClause(@RequestParam(name = "regulations_id",required = false)Integer regulations_id,
                              @RequestParam(name = "clause_no",required = false)Integer clause_no,
                              @RequestParam(name = "clause_antistop",required = false)String clause_antistop,
                              Model  model){
   //查询所有法规
        System.out.println("initClause");
        List<RegulationVo> regulationVos=regulationsService.queryAllRegulations();
     List<RegulationClasueVo>allClause =clauseService.queryClause(regulations_id,clause_no,clause_antistop);
      model.addAttribute("allClause",allClause);
        System.out.println("============="+regulationVos);
      model.addAttribute("regulationVos",regulationVos);
      model.addAttribute("regulations_id",regulations_id);
      model.addAttribute("clause_no",clause_no);
      model.addAttribute("clause_antistop",clause_antistop);
        return  "clause-list";
    }
  //新增条款页面
    @RequestMapping("/initClause_add")
    public   String initClause_add(Model  model){
        List<RegulationVo>allRegulations=regulationsService.queryAllRegulations();
        model.addAttribute("allRegulations",allRegulations);
        List<Directory>directoryList=regulationsService.queryAllDirectory(1);
        model.addAttribute("directoryList",directoryList);
       return "clause_add";
    }
  //进入组织页面
    @RequestMapping("/zuzhi")
    public   String zuzhi(Model  model){

        List<RegulationTypeVo> zuzhiList=regulationsService.getzuzhiList();
        List<RegulationType>  type=regulationsService.getzuzhiByType(1);
        model.addAttribute("zuzhiList",zuzhiList);
        model.addAttribute("type",type);
        return "zuzhi_add";
    }

    @RequestMapping("/delzuzhi")
    public   String  delzuzhi(int id){

        regulationsService.delzuzhi(id);
        return "redirect:/zuzhi";
    }

    @RequestMapping("/addYijiTYpe")
    public  String  addYijiTYpe(String regulations_type_name, HttpServletResponse response) throws IOException {
        int count=regulationsService.addYijiType(regulations_type_name);

        return "redirect:/zuzhi";
    }

    @RequestMapping("/adderjiType")
    public  String adderjiType(String regulations_type_name,int shangji){
        int count= regulationsService.addErjiType(regulations_type_name,2,shangji);
        return  "redirect:/zuzhi";
    }

    //初始化新增法规
    @RequestMapping("/RegulationPage")
    public  String RegulationPage(){

        return "regulations_add";
    }
    @RequestMapping("/querByShangji")
    public  void   querByShangji(int shangji, Model  model,HttpServletResponse  response) throws IOException {
        response.setContentType("application/json;charset=utf-8");
        List<RegulationType>regulationType=regulationsService.getzuzhiBySid(shangji);
        model.addAttribute("regulationType",regulationType);
        PrintWriter out=response.getWriter();
       String jsonString =JSON.toJSONString(regulationType);
       out.print(jsonString);
    }

    //用户列表的初始化界面
    @RequestMapping("/initUser")
    public    String initUser(Model  model){
       List<User>userList= userService.queryAllUser();
       model.addAttribute("userList",userList);
        return   "user";
    }

   // 法规目录管理初始画页面
    @RequestMapping("/initDirectory")
    public   String initDirectory(Model  model){
      List<RegulationType>regulationTypes=regulationsService.getzuzhiBySid(1);
      model.addAttribute("regulations",regulationTypes);
      List<RegulationVo>regulationName=regulationsService.queryAllRegulations();
      model.addAttribute("regulationName",regulationName);
      return  "directory";
    }

    @RequestMapping("/queryRegualtion")
    public   void  queryRegualtion(int classify_foreign_key,HttpServletResponse  response) throws IOException {
        List<RegulationVo>regulationName=regulationsService.queryRegulationByType(classify_foreign_key);
        response.setContentType("application/json;charset=utf-8");
            System.out.println(JSON.toJSONString(regulationName));
        PrintWriter  out=response.getWriter();
        out.print(JSON.toJSONString(regulationName));
    }

   //根据法规查  法规下面的目录
    @RequestMapping("/queryAllDirectory")
    public  void   queryAllDirectory(HttpServletResponse  response,int  regulations_foreign_key) throws IOException {
        response.setContentType("application/json;charset=utf-8");
        PrintWriter  out=response.getWriter();
        System.out.println("/queryAllDirectory  方法进来了"+regulations_foreign_key);
       List<Directory>directoryList=regulationsService.queryAllDirectory(regulations_foreign_key);
       out.print(JSON.toJSONString(directoryList));
    }
    @RequestMapping("/initConsult")
    public   String initConsult(Model  model){
      List<consult>allCon=userService.quertAllCon();
      model.addAttribute("allCon",allCon);
      return "consult";
    }

    @RequestMapping("/queryCScontent")
    public  String queryCScontent(int  consult_id,Model  model ){
         String  content=consultService.queryCSContent(consult_id);
         model.addAttribute("content",content);
         return  "consult";
    }
    @RequestMapping("/initAddDirectory")
    public String  initAddDirectory(Model  model){
     List<RegulationVo>regulationName=regulationsService.queryAllRegulations();
     model.addAttribute("regulationName",regulationName);
      return "directory_add";
    }
    @RequestMapping("/addDirectoy")
    public   void  addDirectoy(String directory_name, int index, int regulations_foreign_key, int level,HttpServletResponse  response) throws IOException {
        response.setContentType("application/json;charset=utf-8");
        String flag="false";
        if(regulationsService.addDirectory(directory_name,index,regulations_foreign_key,level)){
              flag="true";
        }
        response.getWriter().print(flag);
    }
    @RequestMapping("/delDirectory")
    public  void  delDirectory(int directory_id,HttpServletResponse  response) throws IOException {
        System.out.println("要删除的id"+directory_id);
        response.setContentType("application/json;charset=utf-8");

        String flag="";
        if(regulationsService.delDirectory(directory_id)){
             flag="true";
        }else {
            flag="false";
        }
        response.getWriter().print(flag);
    }
    @RequestMapping("/delRegulation")
    public  void    delRegulation(int regulations_id,HttpServletResponse  response) throws IOException {
        String flag="";
        response.setContentType("application/json;charset=utf-8");
        if(regulationsService.delRegulation(regulations_id)){
            System.out.println("删除成功");
            flag="true";
        }else {
            flag="false";
        }
        response.getWriter().print(flag);

    }

    @RequestMapping("/delConsult")
    public   void   delConsult(int consult_id,HttpServletResponse  response) throws IOException {
        response.setContentType("application/json;charset=utf-8");
        String flag="false";
           if(consultService.delConsult(consult_id)){
            flag="true";
           }
        response.getWriter().print(flag);
    }

    @RequestMapping("/initserviceHtttp")
    public   String initserviceHtttp(Model  model){
       String serviceContent= serviceHttpService.queryServiceContent();
        model.addAttribute("serviceContent",serviceContent);
           return "serviceHTTP";
    }
 //初始化短信设置的页面
    @RequestMapping("/initMessageSet")
    public  String initMessageSet(Model model){
      // String message= noteService.queryNote();
       String message= ApplicationParams.apikey;
        model.addAttribute("message",message);
        return "message_setting";
    }
    @RequestMapping("/initWebsiteSetup")
    public   String initWebsiteSetup(Model model){
      WebSeting web= webSetService.queryWebSeting();
      model.addAttribute("web",web);
      return "website_setup";
    }

    @RequestMapping("/initStmpEmail")
    public String initStmpEmail(Model  model){
    SmtpEmail smtp= smtpEmailService.querySmtpEmail();
    model.addAttribute("smtp",smtp);
         return "STMP_email";
    }
    //初始化 意见反馈表
    @RequestMapping("/initSuggestionFeedBack")
    public   String  initSuggestionFeedBack(Model  model){
      List<FeedBack>backs=  feedBackService.queryAllFeedBack();
      model.addAttribute("backs",backs);
      return "suggestion_feedback";
    }
    //初始化 条款列表页面
    public   String initTestList(){
        return "testlist";
    }

    @RequestMapping("/initAdmin")
    public  String initAdmin(Model  model){
       List<Admin>allAdmin= userService.allAdmin();
        model.addAttribute("allAdmin",allAdmin);
        return "admin";
    }
    //初始化 公司介绍页面
    @RequestMapping("/initComIntroduct")
    public   String initComIntroduct(Model  model){
        Abouts abouts=aboutusService.queryAbouts();
        model.addAttribute("abouts",abouts);
        return "company_introduction";
    }

    //修改网站设置
    @RequestMapping("/updateWebSet")
    public  void updateWebSet(@RequestBody WebSeting  webSeting,HttpServletResponse  response) throws IOException {
        response.setContentType("application/json;charset=utf-8");
        PrintWriter  out=response.getWriter();
        String flag="";
        if(webSetService.updateWeb(webSeting)){
            servletContext.setAttribute("web_title",webSeting.getWeb_title());
               flag="true";
        }else {
            flag="false";
        }
        out.print(flag);
    }
    @RequestMapping("/delAdmin")
   public   void   delAdmin(int admin_id,HttpServletResponse  response) throws IOException {
        response.setContentType("text/json;charset=utf-8");
        PrintWriter  out=response.getWriter();
        System.out.println("admin_id++++++++"+admin_id);
        String flag="";
        if(userService.delAdmin(admin_id)){
              flag="true";
            System.out.println("删除成功");
        }else {
            flag="false";
        }
        out.print(flag);
    }

//   @RequestMapping("/addAdmin")
//    public   void addAdmin(@RequestBody Admin  admin,HttpServletResponse  response) throws IOException {
//        String flag="false";
//        if(userService.addAdmin(admin)) {
//           flag="true";
//        }
//       response.getWriter().print(flag);
//    }


    @RequestMapping("/addAdmins")
    public   void  addAdmin(HttpServletResponse  response,
                            @RequestParam("admin_name") String admin_name,
                            @RequestParam("admin_phone") String admin_phone,
                            @RequestParam("admin_password") String admin_password,
                            @RequestParam("admin_type") int  admin_type) throws IOException {
        response.setContentType("application/json;charset=utf-8");
        PrintWriter  out=response.getWriter();
        String flag="false";
        System.out.println("添加方法进来了"+admin_name);
      if(userService.addAdmin(admin_phone,admin_password,admin_name)) {
          //这块证明已经添加成功了，再根据手机姓名查找他的id
         int aid=userService.queryIdByAdminName(admin_name);//获取到新增管理员的id
          //再添加中间表
          System.out.println("aid+++++"+aid);
          userService.addAdminType(admin_type,aid);
          flag="true";
     }
        System.out.println("tianjiafangfa"+flag);
     out.print(flag);


    }
       @RequestMapping("/queryAdminById")
        public  void queryAdminById(int  admin_id,HttpServletResponse response) throws IOException {
           response.setContentType("text/json;charset=utf-8");
            String  phone=userService.queryAdminById(admin_id);
           System.out.println("phone++++++++++++"+phone);
           response.getWriter().print(phone);
        }

        @RequestMapping("/delFeedBack")
        public  void  delFeedBack(int feedback_id,HttpServletResponse  response) throws IOException {
        response.setContentType("text/json;charset=utf-8");
        PrintWriter  out=response.getWriter();

            System.out.println(feedback_id+"=========== ");
        String  flag="";
           if(feedBackService.delFeedBack(feedback_id)){
               System.out.println("删除成功");
           flag="true";
           }else {
           flag="false";
           }
           out.print(flag);
        }
    //根据id  查询 意见详情
    @RequestMapping("/queryContentById")
    public   void   queryContentById(int  feedback_id,HttpServletResponse response) throws IOException {
        response.setContentType("text/json;charset=utf-8");
        System.out.println("queryContentById=================="+feedback_id);
         String  feedback=feedBackService.queryContentById(feedback_id);
        System.out.println("feed++++++++++"+feedback);
        response.getWriter().print(feedback);

}


    //修改公司内容

    @RequestMapping("/updataAboutByContent")
    public   void   updataAboutByContent(String aboutus_content,HttpServletResponse  response) throws IOException {
          response.setContentType("text/json;charset=utf-8");
          String flag="";
          if(aboutusService.upateAbouts(aboutus_content)){
                    flag="true";
          }else {
              flag="false";
          }
        response.getWriter().print(flag);
    }
    @RequestMapping("/updataServiceHttpContent")
    public   void   updataServiceHttpContent(String service_agreement_content,HttpServletResponse  response) throws IOException {
        response.setContentType("text/json;charset=utf-8");
        String flag="";
        if(serviceHttpService.updataSeerviceHttp(service_agreement_content)){
            flag="true";
        }else {
            flag="false";
        }
        response.getWriter().print(flag);
    }
    @RequestMapping("/updataSmtpEmail")
    public   void   updataSmtpEmail(@RequestBody SmtpEmail  smtpEmail, HttpServletResponse  response) throws IOException {
        System.out.println(smtpEmail);
 /*       response.setContentType("text/json;charset=utf-8");*/
        String flag="";
        if(smtpEmailService.updataSmtp(smtpEmail)){
            flag="true";
        }else {
            flag="false";
        }
        response.getWriter().print(flag);
    }


    @RequestMapping("/addRegulations")
   public   void addRegulations(Regulations regulations, HttpServletResponse  response){
        response.setContentType("text/json;charset=utf-8");
         if(regulationsService.addRegulations(regulations)){


         }
   }

   @RequestMapping("/updataApiKey")
   public   void  updataApiKey(String api_key,HttpServletResponse  response) throws IOException {
       response.setContentType("text/json;charset=utf-8");
       String flag="true";
       ApplicationParams.apikey=api_key;
//       if(noteService.updataApiKey(api_key)){
//         flag="true";
//       }
       response.getWriter().print(flag);
   }


   @RequestMapping("/updataAdmin")
   public void  updataAdmin(@RequestBody Admin  admin,HttpServletResponse  response) throws IOException {
       response.setContentType("text/json;charset=utf-8");
       String flag="";
        if(userService.updataAdmin(admin)){
            flag="true"; }else {
            flag="false";
        }
        response.getWriter().print(flag);
   }

   //添加条款
   @RequestMapping("/addClause")
   public  void   addClause(@RequestBody Clause  clause,HttpServletResponse  response) throws IOException {
       response.setContentType("text/json;charset=utf-8");
        String flag="";
        if(clauseService.addClauseDao(clause)){
            flag="true";
        }else {
            flag="false";
        }
       response.getWriter().print(flag);
   }

   @RequestMapping("/delClause")
   public   void   delClause(int  clause_id,HttpServletResponse  response) throws IOException {
       response.setContentType("text/json;charset=utf-8");
       String flag="";
        if(clauseService.delClause(clause_id)){
            flag="true";
        }else {
            flag="false";
        }
       response.getWriter().print(flag);
   }

   //点击咨询详情  需要展示的内容
    @RequestMapping("/queryDetailByConsultId")
   public  void     queryDetailByConsultId(int consult_id,HttpServletResponse  response) throws IOException {
       ConclauseVo conclauseVos= userService.queryDetailByConsultId(consult_id);

        System.out.println("conclauseVos"+conclauseVos);
       response.setContentType("text/json;charset=utf-8");
       response.getWriter().print(JSON.toJSONString(conclauseVos));
   }

   @RequestMapping("/queryminhang")
       public String  queryminhang(Model  model){
        List<RegulationTypeVo>queryminhangs=regulationsService.queryminhang();
        model.addAttribute("queryminhangs",queryminhangs);
        List<RegulationVo>allRegulations = regulationsService.queryAllRegulations();
        model.addAttribute("allRegulations",allRegulations);
       System.out.println("queryminhangs"+queryminhangs);
        return "aviation-list";
       }

       @RequestMapping("/queryRegulationsByErji")
       public  void    queryRegulationsByErji(int classify_foreign_key,HttpServletResponse  response) throws IOException {
            response.setContentType("text/json;charset=utf-8");
            List<RegulationVo>regulations=regulationsService.queryRegulationsByErji(classify_foreign_key);
            response.getWriter().print(JSON.toJSONString(regulations));
       }

}

