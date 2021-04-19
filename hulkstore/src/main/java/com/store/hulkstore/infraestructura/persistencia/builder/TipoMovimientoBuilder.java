package com.store.hulkstore.infraestructura.persistencia.builder;

import com.store.hulkstore.dominio.modelo.TipoMovimiento;
import com.store.hulkstore.infraestructura.persistencia.entidad.TipoMovimientoEntity;

public class TipoMovimientoBuilder extends AbstractBuilder<TipoMovimientoEntity, TipoMovimiento> {
    @Override
    public TipoMovimientoEntity fromDto(TipoMovimiento dto) {
        TipoMovimientoEntity tipoMovimientoEntity = new TipoMovimientoEntity();
        tipoMovimientoEntity.setId_tipo(dto.getId_tipo());
        tipoMovimientoEntity.setDescripcion(dto.getDescripcion());
        return tipoMovimientoEntity;
    }

    @Override
    public TipoMovimiento fromEntity(TipoMovimientoEntity entity) {
        TipoMovimiento tipoMovimiento = null;
        if(entity!= null){
            tipoMovimiento = new TipoMovimiento(entity.getId_tipo(),entity.getDescripcion());
        }
        return tipoMovimiento;
    }
}
