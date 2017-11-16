/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import dato.receta;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Isabel-Fabian
 */
public class BD3 implements Serializable {

    private ArrayList<receta> activos;

    public BD3() {
        this.activos = new ArrayList<receta>();

    }

    public void addReceta(receta activo) {
        this.activos.add(activo);
    }

    public ArrayList<receta> getRecetas() {
        return activos;
    }

}
