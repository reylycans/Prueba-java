package com.store.hulkstore.aplicacion.fabrica;

import com.store.hulkstore.aplicacion.comando.ComandoRecepcionTecnica;
import com.store.hulkstore.dominio.modelo.RecepcionTecnica;
import org.springframework.stereotype.Component;

@Component
public class FabricaRecepcionTecnica {

    public RecepcionTecnica crear(ComandoRecepcionTecnica comandoRecepcionTecnica){
        return new RecepcionTecnica(comandoRecepcionTecnica.getId_recepcion(),
                                    comandoRecepcionTecnica.getRecepcionItems());
    }
}
