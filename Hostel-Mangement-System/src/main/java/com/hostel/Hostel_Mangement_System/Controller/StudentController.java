

package com.hostel.Hostel_Mangement_System.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hostel.Hostel_Mangement_System.Services.IStudentService;
import com.hostel.Hostel_Mangement_System.models.Student;

@RestController
@RequestMapping("api/student/")
public class StudentController {
	@Autowired
	IStudentService Studentservice;
	
	
	@GetMapping(value="/")
	public List<Student> getAllStudent()
	{
		return Studentservice.getALLStudent();
	}
	@GetMapping(value="/{id}")
	public Student getStudentById(@PathVariable("id") int id)
	{
		return Studentservice.gtStudentById(id);
	}
	@PostMapping(value="login")
	public Student studentLogin(@RequestParam("emailid") String emailid,
			@RequestParam("password") String password)
	{
		return Studentservice.getStudentByEmail(emailid, password);
	}
	@PostMapping(value="create")
	public Student studentCreate(@RequestBody Student student)
	{
		return Studentservice.createStudent(student);
	}
	@PutMapping(value="edit")
	public Student studentEdit(@RequestBody Student users)
	{
		return Studentservice.updateStudent(users);
	}
	@DeleteMapping(value="delete/{id}")
	public String studentDelete(@PathVariable("id") int id)
	{
		return Studentservice.deleteStudent(id);
	}
	
}

