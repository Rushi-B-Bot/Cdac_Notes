package com.demo.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.demo.beans.Student;



public class StudentDaoImpl implements StudentDao{
	
	  static List<Student> slist; 
	  static {
		  slist=new ArrayList<>(); 
		  }
	  
	  @Override
		public void writeToFile(List<Student> slist) { 
			try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("Studentdata.csv"));)
			{ 
				for(Student e:slist) {
				//serialize the object
					oos.writeObject(e); 
					} 
			} 
			catch (FileNotFoundException e) {  
		  e.printStackTrace(); 
		  } 
			catch (IOException e) { 
			  e.printStackTrace(); }
	  
	  }

	@Override
	public List<Student> readFromFile() {
		List<Student> lst = null;
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("Studentdata.csv"))){
			lst = new ArrayList<Student>();
			while(true) {
				Student e=(Student)ois.readObject();
				//System.out.println(e);
				lst.add(e);
			}
			
		} catch(EOFException e) {
			//System.out.println("reached to end of file");
			
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lst;
	}

	@Override
	public boolean deleteStud(int ePrn,List<Student> e) {
		Iterator irt=e.iterator();
		while(irt.hasNext()) {
			Student e1=(Student) irt.next();
			if(e1.getPrn()==ePrn) {
				irt.remove();
			}
		}
		writeToFile(e);
		return true;
	}

	
}