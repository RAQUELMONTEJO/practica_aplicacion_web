<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Registro de prendas</title>
</head>
<body>
	<jsp:include page="menu.jsp"></jsp:include>
	<br/><br/>
	<h3>Introduce los datos de la prenda a registrar:</h3>
	<form action="ServletRegistroPrenda" method="post">
		<p>
			<label>Tipo:</label> <input name="tipo" type="text"
				placeholder="Tipo (camisa, pantalón...)" autofocus="" required="">
		</p>
		<p>
			<label>Color:</label> <input name="color" type="text"
				placeholder="Color" autofocus="" required="">
		</p>
		<p>
			<label>Precio:</label> <input name="precio" type="text"
				placeholder="Precio (euros)" autofocus="" required="">
		</p>
		<p>
			<label>Talla:</label> <select name="talla">
				<option value="" selected="selected">- selecciona -</option>
				<option value="s">S</option>
				<option value="m">M</option>
				<option value="l">L</option>
			</select>
		</p>
		<p>
			<label>Sexo:</label> <select name="sexo">
				<option value="" selected="selected">- selecciona -</option>
				<option value="hombre">HOMBRE</option>
				<option value="mujer">MUJER</option>
			</select>
		</p>
		<p>
			<label>Referecia:</label> <input name="referencia" type="text"
				placeholder="Referencia" autofocus="" required="">
		</p>
		<p>
			<label>Descripción:</label>
			<textarea name="descripcion" cols="40" rows="5"></textarea>
		</p>
		<p>
			<input type="submit" value="REGISTRAR">
		</p>
	</form>
</body>
</html>