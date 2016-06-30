package controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import play.data.Form;
import play.mvc.*;
import Models.Producto;
import static com.google.common.collect.Multimaps.index;
import static play.api.Application$class.routes;
import static play.api.Play.routes;
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
        return ok(index.render("Compra"));
    }
    public Result crearProductoGet()
    {
        Form<Producto> prodForm= formFactory.form(Producto.class);
        return ok(compra.render("Compra de Baldosas y Columnas", 
                prodForm, 
                routes.HomeController.crearProductoPost()));
    } 
    public Result crearProductoPost()
    {
        Form<Producto> prodForm = formFactory.form(Producto.class).bindFromRequest();
        if(prodForm.hasErrors())
        {
            return badRequest(compra.render("El pedido tiene errores",prodForm, routes.HomeController.index()));
        }
        else
        {
            Producto prod=prodForm.get();
            prod.save();
            prodForm=formFactory.form(Producto.class);
        }
        return ok(compra.render("Se ha guardado el pedido correctamente.", prodForm,routes.HomeController.crearProductoPost()));
    }
    

}
