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
    List lista;
    public Result crearCompraGet() {
        Form<Producto> prodForm = formFactory.form(Producto.class);
        return ok(compra.render(routes.CompraController.crearCompraPost()));
    }

    public Result crearCompraPost() {
        Form<Producto> prodForm = formFactory.form(Producto.class).bindFromRequest();
        System.out.print("kjacbbwdhvbfkjb dfkjbvhdjfbvhdfjhbvdjfhvbdjbfvhjdfbvjdbfjhdfb");
        if (prodForm.hasErrors()) {
            return badRequest(compra.render(routes.HomeController.compras()));
        } else
        {
            Producto prod=prodForm.get();
            if(prod.id.equals("0"))
            {
                Producto pord=new Producto();
                pord.cantidad=12;
                pord.precio=100000;
                pord.tipo="Columna";
                
                pord.save();
            } else if(prod.id.equals("1")){
                Producto pord=new Producto();
                pord.cantidad=12;
                pord.precio=120000;
                pord.tipo="Tes";
                pord.save();
            }else if(prod.id.equals("2")){
                Producto pord=new Producto();
                pord.cantidad=12;
                pord.precio=80000;
                pord.tipo="Coronas";
                pord.save();
            }else if(prod.id.equals("3")){
                Producto pord=new Producto();
                pord.cantidad=12;
                pord.precio=100000;
                pord.tipo="Baldosas";
                pord.save();
            }
        }
        return ok(compra.render(routes.HomeController.compras()));
    }
    public Result realizarCompra()
    {
        List<Producto>lista=Producto.find.all();
        Form<Producto> prodForm  = formFactory.form(Producto.class);
      return ok(compra.render("Listado de Grupo",prodForm));
    }   
    }