<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
<style>
.card{
background-color:white-smoke;
width:300px;
heigt:auto;
margin-left:auto;
margin-right:auto;
padding-left:30px;
padding-right:30px;
padding-top:30px;
padding-bottom:30px;
}
</style>
<meta charset="ISO-8859-1">
<title>Sign Up</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <div class="container-fluid">
   <h4 style="color:white">Contact Manager</h4>
   </div>
 </nav>
 <br>
 <div  class="card">
<h1>Sign Up</h1>
<br>
Already have an account? <a href="/signin">Sign In</a><br><br>
<form action="/signup/do" method="post">
Email<br>
<input type="email" name="email" required="required"><br>
Password<br>
<input type="password" name="password" required="required"><br>
Secret<br>
<input type="text" name="secret" required="required"><br><br>
<button class="btn btn-primary" type="submit">Sign Up</button>
</form>
</div>
</body>
</html>