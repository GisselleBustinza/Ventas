/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

/**
 *
 * @author gisselle
 */
public class producto {
    private int idproducto;
    private String nombre;
    private int costo;
    private int cantidad;
    private int fechavencimiento;
    private String estado;
    public producto(){
        
    }

    public producto(int idproducto, String nombre, int costo, int cantidad, int fechavencimiento, String estado) {
        this.idproducto = idproducto;
        this.nombre = nombre;
        this.costo = costo;
        this.cantidad = cantidad;
        this.fechavencimiento = fechavencimiento;
        this.estado = estado;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCosto() {
        return costo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getFechavencimiento() {
        return fechavencimiento;
    }

    public String getEstado() {
        return estado;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setFechavencimiento(int fechavencimiento) {
        this.fechavencimiento = fechavencimiento;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}