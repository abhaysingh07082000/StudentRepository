package com.ViratKohli.studentLayersResponseEntity;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController
{

        @Autowired

        StudentService studentService;

        @PostMapping("/create_student")
        public ResponseEntity createStudent(@RequestBody Student student)
        {
                      String str= studentService.createStudent(student);
                      return new ResponseEntity<>(str, HttpStatus.CREATED);
        }

       @GetMapping("get_student")
        public ResponseEntity getStudent(@RequestParam("id") int id)
       {
                      Student student=studentService.getStudent(id);

                      return new ResponseEntity<>(student,HttpStatus.FOUND);
       }

       @PutMapping("/update_student")
        public ResponseEntity updateStudent(@RequestParam("id") int id,@RequestParam("age") int age)
       {
             String response=studentService.updateStudent(id,age);
             return new ResponseEntity<>(response,HttpStatus.ACCEPTED);
       }

       @DeleteMapping("/delete_student")
        public ResponseEntity deleteStudent(@RequestParam("id") int id)
       {
                  String response=studentService.deleteStudent(id);

                  return new ResponseEntity<>(response,HttpStatus.GONE);
       }

}
