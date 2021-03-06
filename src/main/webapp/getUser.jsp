<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
<link href="<c:url value="/resources/css/theme.min.css" />" rel="stylesheet">
<link href="<c:url value="/resources/css/font-awesome.min.css" />" rel="stylesheet">
<style type="text/css">
	body{
		margin-top: 80px;
	}
		.front-bg {
	
    position: fixed;
    width: 100%;
    height: 100%;
    top:0;
    background: #ccc;
}
.front-bg img {
    display: block;
    margin: auto;
    min-width: 50%;
    min-height: 50%;
    top: 0;
    left: 0;
    right: 0;
    bottom: 0;
}

.navbar-custom {
	background-color:rgba(0, 0, 0, 0.3);
	-webkit-box-shadow: 0px 5px 10px rgba(0, 0, 0, 0.3);
    -moz-box-shadow:    0px 5px 10px rgba(0, 0, 0, 0.3);
    box-shadow:         0px 5px 10px rgba(0, 0, 0, 0.3);
    z-index:999;
}
.navbar-custom .navbar-toggle:focus, .navbar-custom .navbar-toggle:hover {
  background-color: #ddd;
  color: #000;
}
.navbar-custom .navbar-toggle {
  border-color: #ddd;

}
.navbar-toggle {
  position: relative;
  float: right;
  padding: 9px 10px;
  margin-top: 8px;
  margin-right: 15px;
  margin-bottom: 8px;
  background-color: transparent;
  background-image: none;
  border: 1px solid transparent;
  border-radius: 4px;
  color: #000;
}

.navbar-brand {
	color: #fff;
}

.panel-custom, .panel-custom > .panel-heading {
	background: none;
	background-color:rgba(255, 255, 255, 0.2);
	border:0;
	color:#fff;
}

.quote {
	position: fixed;

    bottom:0%;
}
.login {
}
.nav a {
	color: #fff;
}
		</style>
<title>Insert title here</title>
</head>
<body>
<nav class="navbar navbar-custom navbar-fixed-top">
      <!-- We use the fluid option here to avoid overriding the fixed width of a normal container within the narrow content columns. -->
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-6">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">Cyfres</a>
        </div>

        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-6">
          
          <ul class="nav navbar-nav navbar-right">
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">English <span class="caret"></span></a>
          <ul class="dropdown-menu" role="menu">
            <li><a href="#">Action</a></li>
            <li><a href="#">Another action</a></li>
            <li><a href="#">Something else here</a></li>
            <li class="divider"></li>
            <li><a href="#">Separated link</a></li>
          </ul>
        </li>
      </ul>
        </div><!-- /.navbar-collapse -->
      </div>
    </nav>
    <div class="front-bg"><img src="<c:url value="/resources/images/tbbt.jpg" />" width="100%" height="100%" /></div>
    
	<div class="container">
		<div class="row">
			<div class="col-md-3">
				Nick: ${usernick} <br>
				Email: ${email} <br>
				Name: ${name} <br>
				<br>
			</div>
		</div>
	</div>
	
	
<script type="text/javascript" src="<c:url value="/resources/js/jquery.min.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
</body>
</html>