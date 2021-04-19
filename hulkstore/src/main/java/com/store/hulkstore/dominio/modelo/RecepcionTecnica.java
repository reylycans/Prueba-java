package com.store.hulkstore.dominio.modelo;

import java.util.List;

public class RecepcionTecnica {
    private int id_recepcion;
    private List<RecepcionItems> recepcionItems;

    public RecepcionTecnica(int id_recepcion,List<RecepcionItems> recepcionItems){
        this.id_recepcion = id_recepcion;
        this.recepcionItems = recepcionItems;
    }

    public int getId_recepcion() {
        return id_recepcion;
    }

    public void setId_recepcion(int id_recepcion) {
        this.id_recepcion = id_recepcion;
    }

    public List<RecepcionItems> getRecepcionItems() {
        return recepcionItems;
    }

    public void setRecepcionItems(List<RecepcionItems> recepcionItems) {
        this.recepcionItems = recepcionItems;
    }
}
