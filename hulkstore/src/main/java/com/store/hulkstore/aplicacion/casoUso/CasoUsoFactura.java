package com.store.hulkstore.aplicacion.casoUso;
import com.store.hulkstore.aplicacion.comando.ComandoFactura;
import com.store.hulkstore.aplicacion.fabrica.FabricaFactura;
import com.store.hulkstore.dominio.modelo.Factura;
import com.store.hulkstore.dominio.servicio.FacturaServicio;
import org.springframework.stereotype.Component;

@Component
public class CasoUsoFactura {

    private final FacturaServicio facturaServicio;
    private final FabricaFactura fabricaFactura;

    public CasoUsoFactura(FacturaServicio facturaServicio,
                          FabricaFactura fabricaFactura){
      this.facturaServicio = facturaServicio;
      this.fabricaFactura = fabricaFactura;
    }

    public void ejecutar(ComandoFactura comandoFactura){
        Factura factura = fabricaFactura.crear(comandoFactura);
        this.facturaServicio.crearFactura(factura);
    }

}
