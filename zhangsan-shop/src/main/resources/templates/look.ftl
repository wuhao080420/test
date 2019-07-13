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
			编号<input type="text" name="sid" value="${shop.sid}">
			店铺<input type="text" name="sname" value="${shop.sname}"><br>
			创建日期<input type="date" name="stime" value="${shop.stime}"><br>
			销售商品<#list goods as g>
			<input type="checkbox" name="gids" value="${g.gid}">${g.gname}
			</#list><br>
			<input type="submit" value="关闭">
</body>
</html>