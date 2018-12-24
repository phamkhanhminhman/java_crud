<%-- 
    Document   : login.jsp
    Created on : May 7, 2017, 4:44:42 PM
    Author     : MinhMan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="bootstrap3/css/bootstrap.css" rel="stylesheet" />

        <link href="login-register.css" rel="stylesheet" />
        <link rel="stylesheet" href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css">
        <script src="jquery/jquery-1.10.2.js" type="text/javascript"></script>
        <script src="bootstrap3/js/bootstrap.js" type="text/javascript"></script>
        <script src="login-register.js" type="text/javascript"></script>
        <link href="bootstrap3/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <meta charset="utf-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

    <head>
       
        <title>JSP Page</title>
    </head>
    <body>

        <div class="container">
            <div class="row">
                <div class="col-sm-4"></div>
                <div class="col-sm-4">
                    <a class="btn btn-primary" data-toggle="modal" href="javascript:void(0)" onclick="openLoginModal();"><span class="glyphicon glyphicon-user">Login</span></a>
                    <a class="btn btn-info"    data-toggle="modal" href="javascript:void(0)" onclick="openRegisterModal();">Register</a></div>
                <div class="col-sm-4"></div>
            </div>


            <div class="modal fade login" id="loginModal">
                <div class="modal-dialog login animated">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                            <h4 class="modal-title">Login with</h4>
                        </div>
                        <div class="modal-body">  
                            <div class="box">
                                <div class="content">
                                    <div class="social">
                                        <a class="circle github" href="/auth/github">
                                            <i class="fa fa-github fa-fw"></i>
                                        </a>
                                        <a id="google_login" class="circle google" href="/auth/google_oauth2">
                                            <i class="fa fa-google-plus fa-fw"></i>
                                        </a>
                                        <a id="facebook_login" class="circle facebook" href="/auth/facebook">
                                            <i class="fa fa-facebook fa-fw"></i>
                                        </a>
                                    </div>
                                    <div class="division">
                                        <div class="line l"></div>
                                        //  <span>or</span>
                                        <div class="line r"></div>
                                    </div>
                                    <div class="error"></div>
                                    <div class="form loginBox">
                                        <form style="text-align: " action="HelloWorld" method="post">
                                            User Name:<input type="text"          class="btn btn-primary" value="" placeholder="Input User "   name="username"/></br>
                                            <p> </p> Password :<input type="text" class="btn btn-danger"  value=""  placehoder="Input Password"name="password"/>
                                            <input type="submit" class="btn btn-warning"value="ok">

                                        </form>
                                    </div>
                                </div>
                            </div>
                            <div class="box">
                                <div class="content registerBox" style="display:none;">
                                    <div class="form">
                                        <form method="post" html="{:multipart=>true}" data-remote="true" action="/register" accept-charset="UTF-8">
                                            <input id="email" class="form-control" type="text" placeholder="Email" name="email">
                                            <input id="password" class="form-control" type="password" placeholder="Password" name="password">
                                            <input id="password_confirmation" class="form-control" type="password" placeholder="Repeat Password" name="password_confirmation">
                                            <input class="btn btn-default btn-register" type="submit" value="Create account" name="commit">
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="modal-footer">
                            <div class="forgot login-footer">
                                <span>Looking to 
                                    <a href="javascript: showRegisterForm();">create an account</a>
                                    ?</span>
                            </div>
                            <div class="forgot register-footer" style="display:none">
                                <span>Already have an account?</span>
                                <a href="javascript: showLoginForm();">Login</a>
                            </div>
                        </div>        
                    </div>
                </div>
            </div>
        </div>

    </body>
</html>
