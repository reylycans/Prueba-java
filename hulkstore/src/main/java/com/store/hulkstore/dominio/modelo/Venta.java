package com.store.hulkstore.dominio.modelo;

public class Venta {
    private int id_venta;
    private Producto producto;
    private double precio;
    private int cantidad;

    public Venta(int id_venta, Producto producto, double precio, int cantidad) {
        this.id_venta = id_venta;
        this.producto = producto;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public int getId_venta() {
        return id_venta;
    }

    public Producto getProducto() {
        return producto;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }
}
