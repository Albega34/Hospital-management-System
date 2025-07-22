

package com.hostel.Hostel_Mangement_System.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hostel.Hostel_Mangement_System.Repo.IStudentRepo;
import com.hostel.Hostel_Mangement_System.models.Student;

@Service
public class StudentService implements IStudentService{
	
	@Autowired
	IStudentRepo StudentRepo;

	@Override
	public Student createStudent(Student student) {
		// TODO Auto-generated method stub
		return StudentRepo.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return StudentRepo.save(student);
	}

	@Override
	public String deleteStudent(int id) {
		// TODO Auto-generated method stub
		Optional<Student> student=StudentRepo.findById(id);
		//check the object is ther or not

			if(student.isPresent())
			{
				Student stud=student.get();
				//delete
				StudentRepo.delete(stud);
				return "Student is deleted Successfully";
			}
			return "Student with "+id+" not found";
	}

	@Override
	public Student gtStudentById(int id) {
		// TODO Auto-generated method stub
	Optional<Student> optionalStudent=StudentRepo.findById(id);
		
		return (Student)optionalStudent.get();	}

	@Override
	public List<Student> getALLStudent() {
		// TODO Auto-generated method stub
		return StudentRepo.findAll();
	}

	@Override
	public Student getStudentByEmail(String emailid, String password) {
		// TODO Auto-generated method stub
		Student student=StudentRepo.findByEmailid(emailid);
		if(student!=null)
		{
			//check the password
			if(student.getPassword().equals(password))
			{
				return student;
				
			}
			else
			{
				student=null;
			}
			
		}
		return student;
	}

}

