<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css" integrity="sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay" crossorigin="anonymous">
        <title>SmartShop ST 🛒</title>
    </head>
    <body>       
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo03" aria-controls="navbarTogglerDemo03" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="text-center">                         
                <img src="img/logo.png" width="70" height="50">                         
            </div>
            <a class="navbar-brand" href="#"><i>SmartShop ST 🛒</i></a>
            <div class="collapse navbar-collapse" id="navbarTogglerDemo03">
                <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
                    <li class="nav-item active">
                        <a class="nav-link" href="./Controlador?accion=Nuevo"><i class="fas fa-home"></i> Home<span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="./Controlador?accion=home"><i class="fas fa-plus-circle"></i> Ofertas del Dia</a>
                    </li>                   
                    <li class="nav-item">
                        <a class="nav-link" href="./Controlador?accion=home"><i class="fas fa-plus-circle"></i> Seguir Comprando</a>
                    </li>                   
                    <li class="nav-item">
                        <a class="nav-link" href="./Controlador?accion=carrito"><i class="fas fa-cart-plus"></i> Carrito</a>
                    </li>   
                </ul>                                             
                <ul class="navbar-nav btn-group my-2 my-lg-0" role="group">
                    <a style="color: white; cursor: pointer" class="dropdown-toggle" data-toggle="dropdown">
                        <i class="fas fa-user-tie"></i> ${logueo}</a>
                    <div class="dropdown-menu text-center dropdown-menu-right">
                        <a class="dropdown-item" href="#"><img src="img/user.png" alt="60" height="60"/></a>                        
                        <a class="dropdown-item" href="#">${user}</a>
                        <a class="dropdown-item" href="#" data-toggle="modal" data-target="#myModal">${correo}</a>
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item" href="Controlador?accion=MisCompras">Mis Compras</a>
                        <div class="dropdown-divider"></div>                        
                        <a class="dropdown-item" href="./Controlador?accion=Salir"> <i class="fas fa-arrow-right"> Salir</i></a>                        
                    </div>
                </ul>     
            </div>
        </nav> 
        <div class="container mt-4">
            <h2>Mis Compras</h2>
            <div class="row">            
                <table class="table tab-pane">
                    <thead class="thead-light">
                        <tr class="text-center">
                            <th>CODIGO DE COMPRA</th>                               
                            <th>Fecha de Compra</th>
                            <th>Monto</th>                                                   
                            <th>Codigo de Pago</th>                                                   
                            <th>Estado</th>                                                   
                            <th></th>                                                   
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="p" items="${myCompras}">
                            <tr class="text-center">
                                <td>C00${p.getId()}</td>                                  
                                <td>${p.getFecha()}</td>
                                <td>${p.getMonto()}</td>                                                                                                       
                                <td>P00${p.getIdPago()}</td>                                                                                                       
                                <td>${p.getEstado()}</td>                                                                                                       
                                <td>
                                    <a href="Controlador?accion=verDetalle&idcompra=${p.getId()}">Ver Detalle</a>
                                </td>                                                                                                       
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>             
            </div>          
        </div> 

         <!-- Modal Iniciar Sesión o Registrarse -->
        <div class="modal fade" id="myModal" tabindex="-1" role="dialog">
            <div class="modal-dialog modal-dialog-centered" role="document">
                <div class="container col-lg-9">
                    <div class="modal-content border-0 rounded">
                        <div class="modal-header bg-dark text-light">
                            <h5 class="modal-title mx-auto">Iniciar Sesión o Crear Cuenta</h5>
                            <button type="button" class="close text-light" data-dismiss="modal" aria-label="Close">
                                <span aria-hidden="true">&times;</span>
                            </button>
                        </div>
                        <div class="modal-body">
                            <div class="text-center mb-3">
                                <img src="img/user.png" width="80" height="80" class="rounded-circle border border-dark p-1">
                            </div>
                            <ul class="nav nav-pills nav-justified mb-3">
                                <li class="nav-item">
                                    <a class="nav-link active" data-toggle="pill" href="#pills-iniciar">Iniciar Sesión</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" data-toggle="pill" href="#pills-registrar">Crear Cuenta</a>
                                </li>
                            </ul>
                            <div class="tab-content">
                                <!-- Iniciar Sesión -->
                                <div class="tab-pane fade show active" id="pills-iniciar" role="tabpanel">
                                    <form action="Controlador">
                                        <div class="form-group">
                                            <label for="loginEmail">Correo Electrónico</label>
                                            <input type="email" name="txtemail" class="form-control" id="loginEmail" placeholder="email@example.com">
                                        </div>
                                        <div class="form-group">
                                            <label for="loginPassword">Contraseña</label>
                                            <input type="password" name="txtpass" class="form-control" id="loginPassword" placeholder="Contraseña">
                                        </div>
                                        <button type="submit" name="accion" value="Validar" class="btn btn-block" style="background-color: #4CAF50; color: white;">Iniciar Sesión</button>
                                    </form>
                                </div>
                                <!-- Crear Cuenta -->
                                <div class="tab-pane fade" id="pills-registrar" role="tabpanel">
                                    <form action="Controlador">
                                        <div class="form-group">
                                            <label for="registerName">Nombres</label>
                                            <input type="text" name="txtnom" class="form-control" id="registerName" placeholder="Ana Torres">
                                        </div>
                                        <div class="form-group">
                                            <label for="registerDni">DNI</label>
                                            <input type="text" maxlength="8" name="txtdni" class="form-control" id="registerDni" placeholder="01234567">
                                        </div>
                                        <div class="form-group">
                                            <label for="registerAddress">Dirección</label>
                                            <input type="text" name="txtdire" class="form-control" id="registerAddress" placeholder="Pasto - Nariño">
                                        </div>
                                        <div class="form-group">
                                            <label for="registerEmail">Correo Electrónico</label>
                                            <input type="email" name="txtemail" class="form-control" id="registerEmail" placeholder="email@example.com">
                                        </div>
                                        <div class="form-group">
                                            <label for="registerPassword">Contraseña</label>
                                            <input type="password" name="txtpass" class="form-control" id="registerPassword" placeholder="Contraseña">
                                        </div>
                                        <button type="submit" name="accion" value="Registrar" class="btn btn-block" style="background-color: #4CAF50; color: white;">Crear Cuenta</button>

                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

    </body>
</html>
