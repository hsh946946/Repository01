<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.aaa{
		border-collapse: collapse;
	}
	.bbb{
		background-color: green;
	}
	.ccc{
		text-decoration: none;
	}

</style>
<script type="text/javascript" src="../jquery/jquery.min.js"></script>
<script type="text/javascript" src="../js/layer/layer.js"></script>

</head>
<body>
<button onclick="f1()">改变样式</button>
<h1>我是用户列表</h1>
<a  href="javascript:void(0);"  onclick="f4()"  >测试</a>
<table border="1" class="aaa" id="tableid">
	<tr>
	<th>用户</th>
	<th>用户姓名</th>
	<th>用户密码</th>
	<th>用户年龄</th>
	<th>操作</th>
	</tr>
	<c:forEach items="${requestScope.userlist}" var="user" varStatus="var">
		<tr>
			<td>${user.id}</td>
			<td>${user.name }</td>
			<td>${user.passoword }</td>
			<td>${user.age }</td>
			<td>
			<a  class="ccc" href="javascript:void(0);" onclick="f1(${user.id},this)">删除</a>
			<a  class="ccc"  href="javascript:void(0);" >修改</a>
			</td>
		</tr>
	</c:forEach>
</table>
<script type="text/javascript">
	$("tr:odd").css("background","red");
	
	function f1(uid,ob){
		layer.confirm('你确认删除？', {
			  btn: ['确认','取消'] //按钮
			}, function(){
				$.ajax({
					type:"post",
					url:"delete.do",
					async:true,
					data:{"uid":uid},
					dataType:"json",
					success:function(data){
						console.log($(ob).parent())
						$(ob).parent().parent().remove();
						layer.msg(data.des, {icon: 1});
					}
			})
	},function(){
		  
	});
	}
</script>
</body>
</html>