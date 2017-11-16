/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import dato.Empleado;
import dato.receta;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Isabel-Fabian
 */
public class BD4 implements Serializable {

    private ArrayList<Empleado> activos;

    public BD4() {
        this.activos = new ArrayList<Empleado>();

    }

    public void addEmpleado(Empleado activo) {
        this.activos.add(activo);
    }

    public ArrayList<Empleado> getEmpleados() {
        return activos;
    }

}
