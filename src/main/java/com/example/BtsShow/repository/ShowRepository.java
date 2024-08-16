package com.example.BtsShow.repository;

import com.example.BtsShow.model.Show;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ShowRepository extends MongoRepository<Show, String> {
}
