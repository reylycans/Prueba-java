package com.store.hulkstore.dominio.servicio;

import com.store.hulkstore.dominio.modelo.Factura;
import com.store.hulkstore.dominio.repositorio.FacturaRepositorio;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class FacturaServicio {

    private final FacturaRepositorio facturaRepositorio;

    public FacturaServicio(FacturaRepositorio facturaRepositorio){
        this.facturaRepositorio = facturaRepositorio;
    }

    @Transactional
    public void crearFactura(Factura factura){
        this.facturaRepositorio.crearFactura(factura);
    }
}
