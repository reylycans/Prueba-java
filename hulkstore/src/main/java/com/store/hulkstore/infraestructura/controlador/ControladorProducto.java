package com.store.hulkstore.infraestructura.controlador;

import com.store.hulkstore.aplicacion.casoUso.CasoUsoProducto;
import com.store.hulkstore.aplicacion.comando.ComandoProducto;
import com.store.hulkstore.dominio.modelo.Producto;
import com.store.hulkstore.infraestructura.persistencia.entidad.ProductoEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ControladorProducto {

    private final CasoUsoProducto casoUsoProducto;

    public ControladorProducto(CasoUsoProducto casoUsoProducto){
        this.casoUsoProducto = casoUsoProducto;
    }

    @PostMapping
    public void crearProducto(@RequestBody ComandoProducto comandoProducto){
        this.casoUsoProducto.ejecutar(comandoProducto);
    }

    @GetMapping
    public ResponseEntity<List<ProductoEntity>> obtenerPorductos(){
        return ResponseEntity.ok(this.casoUsoProducto.obtenerProductos());
    }
}
