<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Gestión de prendas</title>
</head>
<body>
	<jsp:include page="menu.jsp"></jsp:include>
	<br/><br/>
	<c:forEach items="${prendas}" var="prenda">
		<div style="margin: 8px">
			<br /> <br /> <br /> Tipo: ${prenda.tipo}<br /> Color:
			${prenda.color}<br /> Precio: ${prenda.precio}<br /> Talla:
			${prenda.talla}<br /> Sexo: ${prenda.sexo}<br /> Referencia:
			${prenda.referencia}<br /> Descripción: ${prenda.descripcion}<br />
			<br /> <a href="ServletBorrarPrenda?id=${prenda.id}">BORRAR</a> <a
				href="ServletEditarPrenda?id=${prenda.id}">EDITAR</a>
		</div>
	</c:forEach>

</body>
</html>