<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Frameset//EN" "http://www.w3.org/TR/html4/frameset.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">


<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" />
    <title>组织设定</title>
    <link rel="icon" href="favicon.ico" type="image/ico">
    <meta name="keywords" content="LightYear,光年,后台模板,后台管理系统,光年HTML模板">
    <meta name="description" content="LightYear是一个基于Bootstrap v3.3.7的后台管理系统的HTML模板。">
    <meta name="author" content="yinqi">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/materialdesignicons.min.css" rel="stylesheet">
    <link href="css/style.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://cdn.datatables.net/1.10.16/css/jquery.dataTables.min.css" />
</head>

<body data-sidebarbg="color_8" data-headerbg="color_8">
<div class="lyear-layout-web">
    <div class="lyear-layout-container">
        <!--左侧导航-->
        <aside class="lyear-layout-sidebar">

            <!-- logo -->
         <#--   <div id="logo" class="sidebar-header">
                <a href="index.html"><img src="images/logo-sidebar.png" title="LightYear" alt="LightYear" /></a>
            </div>-->
            <div class="lyear-layout-sidebar-scroll" id="dic">

                <div  style="height: 46px">
                    <h4 style="color: white;margin:18px" >${web_title}</h4>
                </div>
                <nav class="sidebar-main">
                    <ul class="nav nav-drawer">
                        <#--<li class="nav-item active"> <a href="back_index.html"><i class="mdi mdi-home"></i> 后台首页</a> </li>-->
                        <li class="nav-item nav-item-has-subnav active open">
                            <a href="javascript:void(0)"><i class="mdi mdi-palette"></i> 法规管理</a>
                            <ul class="nav nav-subnav">
                                <li > <a href="/queryAllRegulations">法规列表</a> </li>
                                <li  class="active"> <a href="/zuzhi">组织设定</a> </li>
                                <li > <a href="/RegulationPage">新增法规</a> </li>
                                <li> <a href="/initDirectory">法规目录管理</a> </li>
                                <li> <a href="/initAddDirectory">新增目录</a>
                                <li> <a href="/initClause">条款列表</a> </li>
                                <li> <a href="/initClause_add">新增条款</a> </li>
                            </ul>
                        </li>
                        <li class="nav-item nav-item-has-subnav">
                            <a href="javascript:void(0)"><i class="mdi mdi-account-multiple-outline"></i> 用户管理</a>
                            <ul class="nav nav-subnav">
                                <li> <a href="/initUser">用户列表</a> </li>
                            </ul>
                        </li>
                        <li class="nav-item nav-item-has-subnav">
                            <a href="javascript:void(0)"><i class="mdi mdi-comment-processing-outline"></i> 咨询管理</a>
                            <ul class="nav nav-subnav">
                                <li> <a href="/initConsult">咨询列表</a> </li>
                            </ul>
                        </li>
                        <li class="nav-item nav-item-has-subnav">
                            <a href="javascript:void(0)"><i class="mdi mdi-laptop-off"></i> 设置</a>
                            <ul class="nav nav-subnav">
                                <li> <a href="/initWebsiteSetup">网站设置</a> </li>
                                <li> <a href="/initComIntroduct">公司介绍</a> </li>
                                <li> <a href="/initserviceHtttp">服务协议</a> </li>
                                <li> <a href="/initStmpEmail">邮件SMTP设置</a> </li>
                                <li> <a href="/initMessageSet">短信设置</a> </li>
                                <li> <a href="/initAdmin">管理员管理</a> </li>
                                <li> <a href="/initSuggestionFeedBack">意见反馈列表</a> </li>
                            </ul>
                        </li>
                    </ul>
                </nav>

               <#-- <div class="sidebar-footer">
                    <p class="copyright">Copyright &copy; 2019. <a target="_blank" href="http://lyear.itshubao.com">IT书包</a> All rights reserved.</p>
                </div>-->
            </div>

        </aside>
        <!--End 左侧导航-->

        <!--头部信息-->
        <header class="lyear-layout-header">

            <nav class="navbar navbar-default">
                <div class="topbar" style="height:0px" >

                    <div class="topbar-left">
                        <div class="lyear-aside-toggler">
                            <span class="lyear-toggler-bar"></span>
                            <span class="lyear-toggler-bar"></span>
                            <span class="lyear-toggler-bar"></span>
                        </div>
                        <span class="navbar-page-title"> 组织设定 </span>
                    </div>

                    <ul class="topbar-right">
                        <li class="dropdown dropdown-profile">
                            <a href="javascript:void(0)" data-toggle="dropdown">
                                <span>admin <span class="caret"></span></span>
                            </a>
                            <ul class="dropdown-menu dropdown-menu-right">
                                <li> <a href="javascript:void(0)"><i class="mdi mdi-delete"></i> 清空缓存</a></li>
                                <li class="divider"></li>
                                <li> <a href="lyear_pages_login.html"><i class="mdi mdi-logout-variant"></i> 退出登录</a> </li>
                            </ul>
                        </li>
                        <!--切换主题配色-->
                        <li class="dropdown dropdown-skin">
                            <span data-toggle="dropdown" class="icon-palette"><i class="mdi mdi-palette"></i></span>
                            <ul class="dropdown-menu dropdown-menu-right" data-stopPropagation="true">
                                <li class="drop-title">
                                    <p>主题</p>
                                </li>
                                <li class="drop-skin-li clearfix">
                                        <span class="inverse">
                    <input type="radio" name="site_theme" value="default" id="site_theme_1" checked>
                    <label for="site_theme_1"></label>
                  </span>
                                    <span>
                    <input type="radio" name="site_theme" value="dark" id="site_theme_2">
                    <label for="site_theme_2"></label>
                  </span>
                                    <span>
                    <input type="radio" name="site_theme" value="translucent" id="site_theme_3">
                    <label for="site_theme_3"></label>
                  </span>
                                </li>
                                <li class="drop-title">
                                    <p>LOGO</p>
                                </li>
                                <li class="drop-skin-li clearfix">
                                        <span class="inverse">
                    <input type="radio" name="logo_bg" value="default" id="logo_bg_1" checked>
                    <label for="logo_bg_1"></label>
                  </span>
                                    <span>
                    <input type="radio" name="logo_bg" value="color_2" id="logo_bg_2">
                    <label for="logo_bg_2"></label>
                  </span>
                                    <span>
                    <input type="radio" name="logo_bg" value="color_3" id="logo_bg_3">
                    <label for="logo_bg_3"></label>
                  </span>
                                    <span>
                    <input type="radio" name="logo_bg" value="color_4" id="logo_bg_4">
                    <label for="logo_bg_4"></label>
                  </span>
                                    <span>
                    <input type="radio" name="logo_bg" value="color_5" id="logo_bg_5">
                    <label for="logo_bg_5"></label>
                  </span>
                                    <span>
                    <input type="radio" name="logo_bg" value="color_6" id="logo_bg_6">
                    <label for="logo_bg_6"></label>
                  </span>
                                    <span>
                    <input type="radio" name="logo_bg" value="color_7" id="logo_bg_7">
                    <label for="logo_bg_7"></label>
                  </span>
                                    <span>
                    <input type="radio" name="logo_bg" value="color_8" id="logo_bg_8">
                    <label for="logo_bg_8"></label>
                  </span>
                                </li>
                                <li class="drop-title">
                                    <p>头部</p>
                                </li>
                                <li class="drop-skin-li clearfix">
                                        <span class="inverse">
                    <input type="radio" name="header_bg" value="default" id="header_bg_1" checked>
                    <label for="header_bg_1"></label>
                  </span>
                                    <span>
                    <input type="radio" name="header_bg" value="color_2" id="header_bg_2">
                    <label for="header_bg_2"></label>
                  </span>
                                    <span>
                    <input type="radio" name="header_bg" value="color_3" id="header_bg_3">
                    <label for="header_bg_3"></label>
                  </span>
                                    <span>
                    <input type="radio" name="header_bg" value="color_4" id="header_bg_4">
                    <label for="header_bg_4"></label>
                  </span>
                                    <span>
                    <input type="radio" name="header_bg" value="color_5" id="header_bg_5">
                    <label for="header_bg_5"></label>
                  </span>
                                    <span>
                    <input type="radio" name="header_bg" value="color_6" id="header_bg_6">
                    <label for="header_bg_6"></label>
                  </span>
                                    <span>
                    <input type="radio" name="header_bg" value="color_7" id="header_bg_7">
                    <label for="header_bg_7"></label>
                  </span>
                                    <span>
                    <input type="radio" name="header_bg" value="color_8" id="header_bg_8">
                    <label for="header_bg_8"></label>
                  </span>
                                </li>
                                <li class="drop-title">
                                    <p>侧边栏</p>
                                </li>
                                <li class="drop-skin-li clearfix">
                                        <span class="inverse">
                    <input type="radio" name="sidebar_bg" value="default" id="sidebar_bg_1" checked>
                    <label for="sidebar_bg_1"></label>
                  </span>
                                    <span>
                    <input type="radio" name="sidebar_bg" value="color_2" id="sidebar_bg_2">
                    <label for="sidebar_bg_2"></label>
                  </span>
                                    <span>
                    <input type="radio" name="sidebar_bg" value="color_3" id="sidebar_bg_3">
                    <label for="sidebar_bg_3"></label>
                  </span>
                                    <span>
                    <input type="radio" name="sidebar_bg" value="color_4" id="sidebar_bg_4">
                    <label for="sidebar_bg_4"></label>
                  </span>
                                    <span>
                    <input type="radio" name="sidebar_bg" value="color_5" id="sidebar_bg_5">
                    <label for="sidebar_bg_5"></label>
                  </span>
                                    <span>
                    <input type="radio" name="sidebar_bg" value="color_6" id="sidebar_bg_6">
                    <label for="sidebar_bg_6"></label>
                  </span>
                                    <span>
                    <input type="radio" name="sidebar_bg" value="color_7" id="sidebar_bg_7">
                    <label for="sidebar_bg_7"></label>
                  </span>
                                    <span>
                    <input type="radio" name="sidebar_bg" value="color_8" id="sidebar_bg_8">
                    <label for="sidebar_bg_8"></label>
                  </span>
                                </li>
                            </ul>
                        </li>
                        <!--切换主题配色-->
                    </ul>

                </div>
            </nav>

        </header>
        <!--End 头部信息-->

        <!--页面主要内容-->
        <main class="lyear-layout-content">

            <div class="container-fluid">

                <div class="row"  style="margin-left:-40px;margin-top:-18px;width:1350px;">
                    <div class="col-lg-12">
                        <div class="card">
                            <div class="card-toolbar clearfix">

                            </div>
                            <div class="card-body"  style="height:800px">
                                <div>
                                    <form class="form-inline" action="addYijiTYpe" style="margin-bottom: 20px">
                                        <input  type="text" name="regulations_type_name" id="name" class="form-control"  placeholder="请输入一级分类名称">
                                        <button  class="btn btn-primary "  type="submit">添加一级分类</button>

                                    </form>
                                </div>

                                <div class="table-responsive">



                                    <table class="table table-striped" id="datatable_xs"  >
                                        <thead>
                                        <tr>
                                            <th>#</th>
                                            <th>第一层级</th>
                                            <th>第二层级</th>
                                            <th>操作</th>
                                        </tr>
                                        <#list zuzhiList  as  zuzhi>

                                        <tr>
                                            <td>${zuzhi.regulations_type_id}</td>
                                            <td>${zuzhi.regulations_type_name}</td>
                                            <td>${zuzhi.xiaji}</td>
                                            <td><a  href="delzuzhi?id=${zuzhi.regulations_type_id}">删除</a></td>

                                        </tr>

                                        </#list>
                                        </thead>
                                    </table>
                                 <div    class="form-group">

                             <#--    </div>
                                    <div   class="form-group">
                                    <form class="form-inline"  style="float:right;"  action="/adderjiType">
                                        <input  type="text" name="regulations_type_name"  class="form-control"  placeholder="请输入二级分类名称">
                                        所属的一级分类：<select class="form-control" name="shangji">
                                        <#list type  as  t>
                                        <option  value="${t.regulations_type_id}">${t.regulations_type_name}</option>
                                        </#list>
                                    </select>
                                        <button  class="btn btn-default"  type="submit">添加二级分类</button>

                                    </form>
                                    </div>


                                </div>

                                <div  style="margin-top: 10px"  class="form-inline">
                                   请选择所属一级分类： <select  class="form-control" style = "width:150px;" name="regulations_type_id"  id="yiji">
                                        <#list type  as  t>
                                            <option  value="${t.regulations_type_id}">${t.regulations_type_name}</option>
                                        </#list>
                                    </select>

                                   请选择所属二级分类： <select  class="form-control" style = "width:150px;" id="erji">

                                </select>
                                </div>-->

                            </div>
                        </div>
                    </div>

                </div>

            </div>

        </main>
        <!--End 页面主要内容-->
    </div>
</div>

<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/perfect-scrollbar.min.js"></script>
<script type="text/javascript" src="js/main.min.js"></script>
<script src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js"></script>
<script type="text/javascript">
  /*$(function () {

      //获取一级分类的值
      $("#yiji").change(function () {
          var yiji=$("#yiji").val();
      //清空二级的数据
          $("#erji").empty();
          $.ajax({
              type:"post",
              data:{"shangji":yiji},
              url:"/querByShangji",
              async:true,
              success:function (returnData) {
                $(returnData).each(function (index,element) {
                    $("#erji").append("<option>"+element.regulations_type_name+"</option>")
                })
              }
          })
      })

  })*/
</script>
<script type="text/javascript">
    window.onload=function (){
        function auto_height()
        {
            document.getElementById("dic").style.height=document.documentElement.clientHeight+"px";

        }
        auto_height();
        onresize=auto_height;
    }

</script>
</body>

</html>