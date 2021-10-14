package kz.zhelezyaka.springbootdemo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student vladimir = new Student(
                    1L,
                    "Vladimir",
                    "vladimir@gmail.com",
                    LocalDate.of(1998, 01, 9));
            Student olya = new Student(
                    2L,
                    "Olya",
                    "olya@gmail.com",
                    LocalDate.of(1990, 9, 10));

            repository.saveAll(
                    List.of(vladimir, olya));
        };
    }
}
