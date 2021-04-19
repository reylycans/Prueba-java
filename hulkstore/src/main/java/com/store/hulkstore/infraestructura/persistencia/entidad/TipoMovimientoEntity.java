package com.store.hulkstore.infraestructura.persistencia.entidad;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "tipo_Movimiento")
public class TipoMovimientoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_tipo;
    private String descripcion;

    public int getId_tipo() {
        return id_tipo;
    }

    public void setId_tipo(int id_tipo) {
        this.id_tipo = id_tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
