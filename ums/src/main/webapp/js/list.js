$('#listUser').datagrid({
    url:'user/list',
	fitColumns:true,
	singleSelect:true,
	pagination:true,
    columns:[[
        {field:'id',title:'编号',width:100,align:'center'},
        {field:'name',title:'姓名',width:100,align:'center'},
        {field:'birthday',title:'生日',width:100,align:'center'},
        {field:'gender',title:'性别',width:100,align:'center'},
        {field:'career',title:'职位',width:100,align:'center'},
        {field:'address',title:'地址',width:100,align:'center'},
        {field:'mobile',title:'电话',width:100,align:'center'},
        {field:'operator',title:'操作',width:100,align:'center', 
        	formatter: function(value,row,index){
			var returnStr = '<a class="detailBtn" href="javascript:void(0);" onClick="detailUser('
				+ index +')">详情</a>&nbsp;&nbsp;'
				+ '<a class="modifyBtn" href="javascript:void(0);" onClick="modifyUser('
				+ index +')">修改</a>'
				+ '<script>$(".detailBtn").linkbutton({iconCls: "icon-search"});'
				+ '$(".modifyBtn").linkbutton({iconCls: "icon-edit"});</script>';
			return returnStr;
		}}]],
});


function detailUser(index){
	var currRow = $('#listUser').datagrid("getRows")[index];
	$("#detailUser").dialog("open");
	$("#did").val(currRow.id);
	$("#dname").val(currRow.name);
	$("#dbirthday").val(currRow.birthday);
	$("#dgender").val(currRow.gender);
	$("#dcareer").val(currRow.career);
	$("#daddress").val(currRow.address);
	$("#dmobile").val(currRow.mobile);
}

$("#detailUser").dialog({
	width:300,
	closable :false,
	title:"用户详情"
});
$("#detailUser").dialog("close");

$("#closeDBtn").linkbutton({
	iconCls: "icon-cancel",
	onClick: function(){
		$("#detailUser").dialog("close");
	}});

function modifyUser(index){
	var currRow = $('#listUser').datagrid("getRows")[index];
	$("#modifyUser").dialog("open");
	$("#uid").val(currRow.id);
	$("#uname").val(currRow.name);
	$("#ubirthday").val(currRow.birthday);
	$("#ugender").val(currRow.gender);
	$("#ucareer").val(currRow.career);
	$("#uaddress").val(currRow.address);
	$("#umobile").val(currRow.mobile);
}

$("#modifyUser").dialog({
	width:300,
	closable :false,
	title:"修改用户"
});
$("#modifyUser").dialog("close");

$("#closeBtn").linkbutton({
	iconCls: "icon-cancel",
	onClick: function(){
		$("#modifyUser").dialog("close");
	}});

$("#modifyBtn").linkbutton({
	iconCls: "icon-ok",
	onClick: function(){
		//$("#modifyUser").dialog("close");
		$("#modifyForm").submit();
	}});

$("#modifyForm").form({
	url:"user/modify",
	success:function(data){
		$("#modifyUser").dialog("close");
		var data = data.trim();
		if(data == "true"){
			$('#listUser').datagrid("reload");
		}
		$.messager.show({
			title:'修改用户',
			msg: data == "true" ? "修改用户成功..." : "修改用户失败！！！",
			showType:'show',
			style:{
				top:document.body.scrollTop+document.documentElement.scrollTop + 20,
			}
		});

	}
});