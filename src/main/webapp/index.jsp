<%-- 
    Document   : index.jsp
    Created on : 06-jun-2018, 17:43:15
    Author     : ANDRESCOGI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="icon" href="../../../../favicon.ico">

        <title>App Creditos</title>

        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" rel="stylesheet">
        <link href="${pageContext.servletContext.contextPath}/css/signin.css" rel="stylesheet">
    </head>

    <body class="text-center">
        <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
            <a class="navbar-brand" href="#">AppReserva</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarsExampleDefault">
                <ul class="navbar-nav mr-auto">
                    
                </ul>
            </div>
        </nav><br>
        <form class="form-signin"
              action="${pageContext.servletContext.contextPath}/GuardarServlet"
              method="post">
            
            <h1 class="h3 mb-3 font-weight-normal">Habitacion</h1>

            <label for="inputidhabitacion" class="sr-only">ID Habitacion</label>
            <input type="text" id="inputCredito" name="txtidhabitacion" class="form-control" placeholder="ID Habitacion" required autofocus>
            <label for="inputnumcamas" class="sr-only">Numero camas</label>
            <input type="text" id="inputDocumento" name="txtnumcamas" class="form-control" placeholder="Numero camas " required>

            <select name="txttipohabitacion" id="inputState" class="form-control" required>
                <option value="">Tipo Habitacion</option>
                <option value="compartida">Compartida</option>
                <option value="privada" >Privada</option>
            </select>
            <select name="txtbanoprivado" id="inputState" class="form-control" required>
                <option value="">Baño Privado ?</option>
                <option value="si">Si</option>
                <option value="no" >No</option>
            </select>
            <br>
            <button name="accion" value="crearHabitacion" 
                    type="submit" class="btn btn-primary">
                Registrar</button>
            <p class="mt-5 mb-3 text-muted">&copy;2018</p>
        </form><br>   
         <form class="form-signin"
              action="${pageContext.servletContext.contextPath}/GuardarServlet"
              method="post">
            <h1 class="h3 mb-3 font-weight-normal">Reserva</h1>

            <label for="inputidreserva" class="sr-only">ID Reserva</label>
            <input type="text" id="inputCredito" name="txtidreserva" class="form-control" placeholder="ID Reserva" required autofocus>
            <label for="inputhabitacion" class="sr-only">Habitacion</label>
            <input type="text" id="inputDocumento" name="txthabitacion" class="form-control" placeholder="ID Habitacion" required>
            <label for="inputcamas" class="sr-only">Numero camas</label>
            <input type="text" id="inputDocumento" name="txtcamas" class="form-control" placeholder="Numero camas" required>
            
            <br>
            <button name="accion" value="crearReserva" 
                    type="submit" class="btn btn-primary">
                Reservar</button>
            <p class="mt-5 mb-3 text-muted">&copy;2018</p>
        </form>
    </body>
</html>