package com.store.hulkstore.infraestructura.persistencia.builder;

import com.store.hulkstore.dominio.modelo.Factura;
import com.store.hulkstore.infraestructura.persistencia.entidad.FacturaEntity;

public class FacturaBuilder extends AbstractBuilder<FacturaEntity, Factura>{
    @Override
    public FacturaEntity fromDto(Factura dto) {
        FacturaEntity facturaEntity = new FacturaEntity();
        VentaBuilder ventaBuilder = new VentaBuilder();
        facturaEntity.setId_factura(dto.getId_factura());
        facturaEntity.setVentas(ventaBuilder.fromDto(dto.getVentas()));

        return facturaEntity;
    }

    @Override
    public Factura fromEntity(FacturaEntity entity) {
        VentaBuilder ventaBuilder = new VentaBuilder();
        Factura factura = null;

        if(entity!= null){
            factura = new Factura(entity.getId_factura(),ventaBuilder.fromEntity(entity.getVentas()));
        }
        return factura;
    }
}
