package com.mycompany.controller;


import com.mycompany.model.MenuRestaurant;
import com.mycompany.model.Plats;
import com.mycompany.service.PlatsService;
import com.mycompany.service.MenuRestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.multipart.MultipartFile;


import java.io.BufferedOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;

@Controller
public class PlatsController {

    @Autowired
    PlatsService platsService;
    @Autowired
    MenuRestaurantService menuRestaurantService;

    @GetMapping("/plat")
    public String showFormMenu(Model model){
        //form
        model.addAttribute("plats", new Plats());

        //liste menus
        List<MenuRestaurant> listMenus = menuRestaurantService.getAllMenu();
        model.addAttribute("listMenus", listMenus);

        //liste plats
        List<Plats> listPlats = platsService.getAllPlats();
        model.addAttribute("listPlats", listPlats);
        return "plats/add_plat";
    }

    @PostMapping("/plat/save")
    public String savePlatForm(Plats plats,  RedirectAttributes ra){
        //this.doUpload(request,model, plats);
        platsService.savePlat(plats);
        ra.addFlashAttribute("message","The plat has been saved successfully.");
        return "redirect:/plat";
    }

    @GetMapping("/plat/edit/{id_plat}")
    public  String showEditForm(@PathVariable("id_plat") long id_plat, Model model, RedirectAttributes ra ){
        Optional<Plats> plats = platsService.getPlatById(id_plat);
        model.addAttribute("plats", plats);
        return "plats/add_plat";
    }

    @GetMapping("/plat/delete/{id_plat}")
    public  String deleteRowMenu(@PathVariable("id_plat") long id_plat, RedirectAttributes ra) {
        platsService.deletePlat(id_plat);
        ra.addFlashAttribute("message","The plat has been deleted.");
        return "redirect:/plat";
    }

    //doUpload
    public void doUpload(HttpServletRequest request, Model model, Plats plats) {

        // Root Directory.
        String uploadRootPath = request.getServletContext().getRealPath("upload");
        System.out.println("uploadRootPath=" + uploadRootPath);

        File uploadRootDir = new File(uploadRootPath);
        // Create directory if it not exists.
        if (!uploadRootDir.exists()) {
            uploadRootDir.mkdirs();
        }
        MultipartFile[] fileDatas = plats.getFileDatas();
        //
        List<File> uploadedFiles = new ArrayList<File>();
        List<String> failedFiles = new ArrayList<String>();

        for (MultipartFile fileData : fileDatas) {

            // Client File Name
            String name = fileData.getOriginalFilename();
            System.out.println("Client File Name = " + name);

            if (name != null && name.length() > 0) {
                try {
                    // Create the file at server
                    File serverFile = new File(uploadRootDir.getAbsolutePath() + File.separator + name);

                    BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
                    stream.write(fileData.getBytes());
                    stream.close();
                    //
                    uploadedFiles.add(serverFile);
                    System.out.println("Write file: " + serverFile);
                } catch (Exception e) {
                    System.out.println("Error Write file: " + name);
                    failedFiles.add(name);
                }
            }
        }

        model.addAttribute("uploadedFiles", uploadedFiles);
        model.addAttribute("failedFiles", failedFiles);
    }


}
