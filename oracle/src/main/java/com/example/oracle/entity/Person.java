package com.example.oracle.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
   private Integer Id;
    private String name ;
    private Integer age;

    public Person(String name , Integer age){
    this.name=name;
    this.age=age;
}

    public Person() {

    }
}
