<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="fr">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Liste des Recettes</title>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <style>
    body {
      background-color: darkgreen;
      color: white; /* Texte blanc pour une meilleure lisibilité */
    }
    .genericDiv {
      margin: 20px;
    }
  </style>
</head>
<body>
<div class="container genericDiv">
  <h1 class="text-center">Liste des Recettes</h1>
  <table class="table table-bordered table-striped table-dark">
    <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Nom</th>
      <th scope="col">Description</th>
      <th scope="col">Nombre</th>
      <th scope="col">Actions</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${recettes}" var="Recette">
      <tr>
        <th scope="row">${Recette.getId()}</th>
        <td>${Recette.getName()}</td>
        <td><c:out value="${Recette.getDescription()}"/></td>
        <td>${Recette.getNombre()}</td>
        <td>

          <button class="btn btn-success" role="button">Détails de la recette</button>
        </td>
      </tr>
    </c:forEach>
    </tbody>
  </table>
</div>


<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>