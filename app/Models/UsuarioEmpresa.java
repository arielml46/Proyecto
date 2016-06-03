/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import com.avaje.ebean.Model;
import javax.persistence.Entity;
import javax.persistence.Id;
import play.data.validation.Constraints;

/**
 *
 * @author usuario
 */



@Entity
public class UsuarioEmpresa extends Model{

    @Id
    @Constraints.Min(10)
    public Long id;

    @Constraints.Required
    public String usuario;
    
    public static Model.Finder<Long, UsuarioEmpresa> find = new Model.Finder<Long, UsuarioEmpresa>(UsuarioEmpresa.class);
}
    

