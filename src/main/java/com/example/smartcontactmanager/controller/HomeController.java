package com.example.smartcontactmanager.controller;


import com.example.smartcontactmanager.dao.UserRepository;
import com.example.smartcontactmanager.entities.Contact;
import com.example.smartcontactmanager.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
@RequestMapping("/home")
    public String home(Model model){

    model.addAttribute("title", "Home - Smart Contact Manager");
    return "home" ;

}
@RequestMapping("/about")
        public String about(Model model){

            model.addAttribute("title", "About - Smart Contact Manager");
            return "about" ;

        }
    }
