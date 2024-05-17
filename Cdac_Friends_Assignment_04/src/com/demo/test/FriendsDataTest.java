package com.demo.test;
import java.util.Scanner;
import com.demo.service.FriendsServiceInterface;
import com.demo.service.FriendsServiceImpl;
import java.util.List;
import java.util.ArrayList;

import com.demo.beans.FriendsData;

public class FriendsDataTest {
	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		FriendsServiceInterface fservice=new FriendsServiceImpl();
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
			List<FriendsData> lst=new ArrayList<>();
			System.out.println("Enter choice: ");
			System.out.println("1. Display All Student\n2. Search by id\n3. Search by name");
			System.out.println("4.  Display all friend with a particular hobby \n5. Exit");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					lst=fservice.DisplayAllData();
					if(lst!=null)
					{
						lst.forEach(System.out::println);
					}
					else
					{
						System.out.println("Nothing to display");
					}
					break;
				case 2:
					System.out.println("Enter id: ");
					int id=sc.nextInt();
					FriendsData f=fservice.searchById(id);
					if(f!=null)
					{
						System.out.println(f);
					}
					else
					{
						System.out.println("Id not found");
					}
					
					
					
					break;
				case 3:
					System.out.println("Enter name: ");
					String name=sc.next();
					lst=fservice.searchByName(name);
					if(lst!=null) {
						lst.forEach(System.out::println);
					}
					else
						System.out.println("Not found");
					break;
				case 4:
					System.out.println("Enter hobby: ");
					String hobby=sc.next();
					lst=fservice.searchByhobby(hobby);
					if(lst!=null) {
						lst.forEach(System.out::println);
					}
					else
						System.out.println("Not found");
					break;
				case 5:
					sc.close();
					System.out.println("Thank you for visiting !!!");
					break;
				default:
					System.out.println("Invalid choice");
				
			}
		}while(choice!=5);
		
	}
}


