<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Desafío JSP - Números</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <h1 class="text-center mt-4">Desafío JSP - Listado de Números</h1>
    <div class="row justify-content-center">
        <div class="col-md-8">
            <div class="card">
                <div class="card-header text-center">
                    <h2>Seleccione un número del 1 al 10</h2>
                </div>
                <div class="card-body">
                    <ul class="list-group">
                        <%
                            // Generar los enlaces para los números del 1 al 10
                            for (int i = 1; i <= 10; i++) {
                        %>
                        <li class="list-group-item d-flex justify-content-between align-items-center">
                            Número <%= i %>
                            <span>
                                        <!-- Enlace para Factorial y Fibonacci -->
                                        <a href="factorial-fibonacci?num=<%= i %>" class="btn btn-primary btn-sm">Factorial y Fibonacci</a>
                                <!-- Enlace para Par o Impar -->
                                        <a href="par-impar?num=<%= i %>" class="btn btn-secondary btn-sm">Par o Impar</a>
                                    </span>
                        </li>
                        <%
                            }
                        %>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
