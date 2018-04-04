<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Registro de clientes</title>
</head>
<body>
	<jsp:include page="menu.jsp"></jsp:include>
	<br/><br/>

	<h3>Introduce los datos del cliente a registrar:</h3>
	<form action="ServletRegistroCliente" method="post">
		<p>
			<label>Nombre:</label>
			<input name="nombre" type="text" placeholder="Ingresa nombre"
				autofocus="" required="">
		</p>
		<p>
			<label>Calle:</label>
			<input name="calle" type="text" placeholder="Calle" autofocus=""
				required="">
		</p>
		<p>
			<label>Número:</label>
			<input name="numero" type="text" placeholder="Numero" autofocus=""
				required="">
		</p>
		<p>
			<label>Código postal:</label>
			<input name="codigo_postal" type="text" placeholder="Codigo postal"
				autofocus="" required="">
		</p>
		<p>
			<label>Población:</label>
			<input name="poblacion" type="text" placeholder="Poblacion"
				autofocus="" required="">
		</p>
		<p>
			<label>Teléfono:</label>
			<input name="telefono" type="text" placeholder="Telefono"
				autofocus="" required="">
		</p>
		<p>
			<label>Email:</label>
			<input name="email" type="text" placeholder="nombre@loquesea.com"
				autofocus="" required="">
		</p>
		<p>
			<label>Tipo de cliente:</label>
			<select name="tipo">
				<option value="" selected="selected">- selecciona -</option>
				<option value="cliente">Cliente</option>
				<option value="empresa">Empresa</option>
			</select>
		</p>
		<p>
			<input type="submit" value="REGISTRAR">
		</p>
	</form>
</body>
</html>