package com.ko.personal.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ko.personal.domain.Member;
import com.ko.personal.domain.Student;
import com.ko.personal.dto.JoinDto;
import com.ko.personal.repository.StudentRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentService implements UserDetailsService {

	
	private final StudentRepository sRepository;
	
	@Override
	public UserDetails loadUserByUsername(String studentId) throws UsernameNotFoundException {
		Student student = sRepository.findByStudentId(studentId).orElseThrow(null);
		return new Member(student);
	}
	
	public String joinStudent(JoinDto dto) {
		Student student = Student.builder()
							.studentId(dto.getStudentId())
							.studentPwd(dto.getStudentPwd())
							.role("ROLE_USER")
							.build();
		sRepository.save(student);
		return "ok";
	}
}
