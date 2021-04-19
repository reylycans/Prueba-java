package com.store.hulkstore.aplicacion.comando;

import com.store.hulkstore.dominio.modelo.Categoria;
import com.store.hulkstore.dominio.modelo.Linea;

public class ComandoProducto {

    private int id_producto;
    private String nombre;
    private Categoria categoria;
    private Linea linea;

    public ComandoProducto(int id_producto,String nombre, Categoria categoria,Linea linea){
        this.id_producto = id_producto;
        this.nombre = nombre;
        this.categoria = categoria;
        this.linea = linea;
    }

    public int getId_producto() {
        return id_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Linea getLinea() {
        return linea;
    }
}
