<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Editar prenda</title>
</head>
<body>
	<jsp:include page="menu.jsp"></jsp:include>
	<br/><br/>
	<form action="ServletGuardarCambiosPrenda" method="post">
		<p>
			<label>Tipo:</label> <input name="tipo" type="text"
				placeholder="${ prendaAeditar.tipo }"
				value="${ prendaAeditar.tipo }">
		</p>
		<p>
			<label>Color:</label> <input name="color" type="text"
				placeholder="${ prendaAeditar.color }"
				value="${ prendaAeditar.color }">
		</p>
		<p>
			<label>Precio:</label> <input name="precio" type="text"
				placeholder="${ prendaAeditar.precio }"
				value="${ prendaAeditar.precio }">
		</p>
		<p>
			<label>Talla:</label> <select name="talla"
				value="${ prendaAeditar.talla }">
				<option value="" selected="selected">- selecciona -</option>
				<option value="s">S</option>
				<option value="m">M</option>
				<option value="l">L</option>
			</select>
		</p>
		<p>
			<label>Sexo:</label> <select name="sexo"
				value="${ prendaAeditar.sexo }">
				<option value="" selected="selected">- selecciona -</option>
				<option value="hombre">HOMBRE</option>
				<option value="mujer">MUJER</option>
			</select>
		</p>
		<p>
			<label>Referecia:</label> <input name="referencia" type="text"
				placeholder="${ prendaAeditar.referencia }"
				value="${ prendaAeditar.referencia }">
		</p>
		<p>
			<label>Descripción:</label>
			<textarea name="descripcion" cols="40" rows="5"
				placeholder="${ prendaAeditar.descripcion }"
				value="${ prendaAeditar.descripcion }"></textarea>
		</p>
		<p>
			<input type="hidden" name="campoId" value="${ prendaAeditar.id}" />
		</p>
		<p>
			<input type="submit" value="GUARDAR CAMBIOS" />
		</p>
	</form>

</body>
</html>