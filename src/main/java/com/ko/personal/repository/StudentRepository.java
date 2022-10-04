package com.ko.personal.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ko.personal.domain.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

	public Optional<Student> findByStudentId(String studentId);

}
