package com.example.restfulcrud.controller;

import com.example.restfulcrud.domain.Student;
import com.example.restfulcrud.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    private StudentService studentService = new StudentService();

    @RequestMapping(value = "/students", method = RequestMethod.GET, headers = "Accept=application/json")
    public List<Student> getStudent() {
        List<Student> studentList = studentService.getAllStudents();
        return studentList;
    }

    @RequestMapping(value = "/student/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
    public Student getStudentbyId(@PathVariable int id) {
        return studentService.getStudent(id);
    }

    @RequestMapping(value = "/students", method = RequestMethod.POST, headers = "Accept=application/json")
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }


    @RequestMapping(value = "/students", method = RequestMethod.PUT, headers = "Accept=application/json")
    public Student updateStudent(@RequestBody Student student){
        return studentService.updateStudent(student);
    }


    @RequestMapping(value = "/student/{id}" ,method = RequestMethod.DELETE,headers = "Accept=application/json")
    public void deleteStudent(@PathVariable("id") int id){
        studentService.deleteStudent(id);
    }
}
