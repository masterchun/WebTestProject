<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <!-- Page Preloder -->
    <div id="preloder">
        <div class="loader"></div>
    </div>

    <!-- Offcanvas Menu Begin -->
    <div class="offcanvas-menu-overlay"></div>
    <div class="offcanvas-menu-wrapper">
        <div class="offcanvas__close">+</div>
        <ul class="offcanvas__widget">
            <li><span class="icon_search search-switch"></span></li>
            <li><a href="#"><span class="icon_heart_alt"></span>
                <div class="tip">2</div>
            </a></li>
            <li><a href="#"><span class="icon_bag_alt"></span>
                <div class="tip">2</div>
            </a></li>
        </ul>
        <div class="offcanvas__logo">
            <a href="./index.html"><img src="img/allcamp.png" alt=""></a>
        </div>
        <div id="mobile-menu-wrap"></div>
        <div class="offcanvas__auth">
            <a href="#">Login</a>
            <a href="#">Register</a>
        </div>
    </div>
    <!-- Offcanvas Menu End -->

    <!-- Header Section Begin -->
    <header class="header">
        <div class="container-fluid">
            <div class="row">
                <div class="col-xl-2 col-lg-1">
                    <div class="header__logo">
                        <a href="./index.html"><img src="../front/img/allcamp.png" alt=""></a>
                    </div>
                </div>
                <div class="col-xl-7 col-lg-8" style="margin-left: 70px;">
                    <nav class="header__menu">
                        <ul>
                            <li><a href="./index.html">캠핑장</a></li>
                            <li><a href="./index.html">캠핑장</a></li>
                            <li><a href="#">캠핑 용품</a></li>
                            <li><a href="#">지역 맛집</a></li>
                            <li><a href="./shop.html">지역 축제</a></li>
                            <li><a href="#">쿠폰</a></li>
                            <li><a href="#">커뮤니티</a></li>
                            <!-- <li><a href="#">Pages</a>
                                <ul class="dropdown">
                                    <li><a href="./product-details.html">Product Details</a></li>
                                    <li><a href="./shop-cart.html">Shop Cart</a></li>
                                    <li><a href="./checkout.html">Checkout</a></li>
                                    <li><a href="./blog-details.html">Blog Details</a></li>
                                </ul>
                            </li> -->
                            <li><a href="./contact.html">Contact</a></li>
                        </ul>
                    </nav>
                </div>
                <div>
                    <div class="header__right">
                        <div class="header__right__auth">
                            <a href="#">로그인</a>
                            <a href="#">회원가입</a>
                        </div>
                        <ul class="header__right__widget">
                            <li><span class="icon_search search-switch"></span></li>
                            <li><a href="#"><span class="icon_heart_alt"></span>
                                <div class="tip">2</div>
                            </a></li>
                            <li><a href="#"><span class="icon_bag_alt"></span>
                                <div class="tip">2</div>
                            </a></li>
                        </ul>
                    </div>
                </div>
            </div>
            <div class="canvas__open">
                <i class="fa fa-bars"></i>
            </div>
        </div>
    </header>
    <!-- Header Section End -->
</body>
</html>