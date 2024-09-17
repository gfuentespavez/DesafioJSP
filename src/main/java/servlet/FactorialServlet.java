package servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "FactorialFibonacciServlet", value = "/factorial-fibonacci")
public class FactorialServlet extends HttpServlet {
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

        // Calcular el factorial
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        // Calcular Fibonacci
        int fibonacci = calcularFibonacci(num);

        // Enviar la respuesta con ambos resultados
        response.setContentType("text/html");
        response.getWriter().append("<html><body>")
                .append("<h1>Resultados para el número ").append(String.valueOf(num)).append("</h1>")
                .append("<p>Factorial: ").append(String.valueOf(factorial)).append("</p>")
                .append("<p>Fibonacci: ").append(String.valueOf(fibonacci)).append("</p>")
                .append("<p><a href='index.jsp'>Volver al inicio</a></p>")
                .append("</body></html>");
    }

    // Método para calcular el número de Fibonacci
    private int calcularFibonacci(int num) {
        if (num <= 1) {
            return num;
        }
        int fibo1 = 0, fibo2 = 1, fibonacci = 1;
        for (int i = 2; i <= num; i++) {
            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;
        }
        return fibonacci;
    }
}
