package com.jdc04.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jdc04.Entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
