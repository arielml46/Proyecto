/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.*;
import javax.persistence.*;

import com.avaje.ebean.Model;
import play.data.format.*;
import play.data.validation.*;
/**
 *
 * @author usuario
 */
@Entity
public class Producto extends Model{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    
    public int precio;
    public String tipo;
    public int cantidad;
    public static Model.Finder<Long, Producto> find=new 
        Model.Finder<Long, Producto>(Producto.class);
    
}
