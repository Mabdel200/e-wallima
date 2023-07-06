package com.mycompany.service;


import com.mycompany.db.EncaissementRepository;
import com.mycompany.model.Encaissement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EncaissementService {
    @Autowired
    private EncaissementRepository encRepository;

    //get all list of enc
    public List<Encaissement> getAllEnc() {return encRepository.findAll();}

    //get one enc
    public Optional<Encaissement> getEncById(long id_enc) {
        return encRepository.findById(id_enc);
    }

    public void saveEnc(Encaissement enc) {
        encRepository.save(enc);
    }

    public void deleteEnc(long id_enc) {
        Optional<Encaissement> EncDb = this.encRepository.findById(id_enc);
        EncDb.ifPresent(enc -> encRepository.delete(enc));
    }
}
