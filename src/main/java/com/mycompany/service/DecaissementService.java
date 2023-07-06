package com.mycompany.service;

import com.mycompany.db.DecaissementRepository;
import com.mycompany.model.Decaissement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DecaissementService {
    @Autowired
    private DecaissementRepository decRepository;

    //get all list of Dec

    public List<Decaissement> getAllDec() {return decRepository.findAll();}

    //get one Dec
    public Optional<Decaissement> getDecById(long id_dec) {
        return decRepository.findById(id_dec);
    }

    public void saveDec(Decaissement dec) {
        decRepository.save(dec);
    }

    public void deleteDec(long id_dec) {
        Optional<Decaissement> DecDb = this.decRepository.findById(id_dec);
        DecDb.ifPresent(dec -> decRepository.delete(dec));
    }

}
