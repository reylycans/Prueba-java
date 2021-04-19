package com.store.hulkstore.aplicacion.comando;

import com.store.hulkstore.dominio.modelo.RecepcionItems;

import java.util.List;

public class ComandoRecepcionTecnica {
    private int id_recepcion;
    private List<RecepcionItems> recepcionItems;

    public ComandoRecepcionTecnica(int id_recepcion,List<RecepcionItems> recepcionItems){
        this.id_recepcion = id_recepcion;
        this.recepcionItems = recepcionItems;
    }

    public int getId_recepcion() {
        return id_recepcion;
    }

    public List<RecepcionItems> getRecepcionItems() {
        return recepcionItems;
    }
}
