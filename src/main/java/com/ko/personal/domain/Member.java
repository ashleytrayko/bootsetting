package com.ko.personal.domain;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@EqualsAndHashCode(of = "studentId")
public class Member implements UserDetails {
	private Student student;

	public Member(Student student) {
		this.student = student;
	}
	
	@Override
	// 권한부
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		Collection<GrantedAuthority> collection = new ArrayList<>();
        collection.add(new GrantedAuthority() {
            @Override
            public String getAuthority() {
                return student.getRole();
            }
        });
        return collection;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return this.student.getStudentPwd();
	}

	@Override
	// 아이
	public String getUsername() {
		// TODO Auto-generated method stub
		return this.student.getStudentId();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
