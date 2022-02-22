<%@page language="java" contentType="text/html; charset=UTF-8"%>
<%@page import="org.spcbrasil.spcjava.controleacesso.autenticacao.web.AutenticacaoController"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="spcjava" uri="http://www.spcbrasil.org.br/spcjava/tags/util"%>
<%@taglib prefix="spcjavax-private" tagdir="/WEB-INF/tags/private"%>

<!DOCTYPE html>
<html lang="en" >
<head>
    <meta charset="UTF-8">
    <title>Calculadora Financeira</title>
</head>
<body>
<form action="${urlContext}/calcular" method="GET">
    <div>
        <label for="valor"  >Valor:</label>
        <input id="valor" name="valor" mb-3></input>
    </div>
    <div class="button">
        <button type="submit">Calcular</button>
    </div>
</form>
</body>
</html>