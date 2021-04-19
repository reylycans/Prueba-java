package com.store.hulkstore.infraestructura.persistencia.repositorio;

import ch.qos.logback.classic.LoggerContext;
import com.store.hulkstore.dominio.modelo.Producto;
import com.store.hulkstore.dominio.repositorio.ProductoRepositorio;
import com.store.hulkstore.infraestructura.persistencia.builder.ProductoBuilder;
import com.store.hulkstore.infraestructura.persistencia.entidad.ProductoEntity;
import com.store.hulkstore.infraestructura.persistencia.repositorio.jpa.ProductoRepositorioJpa;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

@Repository
public class RepositorioProductoPersistencia implements ProductoRepositorio {
    private static Logger logger = ((LoggerContext) LoggerFactory.getILoggerFactory()).getLogger(RepositorioProductoPersistencia.class);
    private final ProductoRepositorioJpa productoRepositorioJpa;


    private final EntityManager entityManager;

   public RepositorioProductoPersistencia(ProductoRepositorioJpa productoRepositorioJpa,
                                          EntityManager entityManager){
      this.productoRepositorioJpa = productoRepositorioJpa;
      this.entityManager = entityManager;
   }

    @Override
    public void crearProducto(Producto producto) {
       this.productoRepositorioJpa.save(ProductoBuilder.convertirAEntity(producto));
    }

    @Override
    public List<ProductoEntity> obtenerProductos() {
      Query query;
      List<ProductoEntity> productoEntity = new ArrayList<>();
      try{
          query = entityManager.createNamedQuery("producto.obtenerProductos");
          productoEntity = query.getResultList();
      }catch(Exception exception){
          logger.error("No se pudo recuperar la lista de productos [{}].", exception);
      }
      return productoEntity;
    }

}
