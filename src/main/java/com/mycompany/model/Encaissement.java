package com.mycompany.model;

import javax.persistence.*;

@Entity
@Table(name = "encaissement")
public class Encaissement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_enc;

    @Column(nullable = false)
    private String code_enc;

    private Float montant_enc;

    private String motif;

    private String date_enc;

    private Integer type_enc_id;

    @Column(nullable = false)
    private Integer caisse_id;

    public long getId_enc() {
        return id_enc;
    }

    public void setId_enc(long id_enc) {
        this.id_enc = id_enc;
    }

    public String getCode_enc() {
        return code_enc;
    }

    public void setCode_enc(String code_enc) {
        this.code_enc = code_enc;
    }

    public Float getMontant_enc() {
        return montant_enc;
    }

    public void setMontant_enc(Float montant_enc) {
        this.montant_enc = montant_enc;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public String getDate_enc() {
        return date_enc;
    }

    public void setDate_enc(String date_enc) {
        this.date_enc = date_enc;
    }

    public Integer getType_enc_id() {
        return type_enc_id;
    }

    public void setType_enc_id(Integer type_enc_id) {
        this.type_enc_id = type_enc_id;
    }

    public Integer getCaisse_id() {
        return caisse_id;
    }

    public void setCaisse_id(Integer caisse_id) {
        this.caisse_id = caisse_id;
    }
}
