package com.store.hulkstore.aplicacion.comando;

import com.store.hulkstore.dominio.modelo.Venta;

import java.util.List;

public class ComandoFactura {
    private int id_factura;
    private List<Venta> ventas;

    public ComandoFactura(int id_factura, List<Venta> ventas) {
        this.id_factura = id_factura;
        this.ventas = ventas;
    }

    public int getId_factura() {
        return id_factura;
    }

    public List<Venta> getVentas() {
        return ventas;
    }
}
