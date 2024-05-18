package com.demo.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.Student;
import com.demo.service.FileService;
import com.demo.service.FileServiceImpl;

public class TestCrudApp {

	public static void main(String[] args) {
		FileService fs=new FileServiceImpl();
		List<Student> elst=new ArrayList<>();
		//fs.writeFile(elst);
		Student s1=null;
		Scanner sc=new Scanner(System.in);
		int n=0,e,i,id;
		String nm,deg,em;
		double sal;
		while(n!=5) {
		System.out.println("Enter Choice:\n1.Add Student \n2.Read Students\n\n3.Update Student\n4.Exit");
		n=sc.nextInt();
		switch (n) {
		case 2:
			elst= fs.readFile();
			elst.forEach(System.out::println);
			elst=new ArrayList<>();
			break;
		case 1:
			System.out.println("No. of Student to be added");
			e=sc.nextInt();
			elst= fs.readFile();
			for(i=0;i<=e-1;i++) {
				System.out.println("Enter PRN");
				id=sc.nextInt();
				System.out.println("Enter name");
				nm=sc.next();
				System.out.println("Enter Degree");
				deg=sc.next();
				System.out.println("Enter Email");
				em=sc.next();
				s1=new Student(id,nm,deg,em);
				elst.add(s1);
				
			}
			fs.writeFile(elst);
			elst=new ArrayList<>();
			break;
        case 3:
        	System.out.println("Enter Prn you want to update");
			id=sc.nextInt();
			elst= fs.readFile();
			fs.deleteStudent(id,elst);
			System.out.println("Enter updated name");
			nm=sc.next();
			System.out.println("Enter updated Degree");
			deg=sc.next();
			System.out.println("Enter updated email");
			em=sc.next();
			s1=new Student(id,nm,deg,em);
			elst.add(s1);
			fs.writeFile(elst);
			elst=new ArrayList<>();
	        break;
        case 5:	
//        	elst= fs.readFile();
//        	System.out.println("enter the prn to be deleted:");
//        	int eid=sc.nextInt();
//        	fs.deleteStudent(eid,elst);
//        	elst=new ArrayList<>();
	        break;
		default:
			System.out.println("Thank you");
			break;
		}
	}

}
}