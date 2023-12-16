<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="/w3css/3/w3.css">
<head>
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
   font-size: 30px;
  text-decoration: none;
}
li a:hover {
  background-color: #111;
}
</style>
</head>
<body>

<ul>
 <li><a class="active" href="HOMEPAGE.jsp">Home</a></li>
 <li><a href="contact.xhtml">Contact Us</a></li>
  
</ul></head>
<body>


<!-- Slide Show -->
<section>
  <img class="mySlides" src="ind1.png"
  style="width:100%">
  <img class="mySlides" src="ind2.png"
  style="width:100%">
  <img class="mySlides" src="ind3.jpg"
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

</body>
</html>

