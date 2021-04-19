package com.store.hulkstore.testDataBuilder;

import com.store.hulkstore.dominio.modelo.Linea;

public class LineaTestDataBuilder {

    private final int ID_LINEA = 1;
    private final String DESCRIPCION = "Marvel";

    private int id_linea;

    private String descripcion;

    public LineaTestDataBuilder(){
        this.id_linea = ID_LINEA;
        this.descripcion = DESCRIPCION;
    }

    public LineaTestDataBuilder conIdLinea(int id_linea){
        this.id_linea = id_linea;
        return this;
    }

    public LineaTestDataBuilder conDescripcion(String descripcion){
        this.descripcion = descripcion;
        return this;
    }

    public Linea build(){
        return new Linea(id_linea,descripcion);
    }
}
