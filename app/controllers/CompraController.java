/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import play.data.Form;
import play.mvc.*;
import models.Producto;
import play.data.FormFactory;
import play.data.validation.Constraints;
import views.html.*;
import play.mvc.Controller;
import static play.mvc.Results.badRequest;
import static play.mvc.Results.ok;

/**
 *
 * @author usuario
 */
public class CompraController extends Controller{   
    @Inject
    FormFactory formFactory;
    public Result crearPreguntaGet() {
        Form<Producto> prodForm = formFactory.form(Producto.class);
        return ok(compra.render(prodForm,
                routes.CompraController.crearPreguntaPost()));
    }

    public Result crearCompraPost() {
        Form<Producto> prodForm = formFactory.form(Producto.class).bindFromRequest();
        if (prodForm.hasErrors()) {
            return badRequest(compra.render("Encontramos errores",
                    prodForm, routes.HomeController.compra()));
        } else {
            Producto prod=prodForm.get();
            if(prod.id.equals("0"))
            {
//                Producto prod= prodForm.get();
                prod.save();
                prodForm = formFactory.form(Producto.class);
            } else {
            }
        return ok(compra.render("", prodForm,
                routes.CompraController.crearCompraPost()));
    }
}
