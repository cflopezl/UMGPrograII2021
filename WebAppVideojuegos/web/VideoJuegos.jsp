<%-- 
    Document   : MenuPrincipal
    Created on : 23-oct-2021, 7:44:39
    Author     : chris
--%>

<%@page import="model.Videojuego"%>
<%@page import="java.util.ArrayList"%>
<%@page import="DAO.VideoJuegoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
    </head>
    <body>
            <nav >
                <div class="nav-wrapper #0277bd light-blue darken-3">
                  <a href="#" class="brand-logo center">Logo</a>
                  <ul id="nav-mobile" class="left hide-on-med-and-down">
                    <li><a href="#">Videojuegos</a></li>
                    <li><a href="#">Competencias</a></li>
                    <li><a href="#">Competidores</a></li>
                  </ul>
                </div>
            </nav>
        
        <h1>Listado de Videojuegos y sus opciones</h1>
        
        <table class="highlight">
        <thead>
          <tr>
              <th>Id</th>
              <th>Nombre</th>
          </tr>
        </thead>

        <tbody>
          <% 
           VideoJuegoDAO videoJuegoDAO = new VideoJuegoDAO();
           ArrayList<Videojuego> lstVideojuego = videoJuegoDAO.getAll();
           for(Videojuego videojuego : lstVideojuego){%>
            <tr>
              <td><%= videojuego.getId() %></td>
              <td><%= videojuego.getNombre() %></td>
            </tr>   
          <% } %>
        </tbody>
      </table>
        
        <footer class="page-footer #0277bd light-blue darken-3">
        <div class="container">
          <div class="row">
            <div class="col l6 s12">
              <h5 class="white-text">Footer Content</h5>
              <p class="grey-text text-lighten-4">You can use rows and columns here to organize your footer content.</p>
            </div>
            <div class="col l4 offset-l2 s12">
              <h5 class="white-text">Links</h5>
              <ul>
                <li><a class="grey-text text-lighten-3" href="#!">Link 1</a></li>
                <li><a class="grey-text text-lighten-3" href="#!">Link 2</a></li>
                <li><a class="grey-text text-lighten-3" href="#!">Link 3</a></li>
                <li><a class="grey-text text-lighten-3" href="#!">Link 4</a></li>
              </ul>
            </div>
          </div>
        </div>
        <div class="footer-copyright">
          <div class="container">
          © 2014 Copyright Text
          <a class="grey-text text-lighten-4 right" href="#!">More Links</a>
          </div>
        </div>
      </footer>
        
      <!-- Compiled and minified JavaScript -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
    </body>
</html>
