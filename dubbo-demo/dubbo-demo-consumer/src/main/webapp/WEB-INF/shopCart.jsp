<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
	<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
	<title>购物车页面</title>
<link rel="stylesheet" href="css/fullCar.css" />
<link rel="stylesheet" href="css/common.css"/>
<link rel="stylesheet" href="css/style.css" />
<link rel="stylesheet" href="css/icons.css" />
<link rel="stylesheet" href="css/table.css" />
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
    	<a href="#"><img src="images/logo.png"  class="oneImg"></a>
    	

        <div class="h3_right">
        	<img src="images/play_03.png" alt="">
        </div>
       
    </div>
<!--中间部分div-->
<div class="empty">
	<div class="peisong"><pre>全部商品  2 </pre></div>
	<div class="mainCenter">
		<div class="allCheck">
			<input type="checkbox"><p>全选</p>
			<p class="leftM">商品</p>
			<p class="rightM">单价(元)</p>
			<p class="leftM">数量</p>
			<p class="leftM">小计(元)</p>
			<p class="leftM">操作</p>
		</div>
		<div class="mainPro">
			
			<div class="aa">
				<input type="checkbox"><span id="but">自营</span>
			</div>
			
			<c:forEach items="${products}" var="product">
			<div class="bb">
				<input type="checkbox" >
				<img src="${product.image }" >
				 <span>
                   	${product.name }
                    <br>
                </span>
                <div class="mm">
                	<span>¥${product.price }</span>
                </div>
                <div class="pro_buy_nums">
                        	<input type="text" value="1"/>
                            	<button>+</button>
                                <button>+</button>
                        </div>
                <div class="ri">¥${product.price }元</div>
               	<div class="righ">
               		 <a href="deleteCar"><div class="rig">删除</div></a>
               	</div>
			</div>
			</c:forEach>
				
			<!-- <div class="bb">
				<input type="checkbox" >
				<img src="images/2.png" >
				 <span>
                  		 深入JAVA虚拟机
                    <br>
                </span>
                <div class="mm">
                	<span>¥66.00</span>
                </div>
                <img src="images/have_03.png" style="margin-top:40px">
                <div class="ri">¥66.00元</div>
               	<div class="righ">
               		 <div class="rig">删除</div>
               	</div>
			</div> -->
			
		</div>
		<div class="allButtom">
			<a href="order"><p class="caozuo">去结算</p></a>
			<span>已选择<font>2</font>件商品&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;总价(不含运费)：<font>¥132.00元</font></span>
		</div>
	</div>
</div>
     <jsp:include page="foot.jsp"></jsp:include>
</body>
</html>