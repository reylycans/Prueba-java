package com.store.hulkstore.infraestructura.persistencia.builder;
import com.store.hulkstore.dominio.modelo.RecepcionItems;
import com.store.hulkstore.dominio.modelo.RecepcionTecnica;
import com.store.hulkstore.infraestructura.persistencia.entidad.RecepcionItemsEntity;

public class RecepcionItemsBuilder extends AbstractBuilder<RecepcionItemsEntity, RecepcionItems>{

    @Override
    public  RecepcionItemsEntity fromDto(RecepcionItems dto) {
        RecepcionItemsEntity recepcionItemsEntity = new RecepcionItemsEntity();
        recepcionItemsEntity.setId(dto.getId());
        recepcionItemsEntity.setCosto(dto.getCosto());
        recepcionItemsEntity.setCantidad(dto.getCantidad());
        recepcionItemsEntity.setProductoEntity(ProductoBuilder.convertirAEntity(dto.getProducto()));
        return recepcionItemsEntity;
    }

    @Override
    public RecepcionItems fromEntity(RecepcionItemsEntity entity) {
        RecepcionItems recepcionItems = null;

        if(entity!= null){
            recepcionItems = new RecepcionItems(entity.getId(),
                                                ProductoBuilder.convertirADominio(entity.getProductoEntity()),
                                                entity.getCosto(),
                                                entity.getCantidad());
        }
        return recepcionItems;
    }

}
