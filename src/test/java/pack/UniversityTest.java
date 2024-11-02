package pack;

import org.example.Student;
import org.example.University;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniversityTest {


    @Test
    public void getAllStudents(){
        Student stud1 = new Student(1, "Сергей", 21, true);
        Student stud2 = new Student(2, "Жанна", 18, false);
        Student stud3 = new Student(3, "Андрей", 35, true);

        University unik = new University();
        unik.addStudent(stud1);
        unik.addStudent(stud2);
        unik.addStudent(stud3);

        List<Student> expected = unik.getAllStudents();

        List<Student> actual = new ArrayList<>();
        actual.add(stud1);
        actual.add(stud2);
        actual.add(stud3);

        //Метод для сравнения двух сущностей
        assertEquals(expected, actual);
    }


}