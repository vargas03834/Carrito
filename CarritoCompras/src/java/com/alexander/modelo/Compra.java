
package com.alexander.modelo;

import java.util.List;

public class Compra {
    int id;
    int idCliente;
    String fecha;
    Double monto;
    int idPago;
    String estado;

    private List<Carrito>detallecompras;
    
    public Compra() {
    }

    public Compra(int id, int idCliente, String fecha, Double monto, int idPago, String estado, List<Carrito> detallecompras) {
       
        this.idCliente = idCliente;
        this.fecha = fecha;
        this.monto = monto;
        this.idPago = idPago;
        this.estado = estado;
        this.detallecompras = detallecompras;
    }

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

   
   
}
