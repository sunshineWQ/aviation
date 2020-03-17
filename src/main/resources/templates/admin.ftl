<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Frameset//EN" "http://www.w3.org/TR/html4/frameset.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" />
  <title>管理员列表</title>
  <link rel="icon" href="favicon.ico" type="image/ico">
  <meta name="keywords" content="LightYear,光年,后台模板,后台管理系统,光年HTML模板">
  <meta name="description" content="LightYear是一个基于Bootstrap v3.3.7的后台管理系统的HTML模板。">
  <meta name="author" content="yinqi">
  <link href="css/bootstrap.min.css" rel="stylesheet">
  <link href="css/materialdesignicons.min.css" rel="stylesheet">
  <link href="css/style.min.css" rel="stylesheet">
    <link rel="stylesheet" href="js/jconfirm/jquery-confirm.min.css">
    <link href="css/style.min.css" rel="stylesheet">

    <link href="datatables/dataTables.bootstrap4.min.css" rel="stylesheet">
    <link rel="stylesheet" href="toastr/build/toastr.min.css">
</head>

<body data-sidebarbg="color_8" data-headerbg="color_8">
<div class="lyear-layout-web">
  <div class="lyear-layout-container">
    <!--左侧导航-->
    <aside class="lyear-layout-sidebar">

      <!-- logo -->
     <#-- <div id="logo" class="sidebar-header">
        <a href="index.html"><img src="images/logo-sidebar.png" title="LightYear" alt="LightYear" /></a>
      </div>-->
      <div class="lyear-layout-sidebar-scroll" id="dic">

          <div  style="height: 46px">
              <h4 style="color: white;margin:18px" >${web_title}</h4>
          </div>
        <nav class="sidebar-main">
          <ul class="nav nav-drawer">
            <#--<li class="nav-item active"> <a href="back_index.html"><i class="mdi mdi-home"></i> 后台首页</a> </li>-->
            <li class="nav-item nav-item-has-subnav">
              <a href="javascript:void(0)"><i class="mdi mdi-palette"></i> 法规管理</a>
              <ul class="nav nav-subnav">
                <li  class="active"> <a href="/queryAllRegulations">法规列表</a> </li>
                <li> <a href="/RegulationPage">新增法规</a> </li>
                <li> <a href="/initDirectory">法规目录管理</a> </li>
                <li> <a href="/initAddDirectory">新增目录</a> </li>
                <li > <a href="/initClause">条款列表</a> </li>
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
            <li class="nav-item nav-item-has-subnav active open">
              <a href="javascript:void(0)"><i class="mdi mdi-laptop-off"></i> 设置</a>
              <ul class="nav nav-subnav">
                <li > <a href="/initWebsiteSetup">网站设置</a> </li>
                <li> <a href="/initComIntroduct">公司介绍</a> </li>
                <li> <a href="/initserviceHtttp">服务协议</a> </li>
                <li> <a href="/initStmpEmail">邮件SMTP设置</a> </li>
                <li> <a href="/initMessageSet">短信设置</a> </li>
                <li  class="active"> <a href="/initAdmin">管理员管理</a> </li>
                <li> <a href="/initSuggestionFeedBack">意见反馈列表</a> </li>
              </ul>
            </li>
          </ul>
        </nav>

        <div class="sidebar-footer">
      <#--    <p class="copyright">Copyright &copy; 2019. <a target="_blank" href="http://lyear.itshubao.com">IT书包</a> All rights reserved.</p>-->
        </div>
      </div>

    </aside>
    <!--End 左侧导航-->

    <!--头部信息-->
    <header class="lyear-layout-header">

      <nav class="navbar navbar-default">
        <div class="topbar">

          <div class="topbar-left">
            <div class="lyear-aside-toggler">
              <span class="lyear-toggler-bar"></span>
              <span class="lyear-toggler-bar"></span>
              <span class="lyear-toggler-bar"></span>
            </div>
            <span class="navbar-page-title"> 管理员列表 </span>
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

        <div class="row" style="margin-left:-40px;margin-top:-18px;width:1350px;">
          <div class="col-lg-12">
            <div class="card">
              <div class="card-toolbar clearfix">

              </div>

                <div class="tab-content">
                  <div class="card-body">

                    <form class="form-inline"  method="post">
                      <div class="form-group"  class="col-md-3"  style="margin-right:10px">
                        *管理员姓名：
                        <input class="form-control" type="text" id="admin_name" name="admin_name" placeholder="不超过100个字">
                      </div>
                      <div class="form-group"  class="col-md-3"  style="margin-right: 10px">
                        *手机号：
                        <input class="form-control" type="text" id="admin_phone" name="admin_phone" placeholder="请输入手机号">
                      </div>
                      <div class="form-group"  class="col-md-3" style="margin-right: 10px">
                        *密码：
                        <input class="form-control" type="=text" id="admin_password" name="admin_password" placeholder="6-20个字符">
                    </div>
                        <div class="form-group"  class="col-md-3" style="margin-right: 10px">
                            *管理员类型：
                           <select name="admin_type"  class="form-control"  id="admin_type">
                               <option  value="1">高级管理员</option>
                               <option  value="2">普通管理员</option>
                           </select>
                        </div>
                      <div class="form-group"  class="col-md-3" style="margin-left:20px">
                        <button class="btn btn-primary" type="button"  id="addbtn">新增管理员</button>
                      </div>
                    </form>

                  </div>
                  <div class="tab-pane active">

                    <table class="table table-bordered"  id="table_1"  style="width: 100%">
                      <thead  style="background-color: ">
                      <tr>
                        <td>管理员手机号</td>
                        <td>管理员姓名</td>
                        <td>添加日期</td>
                        <td>操作</td>
                      </tr>
                      </thead>

                  <#list allAdmin  as  admin>
                      <tr  name="${admin.admin_id}">
                          <td>${admin.admin_phone}</td>
                          <td>${admin.admin_name}</td>
                          <td>${admin.admin_createtime}</td>
                          <td><button  type="button"  class="btn btn-info btn-sm" data-target="#customModal" data-toggle="modal" onclick="update(${admin.admin_id})">编辑</button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<button  class="btn btn-label btn-danger  btn-sm" onclick="del(${admin.admin_id})">删除</button></td>
                      </tr>
                  </#list>

                    </table>
                  </div>

                </div>
                <div class="tab-pane active">

                </div>

            </div>
          </div>

        </div>

      </div>

    </main>

          <div class="modal fade" id="customModal" tabindex="-1" role="dialog"
               aria-labelledby="customModal" aria-hidden="true">
              <div class="modal-dialog">
                  <div class="modal-content">
                      <div class="modal-header">
                          <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                          <h4 class="modal-title" id="myModalLabel">详细信息</h4>
                      </div>

                          <div class="modal-body">
                              <div class="input-group">
                                  <input  type="hidden" id="admin_id11">
                                  <span class="input-group-addon">手&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;机&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;号&nbsp;</span>
                                  <input type="text" class="form-control" id="admin_phone11"  readonly="readonly">
                              </div>
                              <br />
                              <div class="input-group">
                                  <span class="input-group-addon">管&nbsp;&nbsp;理&nbsp;&nbsp;员&nbsp;&nbsp;姓&nbsp;&nbsp;名</span>
                                  <input type="text" class="form-control" id="admin_name11"  placeholder="请输入管理员姓名" name="admin_name">
                              </div>
                              <br />
                              <div class="input-group">
                                  <span class="input-group-addon">管&nbsp;&nbsp;理&nbsp;&nbsp;员&nbsp;&nbsp;密&nbsp;&nbsp;码</span>
                                  <input type="text" class="form-control"  id="admin_password11"   placeholder="请输入管理员密码" name="admin_password" >
                              </div>
                              <br />

                          </div>
                          <div class="modal-footer">
                              <button type="button" class="btn btn-default"
                                      data-dismiss="modal">关闭</button>
                              <button type="submit" class="btn btn-primary"  id="save">提交修改</button>
                          </div>

                  </div>
                  <!-- /.modal-content -->
              </div>

              <!-- /.modal -->


      <!--End 页面主要内容-->
  </div>
</div>

<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/perfect-scrollbar.min.js"></script>
<script type="text/javascript" src="js/main.min.js"></script>
<script src="toastr/build/toastr.min.js"></script>
<script src="js/jconfirm/jquery-confirm.min.js"></script>
<script type="text/javascript" src="js/main.min.js"></script>
<script src="datatables/jquery.dataTables.min.js"></script>
<script src="datatables/dataTables.bootstrap4.min.js"></script>
    <script src="toastr/build/toastr.min.js"></script>
    <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
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
<script type="text/javascript">

</script>
<script type="text/javascript">
    $("form").submit(function () {
        if($("#name").val()==''){
            alert("姓名不能为空")
            return  false;
        }
        if($("#phone").val()==''){
            alert("手机号不能为空")
            return  false;
        }
        if($("#password").val()==''){
            alert("密码不能为空")
            return  false;
        }
        toastr.success("添加成功")
        return  true;

    })
</script>
<script type="text/javascript">
    function   update(e) {
        $('#admin_id11').attr("value",e);
        $.ajax({
            url:"/queryAdminById",
            type:"GET",
            dataType:"text",
            async : true,
            data:{"admin_id":e},
            success: showquery,
            error:function () {
                alert("请求失败")
            }
        })
    }
    function showquery(data) {
        $("#admin_phone11").val(data)
        $("#customModal").modal('show');
    }

</script>
<script type="text/javascript">
    $("#table_1").dataTable({
        "aLengthMenu" : [5, 10, 25, 50, 100], //更改显示记录数选项(默认：[10,25,50,100])
        "oLanguage" : {
            "sProcessing": "正在加载数据，请稍后...",
            "sLengthMenu": "每页显示 _MENU_ 条记录",
            "sZeroRecords": "没有数据！",
            "sEmptyTable": "表中无数据存在！",
            "sInfo": "当前显示 _START_ 到 _END_ 条，共 _TOTAL_ 条记录",
            "sInfoEmpty": "显示0到0条记录",
            "sInfoFiltered": "数据表中共有 _MAX_ 条记录",
            //"sInfoPostFix": "",
            "sSearch": "搜索:",
            //"sUrl": "",
            //"sLoadingRecords": "载入中...",
            //"sInfoThousands": ",",
            "oPaginate": {
                "sFirst": "首页",
                "sPrevious": "上一页",
                "sNext": "下一页",
                "sLast": "末页"
            }

        }
    })
</script>
    <script type="text/javascript">
        $("#save").click(function () {
            var  admin_id=$("#admin_id11").val();
            var admin_name=$("#admin_name11").val();
            var admin_password=$("#admin_password11").val();
            var  admin={"admin_id":admin_id,"admin_name":admin_name,"admin_password":admin_password};
            $.ajax({
                url:"/updataAdmin",
                type:"post",
                data:JSON.stringify(admin),
                dataType:"text",
                contentType:"application/json;charset=UTF-8",
                success:function (data) {
                   swal(
                       "恭喜你！",
                       "修改成功", "success",
                   ).then(function () {
                        location.href="/initAdmin";
                    })

                }
            })

        })
        
        
    </script>

    <script type="text/javascript">
        $('#customModal').on('show.bs.modal', function (e) {
            // 关键代码，如没将modal设置为 block，则$modala_dialog.height() 为零
            $(this).css('display', 'block');
            var modalHeight=$(window).height() / 2 - $('#customModal .modal-dialog').height() / 2;
            $(this).find('.modal-dialog').css({
                'margin-top': modalHeight
            });
        });
    </script>

    <script type="text/javascript">

        function del(e){
            swal({
                title: "确定要删除该管理员么？",
                /* text: "删除之后无法恢复该数据!", */
                icon: 'warning',
                buttons: {
                    cancel: {
                        text: "取消",
                        value: "",
                        visible: true,
                        closeModal: true,
                    },
                    confirm: {
                        text: "确定",
                        value: true,
                        visible: true,
                        closeModal: true
                    }
                },
                confirmButtonColor: "#DD6B55",
            }).then(function(isConfirm){
                if(isConfirm){
                    console.log("点击确定")
                    $.ajax({
                        url:'/delAdmin',
                        method:'post',
                        data:{"admin_id":e},
                        success:function(str){
                            if(str==true){
                                // 刷新数据
                              //  window.location.reload();
                                swal(
                                        "恭喜你！",
                                        "删除成功", "success",
                                ).then(function () {
                                    location.href="/initAdmin";
                                })
                            }else{
                                swal('提示','删除失败!');
                            }
                        }
                    });
                }else{
                    console.log("点击取消");
                }
            })
        }

    </script>

    <script type="text/javascript">
       $("#addbtn").click(function () {
           var admin_name=$("#admin_name").val();
           var admin_phone=$("#admin_phone").val();
           var admin_password=$("#admin_password").val();
           var admin_type=$("#admin_type").val();
          // alert(admin_name)
           //var admin={"admin_name":admin_name,"admin_phone":admin_phone,"admin_password":admin_password}
           $.ajax({
               url:"/addAdmins",
               type:"post",
               data:{
                   'admin_name':admin_name,
                   'admin_password':admin_password,
                   'admin_phone':admin_phone,
                   'admin_type':admin_type
               },
               //dataType:"text",
               //contentType:"application/json;charset=utf-8",
               success:function (data) {
                   alert(data)
                   if(data==true){
                       swal(
                               "恭喜你！",
                               "添加成功", "success",
                       ).then(function () {
                           location.href="/initAdmin";
                       })
                   }else {
                       swal(
                               "对不起",
                               "添加失败", "warning",
                       ).then(function () {
                           location.href="/initAdmin";
                       })
                   }



               }

           })


       })
    </script>

</body>

</html>