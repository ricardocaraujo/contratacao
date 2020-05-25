<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Contratação</title>
	
	<!-- <link rel="stylesheet" type="text/css" href="css/reset.css"/>
	<link rel="stylesheet" type="text/css" href="css/estilos.css"/> -->
	<link rel="stylesheet" href="<c:url value='/resources/css/reset.css'/>" >
	<link rel="stylesheet" href="<c:url value='/resources/css/estilos.css'/>" >
	<link rel="stylesheet" href="<c:url value='/resources/css/bootstrap.css'/>" media="screen">
	<script type="text/javascript" src="<c:url value='/resources/js/bootstrap.js'/>"></script>
	<!-- <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@300&display=swap" rel="stylesheet"> -->
</head>
<body>
	<header>	
		<div class="cabecalho">
			<nav>
				<ul>
					<li><a href="">Home</a></li>
					<li><a href="">Inserir</a></li>
					<li><a href="">Listar</a></li>				
				</ul>
			</nav>
		</div>
	</header>
	<main>	
		<div class="cartao">
			<div class="row">

					<c:forEach items="${contratacoes}" var="contratacao">			

						<div class="col-sm-6">
							<div class="card">
								<div class="card-body">
									<table>
					 					<tr>
					 						<td>Objeto:</td>
					 						<td>${contratacao.objeto}</td>
					 					</tr>
					 					<tr>
					 						<td>Data de início:</td>
					 						<td></td>
					 					</tr>
					 					<tr>
					 						<td>Data de término:</td>
					 						<td></td>
					 					</tr>
					 					<tr>
					 						<td>Tipo da contratação:</td>
											<td></td>
					 					</tr>
					 				</table>			 			
								</div>
							</div>
						</div>

					</c:forEach>

			</div>
		</div>
	</main>

</body>
</html>