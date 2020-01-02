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
                            <label>开课学期</label>
                            <select class="form-control select2" style="width: 100%;" id="semester" name="semester">
                                <option selected="selected" value="大一上学期">大一上学期</option>
                                <option value="大一下学期">大一下学期</option>
                                <option value="大二上学期">大二上学期</option>
                                <option value="大二下学期">大二下学期</option>
                                <option value="大三上学期">大三上学期</option>
                                <option value="大三下学期">大三下学期</option>
                                <option value="大四上学期">大四上学期</option>
                                <option value="大四下学期">大四下学期</option>
                            </select>
                        </div>

                        <div class="form-group">
                            <label>开始时间</label>
                            <input type="date" class="form-control" value="2019-12-28" name="st" id="st">
                        </div>
                        <div class="form-group">
                            <label>结束时间</label>
                            <input type="date" class="form-control" value="2019-12-28" name="et" id="et">
                        </div>



                        <div class="form-group">
                            <label>先修知识</label>
                            <input type="text" class="form-control" value="高等数学" name="earlystudy" id="earlystudy">
                        </div>
                        <div class="form-group">
                            <label>课程描述</label>
                            <textarea class="form-control" rows="3" placeholder="Enter ..." id="courdesc" name="courdesc"></textarea>
                        </div>


                        <input type="hidden" class="form-control" value="${param.id}" name="id" id="id">

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


    <script src="<%=basePath%>/plugins/jQuery/jquery-2.2.3.min.js"></script>
    <script src="<%=basePath%>/plugins/jQueryUI/jquery-ui.min.js"></script>
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

        function insert(){
            // alert("test");
            var semester = document.getElementById("semester").value;


            var st = document.getElementById("st").value;
            var et = document.getElementById("et").value;

            var earlystudy = document.getElementById("earlystudy").value;

            var courdesc = document.getElementById("courdesc").value;

            var id = document.getElementById("id").value;


            document.formTest.action="<%=basePath%>/applyController/agreeApply?semester="+semester+"&st="+st+"&earlystudy="+earlystudy+"&courdesc="+courdesc+"&et="+et+"&id="+id;
            <%--document.formTest.action="<%=basePath%>/applyController/agreeApply?semester="+semester+"&earlystudy="+earlystudy+"&courdesc="+courdesc+"&id="+id;--%>
            document.formTest.submit();
        }


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


        $(function() {
            //Initialize Select2 Elements
            //$(".select2").select2();

            //Datemask dd/mm/yyyy
            $("#datemask").inputmask("dd/mm/yyyy", {
                "placeholder": "dd/mm/yyyy"
            });
            //Datemask2 mm/dd/yyyy
            $("#datemask2").inputmask("mm/dd/yyyy", {
                "placeholder": "mm/dd/yyyy"
            });
            //Money Euro
            $("[data-mask]").inputmask();

            //Date range picker
            $('#reservation').daterangepicker({
                locale: {
                    applyLabel: '确认',
                    cancelLabel: '取消',
                    fromLabel: '起始时间',
                    toLabel: '结束时间',
                    customRangeLabel: '自定义',
                    firstDay: 1
                },
                opens: 'left', // 日期选择框的弹出位置
                separator: ' 至 '
                //showWeekNumbers : true,     // 是否显示第几周
            });
            //Date range picker with time picker
            $('#reservationtime').daterangepicker({
                timePicker: true,
                timePickerIncrement: 30,
                format: 'MM/DD/YYYY h:mm A',
                locale: {
                    applyLabel: '确认',
                    cancelLabel: '取消',
                    fromLabel: '起始时间',
                    toLabel: '结束时间',
                    customRangeLabel: '自定义',
                    firstDay: 1
                },
                opens: 'right', // 日期选择框的弹出位置
                separator: ' 至 '
            });
            //Date range as a button
            $('#daterange-btn').daterangepicker({
                    locale: {
                        applyLabel: '确认',
                        cancelLabel: '取消',
                        fromLabel: '起始时间',
                        toLabel: '结束时间',
                        customRangeLabel: '自定义',
                        firstDay: 1
                    },
                    opens: 'right', // 日期选择框的弹出位置
                    separator: ' 至 ',
                    ranges: {
                        '今日': [moment(), moment()],
                        '昨日': [moment().subtract(1, 'days'), moment().subtract(1, 'days')],
                        '最近7日': [moment().subtract(6, 'days'), moment()],
                        '最近30日': [moment().subtract(29, 'days'), moment()],
                        '本月': [moment().startOf('month'), moment().endOf('month')],
                        '上个月': [moment().subtract(1, 'month').startOf('month'), moment().subtract(1, 'month').endOf('month')]
                    },
                    startDate: moment().subtract(29, 'days'),
                    endDate: moment()
                },
                function(start, end) {
                    $('#daterange-btn span').html(start.format('MMMM D, YYYY') + ' - ' + end.format('MMMM D, YYYY'));
                }
            );

            //Date picker
            $('#datepicker').datepicker({
                autoclose: true,
                format: 'mm/dd/yyyy'
            });

            // datetime picker
            $('#dateTimePicker').datetimepicker({
                format: 'MM/DD/YYYY hh:mm A'
            });

            //iCheck for checkbox and radio inputs
            $('input[type="checkbox"].minimal, input[type="radio"].minimal').iCheck({
                checkboxClass: 'icheckbox_minimal-blue',
                radioClass: 'iradio_minimal-blue'
            });
            //Red color scheme for iCheck
            $('input[type="checkbox"].minimal-red, input[type="radio"].minimal-red').iCheck({
                checkboxClass: 'icheckbox_minimal-red',
                radioClass: 'iradio_minimal-red'
            });
            //Flat red color scheme for iCheck
            $('input[type="checkbox"].flat-red, input[type="radio"].flat-red').iCheck({
                checkboxClass: 'icheckbox_flat-green',
                radioClass: 'iradio_flat-green'
            });

            //Colorpicker
            $(".my-colorpicker1").colorpicker();
            //color picker with addon
            $(".my-colorpicker2").colorpicker();

            //Timepicker
            $(".timepicker").timepicker({
                showInputs: false
            });
        });


        // 激活导航位置
        setSidebarActive("form-advanced");
    </script>
</body>

</html>