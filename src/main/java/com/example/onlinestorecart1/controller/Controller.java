package com.example.onlinestorecart1.controller;

import com.example.onlinestorecart1.servise.ServiseImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;
@RequestMapping ("/order")
@RestController
public class Controller {


    private final ServiseImpl servise;
    public Controller(ServiseImpl servise) {
        this.servise=servise;
    }

    @GetMapping("/add")
    public ResponseEntity<String> add(@RequestParam("id") List<Integer>  id) {
        this.servise.add(id);
        return new  ResponseEntity<>("Получен ID"+id, HttpStatus.OK);
    }

    @GetMapping("/get")
    public Collection<Integer> get() {
        return this.servise.get();
    }

}
