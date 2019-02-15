package com.example.restfulcrud.service;

import com.example.restfulcrud.domain.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class StudentService {

    private static HashMap<Integer, Student> studentHashMap = getStudentHashMap();

    public StudentService() {
        super();
        if (studentHashMap == null) {

            studentHashMap = new HashMap<Integer, Student>();

            Student student1 = new Student(1, "Burak", "Kutbay", "Fen");
            Student student2 = new Student(2, "Ali", "Doğru", "Edebiyat");
            Student student3 = new Student(3, "Veli", "Yanlış", "Biyoloji");
            Student student4 = new Student(4, "Ahmet", "Mehmet", "Matematik");

            studentHashMap.put(1, student1);
            studentHashMap.put(2, student2);
            studentHashMap.put(3, student3);
            studentHashMap.put(4, student4);
        }
    }

    public static int getMaximumId() {
        int max = 0;
        for (int id : studentHashMap.keySet()) {
            if (max <= id) {
                max = id;
            }
        }
        return max;
    }

    public static HashMap<Integer, Student> getStudentHashMap() {
        return studentHashMap;
    }

    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<Student>(studentHashMap.values());
        return students;
    }

    public Student getStudent(int id) {
        Student student = studentHashMap.get(id);
        return student;
    }

    public Student addStudent(Student student) {
        student.setId(getMaximumId() + 1);
        studentHashMap.put(student.getId(), student);
        return student;
    }

    public Student updateStudent(Student student) {
        if (student.getId() <= 0)
            return null;
        studentHashMap.put(student.getId(), student);
        return student;
    }

    public void deleteStudent(int id) {
        studentHashMap.remove(id);
    }
}
