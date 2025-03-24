package com.example.smartcontactmanager.controller;

import com.example.smartcontactmanager.dao.UserRepository;
import com.example.smartcontactmanager.entities.Contact;
import com.example.smartcontactmanager.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/test")
    @ResponseBody

    public String test(){

       User user= new User();
        user.setName("Shahidkhan");
        user.setEmail("shahid9090@gmail.com");

        Contact contact = new Contact();
        user.getContacts().add(contact);
        userRepository.save(user);
        return "Working";
    }
}
