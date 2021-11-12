
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws  IOException {
        //Simular los valores correctos
        String usuarioOk = "Juan";
        String passwordOk = "123";
        
        String usuario = request.getParameter("usuario");
         String password = request.getParameter("password");
         
         PrintWriter out = response.getWriter();
         
         if(usuarioOk.equals(usuario)  && passwordOk.equals(password)){
             out.print("<h1> Datos correctos<br>");
             out.print("Usuario: " + usuario + "<br>");
             out.print("Password: " + password + "</h1>");
         }
         else{
             response.sendError(response.SC_UNAUTHORIZED, "Las credenciales son incorrectas");
         }
    }
}
