package com.store.hulkstore.infraestructura.persistencia.builder;

import com.store.hulkstore.dominio.modelo.Categoria;
import com.store.hulkstore.dominio.modelo.Linea;
import com.store.hulkstore.dominio.modelo.Producto;
import com.store.hulkstore.infraestructura.persistencia.entidad.CategoriaEntity;
import com.store.hulkstore.infraestructura.persistencia.entidad.LineaEntity;
import com.store.hulkstore.infraestructura.persistencia.entidad.ProductoEntity;



public class ProductoBuilder {

   public ProductoBuilder(){}

   public static ProductoEntity convertirAEntity(Producto producto){
      ProductoEntity productoEntity = new ProductoEntity();
      productoEntity.setId_producto(producto.getId_producto());
      productoEntity.setNombre(producto.getNombre());
      productoEntity.setCategoria(convertirCategoriaAEntity(producto.getCategoria()));
      productoEntity.setLinea(convertirLineaAEntity(producto.getLinea()));


      return productoEntity;
   }

   public static CategoriaEntity convertirCategoriaAEntity(Categoria categoria){
     CategoriaEntity categoriaEntity = new CategoriaEntity();
     categoriaEntity.setId_categoria(categoria.getId_categoria());
     categoriaEntity.setNombre(categoria.getNombre());

     return categoriaEntity;
   }

   public static LineaEntity convertirLineaAEntity(Linea linea){
      LineaEntity lineaEntity = new LineaEntity();
      lineaEntity.setId_linea(linea.getId_linea());
      lineaEntity.setDescripcion(linea.getDescripcion());

      return lineaEntity;
   }

   public static Producto convertirADominio(ProductoEntity productoEntity){
      Producto producto = null;

      if(productoEntity!= null){
         producto = new Producto( productoEntity.getId_producto(),
                                  productoEntity.getNombre(),
                                  convertirCategoriaADominio(productoEntity.getCategoria()),
                                  convertirLineaADomionio(productoEntity.getLinea()));
      }
      return producto;
   }

   public static Categoria convertirCategoriaADominio(CategoriaEntity categoriaEntity){
      Categoria categoria = null;
      if(categoriaEntity != null){
         categoria = new Categoria(categoriaEntity.getId_categoria(),categoriaEntity.getNombre());
      }
      return categoria;
   }

   public static Linea convertirLineaADomionio(LineaEntity lineaEntity){
      Linea linea = null;

      if(lineaEntity!= null){
         linea = new Linea(lineaEntity.getId_linea(),lineaEntity.getDescripcion());
      }
      return linea;
   }
}
