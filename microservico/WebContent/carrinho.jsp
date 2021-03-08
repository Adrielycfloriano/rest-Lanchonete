<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Carrinho</title>
</head>
<body>

	<h1>Meu Pedido:</h1>


	<%-- <c:forEach items="${cardapio}" var="verCesta">
		<li>${verCesta}</li>
	</c:forEach>  --%>

	<c:forEach items="${cardapio}" var="verItem">

		<p>${verItem}</p>

	</c:forEach>


	<%-- <c:forEach items="${quantidade}" var="verQauntidade">
		<p>${verQuantidade}</p>

	</c:forEach>
 --%>
	<%-- <c:forEach items="${quantidade}" var="verQuantidade">
		<li>${verQuantidade}</lis>
	</c:forEach>
	 --%>
	<h2>
		<em>O que deseja fazer agora ?</em>
	</h2>

	<div>
		<button type="submit">
			<em>Concluir Pedido</em>
		</button>
	</div>

</body>
</html>


<%-- <ul>
		<c:forEach items="${cesta}" var="cestas">
			<li>${cestas}</li>
		</c:forEach>
	</ul>  </table> <%-- 	<%
			List<String> employees = (List<String>) request.getAttribute("cardapio");
		for (String e : employees) {
		%>
		<tr>
			<td><%=e%></td>
		</tr>
		<%q
			}
		%> --%>