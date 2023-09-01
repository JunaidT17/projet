<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Home</title>
  <style>
    body {background-color: rosybrown}
  </style>
</head>
<body>


<h1>Home</h1>

<p>Bienvenue sur notre site internet réservé au amateurs de cuisine !</p>

<div class="genericDiv">
  <table id="recettes">
    <tr>
      <th>#</th>
      <th>Name</th>
      <th>Description</th>
      <th>Nombre</th>
      <th>Actions</th>
    </tr>
    <c:forEach items="${recettes}" var="Recette">
      <tr>
        <th>${Recette.getId()}</th>
        <td>${Recette.getName()}</td>
        <td><c:out value="${Recette.getDescription()}"/></td>
        <td>${Recette.getNombre()}</td>
        <td>
          <button class="btn btn-primary" role="button">Edit</button>
          <button class="btn btn-danger" role="button">Delete</button>
          <button class="btn btn-success" role="button">Details</button>
        </td>
      </tr>
    </c:forEach>
  </table>

</div>

</body>
</html>
