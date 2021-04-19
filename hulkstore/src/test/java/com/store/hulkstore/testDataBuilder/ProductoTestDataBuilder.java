package com.store.hulkstore.testDataBuilder;

import com.store.hulkstore.aplicacion.comando.ComandoProducto;
import com.store.hulkstore.dominio.modelo.Categoria;
import com.store.hulkstore.dominio.modelo.Linea;
import com.store.hulkstore.dominio.modelo.Producto;

public class ProductoTestDataBuilder {

    private final int ID_PRODUCTO = 0;
    private final String NOMBRE = "IRON MAN";
    private final double PRECIO = 50000;

    private int id_producto;
    private String nombre;
    private Categoria categoria;
    private Linea linea;

    public ProductoTestDataBuilder(){
        this.id_producto = ID_PRODUCTO;
        this.nombre = NOMBRE;
    }

    public Producto build(){
        return new Producto(id_producto,nombre,
                            new CategoriaTestDataBuilder().build(),
                            new LineaTestDataBuilder().build());
    }

    public ComandoProducto buildComando(){
        return new ComandoProducto(id_producto,nombre,
                new CategoriaTestDataBuilder().build(),
                new LineaTestDataBuilder().build());
    }
}
