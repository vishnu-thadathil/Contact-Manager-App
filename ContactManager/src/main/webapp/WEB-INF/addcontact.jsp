<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
<title>Add Contact</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <div class="container-fluid">
   <h4 style="color:white">Contact Manager</h4>
   </div>
   <li class="nav-item">
          <a class="nav-link" href="/signin">Logout</a>
    </li>
 </nav>
 <br>
 <div  class="card">
<h2>Add Contacts</h2>
<br>
<form action="/addcontact" method="post">
Name 
<input type="name" name="name" required="required"><br><br>
Ph No 
<input type="number" name="ph" required="required"><br><br>
Email 
<input type="email" name="email" required="required"><br><br>
<button class="btn btn-primary" type="submit">Save</button>
</form>
</div>
<br>
<div class="card" style="width:800px">
<h3>My Contacts</h3><br>
<table class="table">
  <thead>
    <tr>
      <th scope="col">Name</th>
      <th scope="col">Ph No</th>
      <th scope="col">Email</th>
    </tr>
  </thead>
  <tbody>
  	<c:forEach items="${contact }" var="element">
    <tr>
      <td>${element.getName() }</td>
      <td>${element.getPh() }</td>
      <td>${element.getEmail() }</td>
    </tr>
    </c:forEach>
  </tbody>
</table>
</div>
</body>
</html>