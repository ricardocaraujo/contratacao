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
	<link rel="stylesheet" href="<c:url value='/resources/css/bootstrap.min.css'/>" >
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
		<form:form action="/contratacao/contratacao" method="post" modelAttribute="contratos">
 			<div class="tabela">
 				<table>
 					<tr>
 						<td><label>Objeto</label></td>
 						<td><input class="input-padrao" type="text" name="objeto"></td>
 					</tr>
 					<tr>
 						<td><label>Data de início</label></td>
 						<td><input class="input-padrao" type="text" name="dataInicio"></td>
 					</tr>
 					<tr>
 						<td><label>Data de término</label></td>
 						<td><input class="input-padrao" type="text" name="dataTermino"></td>
 					</tr>
 					<tr>
 						<td>Tipo da contratação</td>
						<td><form:radiobuttons path="tipo" items="${tipos}" itemLabel="descricao"/></td>
 					</tr>
 					<tr>
 						<td><button class="btn btn-primary" type="submit">Enviar</button></td>
 					</tr>
					
 			    </table>
 			</div>
		</form:form>
		<!-- <div>	
			<ul class="processos">
				<li>
					<h2>Primeira etapa</h2>
					<img src="images/encaminhar.PNG">
					<p>É encaminhada a contratação para o SBS</p>
				</li>
				<li>
					<h2>Segunda etapa</h2>
					<img src="images/instaurar.PNG">
					<p>SBS prepara a contratação</p>
				</li>
				<li>
					<h2>Terceira etapa</h2>
					<img src="images/preparar.PNG">
					<p>A contratação é instaurada</p>						
				</li>
			</ul>
		</div> -->
		
	</main>

</body>
</html>