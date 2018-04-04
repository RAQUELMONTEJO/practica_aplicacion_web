<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:if test="${sessionScope.admin == null}">
	<jsp:forward page="login.jsp"></jsp:forward>
</c:if>
<link rel="stylesheet" href="./css/styleMenu.css">
<ul id="button">
	<li><a href="index.jsp">Home</a></li>
	<li><a>Gestionar usuarios</a>
		<ul>
			<li><a href="registroCliente.jsp">Registrar Cliente</a></li>
			<li><a href="ServletListadoCliente">Listar Clientes</a></li>
			<li><a href="ServletGestionarCliente">Borrar o editar</a></li>
		</ul></li>
	<li><a>Gestionar prendas</a>
		<ul>
			<li><a href="registroPrenda.jsp">Registrar prenda</a></li>
			<li><a href="ServletListadoPrenda">Listar prendas</a></li>
			<li><a href="ServletGestionarPrendas">Borrar o editar</a></li>
		</ul></li>
	<li><a href="ServletLogOutAdmin">Salir</a></li>
</ul>
