package com.store.hulkstore.dominio.modelo;

public class RecepcionItems {
    private int id;
    private Producto producto;
    private double costo;
    private int cantidad;

    public RecepcionItems(int id, Producto producto, double costo, int cantidad){
        this.id = id;
        this.producto = producto;
        this.costo = costo;
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public Producto getProducto() {
        return producto;
    }

    public double getCosto() {
        return costo;
    }

    public int getCantidad() {
        return cantidad;
    }
}
