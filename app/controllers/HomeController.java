package controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import play.data.Form;
import play.mvc.*;
import Models.Producto;
import play.data.FormFactory;
import play.data.validation.Constraints;
import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */

public class HomeController extends Controller {
@Inject
FormFactory formFactory;
    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(index.render());
    }
    
    
    public Result nosotros() {
        return ok(nosotros.render());
    }
    
    public Result horarios() {
        return ok(horarios.render());
    }
    
    public Result productos() {
        return ok(productos.render());
    }
    
    public Result compra() {
        return ok(compra.render());
    }
    
    public Result login() {
        return ok(login.render());
    }
}
