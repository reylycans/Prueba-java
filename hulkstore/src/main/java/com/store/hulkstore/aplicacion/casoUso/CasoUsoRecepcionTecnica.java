package com.store.hulkstore.aplicacion.casoUso;

import com.store.hulkstore.aplicacion.comando.ComandoRecepcionTecnica;
import com.store.hulkstore.aplicacion.fabrica.FabricaRecepcionTecnica;
import com.store.hulkstore.dominio.modelo.RecepcionTecnica;
import com.store.hulkstore.dominio.servicio.RecepcionTecnicaServicio;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class CasoUsoRecepcionTecnica {

    private final RecepcionTecnicaServicio recepcionTecnicaServicio;
    private final FabricaRecepcionTecnica fabricaRecepcionTecnica;

    public CasoUsoRecepcionTecnica(RecepcionTecnicaServicio recepcionTecnicaServicio,
                                   FabricaRecepcionTecnica fabricaRecepcionTecnica){
        this.recepcionTecnicaServicio = recepcionTecnicaServicio;
        this.fabricaRecepcionTecnica = fabricaRecepcionTecnica;
    }

    @Transactional
    public void ejecutar(ComandoRecepcionTecnica comandoRecepcionTecnica){
        RecepcionTecnica recepcionTecnica = fabricaRecepcionTecnica.crear(comandoRecepcionTecnica);
        this.recepcionTecnicaServicio.crearRecepcionTecnica(recepcionTecnica);
    }

    public List<RecepcionTecnica> obtenerRecepciones(){
        return this.recepcionTecnicaServicio.obtener();
    }
}
