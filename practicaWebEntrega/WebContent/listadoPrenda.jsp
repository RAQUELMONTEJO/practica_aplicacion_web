<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="modelo.Ropa"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<title>Listado de prendas</title>
</head>
<body>
	<jsp:include page="menu.jsp"></jsp:include>
	<br/><br/>
	<%
		List<Ropa> prendas = (List<Ropa>)request.getAttribute("prendas");

		for(Ropa r : prendas){
			//toda esta incrustacion esta bien para tener un caso practico
			//pero un poco mas adelante se hará usando etiquetas
	%>
	<div style="margin: 10px">
		Tipo:
		<%=r.getTipo()%>
		<br /> Color:
		<%=r.getColor()%>
		<br /> Precio:
		<%=r.getPrecio()%>
		<br /> Talla:
		<%=r.getTalla()%>
		<br /> Sexo:
		<%=r.getSexo()%>
		<br /> Referencia:
		<%=r.getReferencia()%>
		<br /> Descripción:
		<%=r.getDescripcion()%>
		<br />
	</div>
	<%
		}//end foreach
	%>
</body>
</html>