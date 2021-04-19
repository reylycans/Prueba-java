package com.store.hulkstore.infraestructura.persistencia.builder;
import com.store.hulkstore.dominio.modelo.RecepcionTecnica;
import com.store.hulkstore.infraestructura.persistencia.entidad.RecepcionTecnicaEntity;


import java.util.stream.Collectors;

public class RecepcionTecnicaBuilder extends AbstractBuilder<RecepcionTecnicaEntity, RecepcionTecnica> {

    @Override
    public RecepcionTecnicaEntity fromDto(RecepcionTecnica dto) {
        RecepcionTecnicaEntity recepcionTecnicaEntity = new RecepcionTecnicaEntity();
        recepcionTecnicaEntity.setId_recepcion(dto.getId_recepcion());

       if(dto.getRecepcionItems()!=null) {
           RecepcionItemsBuilder recepcionItemsBuilder = new RecepcionItemsBuilder();
           recepcionTecnicaEntity.setRecepcionItemsEntities(dto.getRecepcionItems()
                   .stream()
                   .map(item ->recepcionItemsBuilder.fromDto(item)).collect(Collectors.toList()));
       }
        return recepcionTecnicaEntity;
    }


    @Override
    public RecepcionTecnica fromEntity(RecepcionTecnicaEntity entity) {
        RecepcionTecnica recepcionTecnica = null;
        if(entity!= null){
            RecepcionItemsBuilder recepcionItemsBuilder = new RecepcionItemsBuilder();
            recepcionTecnica = new RecepcionTecnica(entity.getId_recepcion(),
                                                    recepcionItemsBuilder.fromEntity(entity.getRecepcionItemsEntities()));
        }
        return recepcionTecnica;
    }
}
