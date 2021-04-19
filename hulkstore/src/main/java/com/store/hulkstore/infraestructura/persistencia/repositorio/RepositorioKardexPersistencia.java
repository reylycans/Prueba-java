package com.store.hulkstore.infraestructura.persistencia.repositorio;

import ch.qos.logback.classic.LoggerContext;
import com.store.hulkstore.dominio.modelo.Kardex;
import com.store.hulkstore.dominio.repositorio.KardexRepositorio;
import com.store.hulkstore.infraestructura.persistencia.builder.KardexBuilder;
import com.store.hulkstore.infraestructura.persistencia.repositorio.jpa.KardexRepositorioJpa;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Repository
public class RepositorioKardexPersistencia implements KardexRepositorio {
    private static Logger logger = ((LoggerContext) LoggerFactory.getILoggerFactory()).getLogger(RepositorioKardexPersistencia.class);
    private final EntityManager entityManager;
    private final KardexRepositorioJpa kardexRepositorioJpa;

    public RepositorioKardexPersistencia(EntityManager entityManager,
                                         KardexRepositorioJpa kardexRepositorioJpa){
        this.entityManager = entityManager;
        this.kardexRepositorioJpa = kardexRepositorioJpa;
    }

    @Override
    @Transactional
    public void crearMovimiento(Kardex kardex) {
        try {
            KardexBuilder kardexBuilder = new KardexBuilder();
            this.entityManager.merge(kardexBuilder.fromDto(kardex));
            //this.kardexRepositorioJpa.save(kardexBuilder.fromDto(kardex));
        }catch (Exception exception){
            logger.error("Error al guardar un movimiento",exception);
        }

    }
}
