package com.example.BtsShow.controller;

import com.example.BtsShow.model.Show;
import com.example.BtsShow.repository.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/shows")
public class ShowController {
    @Autowired
    private ShowRepository showRepository;

    @PostMapping
    public ResponseEntity<Show> createShow(@RequestBody Show show) {
        Show savedShow = showRepository.save(show);
        return new ResponseEntity<>(savedShow, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Show>> getAllShows() {
        List<Show> shows = showRepository.findAll();
        return new ResponseEntity<>(shows, HttpStatus.OK);
    }
}
