<%-- 
    Document   : BuscarTodos
    Created on : 5/11/2014, 04:42:59 PM
    Author     : Brenda
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Buscar Todos</title>
        
    </head>
    body bgcolor="pink"
    <script language="JavaScript">
        function valida();
        if(ID_TRABAJADOR.value.lenght==0){
            alert("Tu campo ID esta vacío")
            nombre.focus();
            return 0;
        }
         
        
      </script>
      <form name="Buscar Por Id" methos="get">
          <table aling="center">
              <tr>
                  <td>Id</td>
                  <td>&nbsp;&nbsp;</td>
                  <td>input type="text" name="ID_TRABAJADOR"</td>
              </tr>
              
          </table>
          <td>input type="submit" value="Buscar" onclick=valida()</td>
          
          
      </form>
           
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
