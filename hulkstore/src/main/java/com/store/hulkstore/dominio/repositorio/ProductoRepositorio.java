package com.store.hulkstore.dominio.repositorio;

import com.store.hulkstore.dominio.modelo.Producto;
import com.store.hulkstore.infraestructura.persistencia.entidad.ProductoEntity;

import java.util.List;

public interface ProductoRepositorio {
   void crearProducto(Producto producto);
   List<ProductoEntity> obtenerProductos();
}
