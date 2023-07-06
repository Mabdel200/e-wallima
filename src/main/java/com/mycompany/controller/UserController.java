package com.mycompany.controller;

import com.mycompany.model.User;
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
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users/new")
    public String showFormUser(Model model){
        //form
        model.addAttribute("user", new User());
        //liste
        List<User> listUsers = userService.getAllUsers();
        model.addAttribute("listUsers", listUsers);
        return "users/ajouter_user";
    }


    @PostMapping("/users/save")
    public String saveUserForm(User user, RedirectAttributes ra){
        userService.saveUser(user);
        ra.addFlashAttribute("message","The user has been saved successfully.");
        return "redirect:/users/new";
    }

    @GetMapping("/users/edit/{id_users}")
    public  String showEditForm(@PathVariable("id_users") long id_users, Model model, RedirectAttributes ra ){
        Optional<User> user = userService.getUserById(id_users);
        model.addAttribute("user", user);
        return "users/ajouter_user";
    }

    @GetMapping("/users/delete/{id_users}")
    public  String deleteRowUser(@PathVariable("id_users") long id_users, RedirectAttributes ra) {
        userService.deleteUser(id_users);
        ra.addFlashAttribute("message","The user has been deleted.");
        return "redirect:/users/new";
    }


}
