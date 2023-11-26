package com.jdc04.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdc04.Entity.Student;
import com.jdc04.Repository.StudentRepo;
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepo studentRepo;

	@Override
	public void registerStudent(Student student) {
		studentRepo.save(student);

	}

}
