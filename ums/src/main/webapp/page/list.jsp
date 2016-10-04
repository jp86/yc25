<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<base href="/ums/">
<meta charset="UTF-8">
<title>用户信息</title>
<link rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css">
<link rel="stylesheet" type="text/css" href="css/list.css">
</head>
<body>
	
	<table id="listUser"></table>
	
	<div id="modifyUser">
		<form id="modifyForm" method="post">
			<p><input name="id" readonly="readonly" id="uid"></p>
			<p><input name="name"  id="uname" required="required" placeholder="请输入姓名"></p>
			<p><input type="date" name="birthday"  id="ubirthday" required="required" 
			placeholder="请输入生日" ></p>
			<p><input name="gender"  id="ugender" required="required" placeholder="请输入性别"></p>
			<p><input name="career"  id="ucareer" required="required" placeholder="请输入职位"></p>
			<p><input name="address"  id="uaddress" required="required" placeholder="请输入地址"></p>
			<p><input type="tel" name="mobile"  id="umobile" required="required" placeholder="请输入电话"></p>
			<a id="modifyBtn" href="javascript:void(0);">修改</a>
			<a id="closeBtn" href="javascript:void(0);">关闭</a>
		</form>
	</div>
	
	<div id="detailUser">
		<form id="detailForm">
			<p>编号:<input name="id" readonly="readonly" id="did"></p>
			<p>姓名:<input name="name"  id="dname" readonly="readonly"></p>
			<p>生日:<input name="birthday"  id="dbirthday" readonly="readonly"></p>
			<p>性别:<input name="gender"  id="dgender" readonly="readonly"></p>
			<p>职位:<input name="career"  id="dcareer" readonly="readonly"></p>
			<p>地址:<input name="address"  id="daddress" readonly="readonly"></p>
			<p>电话:<input name="mobile"  id="dmobile" readonly="readonly"></p>
			<a id="closeDBtn" href="javascript:void(0);">关闭</a>
		</form>
	</div>
	
	
	<script type="text/javascript" src="easyui/jquery.min.js"></script>
	<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="easyui/locale/easyui-lang-zh_CN.js"></script>
	<script type="text/javascript" src="js/list.js"></script>
</body>
</html>