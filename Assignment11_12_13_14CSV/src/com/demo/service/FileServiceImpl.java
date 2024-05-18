package com.demo.service;

import java.util.List;

import com.demo.beans.Student;
import com.demo.dao.StudentDao;
import com.demo.dao.StudentDaoImpl;

public class FileServiceImpl implements FileService{
	private StudentDao edao;
	public FileServiceImpl() {
	   edao=new StudentDaoImpl();
	}
	@Override
	public void writeFile(List<Student> e) {
		edao.writeToFile(e);
		
	}
	@Override
	public List<Student> readFile() {
		return edao.readFromFile();
		
	}
	@Override
	public boolean deleteStudent(int eid,List<Student> e) {
		return edao.deleteStud(eid,e);
		
	}
}
