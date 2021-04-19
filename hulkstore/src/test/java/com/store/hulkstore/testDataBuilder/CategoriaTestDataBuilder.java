package com.store.hulkstore.testDataBuilder;

import com.store.hulkstore.dominio.modelo.Categoria;

public class CategoriaTestDataBuilder {

    private static int ID_CATEGORIA = 2;
    private static String NOMBRE = "Juguete";

    private int id_categoria;
    private String nombre;

    public CategoriaTestDataBuilder(){
       this.id_categoria = ID_CATEGORIA;
       this.nombre = NOMBRE;
    }

    public CategoriaTestDataBuilder conIdCategoria(int id_categoria){
        this.id_categoria = id_categoria;
        return this;
    }

    public CategoriaTestDataBuilder conNombre(){
        this.nombre = nombre;
        return this;
    }

    public Categoria build(){
        return new Categoria(id_categoria,nombre);
    }
}
