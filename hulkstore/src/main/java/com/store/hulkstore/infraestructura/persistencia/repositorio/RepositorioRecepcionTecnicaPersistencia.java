package com.store.hulkstore.infraestructura.persistencia.repositorio;

import ch.qos.logback.classic.LoggerContext;
import com.store.hulkstore.dominio.modelo.RecepcionTecnica;
import com.store.hulkstore.dominio.repositorio.RecepcionTecnicaRepositorio;
import com.store.hulkstore.infraestructura.persistencia.builder.RecepcionTecnicaBuilder;
import com.store.hulkstore.infraestructura.persistencia.entidad.RecepcionTecnicaEntity;
import com.store.hulkstore.infraestructura.persistencia.repositorio.jpa.RecepcionTecnicaJpa;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

@Repository
public class RepositorioRecepcionTecnicaPersistencia implements RecepcionTecnicaRepositorio {
    private static Logger logger = ((LoggerContext) LoggerFactory.getILoggerFactory()).getLogger(RepositorioRecepcionTecnicaPersistencia.class);

    private final RecepcionTecnicaJpa recepcionTecnicaJpa;
    private final EntityManager entityManager;

    public RepositorioRecepcionTecnicaPersistencia(EntityManager entityManager,
                                                   RecepcionTecnicaJpa recepcionTecnicaJpa){
        this.entityManager = entityManager;
        this.recepcionTecnicaJpa = recepcionTecnicaJpa;
    }

    @Override
    @Transactional
    public RecepcionTecnica crearRecepcion(RecepcionTecnica recepcionTecnica) {
        RecepcionTecnicaBuilder recepcionTecnicaBuilder = new RecepcionTecnicaBuilder();
        RecepcionTecnicaEntity recepcionTecnicaEntity = this.recepcionTecnicaJpa.save(recepcionTecnicaBuilder.fromDto(recepcionTecnica));
        return recepcionTecnicaBuilder.fromEntity(recepcionTecnicaEntity);
    }

    @Override
    public List<RecepcionTecnica> obtenerRecepciones() {
        Query query;
        RecepcionTecnicaBuilder recepcionTecnicaBuilder = new RecepcionTecnicaBuilder();
        List<RecepcionTecnicaEntity> recepcionTecnicaEntities = new ArrayList<>();
        try {
            query = entityManager.createNamedQuery("recepcion.obtenerRecepciones");
            recepcionTecnicaEntities = query.getResultList();
        }catch ( Exception exception){
            logger.error("No se pudo recuperar la lista de recepciones [{}].", exception);
        }
        return recepcionTecnicaBuilder.fromEntity(recepcionTecnicaEntities);
    }
}
