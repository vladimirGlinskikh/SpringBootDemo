package kz.zhelezyaka.springbootdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Vladimir",
                        "vladimir@gmail.com",
                        LocalDate.of(1998, 01, 9),
                        39),
                new Student(
                        2L,
                        "Olya",
                        "olya@gmail.com",
                        LocalDate.of(1990, 9, 10),
                        38));
    }
}
