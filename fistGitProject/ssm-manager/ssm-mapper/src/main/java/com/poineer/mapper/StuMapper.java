package com.poineer.mapper;

import java.util.List;
import com.poineer.enty.Student;

public interface StuMapper {
	
	public int addStu(Student student);
	
	public int delStuByName(String sName);
	
	public Student findStuById(int sId);

	public List<Student> findAllStus();
	
}
