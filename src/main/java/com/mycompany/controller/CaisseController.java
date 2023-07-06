package com.mycompany.controller;

import com.mycompany.model.Caisse;
import com.mycompany.model.Plats;
import com.mycompany.model.User;
import com.mycompany.service.CaisseService;
import com.mycompany.service.UserService;
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
public class CaisseController {

    @Autowired
    CaisseService caisseService;
    @Autowired
    UserService userService;

    @GetMapping("/caisse")
    public String showFormCaisse(Model model){
        //form
        model.addAttribute("caisse", new Caisse());

        //liste menus
        List<User> listUser = userService.getAllUsers();
        model.addAttribute("listUser", listUser);

        //liste plats
        List<Caisse> listCaisse = caisseService.getAllCaisse();
        model.addAttribute("listCaisse", listCaisse);
        return "caisse/add_caisse";
    }

    @PostMapping("/caisse/save")
    public String saveCaisseForm(Caisse caisse, RedirectAttributes ra){
        caisseService.saveCaisse(caisse);
        ra.addFlashAttribute("message","The caisse has been saved successfully.");
        return "redirect:/caisse";
    }

    @GetMapping("/caisse/edit/{id_caisse}")
    public  String showEditForm(@PathVariable("id_caisse") long id_caisse, Model model, RedirectAttributes ra ){
        Optional<Caisse> caisse = caisseService.getCaisseById(id_caisse);
        model.addAttribute("caisse", caisse);
        return "caisse/add_caisse";
    }

    @GetMapping("/caisse/delete/{id_caisse}")
    public  String deleteRow(@PathVariable("id_caisse") long id_caisse, RedirectAttributes ra) {
        caisseService.deleteCaisse(id_caisse);
        ra.addFlashAttribute("message","The caisse has been deleted.");
        return "redirect:/caisse";
    }


}
