<%-- 
    Document   : index
    Created on : 16-oct-2021, 8:25:56
    Author     : chris
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejemplo</title>
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
</head>

<body>
    <div class="row">
        <form class="col s12" action="index.jsp" method="POST">
      <div class="row">
        <div class="input-field col s6">
          <input placeholder="Username" name="username" type="text" class="validate">
          <label for="first_name">Username</label>
        </div>
      </div>
      <div class="row">
      <div class="row">
        <div class="input-field col s12">
          <input id="password" type="password" name="password" class="validate">
          <label for="password">Password</label>
        </div>
      </div>
      <button class="btn waves-effect waves-light" type="submit" name="action">Log In
        <i class="material-icons right">send</i>
      </button>
    </form>
  </div>
            
            <%
                String vUserName = request.getParameter("username");
                String vPassword = request.getParameter("password");
                boolean resultado = false;
                //obtener usuario y password de db
                //guardarlo en variables
                String vPasswordDB ="123";
                if(vUserName!=null && vPassword.equals(vPasswordDB)){
                    getServletConfig().getServletContext().getRequestDispatcher("/MenuPrincipal.jsp").forward(request,response);
                }
                
            %>

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
