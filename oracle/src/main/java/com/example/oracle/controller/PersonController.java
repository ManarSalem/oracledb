package com.example.oracle.controller;

import com.example.oracle.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
@AllArgsConstructor
public class PersonController {

    private final PersonRepository personRepository;


}
