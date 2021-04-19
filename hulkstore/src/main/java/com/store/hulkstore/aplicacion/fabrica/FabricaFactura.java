package com.store.hulkstore.aplicacion.fabrica;

import com.store.hulkstore.aplicacion.comando.ComandoFactura;
import com.store.hulkstore.dominio.modelo.Factura;
import org.springframework.stereotype.Component;

@Component
public class FabricaFactura {

    public Factura crear(ComandoFactura comandoFactura){
        return new Factura(comandoFactura.getId_factura(),
                           comandoFactura.getVentas());
    }
}
