<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Frameset//EN" "http://www.w3.org/TR/html4/frameset.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
    xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
    <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" />
    <title>法规列表</title>
    <link rel="icon" href="favicon.ico" type="image/ico">
    <meta name="keywords" content="LightYear,光年,后台模板,后台管理系统,光年HTML模板">
    <meta name="description" content="LightYear是一个基于Bootstrap v3.3.7的后台管理系统的HTML模板。">
    <meta name="author" content="yinqi">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/materialdesignicons.min.css" rel="stylesheet">
    <link href="css/style.min.css" rel="stylesheet">

        <link rel="stylesheet" href="toastr/build/toastr.min.css">
        <link href="datatables/dataTables.bootstrap4.min.css" rel="stylesheet">
    </head>

<body data-sidebarbg="color_8" data-headerbg="color_8">
<div class="lyear-layout-web">
    <div class="lyear-layout-container">
        <!--左侧导航-->
        <aside class="lyear-layout-sidebar">

            <!-- logo -->
       <#--     <div id="logo" class="sidebar-header">
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
                                <li> <a href="/initAddDirectory">新增目录</a>
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
                                <li > <a href="/initAdmin">管理员管理</a> </li>
                                <li  class="active"> <a href="/initSuggestionFeedBack">意见反馈列表</a> </li>
                            </ul>
                        </li>
                    </ul>
                </nav>

                <#--<div class="sidebar-footer">
                    <p class="copyright">Copyright &copy; 2019. <a target="_blank" href="http://lyear.itshubao.com">IT书包</a> All rights reserved.</p>
                </div>-->
            </div>

        </aside>
        <!--End 左侧导航-->

        <!--头部信息-->
        <header class="lyear-layout-header">

            <nav class="navbar navbar-default">
                <div class="topbar"  style="height:0px">

                    <div class="topbar-left">
                        <div class="lyear-aside-toggler">
                            <span class="lyear-toggler-bar"></span>
                            <span class="lyear-toggler-bar"></span>
                            <span class="lyear-toggler-bar"></span>
                        </div>
                        <span class="navbar-page-title"> 意见反馈列表 </span>
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

        <div class="modal fade custom-modal" id="customModal" tabindex="-1" role="dialog" aria-labelledby="customModal" aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel2">咨询内容</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <textarea class="form-control" id="pp">

                        </textarea>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">关闭</button>
                       <#-- <button type="button" class="btn btn-primary">Save changes</button>-->
                    </div>
                </div>
            </div>
        </div>


        <!--页面主要内容-->
        <main class="lyear-layout-content">

            <div class="container-fluid">

                <div class="row"  style="margin-left:-40px;margin-top:-18px;width:1350px;">
                    <div class="col-lg-12">
                        <div class="card">

                            <div class="tab-content">
                                <div class="card-body">

                                </div>
                                <div class="tab-pane active">

                                    <table class="table table-bordered"  id="datatable_xs"  style="width:100%;table-layout: fixed">
                                    <thead>
                                        <tr>

                                            <td>意见反馈内容</td>
                                            <td>咨询时间</td>
                                            <td>操作</td>
                                        </tr>
                                    </thead>
                                        <tbody>
                                      <#list   backs  as  b>
                                          <tr  name="${b.feedback_id?c}">
                                              <td style="width: 200px;word-break: keep-all;white-space: nowrap;overflow: hidden;text-overflow: ellipsis" >${b.feedback_content}</td>
                                              <td>${b.feedback_createtime}</td>                                                             
                                              <td><button  class="btn btn-info btn-sm"  onclick="show(${b.feedback_id?c})">查看</button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<button  class="btn btn-label btn-danger  btn-sm"  onclick="del(${b.feedback_id?c})">删除</button></td>
                                          </tr>
                                      </#list>
                                        </tbody>
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
        <!--End 页面主要内容-->
    </div>
</div>

<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/perfect-scrollbar.min.js"></script>
<script src="toastr/build/toastr.min.js"></script>
<script type="text/javascript" src="js/main.min.js"></script>
<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
<script src="datatables/jquery.dataTables.min.js"></script>
<script src="datatables/dataTables.bootstrap4.min.js"></script>
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
    $("#datatable_xs").DataTable({
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
    toastr.options.positionClass = 'toast-top-50-width';
   /* function del(e) {
        if(confirm("确定删除嘛？")){
           $.ajax({
               url:"/delFeedBack",
               type:"post",
               data:{"feedback_id":e},
               success:function (data) {
                   if(data==true){

                       $("tr[name='"+e+"']").remove();
                       toastr.success("删除成功");
                   }


               }
           })
        }
    }*/

    function del(e){
        alert(e)
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
                    url:'/delFeedBack',
                    method:'post',
                    data:{"feedback_id":e},
                    success:function(str){
                        if(str==true){
                            // 刷新数据
                            swal(
                                    "恭喜你！",
                                    "删除成功", "success",
                            ).then(function () {
                                $("tr[name='"+e+"']").remove();
                            })

                        }else{
                            swal('提示','删除工单失败!');
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
    function show(e) {
        $.ajax({
            url:"/queryContentById",
            type:"post",
            dataType:"text",
            async : true,
            data:{"feedback_id":e},
             beforeSend:function(){
                 $('#customModal').modal({
                     backdrop:'static'      //<span style="color:#FF6666;">设置模态框之外点击无效</span>
                 });
                 $("#customModal").modal('show');
             },
           /*  complete: function() {            //ajax得到请求结果后的操作
              $('#customModal').modal('hide');  //隐藏模态框
              },*/
            success: function (data) {

                    $("#pp").val(data);
            },
        })
    }
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

</body>

</html>