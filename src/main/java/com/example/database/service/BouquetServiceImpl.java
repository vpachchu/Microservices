package com.example.database.service;

import com.example.database.model.Bouquet;
import com.example.database.repository.BouquetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BouquetServiceImpl implements BouquetService{
    @Autowired
    BouquetRepository bouquetRepository;


    public Bouquet save(Bouquet bouquet) {

        return bouquetRepository.save(bouquet);
    }
}
