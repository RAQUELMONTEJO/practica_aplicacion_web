<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Gestionar clientes</title>
</head>
<body>
	<jsp:include page="menu.jsp"></jsp:include>
	<br />
	<br />
	<c:forEach items="${clientes}" var="cliente">
		<div style="margin: 8px">
			<br /> <br /> <br /> Nombre: ${cliente.nombre}<br /> Calle:
			${cliente.calle}<br /> N�mero: ${cliente.numero}<br /> C�digo
			postal: ${cliente.codigo_postal}<br /> Poblaci�n:
			${cliente.poblacion}<br /> Tel�fono: ${cliente.telefono}<br />
			Email: ${cliente.email}<br /> Tipo de cliente:
			${cliente.tipoCliente}<br /> <br /> <a
				href="ServletBorrarCliente?id=${cliente.id}"
				onclick="return confirm('�Est�s seguro de que deseas borrarlo?');">BORRAR</a>
			<a href="ServletEditarCliente?id=${cliente.id}">EDITAR</a>
		</div>
	</c:forEach>

</body>
</html>