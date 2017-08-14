<%--This is the index/home page.  It is a completely custom page that doesn't use any of the includes.--%>
<%--This page does not follow the rest of the websites theme.  If you want to make changes to this page,--%>
<%--you will need to edit it here.--%>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <%--This brings in the bootstrap files and the custom css file used throughout the site.  The custom css file--%>
    <%--does have some overlapping styles that are used on this page.  It is important that the bootstrap file--%>
    <%--comes before the custom.css file--%>
    <link rel="stylesheet" href="../../static/css/bootstrap.css" >
    <link rel="stylesheet" href="../../static/css/custom.css" >
</head>
<body>
<%--This div contains the banner and logo image that are above the navbar--%>
<div class="container col-lg-7">
    <div class="row">
        <div class="baconImage">
            <div class="col-lg-12">
                <img src="../../static/css/LogoHome.png" class="logoImage">
            </div>
        </div>
    </div>

    <%--This div contains the links for this page--%>
    <div class="row justify-content-center" style="background-color: #BBBBBB;">
        <div class="navbar navbar-toggleable-md navbar-light">
            <a class="navbar-brand navSpacing" style="color: white;" href="/history">History</a>
            <a class="navbar-brand navSpacing" style="color: white;" href="/locations">Locations</a>
            <a class="navbar-brand navSpacing" style="color: white;" href="/productInfo">Product Info</a>
            <a class="navbar-brand navSpacing" style="color: white;" href="/customerInquiry">Customer Inquiry</a>
        </div>
    </div>

<%--This div contains the content (text) below the links--%>
    <div class="row" style="background-color: #3B3836;">
        <div class="col-lg-12">
            <br />
            <h2 class="text-center" style="color: white;">Welcome To Elliott's Up North Foods</h2>
            <br />

            <div class="align-items-center" style="width: 70%; margin: 0 auto;">
                <p class="text-center" style="color: white;">We are a family owned and operated company since 1984 serving the upper Midwest. Our goal is to always provide you the most fresh and flavorful products. Always take a bit of "up north" wherever you go.</p>

                <br />
                <p class="text-center" style="color: white;">We provide a variety of products available at your local grocery store including bacon, bone in hams, boneless hams, natural casing wieners, skinless hotdogs, summer sausages, cheese, semi dry meats, sliced lunch meats and more.</p>

                <p class="text-center" style="color: white;">From our family to yours enjoy.</p>
            </div>
        </div>
    </div>
</div>




</body>
</html>
