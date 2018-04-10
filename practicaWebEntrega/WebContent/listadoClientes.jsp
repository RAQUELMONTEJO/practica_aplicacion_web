<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="modelo.Clientes"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Listado de clientes</title>
</head>
<body>
	<jsp:include page="menu.jsp"></jsp:include>
	<br />
	<br />
	<%
		List<Clientes> clientes = (List<Clientes>)request.getAttribute("clientes");

			for(Clientes c : clientes){
		//toda esta incrustacion esta bien para tener un caso practico
		//pero un poco mas adelante se hará usando etiquetas
	%>
	<div style="margin: 10px">
		Nombre:
		<%=c.getNombre()%>
		<br /> Calle:
		<%=c.getCalle()%>
		<br /> Numero:
		<%=c.getNumero()%>
		<br /> Código postal:
		<%=c.getCodigo_postal()%>
		<br /> Población:
		<%=c.getPoblacion()%>
		<br /> Teléfono:
		<%=c.getTelefono()%>
		<br /> Email:
		<%=c.getEmail()%>
		<br /> Tipo de cliente:
		<%=c.getTipoCliente()%>
		<br />
	</div>
	<%
		}//end foreach
	%>
	<c:if test="${mostrarAlert!=null }">
		<script type="text/javascript">
			alert("Registro borrado correctamente.")
		</script>
	</c:if>
</body>
</html>