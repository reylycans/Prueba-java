package com.store.hulkstore.infraestructura.persistencia.repositorio;

import com.store.hulkstore.dominio.modelo.Factura;
import com.store.hulkstore.dominio.repositorio.FacturaRepositorio;
import com.store.hulkstore.infraestructura.persistencia.builder.FacturaBuilder;
import com.store.hulkstore.infraestructura.persistencia.entidad.FacturaEntity;
import com.store.hulkstore.infraestructura.persistencia.repositorio.jpa.FacturaRepositorioJpa;
import org.springframework.stereotype.Repository;

@Repository
public class RepositorioFacturaPersistencia implements FacturaRepositorio {

    private final FacturaRepositorioJpa facturaRepositorioJpa;

    public RepositorioFacturaPersistencia(FacturaRepositorioJpa facturaRepositorioJpa){
        this.facturaRepositorioJpa = facturaRepositorioJpa;
    }

    @Override
    public Factura crearFactura(Factura factura) {
        FacturaBuilder facturaBuilder = new FacturaBuilder();
        FacturaEntity facturaEntity = this.facturaRepositorioJpa.save(facturaBuilder.fromDto(factura));
        return facturaBuilder.fromEntity(facturaEntity);
    }



}
