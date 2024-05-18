package com.demo.test;

import java.util.List;
import java.util.Map;
import java.util.Scanner;


import com.demo.dao.CityDao;
import com.demo.dao.CityDaoImpl;
import com.demo.service.CityService;
import com.demo.service.CityServiceImlp;

public class CityTest {
	
	public static void main(String[] args) {
		
		CityService cservice=new CityServiceImlp();
		CityDao cd=new CityDaoImpl();
		Scanner sc=new Scanner(System.in);
		
		int choice;
		do {
			System.out.println("Enter the choice");
			System.out.println("1.Find list of trees for a city \n"
					+ "2.Delete List of a particular city\r\n 3.Add new entry "
					+ "in treemap \n 4.Display all \n5.exit "+ "");
			choice=Integer.parseInt(sc.next());
			
			switch(choice) {
			case 1:
				System.out.println("Enter the city name");
				String city=sc.next();
				List<String> lst=cservice.getTreeList(city);
				//for(String t:lst) {
					//System.out.println("Trees in city:");
				
					System.out.println(city+":\n"+lst);
				//}
				break;
			case 2:
				System.out.println("Enter the city name");
				 city=sc.next();
				cd.RemoveCity(city);
				break;
			case 3:
				System.out.println("Enter the city name");
				 city=sc.next();
				 cd.AddCity(city);
				break;
			case 4:
				cd.ShowAll();
				//List<> plist = pservice.displayAll();
				//plist.stream().forEach(ob->System.out.println(ob));
				break;
			case 5:
				sc.close();
				System.out.println("thanks");
				break;
			}
		}while(choice!=5);
	}
}