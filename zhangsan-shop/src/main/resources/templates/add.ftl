<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/bootstrap.min.css">
<script type="text/javascript" src="/js/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="/js/popper.min.js"></script>
<script type="text/javascript" src="/js/bootstrap.min.js"></script>
</head>
<body>
			<form action="add" method="post">
			编号<input type="text" name="sid">
			店铺<input type="text" name="sname"><br>
			创建日期<input type="date" name="stime"><br>
			销售商品<#list goods as g>
			<input type="checkbox" name="gids" value="${g.gid}">${g.gname}
			</#list><br>
			<input type="submit" value="添加">
			
			</form>
</body>
</html>