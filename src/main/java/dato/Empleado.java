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
public class Empleado {

    private String Nombre_empleado;
    private String apellidos_empleado;
    private String cedula;
    private String edad;
    private String estado_civil;
    private String direccion;
    private String telefono;
    private String eps;
    private String fecha_de_contratacion;

    public Empleado(String Nombre_empleado, String apellidos_empleado,String cedula, String edad, String estado_civil, String direccion, String telefono, String eps,String fecha_de_contratacion) {
        this.Nombre_empleado = Nombre_empleado;
        this.apellidos_empleado = apellidos_empleado;
        this.cedula=cedula;
        this.edad = edad;
        this.estado_civil = estado_civil;
        this.direccion = direccion;
        this.telefono = telefono;
        this.eps = eps;
        this.fecha_de_contratacion=fecha_de_contratacion;
    }

    public Empleado() {
    }
    
    

    public String getNombre_empleado() {
        return Nombre_empleado;
    }

    public void setNombre_empleado(String Nombre_empleado) {
        this.Nombre_empleado = Nombre_empleado;
    }

    public String getApellidos_empleado() {
        return apellidos_empleado;
    }

    public void setApellidos_empleado(String apellidos_empleado) {
        this.apellidos_empleado = apellidos_empleado;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getFecha_de_contratacion() {
        return fecha_de_contratacion;
    }

    public void setFecha_de_contratacion(String fecha_de_contratacion) {
        this.fecha_de_contratacion = fecha_de_contratacion;
    }

   
    
    
    

}
