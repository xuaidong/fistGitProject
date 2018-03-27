package com.poineer.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.poineer.enty.Student;

public interface StuService {

    public int addStu(Student student);
	
	public int delStuByName(String sName);
	
	public Student findStuById(int sId);

	public List<Student> findAllStus();
}
