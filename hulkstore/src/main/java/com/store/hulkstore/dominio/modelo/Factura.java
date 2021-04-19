package com.store.hulkstore.dominio.modelo;

import java.util.List;

public class Factura {
  private int id_factura;
  private List<Venta> ventas;

    public Factura(int id_factura, List<Venta> ventas) {
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
