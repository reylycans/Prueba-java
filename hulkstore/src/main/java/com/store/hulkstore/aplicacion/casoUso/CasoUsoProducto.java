package com.store.hulkstore.aplicacion.casoUso;

import com.store.hulkstore.aplicacion.comando.ComandoProducto;
import com.store.hulkstore.aplicacion.fabrica.FabricaProducto;
import com.store.hulkstore.dominio.modelo.Producto;
import com.store.hulkstore.dominio.servicio.ProductoServicio;
import com.store.hulkstore.infraestructura.persistencia.entidad.ProductoEntity;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class CasoUsoProducto {

    private final ProductoServicio productoServicio;
    private final FabricaProducto fabricaProducto;

    public CasoUsoProducto(ProductoServicio productoServicio,
                           FabricaProducto fabricaProducto){
        this.productoServicio = productoServicio;
        this.fabricaProducto = fabricaProducto;
    }

    @Transactional
    public void ejecutar(ComandoProducto comandoProducto){
        Producto producto = fabricaProducto.crear(comandoProducto);
        this.productoServicio.crearProducto(producto);
    }

    public List<ProductoEntity> obtenerProductos(){
       return this.productoServicio.obtenerProductos();
    }
}
