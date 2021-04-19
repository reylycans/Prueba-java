package com.store.hulkstore.dominio.servicio;

import com.store.hulkstore.dominio.modelo.Kardex;
import com.store.hulkstore.dominio.modelo.RecepcionTecnica;
import com.store.hulkstore.dominio.repositorio.KardexRepositorio;
import com.store.hulkstore.dominio.repositorio.RecepcionTecnicaRepositorio;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Component
public class RecepcionTecnicaServicio {

    private final int MOVIMIENTO_ENTRADA = 1;

    private final RecepcionTecnicaRepositorio recepcionTecnicaRepositorio;
    private final KardexRepositorio kardexRepositorio;

    public RecepcionTecnicaServicio(RecepcionTecnicaRepositorio recepcionTecnicaRepositorio,
                                    KardexRepositorio kardexRepositorio){
        this.recepcionTecnicaRepositorio = recepcionTecnicaRepositorio;
        this.kardexRepositorio = kardexRepositorio;
    }

    @Transactional
    public void crearRecepcionTecnica(RecepcionTecnica recepcionTecnica){
       RecepcionTecnica recepcionTecnicaDataBase = this.recepcionTecnicaRepositorio.crearRecepcion(recepcionTecnica);
       if(recepcionTecnicaDataBase!= null){
           Kardex kardex = new Kardex(1,
                   recepcionTecnicaDataBase.getRecepcionItems(),
                   MOVIMIENTO_ENTRADA);

           this.kardexRepositorio.crearMovimiento(kardex);
       }
    }

    public List<RecepcionTecnica> obtener(){
        return this.recepcionTecnicaRepositorio.obtenerRecepciones();
    }
}
