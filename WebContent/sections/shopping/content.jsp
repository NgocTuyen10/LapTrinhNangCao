<%@page import="model.Giay"%>
<%@page import="service.GiayService"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
</head>
<body>

	<div class="main">
		<div class="content">
			<div class="content_top">
				<div class="heading">
					<h3>New Products</h3>
				</div>
				<div class="see">
					<p>
						<a href="#">See all Products</a>
					</p>
				</div>
				<div class="clear"></div>
			</div>
			<div class="section group">
				<c:forEach items="${listGiay}" var="giay">
					<div class="grid_1_of_4 images_1_of_4">
						<a href="preview.html"><img src=${giay.hinhAnh } alt="" /></a>
						<h2>${giay.getTen()}</h2>
						<div class="price-details">
							<div class="price-number">
								<p>
									<span class="rupees">${giay.gia}đ</span>
								</p>
							</div>
							<div class="add-cart">
								<h4>
									<a href="preview.html">Add to Cart</a>
								</h4>
							</div>
							<div class="clear"></div>
						</div>
					</div>
				</c:forEach>

			</div>
			<div class="content_bottom">
				<div class="heading">
					<h3>Feature Products</h3>
				</div>
				<div class="see">
					<p>
						<a href="#">See all Products</a>
					</p>
				</div>
				<div class="clear"></div>
			</div>
			<div class="section group">
				<div class="grid_1_of_4 images_1_of_4">
					<a href="preview.html"><img src="images/new-pic1.jpg" alt="" /></a>
					<h2>Lorem Ipsum is simply</h2>
					<div class="price-details">
						<div class="price-number">
							<p>
								<span class="rupees">$849.99</span>
							</p>
						</div>
						<div class="add-cart">
							<h4>
								<a href="preview.html">Add to Cart</a>
							</h4>
						</div>
						<div class="clear"></div>
					</div>
				</div>
				<div class="grid_1_of_4 images_1_of_4">
					<a href="preview.html"><img src="images/new-pic2.jpg" alt="" /></a>
					<h2>Lorem Ipsum is simply</h2>
					<div class="price-details">
						<div class="price-number">
							<p>
								<span class="rupees">$599.99</span>
							</p>
						</div>
						<div class="add-cart">
							<h4>
								<a href="preview.html">Add to Cart</a>
							</h4>
						</div>
						<div class="clear"></div>
					</div>
				</div>
				<div class="grid_1_of_4 images_1_of_4">
					<a href="preview.html"><img src="images/new-pic4.jpg" alt="" /></a>
					<h2>Lorem Ipsum is simply</h2>
					<div class="price-details">
						<div class="price-number">
							<p>
								<span class="rupees">$799.99</span>
							</p>
						</div>
						<div class="add-cart">
							<h4>
								<a href="preview.html">Add to Cart</a>
							</h4>
						</div>
						<div class="clear"></div>
					</div>
				</div>
				<div class="grid_1_of_4 images_1_of_4">
					<a href="preview.html"><img src="images/new-pic3.jpg" alt="" /></a>
					<h2>Lorem Ipsum is simply</h2>
					<div class="price-details">
						<div class="price-number">
							<p>
								<span class="rupees">$899.99</span>
							</p>
						</div>
						<div class="add-cart">
							<h4>
								<a href="preview.html">Add to Cart</a>
							</h4>
						</div>
						<div class="clear"></div>
					</div>
				</div>
			</div>
		</div>
	</div>
	</div>
</body>
</html>