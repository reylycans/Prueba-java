package com.store.hulkstore.infraestructura.persistencia.entidad;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "kardex")
public class KardexEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_movimiento;
    private int id_comprobante;

    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private List<RecepcionItemsEntity> recepcionItems;

    private int tipoMovimiento;

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss", timezone="PST")
    @Temporal(TemporalType.DATE)
    private Date fecha;

    @PrePersist
    private void prePersist(){
        this.fecha = new Date();
    }

    public int getId_movimiento() {
        return id_movimiento;
    }

    public void setId_movimiento(int id_movimiento) {
        this.id_movimiento = id_movimiento;
    }

    public int getId_comprobante() {
        return id_comprobante;
    }

    public void setId_comprobante(int id_comprobante) {
        this.id_comprobante = id_comprobante;
    }

    public List<RecepcionItemsEntity> getRecepcionItems() {
        return recepcionItems;
    }

    public void setRecepcionItems(List<RecepcionItemsEntity> recepcionItems) {
        this.recepcionItems = recepcionItems;
    }

    public int getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(int tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }



}
