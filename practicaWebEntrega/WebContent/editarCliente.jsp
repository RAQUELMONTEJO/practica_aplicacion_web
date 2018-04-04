<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Editar cliente</title>
</head>
<body>
	<jsp:include page="menu.jsp"></jsp:include>
	<br/><br/>
	<form action="ServletGuardarCambiosCliente" method="post">
		<p>
			<label>Nombre:</label> <input name="nombre" type="text"
				placeholder="${ clienteAeditar.nombre }"
				value="${ clienteAeditar.nombre }">
		</p>
		<p>
			<label>Calle:</label> <input name="calle" type="text"
				placeholder="${ clienteAeditar.calle }"
				value="${ clienteAeditar.calle }">
		</p>
		<p>
			<label>Número:</label> <input name="numero" type="text"
				placeholder="${ clienteAeditar.numero }"
				value="${ clienteAeditar.numero }">
		</p>
		<p>
			<label>Código postal:</label> <input name="codigo_postal" type="text"
				placeholder="${ clienteAeditar.codigo_postal }"
				value="${ clienteAeditar.codigo_postal }">
		</p>
		<p>
			<label>Población:</label> <input name="poblacion" type="text"
				placeholder="${ clienteAeditar.poblacion }"
				value="${ clienteAeditar.poblacion }">
		</p>
		<p>
			<label>Teléfono:</label> <input name="telefono" type="text"
				placeholder="${ clienteAeditar.telefono }"
				value="${ clienteAeditar.telefono }">
		</p>
		<p>
			<label>Email:</label> <input name="email" type="text"
				placeholder="${ clienteAeditar.email }"
				value="${ clienteAeditar.email }">
		</p>
		<p>
			<label>Tipo de cliente:</label> <select name="tipoCliente"
				value="${ clienteAeditar.tipoCliente }">
				<option value="" selected="selected">- selecciona -</option>
				<option value="cliente">Cliente</option>
				<option value="empresa">Empresa</option>
			</select>
		</p>
		<p>
			<input type="hidden" name="campoId" value="${ clienteAeditar.id }" />
		</p>
		<p>
			<input type="submit" value="GUARDAR CAMBIOS" />
		</p>
	</form>

</body>
</html>