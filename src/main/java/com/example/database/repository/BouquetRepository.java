package com.example.database.repository;

import com.example.database.model.Bouquet;
import com.example.database.service.BouquetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.Repository;

public interface BouquetRepository extends Repository<Bouquet,Integer> {

   Bouquet save(Bouquet bouquet);
}
