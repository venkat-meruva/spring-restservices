package com.spring.thymleaf.service;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.thymleaf.model.Student;

@Service
public class StudentService {

    List<Student> students = new ArrayList<>(Arrays.asList(

            new Student("101", "venkat", "10000"),
            new Student("102", "meruva", "12000"),
            new Student("103", "vera raghava", "50000")

    ));

	/*
	 * @Autowired public StudentRepository studentRepository;
	 */
    public List<Student> getAll() {
        return students;
    }

    public Student getStudentById(String id) {
        return students.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void updateStudent( Student student, String id) {
        for (int i = 0; i <= students.size(); i++) {
            Student s = students.get(i);
            if(s.getId().equals(id)){
                students.set(i,student);
                return;
            }
        }
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void deleteStudent(String id) {
        students.removeIf(t -> t.getId().equals(id));
    }
}
