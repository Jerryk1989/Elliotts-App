<%@ page contentType="text/html" pageEncoding="UTF-8" %>

<%--This is the header file that contains the bootstrap, custom css, jquery, and other custom js files.  It also includes the banner and logo--%>
<%--at the top of the webpage.--%>
<html>
<head>
    <link rel="stylesheet" href="../../static/css/bootstrap.css" >

    <%--Custom css page --%>
    <link rel="stylesheet" href="../../static/css/custom.css" >

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

    <%--This javascript file contains the ajax calls to post and get data from the front-end to the back-end--%>
    <script type="text/javascript" src="../../static/js/json.js"></script>
</head>
<body>
<div class="container col-lg-7">
    <div class="row">
        <%--This is the banner at the top of the page.  The baconImage has a background image.--%>
        <div class="baconImage minLogoWidth">
            <div class="col-lg-12">
                <%--This is the elliotts logo that is at the top of the webpage--%>
                <img src="../../../static/css/images/LogoHome.png" class="logoImage">
            </div>
        </div>
    </div>