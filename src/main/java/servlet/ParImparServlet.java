package servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

//Par Impart

@WebServlet(name = "ParImparServlet", value = "/par-impar")
public class ParImparServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener el número enviado desde el parámetro
        String numStr = request.getParameter("num");
        int num = 0;

        // Validar que el número es un entero válido
        try {
            num = Integer.parseInt(numStr);
        } catch (NumberFormatException e) {
            response.getWriter().println("Parámetro inválido.");
            return;
        }

        // Determinar si es par o impar
        String resultado = (num % 2 == 0) ? "par" : "impar";

        // Enviar la respuesta con el resultado
        response.setContentType("text/html");
        response.getWriter().append("<html><body>")
                .append("<h1>El número ").append(String.valueOf(num)).append(" es ").append(resultado).append("</h1>")
                .append("<p><a href='index.jsp'>Volver al inicio</a></p>")
                .append("</body></html>");
    }
}
