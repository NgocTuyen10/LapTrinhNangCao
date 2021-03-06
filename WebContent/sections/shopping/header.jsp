<%@page import="model.LoaiGiay"%>
<%@page import="service.LoaiGiayService"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

</head>
<body>

	<div class="header">
		<div class="headertop_desc">
			<div class="call">
				<p>
					<span>Need help?</span> call us <span class="number">1-22-3456789</span></span>
				</p>
			</div>
			<div class="account_desc">
				<ul>
					<li><a href="#">Register</a></li>
					<li><a href="#">Login</a></li>
					<li><a href="#">Delivery</a></li>
					<li><a href="#">Checkout</a></li>
					<li><a href="#">My Account</a></li>
				</ul>
			</div>
			<div class="clear"></div>
		</div>
		<div class="header_top">
			<div class="logo">
				<a href="index.jsp"><img src="resources/images/logo.png" alt="" /></a>
			</div>
			<div class="cart">
				<p>
					Welcome to our Online Store! <span>Cart:</span>
				<div id="dd" class="wrapper-dropdown-2">
					0 item(s) - $0.00
					<ul class="dropdown">
						<li>you have no items in your Shopping cart</li>
					</ul>
				</div>
				</p>
			</div>
			<script type="text/javascript">
				function DropDown(el) {
					this.dd = el;
					this.initEvents();
				}
				DropDown.prototype = {
					initEvents : function() {
						var obj = this;

						obj.dd.on('click', function(event) {
							$(this).toggleClass('active');
							event.stopPropagation();
						});
					}
				}

				$(function() {

					var dd = new DropDown($('#dd'));

					$(document).click(function() {
						// all dropdowns
						$('.wrapper-dropdown-2').removeClass('active');
					});

				});
			</script>
			<div class="clear"></div>
		</div>
		<div class="header_bottom">
			<div class="menu">
				<ul>
					<li class="active"><a href="index.jsp">Home</a></li>
					<li><a href="about.jsp">About</a></li>
					<li><a href="delivery.jsp">Delivery</a></li>
					<li><a href="news.jsp">News</a></li>
					<li><a href="contact.jsp">Contact</a></li>
					<div class="clear"></div>
				</ul>
			</div>
			<div class="search_box">
				<form>
					<input type="text" value="Search" onfocus="this.value = '';"
						onblur="if (this.value == '') {this.value = 'Search';}"><input
						type="submit" value="">
				</form>
			</div>
			<div class="clear"></div>
		</div>
		<div class="header_slide">
			<div class="header_bottom_left">
				<div class="categories">
					<ul>
						<h3>Categories</h3>
						<c:forEach items="${listLoaiGiay}" var="loaigiay">
							<li><a href="loaigiay?maloai=${loaigiay.maLoai }">${loaigiay.getTen() }
							</a></li>
						</c:forEach>
					</ul>
				</div>
			</div>
			<div class="header_bottom_right">
				<div class="slider">
					<div id="slider">
						<div id="mover">
							<div id="slide-1" class="slide">
								<div class="slider-img">
									<a href="preview.html"><img
										src="resources/images/slide-1-image.png" alt="learn more" /></a>
								</div>
								<div class="slider-text">
									<h1>
										Clearance<br> <span>SALE</span>
									</h1>
									<h2>UPTo 20% OFF</h2>
									<div class="features_list">
										<h4>Get to Know More About Our Memorable Services Lorem
											Ipsum is simply dummy text</h4>
									</div>
									<a href="preview.html" class="button">Shop Now</a>
								</div>
								<div class="clear"></div>
							</div>
							<div class="slide">
								<div class="slider-text">
									<h1>
										Clearance<br> <span>SALE</span>
									</h1>
									<h2>UPTo 40% OFF</h2>
									<div class="features_list">
										<h4>Get to Know More About Our Memorable Services</h4>
									</div>
									<a href="preview.html" class="button">Shop Now</a>
								</div>
								<div class="slider-img">
									<a href="preview.html"><img
										src="resources/images/slide-3-image.jpg" alt="learn more" /></a>
								</div>
								<div class="clear"></div>
							</div>
							<div class="slide">
								<div class="slider-img">
									<a href="preview.html"><img
										src="resources/images/slide-2-image.jpg" alt="learn more" /></a>
								</div>
								<div class="slider-text">
									<h1>
										Clearance<br> <span>SALE</span>
									</h1>
									<h2>UPTo 10% OFF</h2>
									<div class="features_list">
										<h4>Get to Know More About Our Memorable Services Lorem
											Ipsum is simply dummy text</h4>
									</div>
									<a href="preview.html" class="button">Shop Now</a>
								</div>
								<div class="clear"></div>
							</div>
						</div>
					</div>
					<div class="clear"></div>
				</div>
			</div>
			<div class="clear"></div>
		</div>
	</div>
</body>
</html>