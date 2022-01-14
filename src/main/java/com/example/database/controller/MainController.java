package com.example.database.controller;

import com.example.database.model.Bouquet;
import com.example.database.service.BouquetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
     BouquetService bouquetService;

    @RequestMapping(value="/bouquet",method = RequestMethod.POST)
    public Bouquet save(@RequestBody Bouquet bouquet)
    {
        return bouquetService.save(bouquet);
    }
}
