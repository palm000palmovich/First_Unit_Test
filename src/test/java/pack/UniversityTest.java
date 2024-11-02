package pack;

import org.example.Student;
import org.example.University;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UniversityTest {
    private Student stud1;
    private Student stud2;
    private Student stud3;
    private University unik;


    @BeforeEach
    public void setUp(){
        this.stud1 = new Student(1, "Сергей", 21, true);
        this.stud2 = new Student(2, "Жанна", 18, false);
        this.stud3 = new Student(3, "Андрей", 35, true);

        this.unik = new University();

        unik.addStudent(stud1);
        unik.addStudent(stud2);
        unik.addStudent(stud3);
    }


    //Проверка того, что выводятся все студенты
    @Test
    public void getAllStudents(){

        List<Student> expected = unik.getAllStudents();

        List<Student> actual = new ArrayList<>();
        actual.add(stud1);
        actual.add(stud2);
        actual.add(stud3);

        //Метод для сравнения двух сущностей
        assertEquals(expected, actual);
    }

    //проверка getAllStudents не null
    @Test
    public void getAllStudentsIsNoNull(){
        University university = new University();
        List<Student> expected = university.getAllStudents();

        //Метод для проверки не null
        assertNotNull(expected);
    }


    //Проверка на адекватность вывода по полу
    @Test
    public void getAllStudentsIsMale(){


        List<Student> expected = unik.getAllStudents(true);

        List<Student> actual = new ArrayList<>();
        actual.add(stud1);
        //actual.add(stud3);

        //Метод для сравнения двух сущностей
        assertEquals(expected, actual);
    }
}