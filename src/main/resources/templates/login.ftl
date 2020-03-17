<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Frameset//EN" "http://www.w3.org/TR/html4/frameset.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title></title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="robots" content="all,follow">
    <!-- Bootstrap CSS-->
    <link rel="stylesheet" href="vendor/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="css/style.default.css" id="theme-stylesheet">
  </head>
  <body>
    <div class="login-page">
      <div class="container d-flex align-items-center">
        <div class="form-holder has-shadow"  style="margin-left: 300px">
          <div class="row">
            </div>
            <!-- Form Panel    -->
            <div class="col-lg-6"   style="height:300px">
<!--              <div class="form d-flex align-items-center"style="height: 20px" >-->
                <div class="content" >
                    <div><h3 style="text-align: center;margin-bottom:50px">航多知识管理系统-后台</h3></div>
                  <form action="/login" method="post"class="form-validate mb-4">
                    <div class="form-group"  style="height: 50px">
                      <input id="login-username" type="text" name="admin_phone" required data-msg="请输入你的用户名" class="input-material"  placeholder="用户名">
<!--                      <label for="login-username" class="label-material">User Name</label>-->
                    </div>
                    <div class="form-group"  style="height: 50px">
                      <input id="login-password" type="password" name="admin_password" required data-msg="请输入你的密码" class="input-material"  placeholder="密码">
<!--                      <label for="login-password" class="label-material">Password</label>-->
                        <span  id="msg"  style="color: red">${msg!}</span>
                    </div>

                    <button type="submit" class="btn btn-primary">登录</button>
                  </form>
                </div>
<!--              </div>-->
            </div>
          </div>
        </div>
      </div>
      <div class="copyrights text-center">
      </div>
    </div>
    <!-- JavaScript files-->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/popper.js/umd/popper.min.js"> </script>
    <script src="vendor/bootstrap/js/bootstrap.min.js"></script>
    <script src="vendor/jquery.cookie/jquery.cookie.js"> </script>
    <script src="vendor/chart.js/Chart.min.js"></script>
    <script src="vendor/jquery-validation/jquery.validate.min.js"></script>
    <script src="js/front.js"></script>
  </body>
</html>