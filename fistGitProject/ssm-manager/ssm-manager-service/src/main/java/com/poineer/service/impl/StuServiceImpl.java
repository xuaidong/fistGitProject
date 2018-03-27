package com.poineer.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poineer.enty.Student;
import com.poineer.mapper.StuMapper;
import com.poineer.service.StuService;

@Service("stuService")
public class StuServiceImpl implements StuService {

	@Autowired
	private StuMapper stuMapeer;
	
	

	@Override
	public int addStu(Student student) {
		// TODO Auto-generated method stub
		return stuMapeer.addStu(student);
	}

	@Override
	public int delStuByName(String sName) {
		// TODO Auto-generated method stub
		return stuMapeer.delStuByName(sName);
	}

	@Override
	public Student findStuById(int sId) {
		// TODO Auto-generated method stub
		return stuMapeer.findStuById(sId);
	}

	@Override
	public List<Student> findAllStus() {
		// TODO Auto-generated method stub
		return stuMapeer.findAllStus();
	}

	
	public StuMapper getStuMapeer() {
		return stuMapeer;
	}

	public void setStuMapeer(StuMapper stuMapeer) {
		this.stuMapeer = stuMapeer;
	}
}
