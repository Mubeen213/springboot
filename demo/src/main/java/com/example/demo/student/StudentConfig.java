package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
           Student mubeen =
                    new Student(
                   "Mubeen",
                   "mubeen@gmail.com",
                    LocalDate.of(2000, Month.SEPTEMBER,21));

           Student mariam = new Student("Mariam",
                   "mariam@gmail.com",LocalDate.of(2004,Month.NOVEMBER,21));

           repository.saveAll(
                   List.of(mariam,mubeen)
           );
        };
    }
}
