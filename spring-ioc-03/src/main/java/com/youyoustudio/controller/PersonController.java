package com.youyoustudio.controller;

import com.youyoustudio.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PersonController {

    @Autowired
    private PersonService personService;

    public void doGet() {
        personService.saveDb();
    }

}
