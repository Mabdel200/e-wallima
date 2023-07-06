package com.mycompany.model;

import javax.persistence.*;

@Entity
@Table(name = "caisse")
public class Caisse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_caisse;

    @Column(nullable = false)
    private String designation;

    @Column(nullable = false)
    private String code_caisse;

    private Float solde_net;

    private Float solde_enc;

    private Float solde_dec;

    @Column(nullable = false)
    private Integer users_id;

    public long getId_caisse() {
        return id_caisse;
    }

    public void setId_caisse(long id_caisse) {
        this.id_caisse = id_caisse;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getCode_caisse() {
        return code_caisse;
    }

    public void setCode_caisse(String code_caisse) {
        this.code_caisse = code_caisse;
    }

    public Float getSolde_net() {
        return solde_net;
    }

    public void setSolde_net(Float solde_net) {
        this.solde_net = solde_net;
    }

    public Float getSolde_enc() {
        return solde_enc;
    }

    public void setSolde_enc(Float solde_enc) {
        this.solde_enc = solde_enc;
    }

    public Float getSolde_dec() {
        return solde_dec;
    }

    public void setSolde_dec(Float solde_dec) {
        this.solde_dec = solde_dec;
    }

    public Integer getUsers_id() {
        return users_id;
    }

    public void setUsers_id(Integer users_id) {
        this.users_id = users_id;
    }
}
