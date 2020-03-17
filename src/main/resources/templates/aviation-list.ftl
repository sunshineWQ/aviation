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
   <#-- <link rel="stylesheet" href="https://cdn.datatables.net/1.10.16/css/jquery.dataTables.min.css" />-->
    <link href="datatables/dataTables.bootstrap4.min.css" rel="stylesheet">


</head>

<body  data-sidebarbg="color_8" data-headerbg="color_8">
    <div class="lyear-layout-web">
        <div class="lyear-layout-container">
            <!--左侧导航-->
            <aside class="lyear-layout-sidebar">

                <!-- logo -->
               <#--<div id="logo" class="sidebar-header">-->
                   <#--<div>-->
                       <#--&lt;#&ndash;<img src="images/logo-sidebar.png" title="LightYear" alt="LightYear" />&ndash;&gt;-->

   <#--航多知识管理系统-后台-->
                   <#--</   div>-->
                <#--</div>-->
                <div class="lyear-layout-sidebar-scroll"  id="dic">
                    <div  style="height: 46px">
                        <h4 style="color: white;margin:18px" >${web_title}</h4>
                    </div>


                    <nav class="sidebar-main">
                        <ul class="nav nav-drawer">
                            <#--<li class="nav-item">
                            <h3  style="color: white">航多知识管理系统</h3>  </li>->-->
                            <li class="nav-item nav-item-has-subnav active open">
                                <a href="javascript:void(0)"><i class="mdi mdi-palette"></i> 法规管理</a>
                                <ul class="nav nav-subnav">
                                    <li class="active"> <a href="/queryAllRegulations">法规列表</a> </li>
                                    <li> <a href="/zuzhi">组织设定</a> </li>
                                    <li> <a href="/RegulationPage">新增法规</a> </li>
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
<#--
                    <div class="sidebar-footer">
                       &lt;#&ndash; <p class="copyright">Copyright &copy; 2019. <a target="_blank" href="http://lyear.itshubao.com">IT书包</a> All rights reserved.</p>&ndash;&gt;
                    </div>-->
                </div>

            </aside>
            <!--End 左侧导航-->

            <!--头部信息-->
            <header class="lyear-layout-header">

                <nav class="navbar navbar-default">
                    <div class="topbar" style="height: 0px">

                        <div class="topbar-left"  style="height: 10px">
                            <div class="lyear-aside-toggler">
                                <span class="lyear-toggler-bar"></span>
                                <span class="lyear-toggler-bar"></span>
                                <span class="lyear-toggler-bar"></span>
                            </div>
                            <span class="navbar-page-title"> 法规列表 </span>
                        </div>

                        <ul class="topbar-right">
                            <li class="dropdown dropdown-profile">
                                <a href="javascript:void(0)" data-toggle="dropdown">
                                    <span>admin <span class="caret"></span></span>
                                </a>
                                <ul class="dropdown-menu dropdown-menu-right">
                                    <li> <a href="javascript:void(0)"><i class="mdi mdi-delete"></i> 清空缓存</a></li>
                                    <li class="divider"></li>
                                    <li> <a href="/logout"><i class="mdi mdi-logout-variant"></i> 退出登录</a> </li>
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
                    <input type="radio" name="sidebar_bg" value="default" id="sidebar_bg_1">
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
                    <input type="radio" name="sidebar_bg" value="color_8" id="sidebar_bg_8"  checked>
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

              <div class="container-fluid"  >

             <div class="row"  style="margin-left:-40px;margin-top:-18px;width:1350px;">
                        <div class="col-lg-12"  style="height: auto ">
                       <div class="card">

                              <#--<div class="card-toolbar clearfix">

                                </div>-->
                                <div class="card-body"  style="position:relative;top:0px;bottom:700px;left:0px">

                             <div class="table-responsive">
                                 <p  align="center"><a  href="/queryminhang">按CCAR部号查询</a></p>
                                     <#if  queryminhangs??>
                                         <#list queryminhangs  as  min>
                                             <p align="center"><a href="javascript:void(0)" onclick="show2(${min.regulations_type_id})" style="text-align: center">${min.regulations_type_name}</a></p>
                                         </#list>
                                     </#if>

                                        <table class="table table-striped" id="datatable_xs"  style="width: 100%">
                                            <thead>
                                            <tr>
                                                    <td>部号</td>
                                                    <td>法规部号别名</td>
                                                    <td>版本号</td>
                                                    <td>法规名称</td>
                                                    <td>前台显示</td>
                                                    <td>组织</td>
                                                    <td>操作</td>
                                                </tr>
                                            </thead>
                                        <tbody>
                                            <#if  allRegulations??>

                                                <#list allRegulations  as  regulations>
                                                <tr id="rr" >
                                                    <td>${regulations.regulations_part_no}</td>
                                                    <td>${regulations.regulations_part_no_alias}</td>
                                                    <td>${regulations.regulations_version}</td>
                                                    <td>${regulations.regulations_name}</td>
                                                    <td><#if regulations.regulations_show_status==1>显示</#if>
                                                         <#if regulations.regulations_show_status==2>不显示</#if>
                                                    </td>
                                                    <td>${regulations.regulations_type_name}</td>
                                                    <td><button  class="btn btn-primary btn-sm"  onclick="show()">编辑</button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<button class="btn btn-warning btn-sm" onclick="del(${regulations.regulations_id})" >删除</button></td>

                                                </tr>


                                                </#list>

                                            </#if>

                                        </tbody>
                                        </table>

                                    </div>
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
    <script src="js/bootstrap.bundle.js"></script>
    <script type="text/javascript" src="js/perfect-scrollbar.min.js"></script>
    <script src="jquery-easing/jquery.easing.min.js"></script>
    <script type="text/javascript" src="js/main.min.js"></script>
    <script src="js/sb-admin-2.js"></script>
    <script src="datatables/jquery.dataTables.min.js"></script>
    <script src="datatables/dataTables.bootstrap4.min.js"></script>
    <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>

    <script type="text/javascript">
        var ee;
        $(document).ready(function () {
          ee=$("#datatable_xs").DataTable({
                "aLengthMenu" : [5, 10, 25, 50, 100], //更改显示记录数选项(默认：[10,25,50,100])
                //'destroy':true,
                'sZeroRecords':false,
              'autoLoad':true,
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
        })
        function show2(e) {
            // $("tbody[name='regulation']").empty();
            //$("#regulation").dataTable().fnClearTable();
            //window.location.reload();
            //$("#datatable_xs").DataTable({});
            // $('#datatable_xs').DataTable().clear().draw();

            $('#datatable_xs').dataTable().fnClearTable();
            //$("#datatable_xs").dataTable().fnDestroy();
           // $("#datatable_xs").dataTable(ee);

            $.ajax({
                url:"/queryRegulationsByErji",
                type:"post",
                data:{"classify_foreign_key":e},
                success:function (data){

                    //清空table
                    $(data).each(function (index,element) {
                        // alert(element.regulations_id)
                        $("tr[class='odd']").empty();
                        $("#datatable_xs").append("<tr id='rr'><td>"+element.regulations_part_no+"</td>" +
                                "<td>"+element.regulations_part_no_alias+"</td>" +
                                "<td>"+element.regulations_version+"</td>" +
                                "<td>"+element.regulations_name+"</td>" +
                                "<td>"+element.regulations_show_status+"</td>" +
                                "<td>"+element.regulations_type_name+"</td>" +
                                "<td><button  class='btn btn-primary btn-sm' onclick='show()'>编辑</button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" +
                                "<button  class='btn btn-warning btn-sm'  onclick='del("+element.regulations_id+")'>删除</button></td></tr>")
                    })
                }
            })
            ee= $('#datatable_xs').dataTable();

        }



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
<script type="text/javascript">
    function del(e) {
        swal({
            title: "确定要删除么？",
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
                    url:'/delRegulation',
                    method:'post',
                    data:{"regulations_id":e},
                    success:function(str){
                        if(str==true){

                            // 刷新数据
                            swal(
                                    "恭喜你！",
                                    "删除成功", "success",
                            ).then(function () {
                                $("#regulation").remove();
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
    function  show() {
        location.href="/RegulationPage";
    }
</script>
<script type="text/javascript">
    // function show2(e) {
    //     // $("tbody[name='regulation']").empty();
    //     //$("#regulation").dataTable().fnClearTable();
    //     //window.location.reload();
    //    //$("#datatable_xs").DataTable({});
    //    // $('#datatable_xs').DataTable().clear().draw();
    //
    //     $('#datatable_xs').dataTable().fnClearTable();
    //
    //     $.ajax({
    //         url:"/queryRegulationsByErji",
    //         type:"post",
    //         data:{"classify_foreign_key":e},
    //         success:function (data) {
    //             //清空table
    //             $(data).each(function (index,element) {
    //                 // alert(element.regulations_id)
    //                 $("tr[class='odd']").empty();
    //                 $("#datatable_xs").append("<tr id='rr'><td>"+element.regulations_part_no+"</td>" +
    //                         "<td>"+element.regulations_part_no_alias+"</td>" +
    //                         "<td>"+element.regulations_version+"</td>" +
    //                         "<td>"+element.regulations_name+"</td>" +
    //                         "<td>"+element.regulations_show_status+"</td>" +
    //                         "<td>"+element.regulations_type_name+"</td>" +
    //                         "<td><button  class='btn btn-primary btn-sm' onclick='show()'>编辑</button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" +
    //                         "<button  class='btn btn-warning btn-sm'  onclick='del("+element.regulations_id+")'>删除</button></td></tr>")
    //             })
    //         }
    //     })
    //
    // }

</script>
<script type="text/javascript">

</script>
</body>

</html>