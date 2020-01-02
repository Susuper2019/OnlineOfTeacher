<%@ page isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
%>
<!DOCTYPE html>
<html>

<head>
    <!-- 页面meta -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>编辑</title>
    <meta name="description" content="AdminLTE2定制版">
    <meta name="keywords" content="AdminLTE2定制版">
    <meta content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no" name="viewport">
  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <link rel="stylesheet" href="<%=basePath%>/plugins/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="<%=basePath%>/plugins/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="<%=basePath%>/plugins/ionicons/css/ionicons.min.css">
    <link rel="stylesheet" href="<%=basePath%>/plugins/iCheck/square/blue.css">
    <link rel="stylesheet" href="<%=basePath%>/plugins/morris/morris.css">
    <link rel="stylesheet" href="<%=basePath%>/plugins/jvectormap/jquery-jvectormap-1.2.2.css">
    <link rel="stylesheet" href="<%=basePath%>/plugins/datepicker/datepicker3.css">
    <link rel="stylesheet" href="<%=basePath%>/plugins/daterangepicker/daterangepicker.css">
    <link rel="stylesheet" href="<%=basePath%>/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">
    <link rel="stylesheet" href="<%=basePath%>/plugins/datatables/dataTables.bootstrap.css">
    <link rel="stylesheet" href="<%=basePath%>/plugins/treeTable/jquery.treetable.css">
    <link rel="stylesheet" href="<%=basePath%>/plugins/treeTable/jquery.treetable.theme.default.css">
    <link rel="stylesheet" href="<%=basePath%>/plugins/select2/select2.css">
    <link rel="stylesheet" href="<%=basePath%>/plugins/colorpicker/bootstrap-colorpicker.min.css">
    <link rel="stylesheet" href="<%=basePath%>/plugins/bootstrap-markdown/css/bootstrap-markdown.min.css">
    <link rel="stylesheet" href="<%=basePath%>/plugins/adminLTE/css/AdminLTE.css">
    <link rel="stylesheet" href="<%=basePath%>/plugins/adminLTE/css/skins/_all-skins.min.css">
    <link rel="stylesheet" href="<%=basePath%>/css/style.css">
    <link rel="stylesheet" href="<%=basePath%>/plugins/ionslider/ion.rangeSlider.css">
    <link rel="stylesheet" href="<%=basePath%>/plugins/ionslider/ion.rangeSlider.skinNice.css">
    <link rel="stylesheet" href="<%=basePath%>/plugins/bootstrap-slider/slider.css">
    <link rel="stylesheet" href="<%=basePath%>/plugins/bootstrap-datetimepicker/bootstrap-datetimepicker.css">
</head>
<body class="hold-transition skin-purple sidebar-mini">
    <div class="wrapper">
        <header class="main-header">
            <a href="all-admin-index.html" class="logo">
                <span class="logo-mini"><b>课程</b></span>
                <span class="logo-lg"><b>课程</b>添加</span>
            </a>
            <nav class="navbar navbar-static-top">
                <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
                    <span class="sr-only">Toggle navigation</span>
                </a>
                <div class="navbar-custom-menu">
                    <ul class="nav navbar-nav">
                        <li class="dropdown user user-menu">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                <img src="../img/user2-160x160.jpg" class="user-image" alt="User Image">
                                <span class="hidden-xs">${USER_SESSION.tname}</span>
                            </a>
                            <ul class="dropdown-menu">
                                <li class="user-header">
                                    <img src="../img/user2-160x160.jpg" class="img-circle" alt="User Image">
                                    <p>
                                        ${USER_SESSION.tname}
                                    </p>
                                </li>
                                <li class="user-footer">
                                    <div class="pull-right">
                                        <a href="<%=basePath%>/page/login.jsp" class="btn btn-default btn-flat">注销</a>
                                    </div>
                                </li>
                            </ul>
                        </li>
                    </ul>
                </div>
            </nav>
        </header>

        <aside class="main-sidebar">
            <section class="sidebar">
                <div class="user-panel">
                    <div class="pull-left image">
                        <img src="../img/user2-160x160.jpg" class="img-circle" alt="User Image">
                    </div>
                    <div class="pull-left info">
                        <p>${USER_SESSION.tname}</p>
                        <a href="#"><i class="fa fa-circle text-success"></i> 在线</a>
                    </div>
                </div>
                <ul class="sidebar-menu">
                    <li class="header">菜单</li>
                    <li class="treeview">
                        <a href="#">
                            <i class="fa fa-folder"></i> <span>功能菜单</span>
                            <span class="pull-right-container">
                        <i class="fa fa-angle-left pull-right"></i>
                    </span>
                        </a>
                        <ul class="treeview-menu">
                            <li>
                                <a href="<%=basePath%>/applyController/showApplyAll"><i class="fa fa-circle-o" ></i>查看申请课程 </a>
                            </li>
                            <li>
                                <a href="<%=basePath%>/CourseController/showCourseAll"><i class="fa fa-circle-o" ></i>查看已经开设课程 </a>
                            </li>
                        </ul>
                    </li>
                </ul>
            </section>
        </aside>

        <div class="content-wrapper">
            <section class="content-header">
                <h1>
                    课程
                    <small>添加课程</small>
                </h1>
                <ol class="breadcrumb">
                    <li><a href="all-admin-index.html"><i class="fa fa-dashboard"></i> 首页</a></li>
                    <li class="active">添加课程</li>
                </ol>
            </section>
            <!-- 内容头部 /-->

            <!-- 正文区域 -->
            <section class="content">

                <form method="get" name="formTest">
                <!--订单信息-->
                <div class="panel panel-default">
                    <div class="panel-heading">教师申请</div>
                    <div class="row data-type">
                        <div class="form-group">
                            <label>申请教师的编号</label>
                            <input type="text" class="form-control"  placeholder="请输入教师编号" name="extreaTecUser" id="extreaTecUser">
                        </div>
                        <div class="form-group">
                            <label>课程名称</label>
                            <input type="text" class="form-control" name="acname" placeholder="课程名"  id="acname">
                        </div>

                        <div class="form-group">
                            <label>开设课程性质</label>
                            <select class="form-control select2" style="width: 100%;" name="actype" id="actype">
                                <option selected="selected" value="考试">考试</option>
                                <option value="考查">考查</option>
                            </select>
                        </div>
                        <div class="form-group">
                            <label>课程学科类别</label>
                            <select class="form-control select2" style="width: 100%;" name="accategory" id="accategory">
                                <option selected="selected" value="先修">先修</option>
                                <option value="后修">后修</option>
                                <option value="选秀">选秀</option>
                                <option disabled="disabled">待选</option>
                            </select>
                        </div>
                        <div class="form-group">
                            <label>团队成员教师人数</label>
                            <input type="text" class="form-control" value="0" name="teachernum" id="teachernum">
                        </div>





                    </div>
                    <!--工具栏-->
                    <div class="box-tools text-center">
                        <button type="button" class="btn bg-maroon" onclick="insert()">添加</button>
                        <button type="button" class="btn bg-default" onclick="history.back(-1);">返回</button>
                    </div>
                    <!--工具栏/-->
                </div>

                </form>


            </section>
            <!-- 正文区域 /-->

        </div>
        <!-- 内容区域 /-->



    </div>


    <script src="../plugins/jQuery/jquery-2.2.3.min.js"></script>
    <script src="../plugins/jQueryUI/jquery-ui.min.js"></script>
    <script>
        $.widget.bridge('uibutton', $.ui.button);
    </script>
    <script src="<%=basePath%>/plugins/bootstrap/js/bootstrap.min.js"></script>
    <script src="<%=basePath%>/plugins/raphael/raphael-min.js"></script>
    <script src="<%=basePath%>/plugins/morris/morris.min.js"></script>
    <script src="<%=basePath%>/plugins/sparkline/jquery.sparkline.min.js"></script>
    <script src="<%=basePath%>/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
    <script src="<%=basePath%>/plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
    <script src="<%=basePath%>/plugins/knob/jquery.knob.js"></script>
    <script src="<%=basePath%>/plugins/daterangepicker/moment.min.js"></script>
    <script src="<%=basePath%>/plugins/daterangepicker/daterangepicker.js"></script>
    <script src="<%=basePath%>/plugins/daterangepicker/daterangepicker.zh-CN.js"></script>
    <script src="<%=basePath%>/plugins/datepicker/bootstrap-datepicker.js"></script>
    <script src="<%=basePath%>/plugins/datepicker/locales/bootstrap-datepicker.zh-CN.js"></script>
    <script src="<%=basePath%>/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
    <script src="<%=basePath%>/plugins/slimScroll/jquery.slimscroll.min.js"></script>
    <script src="<%=basePath%>/plugins/fastclick/fastclick.js"></script>
    <script src="<%=basePath%>/plugins/iCheck/icheck.min.js"></script>
    <script src="<%=basePath%>/plugins/adminLTE/js/app.min.js"></script>
    <script src="<%=basePath%>/plugins/treeTable/jquery.treetable.js"></script>
    <script src="<%=basePath%>/plugins/select2/select2.full.min.js"></script>
    <script src="<%=basePath%>/plugins/colorpicker/bootstrap-colorpicker.min.js"></script>
    <script src="<%=basePath%>/plugins/bootstrap-wysihtml5/bootstrap-wysihtml5.zh-CN.js"></script>
    <script src="<%=basePath%>/plugins/bootstrap-markdown/js/bootstrap-markdown.js"></script>
    <script src="<%=basePath%>/plugins/bootstrap-markdown/locale/bootstrap-markdown.zh.js"></script>
    <script src="<%=basePath%>/plugins/bootstrap-markdown/js/markdown.js"></script>
    <script src="<%=basePath%>/plugins/bootstrap-markdown/js/to-markdown.js"></script>
    <script src="<%=basePath%>/plugins/ckeditor/ckeditor.js"></script>
    <script src="<%=basePath%>/plugins/input-mask/jquery.inputmask.js"></script>
    <script src="<%=basePath%>/plugins/input-mask/jquery.inputmask.date.extensions.js"></script>
    <script src="<%=basePath%>/plugins/input-mask/jquery.inputmask.extensions.js"></script>
    <script src="<%=basePath%>/plugins/datatables/jquery.dataTables.min.js"></script>
    <script src="<%=basePath%>/plugins/datatables/dataTables.bootstrap.min.js"></script>
    <script src="<%=basePath%>/plugins/chartjs/Chart.min.js"></script>
    <script src="<%=basePath%>/plugins/flot/jquery.flot.min.js"></script>
    <script src="<%=basePath%>/plugins/flot/jquery.flot.resize.min.js"></script>
    <script src="<%=basePath%>/plugins/flot/jquery.flot.pie.min.js"></script>
    <script src="<%=basePath%>/plugins/flot/jquery.flot.categories.min.js"></script>
    <script src="<%=basePath%>/plugins/ionslider/ion.rangeSlider.min.js"></script>
    <script src="<%=basePath%>/plugins/bootstrap-slider/bootstrap-slider.js"></script>
    <script src="<%=basePath%>/plugins/bootstrap-datetimepicker/bootstrap-datetimepicker.js"></script>
    <script src="<%=basePath%>/plugins/bootstrap-datetimepicker/locales/bootstrap-datetimepicker.zh-CN.js"></script>
    <script>
        $(document).ready(function() {
            // 选择框
            $(".select2").select2();

            // WYSIHTML5编辑器
            $(".textarea").wysihtml5({
                locale: 'zh-CN'
            });
        });


        // 设置激活菜单
        function setSidebarActive(tagUri) {
            var liObj = $("#" + tagUri);
            if (liObj.length > 0) {
                liObj.parent().parent().addClass("active");
                liObj.addClass("active");
            }
        }



        function insert(){
            var acname = document.getElementById("acname").value;

            var actype = document.getElementById("actype").value;
            var accategory = document.getElementById("accategory").value;

            var teachernum = document.getElementById("teachernum").value;
            var extreaTecUser = document.getElementById("extreaTecUser").value;



            document.formTest.action="<%=basePath%>/applyController/insertApplyCourse?acname="+acname+"&actype="+actype+"&accategory="+accategory+"&teachernum="+teachernum+"&extreaTecUser="+extreaTecUser;
            document.formTest.submit();
        }

        $(document).ready(function() {
            $('#datepicker-a3').datepicker({
                autoclose: true,
                language: 'zh-CN'
            });
        });


        $(document).ready(function() {
            $('#datepicker-a6').datepicker({
                autoclose: true,
                language: 'zh-CN'
            });
        });


        $(document).ready(function() {
            // 激活导航位置
            setSidebarActive("order-manage");
        });
    </script>
</body>

</html>