package com.store.hulkstore.dominio.modelo;


public class Categoria {

    private int id_categoria;
    private String nombre;

    public Categoria(int id_categoria, String nombre){
        this.id_categoria = id_categoria;
        this.nombre = nombre;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public String getNombre() {
        return nombre;
    }
}
