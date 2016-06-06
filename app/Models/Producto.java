/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;
import java.util.*;
import javax.persistence.*;

import com.avaje.ebean.Model;
import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValue;
import play.data.format.*;
import play.data.validation.*;
/**
 *
 * @author usuario
 */
@Entity
public class Producto extends Model{
    @Id
    @GeneratedValue(strategy=GenerationType.Auto)
    public Long id;
    
    public int tamanno;
    public int precionUnidad;
    public String tipo;
    public int cantidad;
    public static Model.Finder<Long, Producto> find=new 
        Model.Finder<Long, Producto>(Producto.class);
    public Long getId()
    { 
        return id;
    }
    public void setId(Long id)
    {
        this.id=id;
    }
    public void setTamanno()
    {
        this.tamanno=tamanno;    
    }
    public int getTamanno()
    {
        return tamanno;
    }
    public void setTipo(String  tipo)
    {
        this.tipo=tipo;
    }
    public String getTipo()
    {
        return tipo;
    }
    public void setCantidad(int cantidad)
    {
        this.cantidad=cantidad;
    }
    public int getCantidad()
    {
        return cantidad;
    }
    public static Finder<Long, Producto>getFind()
    {
        return find;
    }
    public static void setFind(Finder<Long, Producto>find)
    {
        Producto.find=find;
    }
}
