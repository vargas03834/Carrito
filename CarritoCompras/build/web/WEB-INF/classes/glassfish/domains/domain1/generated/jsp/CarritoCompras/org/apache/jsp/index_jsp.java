package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      response.setHeader("X-Powered-By", "JSP/2.3");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.2/css/all.css\" integrity=\"sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"css/estilos.css\" rel=\"stylesheet\" type=\"text/css\"/>        \n");
      out.write("        <title>SmartShop ST 🛒</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarTogglerDemo03\" aria-controls=\"navbarTogglerDemo03\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("            <div class=\"text-center\">                         \n");
      out.write("                <img src=\"img/logo.png\" width=\"70\" height=\"50\">                         \n");
      out.write("            </div>\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\"><i>SmartShop ST 🛒</i></a>\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarTogglerDemo03\">\n");
      out.write("                <ul class=\"navbar-nav mr-auto mt-2 mt-lg-0\">\n");
      out.write("                    <li class=\"nav-item active\">\n");
      out.write("                        <a class=\"nav-link\" href=\"./Controlador?accion=Nuevo\"><i class=\"fas fa-home\"></i> Home<span class=\"sr-only\">(current)</span></a>\n");
      out.write("                    </li>\n");
      out.write("                    <!--<li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"./Controlador?accion=home\"><i class=\"fas fa-plus-circle\"></i> Ofertas del Dia</a>\n");
      out.write("                    </li>      -->            \n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"./Controlador?accion=carrito\"><i class=\"fas fa-cart-plus\">(<label style=\"color: darkorange\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cont}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</label>)</i> Carrito</a>\n");
      out.write("                    </li> \n");
      out.write("                    <!--\n");
      out.write("                        <a class=\"nav-link\" href=\"./Controlador?accion=NuevoProducto\">Productos</a>\n");
      out.write("                    </li> -->\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"./Controlador?accion=ChatBot\">ChatBot</a>\n");
      out.write("                    </li> \n");
      out.write("                </ul>\n");
      out.write("                <ul class=\"navbar-nav mr-auto mt-2 mt-lg-0\">\n");
      out.write("                    <!--<form class=\"form-inline my-2 my-lg-0\">-->\n");
      out.write("                    <input style=\"width:300px; background-image: url('ruta_de_la_imagen');\" class=\"form-control mr-sm-2\" id=\"txtBuscar\" placeholder=\"Buscar celular\">\n");
      out.write("\n");
      out.write("                    <button class=\"btn btn-outline-info my-2 my-sm-0\" id=\"btnBuscar\"><i class=\"fas fa-search\"></i> Buscar</button>\n");
      out.write("                    <!-- </form>       -->                 \n");
      out.write("                </ul>                                \n");
      out.write("                <ul class=\"navbar-nav btn-group my-2 my-lg-0\" role=\"group\">\n");
      out.write("                    <a style=\"color: white; cursor: pointer\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                        <i class=\"fas fa-user-tie\"></i> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${logueo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a>\n");
      out.write("                    <div class=\"dropdown-menu text-center dropdown-menu-right\">\n");
      out.write("                        <a class=\"dropdown-item\" href=\"#\"><img src=\"img/user.png\" alt=\"60\" height=\"60\"/></a>                        \n");
      out.write("                        <a class=\"dropdown-item\" href=\"#\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a>\n");
      out.write("                        <a class=\"dropdown-item\" href=\"#\" data-toggle=\"modal\" data-target=\"#myModal\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${correo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a>\n");
      out.write("                        <div class=\"dropdown-divider\"></div>\n");
      out.write("                        <a class=\"dropdown-item\" href=\"Controlador?accion=MisCompras\">Mis Compras</a>\n");
      out.write("                        <div class=\"dropdown-divider\"></div>\n");
      out.write("                        <a class=\"dropdown-item\" href=\"./Controlador?accion=Salir\"> <i class=\"fas fa-arrow-right\"> Salir</i></a>                        \n");
      out.write("                    </div>\n");
      out.write("                </ul>     \n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <div class=\"container mt-4\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("                        \n");
      out.write("                        <!-- Información de contacto y enlaces -->\n");
      out.write("               <!-- Footer -->\n");
      out.write("        <footer class=\"footer mt-4 bg-dark text-white\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        \n");
      out.write("                        <h5>Redes Sociales</h5>\n");
      out.write("                        <ul class=\"list-unstyled\">\n");
      out.write("                            <li><a href=\"#\"><i class=\"fab fa-facebook-f\"></i> Facebook</a></li>\n");
      out.write("                            <li><a href=\"#\"><i class=\"fab fa-twitter\"></i> Twitter</a></li>\n");
      out.write("                            <li><a href=\"#\"><i class=\"fab fa-instagram\"></i> Instagram</a></li>\n");
      out.write("                            <li><a href=\"#\"><i class=\"fab fa-whatsapp\"></i> Whatsapp</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <h5>Contacto</h5>\n");
      out.write("                        <p>Tels: 304 205 0515 / 304 205 0535</p>\n");
      out.write("                        <p>Whatsapp: +57 313 297 0479</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <h5>Quiénes Somos</h5>\n");
      out.write("                        <p>SmartShop ST es tu tienda de confianza para todo lo relacionado con celulares. Ofrecemos una amplia selección de los últimos modelos, accesorios y un servicio al cliente excepcional.</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- Dirección -->\n");
      out.write("            <div class=\"container-fluid bg-dark text-white text-center py-2\">\n");
      out.write("                <p>Calle 10 # 23-45, Pasto - Nariño, Colombia</p>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Modal Iniciar Sesión o Registrarse -->\n");
      out.write("        <div class=\"modal fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\">\n");
      out.write("            <div class=\"modal-dialog modal-dialog-centered\" role=\"document\">\n");
      out.write("                <div class=\"container col-lg-9\">\n");
      out.write("                    <div class=\"modal-content border-0 rounded\">\n");
      out.write("                        <div class=\"modal-header bg-dark text-light\">\n");
      out.write("                            <h5 class=\"modal-title mx-auto\">Iniciar Sesión o Crear Cuenta</h5>\n");
      out.write("                            <button type=\"button\" class=\"close text-light\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                                <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                            </button>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-body\">\n");
      out.write("                            <div class=\"text-center mb-3\">\n");
      out.write("                                <img src=\"img/user.png\" width=\"80\" height=\"80\" class=\"rounded-circle border border-dark p-1\">\n");
      out.write("                            </div>\n");
      out.write("                            <ul class=\"nav nav-pills nav-justified mb-3\">\n");
      out.write("                                <li class=\"nav-item\">\n");
      out.write("                                    <a class=\"nav-link active\" data-toggle=\"pill\" href=\"#pills-iniciar\">Iniciar Sesión</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"nav-item\">\n");
      out.write("                                    <a class=\"nav-link\" data-toggle=\"pill\" href=\"#pills-registrar\">Crear Cuenta</a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                            <div class=\"tab-content\">\n");
      out.write("                                <!-- Iniciar Sesión -->\n");
      out.write("                                <div class=\"tab-pane fade show active\" id=\"pills-iniciar\" role=\"tabpanel\">\n");
      out.write("                                    <form action=\"Controlador\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label for=\"loginEmail\">Correo Electrónico</label>\n");
      out.write("                                            <input type=\"email\" name=\"txtemail\" class=\"form-control\" id=\"loginEmail\" placeholder=\"email@example.com\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label for=\"loginPassword\">Contraseña</label>\n");
      out.write("                                            <input type=\"password\" name=\"txtpass\" class=\"form-control\" id=\"loginPassword\" placeholder=\"Contraseña\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <button type=\"submit\" name=\"accion\" value=\"Validar\" class=\"btn btn-block\" style=\"background-color: #4CAF50; color: white;\">Iniciar Sesión</button>\n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- Crear Cuenta -->\n");
      out.write("                                <div class=\"tab-pane fade\" id=\"pills-registrar\" role=\"tabpanel\">\n");
      out.write("                                    <form action=\"Controlador\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label for=\"registerName\">Nombres</label>\n");
      out.write("                                            <input type=\"text\" name=\"txtnom\" class=\"form-control\" id=\"registerName\" placeholder=\"Ana Torres\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label for=\"registerDni\">DNI</label>\n");
      out.write("                                            <input type=\"text\" maxlength=\"8\" name=\"txtdni\" class=\"form-control\" id=\"registerDni\" placeholder=\"01234567\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label for=\"registerAddress\">Dirección</label>\n");
      out.write("                                            <input type=\"text\" name=\"txtdire\" class=\"form-control\" id=\"registerAddress\" placeholder=\"Pasto - Nariño\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label for=\"registerEmail\">Correo Electrónico</label>\n");
      out.write("                                            <input type=\"email\" name=\"txtemail\" class=\"form-control\" id=\"registerEmail\" placeholder=\"email@example.com\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label for=\"registerPassword\">Contraseña</label>\n");
      out.write("                                            <input type=\"password\" name=\"txtpass\" class=\"form-control\" id=\"registerPassword\" placeholder=\"Contraseña\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <button type=\"submit\" name=\"accion\" value=\"Registrar\" class=\"btn btn-block\" style=\"background-color: #4CAF50; color: white;\">Crear Cuenta</button>\n");
      out.write("\n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.4.1.js\" integrity=\"sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU=\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"js/index.js\" type=\"text/javascript\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("p");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productos}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    <div class=\"col-sm-4\">\n");
          out.write("                        <div class=\"form-group\">\n");
          out.write("                            <div class=\"card shadow\">\n");
          out.write("                                <div class=\"card-header bg-primary text-white text-center\">\n");
          out.write("                                    <h5 class=\"card-title font-weight-bold\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getNombres()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h5>                                    \n");
          out.write("                                </div>\n");
          out.write("                                <div class=\"card-body text-center\">\n");
          out.write("                                    <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getImagen()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"img-fluid mb-3\" alt=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getNombres()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" style=\"max-height: 170px;\">\n");
          out.write("                                    <div class=\"price-container bg-light p-2 rounded\">\n");
          out.write("                                        <span class=\"font-weight-bold\">Precio $ ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getPrecio()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" COP</span>\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                                <div class=\"card-footer bg-light\">\n");
          out.write("                                    <p class=\"card-text text-muted\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getDescripcion()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>                                   \n");
          out.write("                                    <div class=\"text-center\">                                \n");
          out.write("                                        <a href=\"Controlador?accion=AgregarCarrito&id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"btn btn-outline-primary\">Agregar a Carrito<i class=\"fas fa-cart-plus ml-1\"></i></a>\n");
          out.write("                                        <a href=\"Controlador?accion=Comprar&id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"btn btn-success\">Comprar</a>\n");
          out.write("                                    </div>                         \n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("                        </div>\n");
          out.write("                    </div>\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
