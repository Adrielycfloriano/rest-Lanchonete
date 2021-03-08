<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cardapio</title>
</head>
<body>

	<form action="/microservico/cardapio" method="post">

			<h2><em>°Seja bem-vindo a parte do cardápio, aqui você poderá ver o
				que temos disponivel, consultar os produtos que estão sendo
				comprados e finalizar sua compra.</em></h2>


		<h1>Cardápio</h1>

		
			<label><em>**Lanches</em></label>
			<div>
				Hamburguer R$ 30,00 <input name="cardapio" value="hamburguer"
					type="checkbox"> <input name="cardapio"
					type="number">
			</div>

			<div>
				Pizza R$ 45,00<input name="cardapio" value="pizza" type="checkbox">
				<input name="cardapio" value="pizza" type="number">
			</div>
			<div>
				Fogazza R$20,00 <input name="cardapio" value="fogazza"
					type="checkbox"> <input name="cardapio" value="fogazza"
					type="number">
			</div>
		
		
			<label><em>**Comidas</em></label>
			<div>
				Pasta R$ 30,00 <input name="cardapio" value="pasta" type="checkbox">
				<input name="cardapio" value="pasta" type="number">
			</div>
			<div>
				Lasanha R$ 70,00 <input name="cardapio" value="lasanha"
					type="checkbox"> <input name="cardapio" value="lasanha"
					type="number">
			</div>
			<div>
				Polpetone R$ 50,00<input name="cardapio" value="polpetone"
					type="checkbox"> <input name="cardapio" value="polpetone"
					type="number">
			</div>


		<div>
			<label><em>**Bebidas</em></label>
			<div>
				Agua R$ 5,00<input name="cardapio" value="agua" type="checkbox">
				<input name="cardapio" value="agua" type="number">
			</div>
			<div>
				Refrigerante R$ 6,00<input name="cardapio" value="refrigerante"
					type="checkbox"> <input name="cardapio"
					value="refrigerante" type="number">
			</div>
			<div>
				Suco R$ 8,50<input name="cardapio" value="suco" type="checkbox">
				<input name="cardapio" value="suco" type="number">
			</div>
			<div>
				H20 R$ 10,00 <input name="cardapio" value="H2O" type="checkbox">
				<input name="cardapio" value="H2O" type="number">
			</div>
		
			<label><em>**Sobremesa: </em></label>
			<div>
				Casquinha R$ 2,00<input name="cardapio" value="casquinha"  type="checkbox">
				<input name="cardapio" value="casquinha" type="number">
			</div>
			<div>
				Milk-shake R$ 10,00<input name="cardapio" value="milshake" type="checkbox">
				<input name="cardapio" value="milkshake" type="number">
			</div>
			<div>
				Sundae R$ 8,50<input name="cardapio" value="sundae" type="checkbox">
				<input name="cardapio" value="sundae" type="number">
			</div>

		</div>
	
	<div>
			<button type="submit">
				<em>Ok, finalizar Pedido</em>

			</button>
		</div>
	</form>

</body>
</html>