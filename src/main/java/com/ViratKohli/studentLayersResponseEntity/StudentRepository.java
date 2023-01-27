package com.ViratKohli.studentLayersResponseEntity;

import org.springframework.stereotype.Repository;


import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepository
{

    Map<Integer,Student>studentDb=new HashMap<>();

    public String createStudent(Student student)
    {
        int id=student.getId();
         studentDb.put(id,student);
         return "Successfuly added";
    }


    public Student getStudent(int id)
    {
         if(studentDb.containsKey(id))
         {
             return studentDb.get(id);
         }
         return null;
    }


    public String updateStudent(int id,int age)
    {
        if(studentDb.containsKey(id))
        {
            studentDb.get(id).setAge(age);
            return "updation successfully";
        }
        return "Invalid id request";
    }


    public String deleteStudent(int id)
    {
        if(studentDb.containsKey(id))
        {
            studentDb.remove(id);
            return "Deletion successfully";
        }
        return "deletion failed";
    }

}
