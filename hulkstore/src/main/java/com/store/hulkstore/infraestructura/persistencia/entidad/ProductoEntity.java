package com.store.hulkstore.infraestructura.persistencia.entidad;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Date;


@Entity(name = "Producto")

@NamedQuery(name="producto.obtenerProductos", query = "Select producto From Producto producto")
public class ProductoEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id_producto;
    private String nombre;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_categoria", referencedColumnName = "id_categoria")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private CategoriaEntity categoria;

    @OneToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @JoinColumn(name = "id_linea", referencedColumnName = "id_linea")
    private LineaEntity linea;

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss", timezone="PST")
    @Temporal(TemporalType.DATE)
    private Date fecha_creacion;

    @PrePersist
    private void prePersist(){
        this.fecha_creacion = new Date();
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CategoriaEntity getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaEntity categoria) {
        this.categoria = categoria;
    }

    public LineaEntity getLinea() {
        return linea;
    }

    public void setLinea(LineaEntity linea) {
        this.linea = linea;
    }
}
