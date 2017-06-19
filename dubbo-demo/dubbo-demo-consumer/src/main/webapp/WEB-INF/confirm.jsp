<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<base href="<%=basePath %>"/>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
<title>结算页面</title>
<link rel="stylesheet" href="css/common.css" />
<link rel="stylesheet" href="css/icons.css" />
<link rel="stylesheet" href="css/table.css" />
<link rel="stylesheet" href="css/orderSure.css" />
</head>
<body>
	<!--顶部-->
	<div class="top">
		<div class="top_center">
			<ul class="top_bars">
				<li><a href="#">退出</a>|</li>
				<li><a href="#">我的订单<span class="jt_down"></span></a>|</li>
				<li><a href="#">关注杰普<span class="jt_down"></span></a>|</li>
				<li><a href="#">网站导航<span class="jt_down"></span></a></li>
			</ul>
		</div>
	</div>
	<!--头部-->
	<div class="header3">
		<a href="#"><img src="images/logo.png" class="oneImg"></a>


		<div class="h3_right">
			<img src="images/play_03.png" alt="">
		</div>

	</div>
	<p class="orderButtom">填写并核对订单信息</p>
	<!--中间复杂部分-->
	<div class="content">
		<div class="contentCenter">
			<div class="centerTop">
				<b style="font-size: 20px;">收货人信息</b>
				<p style="font-size: 15px;">
					收件人姓名：<input type="text" name="name"><br />
					<br /> 收件人地址：<input type="text" name="address" class=""><br />
					<br /> 收件人电话：<input type="text" name="tel">
				</p>
			</div>
			<p class="singleP">
				<b>送货清单</b><span><a href="carInfo">返回修改购物车</a></span>
			</p>
			<div class="bigDiv">
				<div class="twoDiv">
					<b>商家：briup自营</b>
					<ul class="oneUL">
						<li><img src="images/viewBook.png" class="pic">
							<p>计算机&nbsp;&nbsp;JAVA&nbsp;&nbsp;Effective JAVA&nbsp;&nbsp;</p>
							<p>
								<font>¥100169.00</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;×1&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;有货
							</p>
							<p>
								<img src="images/sureLogo_14.png" alt=""><span>七天无理由退换货</span>
							</p></li>
						<li><pre>【赠品】  高级定制干花书签  随机  ×1</pre></li>
					</ul>
					<ul class="oneUL">
						<li><img src="images/viewBook.png" class="pic">
							<p>计算机&nbsp;&nbsp;JAVA&nbsp;&nbsp;Effective JAVA&nbsp;&nbsp;</p>
							<p>
								<font>¥100169.00</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;×1&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;有货
							</p>
							<p>
								<img src="images/sureLogo_14.png" alt=""><span>七天无理由退换货</span>
							</p></li>
						<li><pre>【赠品】  高级定制干花书签  随机 ×1</pre></li>
					</ul>
				</div>
			</div>

			<div class="money">
				<span><font>2</font>件商品，总商品金额：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;¥14699</span>
				<span><img src="images/sureLogo_18.png" alt="">运费：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;¥0.00</span>

				<span>应付总额：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;¥1470.00</span>
			</div>
			<div class="submit">
				<span>应付金额：<font>¥14699.00</font><img src="images/21_03.png"
					alt=""></span>
			</div>
		</div>

	</div>
<jsp:include page="foot.jsp"></jsp:include>
</body>
</html>