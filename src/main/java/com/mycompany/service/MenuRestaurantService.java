package com.mycompany.service;

import com.mycompany.db.MenuRestaurantRepository;
import com.mycompany.db.UserRepository;
import com.mycompany.model.MenuRestaurant;
import com.mycompany.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MenuRestaurantService {

    @Autowired
    private MenuRestaurantRepository menuRepository;

    //get all list of user
    public List<MenuRestaurant> getAllMenu() {
        return menuRepository.findAll();
    }

    //get one user
    public Optional<MenuRestaurant> getMenuById(long id_menu) {
        return menuRepository.findById(id_menu);
    }

    public void saveMenu(MenuRestaurant menu) {
        menuRepository.save(menu);
    }

    public void updateMenu(MenuRestaurant menu) {
        Optional<MenuRestaurant> MenuDB = this.menuRepository.findById(menu.getId_menu());
        if(MenuDB.isPresent()) {
            menuRepository.save(menu);
        }
    }

    public void deleteMenu(long id_menu) {
        Optional<MenuRestaurant> menuDb = this.menuRepository.findById(id_menu);
        menuDb.ifPresent(menu -> menuRepository.delete(menu));
    }
}
