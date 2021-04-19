package com.store.hulkstore.infraestructura.persistencia.entidad;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "categoria")
public class CategoriaEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id_categoria;
    private String nombre;

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
