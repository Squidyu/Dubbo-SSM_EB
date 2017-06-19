<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>briup安全中心</title>
<link rel="stylesheet" href="css/common.css"/>
<link rel="stylesheet" href="css/style.css" />
<link rel="stylesheet" href="css/icons.css" />
<link rel="stylesheet" href="css/table.css" />
<link rel="stylesheet" href="css/newmain.css" />
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
    	<a href="#"><img src="images/logo.png"></a>
    	<div class="h3_center">
        	<div class="search_box">
            	<input type="text"/>
                <span>搜索</span>
            </div>
            <p>
            	<c:forEach items="${pFTList}" var="productFirstType">
					<a href="#">${productFirstType.name}</a>|
            	
                </c:forEach>
            	<!-- <a href="#">教育类</a>|
                <a href="#">计算机</a>|
                <a href="#">儿童类</a>|
                <a href="#">漫画类</a>| -->
            </p>
        </div>
        <div class="h3_right">
        	<div class="myyy">
            	个人信息
                <span class="sj_down"></span>
             </div>
            <div class="tsc">
            	去购物车结算
                <span class="sj_right"></span>
            </div>
        </div>
    </div>
    <!--头部导航-->
    <div class="nav_top">
    	<div class="nav_top_center">
            <div>
                全部图书分类
            </div>
            <ul>
                <c:forEach items="${pFTList}" var="productFirstType">
					<li><a href="#">${productFirstType.name}</a></li>
				</c:forEach>
               <!--  <li><a href="#">教育类</a></li>
                <li><a href="#">计算机</a></li>
                <li><a href="#">儿童类</a></li>
                <li><a href="#">漫画类</a></li> -->
            </ul>
        </div>
    </div>
    <div class="container4">
    	<div class="register_box">
    			<div class="head">
    				<h3>找回密码</h3>
    			</div>
    			<div class="security">
    				<ul class="step">
    					<li class="green">
    						<span class="line">1</span>
    						<span>填写账户名</span>
    					</li>
    					<li class="green">
    						<span class="line">2</span>
    						<span>身份验证</span>
    					</li>
    					<li class="green">
    						<span class="line">3</span>
    						<span>设置密码</span>
    					</li>
    					<li class="green">
    						<span class="line">4</span>
    						<span>完成</span>
    					</li>
    				</ul>
					<div id="J_successWrap" style="">
						<p class="p_con">
							密码已重置！请
							<a class="more" href="login">登录>></a>
						</p>
					</div>
    			</div>
    	</div>
    </div>
 
    <jsp:include page="foot.jsp"></jsp:include>
</body>
</html>