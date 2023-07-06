package com.mycompany.service;

import com.mycompany.db.CaisseRepository;
import com.mycompany.model.Caisse;
import com.mycompany.model.Plats;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CaisseService {

    @Autowired
    private CaisseRepository caisseRepository;

    //get all list of user
    public List<Caisse> getAllCaisse() {return caisseRepository.findAll();}

    //get one user
    public Optional<Caisse> getCaisseById(long id_caisse) {
        return caisseRepository.findById(id_caisse);
    }

    public void saveCaisse(Caisse caisse) {
        caisseRepository.save(caisse);
    }

    public void deleteCaisse(long id_caisse) {
        Optional<Caisse> CaisseDb = this.caisseRepository.findById(id_caisse);
        CaisseDb.ifPresent(caisse -> caisseRepository.delete(caisse));
    }
}
