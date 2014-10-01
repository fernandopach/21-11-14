<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <link rel="stylesheet" href="/maxcdn.bootsstrapbcdn.com/b"  
      
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Aplicacion web con MVC basica</h1>
        <form action="horoscopo.aspx" method="post">
        <p>Escribe tu nombre</p>
        <input type="text" name="nombre"/><br>
        <select name="signo">
            <option>leo</option>
            <option>libra</option>
            <option>sagitario</option>
            <option>acuario</option>
            <option>aries</option>
            <option>tauro</option>
            <option>piscis</option>
            <option>geminis</option>
            <option>virgo</option>
            <option>escorpion</option>
            <option>cancer</option>
            <option>capricornio</option>
        </select>
        <input type="submit" value="Apachurrame"/>
    </form>
    </body>
</html>
