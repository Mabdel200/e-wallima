package com.mycompany.model;

import javax.persistence.*;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name = "plats")
public class Plats {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_plat;

    @Column(nullable = false, name = "libelle_plat")
    private String libelle_plat;

    @Column(nullable = false)
    private Integer prix_plat;

    private String image_plat;

    // Upload files.
    private MultipartFile[] fileDatas;

    @Column( nullable = false)
    private Integer menu_id;

    public Plats() {
    }


    public Plats(long id_plat, String libelle_plat, Integer prix_plat, String image_plat, MultipartFile[] fileDatas, Integer menu_id) {
        this.id_plat = id_plat;
        this.libelle_plat = libelle_plat;
        this.prix_plat = prix_plat;
        this.image_plat = image_plat;
        this.fileDatas = fileDatas;
        this.menu_id = menu_id;
    }

    public MultipartFile[] getFileDatas() {
        return fileDatas;
    }

    public void setFileDatas(MultipartFile[] fileDatas) {
        this.fileDatas = fileDatas;
    }

    public long getId_plat() {
        return id_plat;
    }

    public void setId_plat(long id_plat) {
        this.id_plat = id_plat;
    }

    public String getLibelle_plat() {
        return libelle_plat;
    }

    public void setLibelle_plat(String libelle_plat) {
        this.libelle_plat = libelle_plat;
    }

    public Integer getPrix_plat() {
        return prix_plat;
    }

    public void setPrix_plat(Integer prix_plat) {
        this.prix_plat = prix_plat;
    }

    public String getImage_plat() {
        return image_plat;
    }

    public void setImage_plat(String image_plat) {
        this.image_plat = image_plat;
    }

    public Integer getMenu_id() {
        return menu_id;
    }

    public void setMenu_id(Integer menu_id) {
        this.menu_id = menu_id;
    }
}
