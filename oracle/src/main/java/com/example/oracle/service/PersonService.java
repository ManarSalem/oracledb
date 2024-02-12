package com.example.oracle.service;

import com.example.oracle.entity.Person;
import com.example.oracle.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class PersonService {

    private final PersonRepository personRepository;


    public void addPerson(Person person){
        personRepository.save(person);
    }

    public void deletePerson(Person person){
        personRepository.delete(person);
    }

 public Optional<Person> getPerson(int id){
        return personRepository.findById(id);
 }
}
