package com.mycompany.service;


import com.mycompany.db.PlatsRepository;
import com.mycompany.model.Plats;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;

@Service
public class PlatsService {

    @Autowired
    private PlatsRepository platsRepository;

    //get all list of user
    public List<Plats> getAllPlats() {return platsRepository.findAll();}

    //get one user
    public Optional<Plats> getPlatById(long id_plat) {
        return platsRepository.findById(id_plat);
    }

    public void savePlat(Plats plats) {
        platsRepository.save(plats);
    }

    public void updatePlat(Plats plats) {
        Optional<Plats> PlatsDB = this.platsRepository.findById(plats.getId_plat());
        if(PlatsDB.isPresent()) {
            platsRepository.save(plats);
        }
    }

    public void deletePlat(long id_plat) {
        Optional<Plats> PlatsDb = this.platsRepository.findById(id_plat);
        PlatsDb.ifPresent(plats -> platsRepository.delete(plats));
    }
}
