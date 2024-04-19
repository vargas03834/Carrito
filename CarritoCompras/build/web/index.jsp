<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css" integrity="sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay" crossorigin="anonymous">
        <link href="css/estilos.css" rel="stylesheet" type="text/css"/>        
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
                    <!--<li class="nav-item">
                        <a class="nav-link" href="./Controlador?accion=home"><i class="fas fa-plus-circle"></i> Ofertas del Dia</a>
                    </li>      -->            
                    <li class="nav-item">
                        <a class="nav-link" href="./Controlador?accion=carrito"><i class="fas fa-cart-plus">(<label style="color: darkorange">${cont}</label>)</i> Carrito</a>
                    </li> 
                    <!--
                        <a class="nav-link" href="./Controlador?accion=NuevoProducto">Productos</a>
                    </li> -->
                    <li class="nav-item">
                        <a class="nav-link" href="./Controlador?accion=ChatBot">ChatBot</a>
                    </li> 
                </ul>
                <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
                    <!--<form class="form-inline my-2 my-lg-0">-->
                    <input style="width:300px; background-image: url('ruta_de_la_imagen');" class="form-control mr-sm-2" id="txtBuscar" placeholder="Buscar celular">

                    <button class="btn btn-outline-info my-2 my-sm-0" id="btnBuscar"><i class="fas fa-search"></i> Buscar</button>
                    <!-- </form>       -->                 
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
            <div class="row">
                <c:forEach var="p" items="${productos}">
                    <div class="col-sm-4">
                        <div class="form-group">
                            <div class="card shadow">
                                <div class="card-header bg-primary text-white text-center">
                                    <h5 class="card-title font-weight-bold">${p.getNombres()}</h5>                                    
                                </div>
                                <div class="card-body text-center">
                                    <img src="${p.getImagen()}" class="img-fluid mb-3" alt="${p.getNombres()}" style="max-height: 170px;">
                                    <div class="price-container bg-light p-2 rounded">
                                        <span class="font-weight-bold">Precio $ ${p.getPrecio()} COP</span>
                                    </div>
                                </div>
                                <div class="card-footer bg-light">
                                    <p class="card-text text-muted">${p.getDescripcion()}</p>                                   
                                    <div class="text-center">                                
                                        <a href="Controlador?accion=AgregarCarrito&id=${p.getId()}" class="btn btn-outline-primary">Agregar a Carrito<i class="fas fa-cart-plus ml-1"></i></a>
                                        <a href="Controlador?accion=Comprar&id=${p.getId()}" class="btn btn-success">Comprar</a>
                                    </div>                         
                                </div>
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </div>
                        
                        <!-- Información de contacto y enlaces -->
               <!-- Footer -->
        <footer class="footer mt-4 bg-dark text-white">
            <div class="container">
                <div class="row">
                    <div class="col-md-4">
                        
                        <h5>Redes Sociales</h5>
                        <ul class="list-unstyled">
                            <li><a href="#"><i class="fab fa-facebook-f"></i> Facebook</a></li>
                            <li><a href="#"><i class="fab fa-twitter"></i> Twitter</a></li>
                            <li><a href="#"><i class="fab fa-instagram"></i> Instagram</a></li>
                            <li><a href="#"><i class="fab fa-whatsapp"></i> Whatsapp</a></li>
                        </ul>
                    </div>
                    <div class="col-md-4">
                        <h5>Contacto</h5>
                        <p>Tels: 304 205 0515 / 304 205 0535</p>
                        <p>Whatsapp: +57 313 297 0479</p>
                    </div>
                    <div class="col-md-4">
                        <h5>Quiénes Somos</h5>
                        <p>SmartShop ST es tu tienda de confianza para todo lo relacionado con celulares. Ofrecemos una amplia selección de los últimos modelos, accesorios y un servicio al cliente excepcional.</p>
                    </div>
                </div>
            </div>
            <!-- Dirección -->
            <div class="container-fluid bg-dark text-white text-center py-2">
                <p>Calle 10 # 23-45, Pasto - Nariño, Colombia</p>
            </div>
        </footer>



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



        <script src="https://code.jquery.com/jquery-3.4.1.js" integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU=" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        <script src="js/index.js" type="text/javascript"></script>
    </body>
</html>
