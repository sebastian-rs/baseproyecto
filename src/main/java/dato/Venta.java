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
public class Venta {

    private int id;
    private String producto;
    private String valor_unitario;
    private String cantidad;
    private String Valor_total;
    private String fecha;

    public Venta(String producto, String valor_unitario, String cantidad, String Valor_total) {
        this.producto = producto;
        this.valor_unitario = valor_unitario;
        this.cantidad = cantidad;
        this.Valor_total = Valor_total;
    }

    public Venta() {

    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getValor_unitario() {
        return valor_unitario;
    }

    public void setValor_unitario(String valor_unitario) {
        this.valor_unitario = valor_unitario;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getValor_total() {
        return Valor_total;
    }

    public void setValor_total(String Valor_total) {
        this.Valor_total = Valor_total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

}
