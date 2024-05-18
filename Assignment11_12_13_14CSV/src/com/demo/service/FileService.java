package com.demo.service;

import java.util.List;

import com.demo.beans.Student;

public interface FileService {

	void writeFile(List<Student> e);

	List<Student> readFile();

	boolean deleteStudent(int eid,List<Student> e);

}
