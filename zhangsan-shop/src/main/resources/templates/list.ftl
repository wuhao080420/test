<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/bootstrap.min.css">
<script type="text/javascript" src="/js/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="/js/popper.min.js"></script>
<script type="text/javascript" src="/js/bootstrap.min.js"></script>

<script type="text/javascript">
				function ps(){
					
					$.post(
					'delall.do',
					{ids:ids},
					function(msg){
						if(msg){
							alert("删除成功");
							location='list';
						}else{
							alert("删除失败")
						}
					}
					)
					
				}

</script>
</head>
<body>
<form action="list" method="post">
<input type="hidden" name="pageNum">
<input type="text" name="sname" value="${map.sname}"> 
<input type="submit" value="搜索">
</form><input type="button"  value="批量删除" onclick="ps()">
			<table class="table table-dark">
			<tr>
			<td>
			<input type="checkbox" >	
			</td>
			<td>编号</td>
			<td>店铺名称</td>
			<td>创建日期</td>
			<td>销售商品</td>
			<td>操作
			<input type="button" onclick="location='toadd'" value="添加">
			</td>
			</tr>
			<#list page.list as s>
			<tr>
			<td>
			<input type="checkbox" name="ids" value="${s.sid}">
			</td>
			<td>${s.sid}</td>
			<td>${s.sname}</td>
			<td>${s.stime?string("yyyy-MM-dd")}</td>
			<td>${s.gnames}</td>
			<td>
			<input type="button" value="详情"  onclick="location='tolook?sid=${s.sid}'">	
			</td>
			</tr>
			
			</#list>
			
			
			</table>
			<#include "page.ftl" >
</body>
</html>