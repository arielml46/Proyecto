/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import models.User;
import models.utils.AppException;
import play.Logger;
import play.data.Form;
import play.data.validation.Constraints;
import play.i18n.Messages;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.home;
import views.html.admin;
import models.utils.Hash;
import static play.data.Form.form;

/**
 *
 * @author usuario
 */
public class Application extends Controller{
  
    public Result GO_HOME = redirect(
            routes.Application.login()
    );
    
    public Result home() {
        String username = ctx().session().get("username");
        if (username != null) {
            User user = User.findByUsername(username);
            if (user != null) {
                return  ok(admin.render(user));
            } else {
                session().clear();
            }
        }
        return ok(home.render(form(Login.class)));
    
    }
    
    public static class Login {

        @Constraints.Required()
        public String username;
        @Constraints.Required()
        public String password;
        
        
    public String validate() {

            User user = null;
            try {
                user = User.authenticate(username, password);
            } catch (AppException e) {
                return Messages.get("error.technical");
            }
            if (user == null) {
                return Messages.get("invalid.username.or.password");
            }
            return null;
        }

    }
    
    public Result authenticate() {
        Form<Login> loginForm = form(Login.class).bindFromRequest();

        if (loginForm.hasErrors()) {
            return badRequest(home.render(loginForm));
        } else {
            session("username", loginForm.get().username);
            return GO_HOME;
        }
    }
    
    public Result logout() {
        session().clear();
        flash("success",  "Usted ha cerrado sesión correctamente");
        return GO_HOME;
    }

    
    
}
