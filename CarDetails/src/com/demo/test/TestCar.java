package com.demo.test;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.demo.beans.*;

import com.demo.service.CarServiceImpl;
import com.demo.service.CarServiceInterface;

public class TestCar {

	public static void main(String[] args) {
		CarServiceInterface cservice=new CarServiceImpl();
		Scanner sc=new Scanner(System.in);
		List<Car> list=new ArrayList<>();
		int choice=0;
		do {
			System.out.println("Enter choice: ");
			System.out.println("1.add new car\n2.Delete a car\n3.Search car by manufacture date");
			System.out.println("4.Search car by price\n5.sort by owner name\n6.Exit");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter Car id: ");
				int id=sc.nextInt();
				System.out.println("Enter Owner name: ");
				String ownername=sc.next();
				System.out.println("Enter Date of Purchase: ");
				String dateofpurchase=sc.next();
				System.out.println("Enter Salesman name: ");
				String salesmanname=sc.next();
				System.out.println("Enter Manufacturate date: ");
				String manufacturedate=sc.next();
				System.out.println("Enter Model name: ");
				String modelname=sc.next();
				System.out.println("Enter Price: ");
				int price=sc.nextInt();
				
				LocalDate ldt=LocalDate.parse(dateofpurchase,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				LocalDate ldt1=LocalDate.parse(manufacturedate,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				
				Car c=new Car(id,price,ownername,salesmanname,modelname,ldt,ldt1);
						
				boolean status=cservice.addNewData(c);
				if(status)
				{
					System.out.println("Data added in file successfully");
				}
				else
				{
					System.out.println("Operation faild");
				}
				break;
				
				
			case 2:
				System.out.println("Enter id to be deleted: ");
				id=sc.nextInt();
				status=cservice.deleteData(id);
				if(status)
				{
					System.out.println("Car deleted from file successfully");
				}
				else
				{
					System.out.println("Operation faild");
				}
				break;
				
				
				
			case 3:
				System.out.println("Enter Manufacture date: ");
				manufacturedate=sc.next();
				ldt1=LocalDate.parse(manufacturedate,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				list=cservice.seachByManufactureDate(ldt1);
				list.forEach(System.out::println);
				break;
				
				
				
			case 4:
				System.out.println("Enter Price: ");
				price=sc.nextInt();
				list=cservice.seachByPrice(price);
				list.forEach(System.out::println);
				break;
				
				
			case 5:
				list=cservice.sortByName();
				list.forEach(System.out::println);
				break;
				
				
			case 6:
				cservice.writeInFile();
				sc.close();
				System.out.println("Thank you for visiting us !!!");
				break;
				
				
			default:
					System.out.println("Invalid choice");
			}
		}while(choice!=6);

	}

}
