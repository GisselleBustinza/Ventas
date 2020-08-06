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
public class detallesdelaventa {
    
    private int detallesdelaventa;
    private int codigoproducto;
    private int stock;
    private String marca;
    private int fechaelaboracion;
    private String estado;
    public detallesdelaventa(){
        
    }

    public detallesdelaventa(int detallesdelaventa, int codigoproducto, int stock, String marca, int fechaelaboracion, String estado) {
        this.detallesdelaventa = detallesdelaventa;
        this.codigoproducto = codigoproducto;
        this.stock = stock;
        this.marca = marca;
        this.fechaelaboracion = fechaelaboracion;
        this.estado = estado;
    }

    public int getDetallesdelaventa() {
        return detallesdelaventa;
    }

    public int getCodigoproducto() {
        return codigoproducto;
    }

    public int getStock() {
        return stock;
    }

    public String getMarca() {
        return marca;
    }

    public int getFechaelaboracion() {
        return fechaelaboracion;
    }

    public String getEstado() {
        return estado;
    }

    public void setDetallesdelaventa(int detallesdelaventa) {
        this.detallesdelaventa = detallesdelaventa;
    }

    public void setCodigoproducto(int codigoproducto) {
        this.codigoproducto = codigoproducto;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setFechaelaboracion(int fechaelaboracion) {
        this.fechaelaboracion = fechaelaboracion;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}