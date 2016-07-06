/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;


import com.avaje.ebean.Model;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import play.mvc.Result;
import static play.mvc.Results.ok;

/**
 *
 * @author usuario
 */
public class Login {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    
    public String contraseña;
    public String usuario;
    public static Model.Finder<Long, Producto> find=new 
        Model.Finder<Long, Producto>(Producto.class);
    
}

