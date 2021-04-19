package com.store.hulkstore.infraestructura.controlador;
import com.store.hulkstore.aplicacion.casoUso.CasoUsoFactura;
import com.store.hulkstore.aplicacion.comando.ComandoFactura;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/factura")
public class ControladorFactura {

    private final CasoUsoFactura casoUsoFactura;

    public ControladorFactura(CasoUsoFactura casoUsoFactura){
        this.casoUsoFactura = casoUsoFactura;
    }

    @PostMapping
    public void crearFactura(@RequestBody ComandoFactura comandoFactura){
        this.casoUsoFactura.ejecutar(comandoFactura);
    }
}
