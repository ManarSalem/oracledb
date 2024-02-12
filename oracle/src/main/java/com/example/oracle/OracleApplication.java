package com.example.oracle;

import com.example.oracle.entity.Person;
import com.example.oracle.service.PersonService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OracleApplication implements CommandLineRunner {

   private final PersonService personService;

    public OracleApplication(PersonService personService){
        this.personService=personService;

    }
    public static void main(String[] args) {
        SpringApplication.run(OracleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        personService.addPerson(creatPerson());
    }


    public Person creatPerson(){
      return   new Person("John", 30);
    }
}
