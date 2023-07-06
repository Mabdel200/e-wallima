package com.mycompany.controller;

import com.mycompany.model.Caisse;
import com.mycompany.model.Decaissement;
import com.mycompany.service.CaisseService;
import com.mycompany.service.DecaissementService;
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
public class DecaissementController {

    @Autowired
    private DecaissementService decService;

    @Autowired
    private CaisseService caisseService;

    @GetMapping("/dec")
    public String showFormDec(Model model){
        //form
        model.addAttribute("dec", new Decaissement());

        //liste caisses
        List<Caisse> listCaisse = caisseService.getAllCaisse();
        model.addAttribute("listCaisse", listCaisse);

        //liste dec
        List<Decaissement> listDec = decService.getAllDec();
        model.addAttribute("listDec", listDec);
        return "caisse/add_dec";
    }

    @PostMapping("/dec/save")
    public String saveDecForm(Decaissement dec, RedirectAttributes ra){
        decService.saveDec(dec);
        ra.addFlashAttribute("message","The Dec has been saved successfully.");
        return "redirect:/dec";
    }

    @GetMapping("/dec/edit/{id_dec}")
    public  String showEditForm(@PathVariable("id_dec") long id_dec, Model model, RedirectAttributes ra ){
        Optional<Decaissement> dec = decService.getDecById(id_dec);
        model.addAttribute("dec", dec);
        return "caisse/add_dec";
    }

    @GetMapping("/dec/delete/{id_dec}")
    public  String deleteRow(@PathVariable("id_dec") long id_dec, RedirectAttributes ra) {
        decService.deleteDec(id_dec);
        ra.addFlashAttribute("message","The dec has been deleted.");
        return "redirect:/dec";
    }

}
