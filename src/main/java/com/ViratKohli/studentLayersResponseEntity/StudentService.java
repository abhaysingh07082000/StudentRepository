package com.ViratKohli.studentLayersResponseEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class StudentService
{

    @Autowired
    StudentRepository studentRepository;


    public String createStudent(Student student)
    {
      return studentRepository.createStudent(student);
    }

    public Student getStudent(int id)
    {
        return studentRepository.getStudent(id);
    }

    public String updateStudent(int id,int age)
    {
        return  studentRepository.updateStudent(id,age);
    }

    public String deleteStudent(int id)
    {
        return studentRepository.deleteStudent(id);
    }
}
