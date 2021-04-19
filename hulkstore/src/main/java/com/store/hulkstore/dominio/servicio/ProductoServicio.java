package com.store.hulkstore.dominio.servicio;

import com.store.hulkstore.dominio.modelo.Producto;
import com.store.hulkstore.dominio.repositorio.ProductoRepositorio;
import com.store.hulkstore.infraestructura.persistencia.entidad.ProductoEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductoServicio {

    private final ProductoRepositorio productoRepositorio;

    public ProductoServicio(ProductoRepositorio productoRepositorio){
        this.productoRepositorio = productoRepositorio;
    }

    public void crearProducto(Producto producto){
       this.productoRepositorio.crearProducto(producto);
    }

    public List<ProductoEntity>obtenerProductos(){
        return this.productoRepositorio.obtenerProductos();
    }
}
