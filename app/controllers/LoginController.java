/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import play.data.FormFactory;
import play.data.validation.Constraints;
import views.html.*;
import static play.mvc.Results.badRequest;
import static play.mvc.Results.ok;
import javax.inject.Inject;
import play.data.Form;
import play.mvc.*;
import models.Login;
/**
 *
 * @author usuario
 */
public class LoginController extends Controller{
    @Inject
    FormFactory formFactory;
    public Result validar()
    {
        Form<Login> loginForm = formFactory.form(Login.class);
        if(loginForm.hasErrors())
        {
            return badRequest(login.render("Ingrese nuevamente el usuario", 
                    routes.HomeController.login));
        }
        else
        {
            Login log=new Login.find.byUsuario(loginForm.get().usuario);
        
            if()
        }
    }
    
}
