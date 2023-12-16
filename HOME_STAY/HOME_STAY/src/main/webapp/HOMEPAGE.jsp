<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>WELCOME TO THE HOMESTAY WEBPAGE</title>
 <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Untitled</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">
    <link rel="stylesheet" href="assets/css/style.css">
</head>
<style>
ul {
  list-style-type: none;
  margin: 0;
  padding: 14px 16px;
  overflow: hidden;
  background-color: #333;
}
li {
  float: left;
}
li a {
  display: block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}
li a:hover {
  background-color: #111;
}
</style>
</head>
<body>
<link rel="stylesheet" href="Homebody.css">
<ul>
   
  <h1 style="text-align:center">HOME STAY</h1>
  <li><a class="active" href="#home">Home</a></li>
   <li><a href="user.xhtml" class="ui-btn ui-corner-all" >Sign Up</a></li>
   <li><a href="login.xhtml">Login</a></li>
  <li><a href="ABOUTUSHOME.jsp">About Us</a></li>
  <li><a href="SERVICEPAGE.jsp">Services</a></li>
  <li><a href="paycat.jsp">Booking Plans</a></li>
  <li><a href="contact.xhtml">Contact</a></li>
   
  
</ul>

<body>

<section>
  <img class="mySlides" src="bk1.png"
  style="width:100%">
  <img class="mySlides" src="bk2.png"
  style="width:100%">
</section>

<script>
var myIndex = 0;
carousel();

function carousel() {
  var i;
  var x = document.getElementsByClassName("mySlides");
  for (i = 0; i < x.length; i++) {
    x[i].style.display = "none";
  }
  myIndex++;
  if (myIndex > x.length) {myIndex = 1}
  x[myIndex-1].style.display = "block";
  setTimeout(carousel, 3000);
}
</script>

<div class="footer-dark">
        <footer>
            <div class="container">
                <div class="row">
                    <div class="col-sm-6 col-md-3 item">
                        <h3>Services</h3>
                        <ul>
                            <li><a href="#">Appointment Booking</a></li>
                            <li><a href="#">Locating Tourist places</a></li>
                         
                        </ul>
                    </div>
                    <div class="col-sm-6 col-md-3 item">
                        <h3>About</h3>
                        <ul>
                            <li><a href="#">Company</a></li>
                            <li><a href="#">Team</a></li>
                            <li><a href="#">Careers</a></li>
                        </ul>
                    </div>
                    <div class="col-md-6 item text">
                        <h3>HomeStay</h3>
                        <p>This is the webiste that helps our customer to book homes that are available for rent and also helps them to locate near by tourist places]</p>
                    </div>
                    <div class="col item social"><a href="#"><i class="icon ion-social-facebook"></i></a><a href="#"><i class="icon ion-social-twitter"></i></a><a href="#"><i class="icon ion-social-snapchat"></i></a><a href="#"><i class="icon ion-social-instagram"></i></a></div>
                </div>
                <p class="copyright">HomeStay © 2022</p>
            </div>
        </footer>
    </div>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/js/bootstrap.bundle.min.js"></script>

</body>
</html>