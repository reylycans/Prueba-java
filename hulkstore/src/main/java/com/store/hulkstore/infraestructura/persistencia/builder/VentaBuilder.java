package com.store.hulkstore.infraestructura.persistencia.builder;

import com.store.hulkstore.dominio.modelo.Venta;
import com.store.hulkstore.infraestructura.persistencia.entidad.VentaEntity;

public class VentaBuilder extends AbstractBuilder<VentaEntity, Venta> {

    @Override
    public VentaEntity fromDto(Venta dto) {
        VentaEntity ventaEntity = new VentaEntity();
        ventaEntity.setId_venta(dto.getId_venta());
        ventaEntity.setProductoEntity(ProductoBuilder.convertirAEntity(dto.getProducto()));
        ventaEntity.setCantidad(dto.getCantidad());
        ventaEntity.setPrecio(dto.getPrecio());

        return ventaEntity;
    }

    @Override
    public Venta fromEntity(VentaEntity entity) {
        Venta venta = null;

        if(entity!= null){
            venta = new Venta(entity.getId_venta(),
                              ProductoBuilder.convertirADominio(entity.getProductoEntity()),
                              entity.getPrecio(),entity.getCantidad());
        }

        return venta;
    }
}
