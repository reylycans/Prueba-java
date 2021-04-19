package com.store.hulkstore.dominio.modelo;

public class Linea {
    private int id_linea;

    private String descripcion;

    public Linea(int id_linea, String descripcion){
        this.id_linea = id_linea;
        this.descripcion = descripcion;
    }

    public int getId_linea() {
        return id_linea;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
