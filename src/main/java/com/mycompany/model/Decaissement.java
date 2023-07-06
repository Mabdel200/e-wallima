package com.mycompany.model;

import javax.persistence.*;

@Entity
@Table(name = "decaissement")
public class Decaissement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_dec;

    @Column(nullable = false)
    private String code_dec;

    private Float montant_dec;

    private String motif;

    private String date_dec;

    @Column(nullable = false)
    private Integer caisse_id;

    public long getId_dec() {
        return id_dec;
    }

    public void setId_dec(long id_dec) {
        this.id_dec = id_dec;
    }

    public String getCode_dec() {
        return code_dec;
    }

    public void setCode_dec(String code_dec) {
        this.code_dec = code_dec;
    }

    public Float getMontant_dec() {
        return montant_dec;
    }

    public void setMontant_dec(Float montant_dec) {
        this.montant_dec = montant_dec;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public String getDate_dec() {
        return date_dec;
    }

    public void setDate_dec(String date_dec) {
        this.date_dec = date_dec;
    }

    public Integer getCaisse_id() {
        return caisse_id;
    }

    public void setCaisse_id(Integer caisse_id) {
        this.caisse_id = caisse_id;
    }
}
