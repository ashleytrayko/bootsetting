package com.ko.personal.domain;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
	@Id
	private long studentNum;
	private String studentId;
	private String studentPwd;
	private String role;
	@CreationTimestamp
	private Timestamp regDate;
	@UpdateTimestamp
	private Timestamp updateDate;
	
}
