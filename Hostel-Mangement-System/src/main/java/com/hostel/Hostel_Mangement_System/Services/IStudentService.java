
package com.hostel.Hostel_Mangement_System.Services;

import java.util.List;

import com.hostel.Hostel_Mangement_System.models.Student;

public interface IStudentService {
public Student createStudent(Student student);
public Student updateStudent(Student student);
public String deleteStudent(int id);
public Student gtStudentById(int id);
public List<Student> getALLStudent();
//login
public Student getStudentByEmail(String emailid,String password);
}
