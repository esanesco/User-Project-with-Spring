<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>



</head>
<body>

<nav class="navbar navbar-default navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <a  href="index.jsp" class="navbar-brand active">
                <span class="glyphicon glyphicon-film"></span>
                <span class="glyphicon glyphicon-film"></span>
            </a>
            <button class="navbar-toggle" type="button" data-toggle="collapse" data-target="#navbar-main">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
        </div>
        <div class="navbar-collapse collapse" id="navbar-main">
            <ul class="nav navbar-nav navbar-right">
                <li class="active"><a href="#">Accueil</a></li>
                <li><a href="lister">Liste des films</a></li>
                <li><a href="ajouter">Ajouter un film</a></li>
                <li><a href="listerStyle">Styles</a></li>
                <li><a href="geo.jsp">Qui sommes-nous</a></li>
            </ul>
        </div>
    </div>
</nav>

<div class="container">
    <div class="jumbotron">
        <h1>Bienvenue <small>dans notre application de gestion de films</small></h1>
        <p>Vous allez pouvoir visualiser vos plus grands chefs-d'oeuvres, mais aussi ajouter, modifier ou supprimer.</p>
        <p>Expérience enrichissante garantie.</p>
        <p><a class="btn btn-primary btn-lg" role="button" href="geo.jsp">En savoir plus ...</a></p>
    </div>
</div>

</body>
</html>