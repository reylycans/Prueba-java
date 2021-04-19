package com.store.hulkstore.infraestructura.persistencia.repositorio.jpa;

import com.store.hulkstore.infraestructura.persistencia.entidad.RecepcionTecnicaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecepcionTecnicaJpa extends JpaRepository<RecepcionTecnicaEntity,Long> {
}
