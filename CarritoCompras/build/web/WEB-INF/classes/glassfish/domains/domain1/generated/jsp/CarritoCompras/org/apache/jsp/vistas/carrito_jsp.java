package org.apache.jsp.vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.DateFormat;
import java.util.Locale;
import com.alexander.config.Fecha;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Date;

public final class carrito_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.2/css/all.css\" integrity=\"sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"css/estilos1.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>Carrito de Compras</title>\n");
      out.write("    </head>\n");
      out.write("    <body>       \n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarTogglerDemo03\" aria-controls=\"navbarTogglerDemo03\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\"><i>Alexander's Store</i></a>\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarTogglerDemo03\">\n");
      out.write("                <ul class=\"navbar-nav mr-auto mt-2 mt-lg-0\">\n");
      out.write("                    <li class=\"nav-item active\">\n");
      out.write("                        <a class=\"nav-link\" href=\"./Controlador?accion=Nuevo\"><i class=\"fas fa-home\"></i> Home<span class=\"sr-only\">(current)</span></a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"./Controlador?accion=home\"><i class=\"fas fa-plus-circle\"></i> Ofertas del Dia</a>\n");
      out.write("                    </li>                   \n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"./Controlador?accion=home\"><i class=\"fas fa-plus-circle\"></i> Seguir Comprando</a>\n");
      out.write("                    </li>                  \n");
      out.write("                </ul>                                            \n");
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
      out.write("                        <a class=\"dropdown-item\" href=\"Controlador?accion=Salir\"> <i class=\"fas fa-arrow-right\"> Salir</i></a>                        \n");
      out.write("                    </div>\n");
      out.write("                </ul>     \n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <div class=\"container mt-4\">\n");
      out.write("            <div class=\"d-flex\">\n");
      out.write("                <h2>Carrito</h2>     \n");
      out.write("                ");

                    Fecha fechaSistema = new Fecha();
                
      out.write("                     \n");
      out.write("                <p class=\"ml-auto\">");
      out.print( fechaSistema.Fecha());
      out.write("</p>                               \n");
      out.write("            </div>                    \n");
      out.write("            <div class=\"row\">             \n");
      out.write("                <div class=\"col-lg-9\">                 \n");
      out.write("                    <table class=\"table\">\n");
      out.write("                        <thead class=\"thead-light\">\n");
      out.write("                            <tr class=\"text-center\">\n");
      out.write("                                <th>Item</th>                               \n");
      out.write("                                <th>Articulo</th>\n");
      out.write("                                <th>Descripcion</th>\n");
      out.write("                                <th>Precio</th>\n");
      out.write("                                <th>Cantidad</th>                       \n");
      out.write("                                <th>Total</th>                       \n");
      out.write("                                <th>Acciones</th>                       \n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>                    \n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-3\">                  \n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <div class=\"card-header\">\n");
      out.write("                            Generar Compra\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <label>Subtotal:</label>\n");
      out.write("                            <a class=\"form-control text-center\"><i class=\"fas fa-dollar-sign h5\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${totalPagar}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("0</i></a>\n");
      out.write("                            <label>Precio Envio:</label>\n");
      out.write("                            <a class=\"form-control text-center\"><i class=\"fas fa-dollar-sign h5\"> 0.00</i></a>\n");
      out.write("                            <label>Descuento:</label>\n");
      out.write("                            <a class=\"form-control text-center\"><i class=\"fas fa-dollar-sign h5\"> 0.00</i></a>\n");
      out.write("                            <label>Total a Pagar:</label>\n");
      out.write("                            <a class=\"form-control text-center\"><i class=\"fas fa-dollar-sign h4 primary\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${totalPagar}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("0</i></a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-footer\">\n");
      out.write("                            <a href=\"Controlador?accion=GenerarCompra\" class=\"btn btn-danger btn-block\">Generar Compra</a>\n");
      out.write("                            <a href=\"#\" data-toggle=\"modal\" data-target=\"#myModalPago\" class=\"btn btn-info btn-block\">Realizar Pago</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>          \n");
      out.write("        </div>\n");
      out.write("        <!-- Modal Iniciar Session o Registrarse -->\n");
      out.write("        <div class=\"modal fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\">\n");
      out.write("            <div class=\"modal-dialog modal-dialog-centered\" role=\"document\">\n");
      out.write("                <div class=\"container col-lg-9\">                   \n");
      out.write("                    <div class=\"modal-content\">                   \n");
      out.write("                        <div class=\"pr-2 pt-1\">                         \n");
      out.write("                            <button type=\"button\" class=\"close\" data-dismiss=\"modal\">\n");
      out.write("                                <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                            </button>                    \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"text-center\">                         \n");
      out.write("                            <img src=\"img/user.png\" width=\"100\" height=\"100\">                         \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-header text-center\">                      \n");
      out.write("                            <ul class=\"nav nav-pills\">                           \n");
      out.write("                                <li class=\"nav-item\">\n");
      out.write("                                    <a class=\"nav-link active\" data-toggle=\"pill\" href=\"#pills-iniciar\">Iniciar Sesion</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"nav-item\">\n");
      out.write("                                    <a class=\"nav-link\" data-toggle=\"pill\" href=\"#pills-registrar\">Registrarse</a>\n");
      out.write("                                </li>                          \n");
      out.write("                            </ul>  \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-body\"> \n");
      out.write("                            <div class=\"tab-content\" id=\"pills-tabContent\">\n");
      out.write("                                <!-- Iniciar Session -->\n");
      out.write("                                <div class=\"tab-pane fade show active\" id=\"pills-iniciar\" role=\"tabpanel\">\n");
      out.write("                                    <form action=\"Controlador\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label>Email address</label>\n");
      out.write("                                            <input type=\"email\" name=\"txtemail\" class=\"form-control\" placeholder=\"email@example.com\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label>Password</label>\n");
      out.write("                                            <input type=\"password\" name=\"txtpass\" class=\"form-control\" placeholder=\"Password\">\n");
      out.write("                                        </div>                                   \n");
      out.write("                                        <button type=\"submit\" name=\"accion\" value=\"Validar\" class=\"btn btn-danger btn-block\">Iniciar</button>\n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- Registrarse -->\n");
      out.write("                                <div class=\"tab-pane fade\" id=\"pills-registrar\" role=\"tabpanel\">\n");
      out.write("                                    <form action=\"Controlador\">                               \n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label>Nombres</label>\n");
      out.write("                                            <input type=\"text\" name=\"txtnom\" class=\"form-control\" placeholder=\"Leo Perez\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label>Dni</label>\n");
      out.write("                                            <input type=\"number\" name=\"txtdni\" class=\"form-control\" placeholder=\"01245678\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label>Direccion</label>\n");
      out.write("                                            <input type=\"text\" name=\"txtdire\" class=\"form-control\" placeholder=\"Chiclayo - La Victoria\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label>Email address</label>\n");
      out.write("                                            <input type=\"email\" name=\"txtemail\" class=\"form-control\" placeholder=\"email@example.com\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label>Password</label>\n");
      out.write("                                            <input type=\"password\" name=\"txtpass\" class=\"form-control\" placeholder=\"Password\">\n");
      out.write("                                        </div>                                  \n");
      out.write("                                        <button type=\"submit\" name=\"accion\" value=\"Registrar\" class=\"btn btn-danger btn-block\">Crear Cuenta</button>\n");
      out.write("                                    </form>\n");
      out.write("                                </div>                          \n");
      out.write("                            </div> \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Modal de Pago -->\n");
      out.write("        <div class=\"modal fade\" id=\"myModalPago\" tabindex=\"-1\" role=\"dialog\">\n");
      out.write("            <div class=\"modal-dialog modal-dialog-centered\" role=\"document\">         \n");
      out.write("                <div class=\"modal-content\">                   \n");
      out.write("                    <div class=\"modal-header text-center\"> \n");
      out.write("                        <label><i class=\"fa-dollar-sign\"></i>Realizar Pago</label>\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\">\n");
      out.write("                            <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                        </button>  \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\"> \n");
      out.write("                        <div class=\"tab-content\" id=\"pills-tabContent\">\n");
      out.write("                            <!-- Metodo Pago -->\n");
      out.write("                            <div class=\"tab-pane fade show active\" id=\"pills-iniciar\" role=\"tabpanel\">\n");
      out.write("                                <form action=\"Controlador\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>Card address</label>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" placeholder=\"9999-9999-9999-9999\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>Codigo Seguridad</label>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" placeholder=\"xxxx\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>Monto</label>\n");
      out.write("                                        <input type=\"text\" name=\"txtmonto\" value=\"$.");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${totalPagar}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("0\" class=\"form-control h1\">\n");
      out.write("                                    </div>                                   \n");
      out.write("                                    <button type=\"submit\" name=\"accion\" value=\"RealizarPago\" class=\"btn btn-info btn-block\">Pagar</button>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div> \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.4.1.js\" integrity=\"sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU=\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\n");
      out.write("        <script src=\"js/funciones.js\" type=\"text/javascript\"></script>\n");
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
    _jspx_th_c_forEach_0.setVar("c");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Carrito}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write(" \n");
          out.write("                                <tr class=\"text-center tr\">\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.getItem()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>                                   \n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.getNombres()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                        <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.getImagen()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" width=\"130\" height=\"110\">\n");
          out.write("                                    </td>\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.getDescripcion()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.getPrecioCompra()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                    <td>        \n");
          out.write("                                        <input type=\"hidden\" id=\"item1\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.getIdProducto()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                        <input type=\"number\" min=\"1\" max=\"10\"  id=\"Cant\" class=\" form-control text-center\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.getCantidad()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                    </td>   \n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.getSubTotal()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>                           \n");
          out.write("                                    <td class=\"text-center\">                                         \n");
          out.write("                                        <input type=\"hidden\" id=\"item2\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.getIdProducto()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                        <a id=\"deleteItem\" href=\"#\" class=\"btn\"><i class=\"fas fa-trash-alt\"></i></a>                                            \n");
          out.write("                                    </td>                           \n");
          out.write("                                </tr>\n");
          out.write("                            ");
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
