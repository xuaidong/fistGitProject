<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	String path = request.getContextPath();
out.print(path+"<br/>");
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	out.print(basePath+"<br/>");
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>My Test</title>
<script type="text/javascript" src="<%=basePath%>/js/jquery-easyui-1.4.1/jquery.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){ 
	var path = '<%=basePath%>';
	$("#add").click(function(){
		alert("增");
		/* var arr = [{
					"sName":"张三",
			        "sSex":"boy"
			        }]; */   /* 数组 */
		var arr = {
			"sName":"张三",
	        "sSex":"boy"
	        };
		$.ajax({
			type : "POST",
			url : path+"/stu/addStu",
			contentType: 'application/json;charset=utf-8',
			data : JSON.stringify(arr),
			success: function(data){
		        alert(data);
		      }
			});
		
	});
	
	$("#del").click(function(){
		alert("删");
		$.post(path+"/stu/delStuByName",{"sName" : "张三"},function(data){
					alert(data);
				},"json");
		});
	
	$("#selOne").click(function(){
		alert("查1");
		$.post(path+"/stu/findStuById",{"sId" : 2},function(data){
			alert(data);
		},"json");
	});

	$("#selAll").click(function(){
		alert("查All");
		$.post(path+"/stu/findAllStus",{},function(data){
			$("#res").html("");
			$.each(data,function(k,v){
				$("#res").append(k+":------------------<br/>");
				$.each(v,function(kk,vv){
					$("#res").append(kk+":"+vv+"<br/>");
				});
				
			});
		},"json");
	});
	
});

</script>
</head>
<body>
	<div id="query">
		<button id="add">addStu</button>
		<button id="del">delStuById</button>
		<button id="selOne">findStuById</button>
		<button id="selAll">findAllStus</button>
	</div>
	
	<div id="res">
	</div>
</body>
</html>