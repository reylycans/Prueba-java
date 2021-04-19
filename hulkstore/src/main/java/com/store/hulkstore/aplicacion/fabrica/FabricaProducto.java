package com.store.hulkstore.aplicacion.fabrica;

import com.store.hulkstore.aplicacion.comando.ComandoProducto;
import com.store.hulkstore.dominio.modelo.Producto;
import org.springframework.stereotype.Component;

@Component
public class FabricaProducto {

    public Producto crear(ComandoProducto comandoProducto){
        return new Producto(comandoProducto.getId_producto(),
                            comandoProducto.getNombre(),
                            comandoProducto.getCategoria(),
                            comandoProducto.getLinea());
    }
}
