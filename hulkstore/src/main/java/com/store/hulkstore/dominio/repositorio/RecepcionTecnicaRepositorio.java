package com.store.hulkstore.dominio.repositorio;
import com.store.hulkstore.dominio.modelo.RecepcionTecnica;

import java.util.List;

public interface RecepcionTecnicaRepositorio {
  RecepcionTecnica crearRecepcion(RecepcionTecnica recepcionTecnica);
  List<RecepcionTecnica> obtenerRecepciones();
}
