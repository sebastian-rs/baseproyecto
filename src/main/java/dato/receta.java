/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dato;

/**
 *
 * @author JCBOT
 */
public class receta {

    private int id;
    private String Nombre_Receta;
    private String Tiempo_de_preparacion;
    private String Receta;
    private String Cantidad_de_personas;
    private String Ingredientes;
    private String Pasos;

    public receta(String Nombre_Receta, String Tiempo_de_preparacion, String Receta, String Cantidad_de_personas, String Ingredientes, String Pasos) {

        this.Nombre_Receta = Nombre_Receta;
        this.Tiempo_de_preparacion = Tiempo_de_preparacion;
        this.Receta = Receta;
        this.Cantidad_de_personas = Cantidad_de_personas;
        this.Ingredientes = Ingredientes;
        this.Pasos = Pasos;
    }

    public receta() {

    }

    public String getNombre_Receta() {
        return Nombre_Receta;
    }

    public void setNombre_Receta(String Nombre_Receta) {
        this.Nombre_Receta = Nombre_Receta;
    }

    public String getTiempo_de_preparacion() {
        return Tiempo_de_preparacion;
    }

    public void setTiempo_de_preparacion(String Tiempo_de_preparacion) {
        this.Tiempo_de_preparacion = Tiempo_de_preparacion;
    }

    public String getReceta() {
        return Receta;
    }

    public void setReceta(String Receta) {
        this.Receta = Receta;
    }

    public String getCantidad_de_personas() {
        return Cantidad_de_personas;
    }

    public void setCantidad_de_personas(String Cantidad_de_personas) {
        this.Cantidad_de_personas = Cantidad_de_personas;
    }

    public String getIngredientes() {
        return Ingredientes;
    }

    public void setIngredientes(String Ingredientes) {
        this.Ingredientes = Ingredientes;
    }

    public String getPasos() {
        return Pasos;
    }

    public void setPasos(String Pasos) {
        this.Pasos = Pasos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
