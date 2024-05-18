package com.demo.dao;

import java.util.List;

import com.demo.beans.Student;


public interface StudentDao {
	void writeToFile(List<Student> s);

	List<Student> readFromFile();

	boolean deleteStud(int eid,List<Student> s);
}
