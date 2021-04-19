package com.store.hulkstore.infraestructura.persistencia.entidad;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity(name = "Recepcion")
@NamedQuery(name="recepcion.obtenerRecepciones",query = "Select recepcion From Recepcion recepcion")
public class RecepcionTecnicaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_recepcion;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_recepcion")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private List<RecepcionItemsEntity>  recepcionItemsEntities;

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss", timezone="PST")
    @Temporal(TemporalType.DATE)
    private Date fecha;

    @PrePersist
    private void prePersist(){
        this.fecha = new Date();
    }

    public int getId_recepcion() {
        return id_recepcion;
    }

    public void setId_recepcion(int id_recepcion) {
        this.id_recepcion = id_recepcion;
    }

    public List<RecepcionItemsEntity> getRecepcionItemsEntities() {
        return recepcionItemsEntities;
    }

    public void setRecepcionItemsEntities(List<RecepcionItemsEntity> recepcionItemsEntities) {
        this.recepcionItemsEntities = recepcionItemsEntities;
    }
}
