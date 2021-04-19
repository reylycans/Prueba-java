package com.store.hulkstore.infraestructura.persistencia.repositorio.jpa;

import com.store.hulkstore.infraestructura.persistencia.entidad.ProductoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepositorioJpa extends JpaRepository<ProductoEntity,Long> {

}
