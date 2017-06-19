<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>briup电子商务-首页</title>
<link rel="stylesheet" href="css/common.css" />
<link rel="stylesheet" href="css/style.css" />
<link rel="stylesheet" href="css/icons.css" />
<link rel="stylesheet" href="css/table.css" />
<script type="text/javascript">
	
</script>
</head>
<body>
	<!--顶部-->
	<div class="top">
		<div class="top_center">
			<ul class="top_bars">
				<li>${member.name}</li>
				<li><c:if test="${member.name==null}">
						<a id=intOut href="login"><input type="button" value="登录"></a>
					</c:if> <c:if test="${member.name!=null}">
						<a id=intOut href="logout"><input type="button" value="退出"></a>
					</c:if> |</li>
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
				<input type="text" /> <span>搜索</span>
			</div>
			<p>
				<c:forEach items="${pFTList}" var="productFirstType">
					<a href="#">${productFirstType.name}</a>|
            	
                </c:forEach>
			</p>
		</div>
		<div class="h3_right">
			<div class="myyy">
				<a href="userinfo?id=0">个人信息</a>
			</div>
			<div class="tsc">
				<a href="carInfo">去购物车结算</a>
			</div>
		</div>
	</div>
	
	<!--头部导航-->
	<div class="nav_top">
		<div class="nav_top_center">
			<div>全部图书分类</div>
			<ul>
				<c:forEach items="${pFTList}" var="productFirstType">
					<li><a href="#">${productFirstType.name}</a></li>
				</c:forEach>
			</ul>
		</div>
	</div>

	<div class="container3">
		<div class="c3_b1">
			<div class="c3_b1_left">
				<dl>
					<c:forEach items="${pFTList}" var="productFirstType">
						<dd>

							<h1>${productFirstType.name}</h1>

							<p>
								<c:forEach items="${map.get(productFirstType)}"
									var="productSecondType">
									<a href="#">${productSecondType.name}</a>
								</c:forEach>
							</p>




						</dd>
					</c:forEach>
					<!-- <dd>
						<h1>教育类</h1>
						<p>
							<a href="#">教育</a> <a href="#">教育</a> <a href="#">教育</a> <a
								href="#">教育</a>
						</p>
					</dd>
					<dd>
						<h1>计算机</h1>
						<p>
							<a href="#">计算机</a> <a href="#">计算机</a> <a href="#">计算机</a>
						</p>
					</dd>
					<dd>
						<h1>儿童类</h1>
						<p>
							<a href="#">图书</a> <a href="#">图书</a> <a href="#">图书</a> <a
								href="#">图书</a>
						</p>
					</dd>
					<dd>
						<h1>漫画类</h1>
						<p>
							<a href="#">漫画</a> <a href="#">漫画</a> <a href="#">漫画</a> <a
								href="#">漫画</a>
						</p>
					</dd>
					<dd>
						<h1>工具书</h1>
						<p>
							<a href="#">工具书</a> <a href="#">工具书</a> <a href="#">工具书</a>
						</p>
					</dd>
					<dd class="last">
						<h1>期刊</h1>
						<p>
							<a href="#">期刊</a> <a href="#">期刊</a> <a href="#">期刊</a> <a
								href="#">期刊</a>
						</p>
					</dd> -->
				</dl>
			</div>
			<div class="c3_b1_center">
				<div>
					<a href="#"><img src="images/ad1.png"></a>
				</div>
				<div class="c3_b1_c_bottom">
					<ul>
						<c:forEach items="${productList}" var="product">
							<li><a href="productInfo?id=${product.id }"><img
									src="${product.image }" /><br>${product.name }</a></li>
						</c:forEach>

						<!-- <li><a href="#"><img src="images/p01.png" /></a> <a href="#">Java从入门到精通</a>
						</li>
						<li><a href="#"><img src="images/p01.png" /></a> <a href="#">Java从入门到精通</a>
						</li> -->
					</ul>
				</div>
			</div>
			<div class="c3_b1_right">
				<h1>
					杰普快报<a href="#">更多</a>
				</h1>
				<ul>
					<li><a href="#">〈加措〉相信这一切都是对我们最好的安排 </a></li>
					<li><a href="#">〈加措〉相信这一切都是对我们最好的安排 </a></li>
					<li><a href="#">〈加措〉相信这一切都是对我们最好的安排 </a></li>
					<li><a href="#">〈加措〉相信这一切都是对我们最好的安排 </a></li>
					<li><a href="#">〈加措〉相信这一切都是对我们最好的安排 </a></li>
					<li><a href="#">〈加措〉相信这一切都是对我们最好的安排 </a></li>
					<li><a href="#">〈加措〉相信这一切都是对我们最好的安排 </a></li>
					<li><a href="#">〈加措〉相信这一切都是对我们最好的安排 </a></li>
					<li><a href="#">〈加措〉相信这一切都是对我们最好的安排 </a></li>
					<li><a href="#">〈加措〉相信这一切都是对我们最好的安排 </a></li>
					<li><a href="#">〈加措〉相信这一切都是对我们最好的安排 </a></li>
					<li><a href="#">〈加措〉相信这一切都是对我们最好的安排 </a></li>
					<li><a href="#">〈加措〉相信这一切都是对我们最好的安排 </a></li>
					<li><a href="#">〈加措〉相信这一切都是对我们最好的安排 </a></li>
					<li><a href="#">〈加措〉相信这一切都是对我们最好的安排 </a></li>
				</ul>
			</div>
			<div style="clear: both"></div>
		</div>
		<div class="c3_b2">
			<ul>
				<c:forEach items="${productList2}" var="product2">
					<li><a href="productInfo?id=${product2.id }">
							<div class="c3_b2_txt">
								<h1>${product2.name }</h1>
								<p>Java经典</p>
								<h2>畅销书籍</h2>
								<h2>覆盖java基础及全新内容</h2>
								<p>
									<a href="#">更多精彩，点击进入</a>
								</p>
							</div>
					</a></li>
				</c:forEach>
				<!-- <li>
					<div class="c3_b2_txt">
						<h1>疯狂JAVA讲义</h1>
						<p>Java经典</p>
						<h2>畅销书籍</h2>
						<h2>覆盖java基础及全新内容</h2>
						<p>
							<a href="#">更多精彩，点击进入</a>
						</p>
					</div>
				</li>
				<li>
					<div class="c3_b2_txt">
						<h1>疯狂JAVA讲义</h1>
						<p>Java经典</p>
						<h2>畅销书籍</h2>
						<h2>覆盖java基础及全新内容</h2>
						<p>
							<a href="#">更多精彩，点击进入</a>
						</p>
					</div>
				</li>
				<li class="no_mr">
					<div class="c3_b2_txt">
						<h1>疯狂JAVA讲义</h1>
						<p>Java经典</p>
						<h2>畅销书籍</h2>
						<h2>覆盖java基础及全新内容</h2>
						<p>
							<a href="#">更多精彩，点击进入</a>
						</p>
					</div>
				</li>
				<li>
					<div class="c3_b2_txt">
						<h1>疯狂JAVA讲义</h1>
						<p>Java经典</p>
						<h2>畅销书籍</h2>
						<h2>覆盖java基础及全新内容</h2>
						<p>
							<a href="#">更多精彩，点击进入</a>
						</p>
					</div>
				</li>
				<li>
					<div class="c3_b2_txt">
						<h1>疯狂JAVA讲义</h1>
						<p>Java经典</p>
						<h2>畅销书籍</h2>
						<h2>覆盖java基础及全新内容</h2>
						<p>
							<a href="#">更多精彩，点击进入</a>
						</p>
					</div>
				</li>
				<li>
					<div class="c3_b2_txt">
						<h1>疯狂JAVA讲义</h1>
						<p>Java经典</p>
						<h2>畅销书籍</h2>
						<h2>覆盖java基础及全新内容</h2>
						<p>
							<a href="#">更多精彩，点击进入</a>
						</p>
					</div>
				</li>
				<li class="no_mr">
					<div class="c3_b2_txt">
						<h1>疯狂JAVA讲义</h1>
						<p>Java经典</p>
						<h2>畅销书籍</h2>
						<h2>覆盖java基础及全新内容</h2>
						<p>
							<a href="#">更多精彩，点击进入</a>
						</p>
					</div>
				</li> -->

			</ul>
		</div>
		<div class="c20"></div>
		<jsp:include page="foot.jsp"></jsp:include>
</body>
</html>
