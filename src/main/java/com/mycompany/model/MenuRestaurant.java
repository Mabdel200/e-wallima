package com.mycompany.model;

import javax.persistence.*;

@Entity
@Table(name = "menu")
public class MenuRestaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_menu;

    @Column(nullable = false, name = "libelle_menu")
    private String libelle_menu;

    @Column(nullable = false)
    private String description;

    @Column(length = 45, nullable = false)
    private String type_menu;

    @Column(length = 45, nullable = false)
    private String categorie_menu;

    @Column(length = 25)
    private String date_creation;

    @Column(length = 25)
    private String date_modif;

    @Column(length = 15, nullable = true)
    private String etat;

    public MenuRestaurant() {
    }

    public MenuRestaurant(long id_menu, String libelle_menu, String description, String type_menu, String categorie_menu, String date_creation, String date_modif, String etat) {
        this.id_menu = id_menu;
        this.libelle_menu = libelle_menu;
        this.description = description;
        this.type_menu = type_menu;
        this.categorie_menu = categorie_menu;
        this.date_creation = date_creation;
        this.date_modif = date_modif;
        this.etat = etat;
    }

    public long getId_menu() {
        return id_menu;
    }

    public void setId_menu(long id_menu) {
        this.id_menu = id_menu;
    }

    public String getLibelle_menu() {
        return libelle_menu;
    }

    public void setLibelle_menu(String libelle_menu) {
        this.libelle_menu = libelle_menu;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType_menu() {
        return type_menu;
    }

    public void setType_menu(String type_menu) {
        this.type_menu = type_menu;
    }

    public String getCategorie_menu() {
        return categorie_menu;
    }

    public void setCategorie_menu(String categorie_menu) {
        this.categorie_menu = categorie_menu;
    }

    public String getDate_creation() {
        return date_creation;
    }

    public void setDate_creation(String date_creation) {
        this.date_creation = date_creation;
    }

    public String getDate_modif() {
        return date_modif;
    }

    public void setDate_modif(String date_modif) {
        this.date_modif = date_modif;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    @Override
    public String toString() {
        return "MenuRestaurant{" +
                "id_menu=" + id_menu +
                ", libelle_menu='" + libelle_menu + '\'' +
                ", description='" + description + '\'' +
                ", type_menu='" + type_menu + '\'' +
                ", categorie_menu='" + categorie_menu + '\'' +
                ", date_creation='" + date_creation + '\'' +
                ", date_modif='" + date_modif + '\'' +
                '}';
    }
}
