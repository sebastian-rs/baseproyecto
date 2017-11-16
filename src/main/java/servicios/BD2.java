/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import dato.compras;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Isabel-Fabian
 */
public class BD2 implements Serializable {

    private ArrayList<compras> activos;

    public BD2() {
        this.activos = new ArrayList<compras>();

    }

    public void addCompra(compras activo) {
        this.activos.add(activo);
    }

    public ArrayList<compras> getActivos() {
        return activos;
    }

}
