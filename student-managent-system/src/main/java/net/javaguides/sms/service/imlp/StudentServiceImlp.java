package net.javaguides.sms.service.imlp;

import java.util.List;

import org.springframework.stereotype.Service;

import net.javaguides.sms.entity.Student;
import net.javaguides.sms.repository.StudentRepository;
import net.javaguides.sms.service.StudentService;
@Service
public class StudentServiceImlp implements StudentService{
private StudentRepository studentRepository;

	public StudentServiceImlp(StudentRepository studentRepository) {
	super();
	this.studentRepository = studentRepository;
}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getStudentById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteStudentById(Long id) {
		// TODO Auto-generated method stub
		
	}

}
