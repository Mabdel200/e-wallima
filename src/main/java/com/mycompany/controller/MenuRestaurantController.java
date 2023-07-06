package com.mycompany.controller;

import com.mycompany.model.MenuRestaurant;
import com.mycompany.service.MenuRestaurantService;
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
public class MenuRestaurantController {

    @Autowired
    MenuRestaurantService menuService;

    @GetMapping("/menuRestaurant")
    public String showFormMenu(Model model){
        //form
        model.addAttribute("menu", new MenuRestaurant());
        //liste
        List<MenuRestaurant> listMenus = menuService.getAllMenu();
        model.addAttribute("listMenus", listMenus);
        return "menu/add_menu";
    }


    @PostMapping("/menuRestaurant/save")
    public String saveMenuForm(MenuRestaurant menu, RedirectAttributes ra){
        menuService.saveMenu(menu);
        ra.addFlashAttribute("message","The menu has been saved successfully.");
        return "redirect:/menuRestaurant";
    }

    @GetMapping("/menuRestaurant/edit/{id_menu}")
    public  String showEditForm(@PathVariable("id_menu") long id_menu, Model model, RedirectAttributes ra ){
        Optional<MenuRestaurant> menu = menuService.getMenuById(id_menu);
        model.addAttribute("menu", menu);
        return "menu/add_menu";
    }

    @GetMapping("/menuRestaurant/delete/{id_menu}")
    public  String deleteRowMenu(@PathVariable("id_menu") long id_menu, RedirectAttributes ra) {
        menuService.deleteMenu(id_menu);
        ra.addFlashAttribute("message","The menu has been deleted.");
        return "redirect:/menuRestaurant";
    }
}
