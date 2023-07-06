package com.mycompany.controller;

import com.mycompany.model.Caisse;
import com.mycompany.model.Encaissement;
import com.mycompany.service.CaisseService;
import com.mycompany.service.EncaissementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@Controller
public class EncaissementController {

    @Autowired
    private EncaissementService encService;

    @Autowired
    private CaisseService caisseService;


    @GetMapping("/enc")
    public String showFormEnc(Model model){
        //form
        model.addAttribute("enc", new Encaissement());
        //liste caisses
        List<Caisse> listCaisse = caisseService.getAllCaisse();
        model.addAttribute("listCaisse", listCaisse);

        //liste enc
        List<Encaissement> listEnc = encService.getAllEnc();
        model.addAttribute("listEnc", listEnc);
        return "caisse/add_enc";
    }

    @PostMapping("/enc/save")
    public String saveEncForm(Encaissement enc, RedirectAttributes ra){
        encService.saveEnc(enc);
        ra.addFlashAttribute("message","The enc has been saved successfully.");
        return "redirect:/enc";
    }

    @GetMapping("/enc/edit/{id_enc}")
    public  String showEditForm(@PathVariable("id_enc") long id_enc, Model model, RedirectAttributes ra ){
        Optional<Encaissement> enc = encService.getEncById(id_enc);
        model.addAttribute("enc", enc);
        return "caisse/add_enc";
    }

    @GetMapping("/enc/delete/{id_enc}")
    public  String deleteRow(@PathVariable("id_enc") long id_enc, RedirectAttributes ra) {
        encService.deleteEnc(id_enc);
        ra.addFlashAttribute("message","The enc has been deleted.");
        return "redirect:/enc";
    }

}
