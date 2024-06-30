package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student John = new Student("john", "john@gmail.com", LocalDate.of(2000, JANUARY,5));
            Student Alex = new Student("alex", "alex@gmail.com", LocalDate.of(2005, FEBRUARY,20));

            repository.saveAll(List.of(John,Alex));


        };
    }
}
