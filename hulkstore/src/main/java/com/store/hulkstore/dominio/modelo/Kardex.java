package com.store.hulkstore.dominio.modelo;

import java.util.List;

public class Kardex {
    private int id_movimiento;
    private int id_comprobante;
    private List<RecepcionItems> recepcionItems;
    private int tipoMovimiento;


    public Kardex( int id_comprobante, List<RecepcionItems> recepcionItems, int tipoMovimiento) {
        this.id_comprobante = id_comprobante;
        this.recepcionItems = recepcionItems;
        this.tipoMovimiento = tipoMovimiento;

    }

    public int getId_movimiento() {
        return id_movimiento;
    }

    public int getId_comprobante() {
        return id_comprobante;
    }

    public List<RecepcionItems> getRecepcionItems() {
        return recepcionItems;
    }

    public int getTipoMovimiento() {
        return tipoMovimiento;
    }

}
