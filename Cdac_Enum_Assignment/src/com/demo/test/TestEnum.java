package com.demo.test;
import com.demo.enums.Grade;
import java.util.Scanner;

public class TestEnum {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter grade: ");
		String grade=sc.next();
		switch(grade)
		{
			case "A":
				Grade g=Grade.Distinction;
				System.out.println("Grade A:\nMaximum marks: "+g.getMax()+"\nMinimum marks: "+g.getMin());
				break;
			case "B":
				Grade f=Grade.First;
				System.out.println("Grade B:\nMaximum marks: "+f.getMax()+"\nMinimum marks: "+f.getMin());
				break;
			case "C":
				Grade h=Grade.Second;
				System.out.println("Grade C:\nMaximum marks: "+h.getMax()+"\nMinimum marks: "+h.getMin());
				break;
			case "D":
				Grade i=Grade.Pass;
				System.out.println("Grade D:\nMaximum marks: "+i.getMax()+"\nMinimum marks: "+i.getMin());
				break;
			case "E":
				Grade j=Grade.Fail;
				System.out.println("Grade E:\nMaximum marks: "+j.getMax()+"\nMinimum marks: "+j.getMin());
				break;
			default:
				System.out.println("Invalid grade");
					
				
		}
	}
}
