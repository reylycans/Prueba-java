package com.store.hulkstore.infraestructura.controlador;

import com.store.hulkstore.aplicacion.casoUso.CasoUsoRecepcionTecnica;
import com.store.hulkstore.aplicacion.comando.ComandoRecepcionTecnica;
import com.store.hulkstore.dominio.modelo.RecepcionTecnica;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recepciontecnica")
public class ControladorRecepcionTecnica {

    private final CasoUsoRecepcionTecnica casoUsoRecepcionTecnica;

    public ControladorRecepcionTecnica(CasoUsoRecepcionTecnica casoUsoRecepcionTecnica){
        this.casoUsoRecepcionTecnica = casoUsoRecepcionTecnica;
    }

    @PostMapping
    public void crearRecepcion(@RequestBody ComandoRecepcionTecnica comandoRecepcionTecnica){
        this.casoUsoRecepcionTecnica.ejecutar(comandoRecepcionTecnica);
    }

    @GetMapping
    public ResponseEntity<List<RecepcionTecnica>> obtenerRecepciones(){
        return ResponseEntity.ok(this.casoUsoRecepcionTecnica.obtenerRecepciones());
    }
}
