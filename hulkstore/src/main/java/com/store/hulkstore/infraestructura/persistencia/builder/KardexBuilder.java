package com.store.hulkstore.infraestructura.persistencia.builder;

import com.store.hulkstore.dominio.modelo.Kardex;
import com.store.hulkstore.infraestructura.persistencia.entidad.KardexEntity;

public class KardexBuilder extends AbstractBuilder<KardexEntity, Kardex> {

    @Override
    public KardexEntity fromDto(Kardex dto) {
        RecepcionItemsBuilder recepcionItemsBuilder = new RecepcionItemsBuilder();
        TipoMovimientoBuilder tipoMovimientoBuilder = new TipoMovimientoBuilder();
        KardexEntity kardexEntity = new KardexEntity();
        kardexEntity.setId_movimiento(dto.getId_movimiento());
        kardexEntity.setId_comprobante(dto.getId_comprobante());
        kardexEntity.setRecepcionItems(recepcionItemsBuilder.fromDto(dto.getRecepcionItems()));
        kardexEntity.setTipoMovimiento(dto.getTipoMovimiento());


        return kardexEntity;
    }

    @Override
    public Kardex fromEntity(KardexEntity entity) {
        Kardex kardex= null;
        RecepcionItemsBuilder recepcionItemsBuilder = new RecepcionItemsBuilder();
        TipoMovimientoBuilder tipoMovimientoBuilder = new TipoMovimientoBuilder();
       // if(kardex!= null){
       //     kardex = new Kardex(entity.getId_comprobante(),
       //                          recepcionItemsBuilder.fromEntity(entity.getProducto()),
       //                          entity.getTipoMovimiento(),
       //                          entity.getCantidad(),
       //                          entity.getValorUnitario());
       // }
        return kardex;
    }
}
