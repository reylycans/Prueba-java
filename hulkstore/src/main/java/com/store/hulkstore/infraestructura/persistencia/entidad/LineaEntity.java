package com.store.hulkstore.infraestructura.persistencia.entidad;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "linea")
public class LineaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_linea;

    private String descripcion;

    public int getId_linea() {
        return id_linea;
    }

    public void setId_linea(int id_linea) {
        this.id_linea = id_linea;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
