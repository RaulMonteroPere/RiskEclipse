<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<!DOCTYPE html>
<html>
	<head>
	    <meta charset="UTF-8">
	    <!-- Link to CSS file -->
	    <link href="<c:url value="/css/admin.css" />" rel="stylesheet">
	    <link href="<c:url value="/css/form.css" />" rel="stylesheet">
	    <!--Link to Fontawesome-->
	    <script src="https://kit.fontawesome.com/fc00ef1987.js" crossorigin="anonymous"></script>
	</head>
	
<body>
<h1>PANEL ADMIN</h1>
    <header>
        <a href="/riskadventure/panel"><i class="fas fa-arrow-left"></i> Volver</a>
    </header>
    <div>
        <h2>Crea un <span style="color: #ba9e38;">Nuevo Evento</span></h2>
        <h3>Rellena todos los datos del formulario y dale al botón para crear un nuevo evento.</h3>
        
        <form action="/riskadventure/create" id="new-event" method="post">
        	<label for="ename">Nombre del evento:</label><br>
  			<input type="text" id="ename" name="nombre" placeholder="p ej: Rafting en Cuenca"><br><br>
  			
  			<label for="edescription">Descripción del evento:</label><br>
  			<textarea id="edescription" name="descripcion" placeholder="Di sobre que va el evento"></textarea><br><br>
  			
  			<label for="edate">Fecha del evento:</label><br>
  			<input type="date" id="edate" name="efechaInicio"><br><br>
  			
  			<label for="eduration">Duración del evento (en horas):</label><br>
  			<input type="number" id="eduration" name="duracion"><br><br>
  			
  			<label for="eaddress">Dirección</label><br>
  			<input type="text" id="eaddress" name="direccion"><br><br>
  			
  			<label for="emax">Aforo máximo</label><br>
  			<input type="number" id="emax" name="aforoMaximo"><br><br>
  			
  			<label for="emin">Mínimo de asistencia</label><br>
  			<input type="number" id="emin" name="minimoAsistencia"><br><br>
  			
  			<label for="eprice">Precio (€):</label><br>
  			<input type="number" id="eprice" name="precio"><br><br>
  			
  			<label for="etype">Tipo de evento</label><br>
			<select name="tipo" id="etype" form="new-event">
			  <c:forEach var="tipo" items="${listadoTipos}" varStatus="estado">
				
					  <option value="${tipo.idTipo}">${tipo.nombre}</option>
				  
				  </c:forEach>
			</select>
  			<br><br>
  			
  			
 			<button type="submit">CREAR EVENTO <i class="far fa-check-square"></i></button>
        </form>
        
    </div>
</body>
</html>