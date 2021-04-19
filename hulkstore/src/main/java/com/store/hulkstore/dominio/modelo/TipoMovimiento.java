package com.store.hulkstore.dominio.modelo;

public class TipoMovimiento {
    private int id_tipo;
    private String descripcion;

    public TipoMovimiento(int id_tipo,String descripcion){
        this.id_tipo = id_tipo;
        this.descripcion = descripcion;
    }

    public int getId_tipo() {
        return id_tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
