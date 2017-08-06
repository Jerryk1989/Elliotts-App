<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<html>
<head>
    <link rel="stylesheet" href="../../static/css/bootstrap.css" >
    <link rel="stylesheet" href="../../static/css/custom.css" >
    <script>
        var imgArray = new Array(4);

        var index = 0;

        function cycle()
        {

            document.banner.src = imgArray[index].src;
            index++;
            if (index > 3)
            {
                index = 0;
            }
            setTimeout("cycle()", 5000);
            return;
        }

        function startup()
        {
            imgArray[0] = new Image;
            imgArray[0].src = "../../static/css/Elliott_Logo_10-12-07.jpg";
            imgArray[1] = new Image;
            imgArray[1].src = "../../static/css/Elliott_Meats.jpg";
            imgArray[2] = new Image;
            imgArray[2].src = "../../static/css/Elliotts_Memrobilia_Photo_5-23-13.jpg";
            imgArray[3] = new Image;
            imgArray[3].src = "../../static/css/Tri_Star_Logo_3-26-15.jpg";

            cycle();

            return;
        }
    </script>

</head>
<body onload="startup()">
<div class="container col-lg-7">
    <div class="row">
        <div class="baconImage minLogoWidth">
            <div class="col-lg-12">
                <img src="../../../static/css/images/LogoHome.png" class="logoImage">
            </div>
        </div>
    </div>
    <%@ include file="includes/navbar.jsp"%>


    <div class="row contentStyling">
        <div class="col-lg-12">
            <br />
            <h2 class="text-center" style="color: white;">Our History</h2>
            <br />
            <div class="text-center">
                <img name="banner" src="../../static/css/Elliotts_Memrobilia_Photo_5-23-13.jpg" class="slideshow" />
            </div>
            <br />
            <div class="align-items-center" style="width: 70%; margin: 0 auto;">
                <p class="text-center" style="color: white;">The Elliot's Up North tradition began in Northern Minnesota in 1892. Capturing the old fashioned taste of smokehouse meats. With over 100 years of experience, the line has continued to grow. In keeping with tradition our items are made of the finest and freshest ingredients so you can buy with confidence. From our family's to yours enjoy and take a bit of "up north" wherever you go.</p>
            </div>
        </div>
    </div>

<%@ include file="includes/footer.jsp"%>