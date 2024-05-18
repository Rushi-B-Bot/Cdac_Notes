package com.demo.test;
import java.util.List;
import com.demo.bean.IplTeam;
import java.util.Scanner;
import com.demo.service.*;

public class TestIplTeam {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int choice = 0;
		IplServiceInterface iplservice =new IplServiceImpl();
		do {
			List<String> bowler=null;
			List<String> batsman = null;
			List<String> allrounder=null;
			System.out.println("Enter Choice");
			System.out.println("1. add new Team\r\n"
					+ "2. delete a team\r\n"
					+ "3. delete a player from team(accept player id to delete)\r\n"
					+ "4. display all batsman\r\n"
					+ "5. display all player with a speciality(accept speciality from user)\r\n"
					+ "6. add a new player in a team\r\n"
					+ "7. modify coach of a team\r\n"
					+ "8. Display all teams\r\n"
					+ "9. exit\r\n");
			choice=sc.nextInt();
				switch (choice)
				{
					case 1:
						System.out.println("Enter Id: ");
						int id;
						id=sc.nextInt();
						System.out.println("Enter Team Name: ");
						String teamname;
						teamname=sc.next();
						System.out.println("Enter Coach Name: ");
						String coachname;
						coachname=sc.next();
						for(int i=0;i<2;i++)
						{
							System.out.println("Enter bowler name");
							String bowlerrname=sc.next();
							bowler=List.of(bowlerrname);
							
							System.out.println("Enter batsman name");
							String batsmanname=sc.next();
							batsman=List.of(batsmanname);
							
							System.out.println("Enter allrounder name");
							String allroundername=sc.next();
							allrounder=List.of(allroundername);
							
						}
						List<List<String>> players=List.of(bowler,batsman,allrounder);
						boolean status=iplservice.addTeam(id,teamname,coachname,players);
						if(status)
						{
							System.out.println("Added successfully");
						}
						else
						{
							System.out.println("Operation failed");
						}
						break;
						
					case 2:
						System.out.println("Enter team id to be removed: ");
						id=sc.nextInt();
						status=iplservice.deleteTeam(id);
						if(status)
						{
							System.out.println("Removed successfully");
						}
						else
						{
							System.out.println("Operation failed");
						}
						break;
						
					case 3:
						break;
						
					case 4:
						List<List<String>> lst1=iplservice.displayBatsman();
						if(lst1!=null)
						{
							lst1.forEach(System.out::println);
						}
						else
						{
							System.out.println("List is empty");
						}
						break;
						
					case 5:
						System.out.println("Enter speciality 1.Bowler 2.Batsman 3.All Rounder");
						int speciality=sc.nextInt();
						switch(speciality)
						{
							case 1:
								List<List<String>> lst=iplservice.displaySpecialist1();
								if(lst!=null)
								{
									lst.forEach(System.out::println);
								}
								else
								{
									System.out.println("List is empty");
								}
								break;
							case 2:
								lst=iplservice.displayBatsman();
								if(lst!=null)
								{
									lst.forEach(System.out::println);
								}
								else
								{
									System.out.println("List is empty");
								}
								break;
							case 3:
								lst=iplservice.displaySpecialist2();
								if(lst!=null)
								{
									lst.forEach(System.out::println);
								}
								else
								{
									System.out.println("List is empty");
								}
								break;
							
						}
						break;
						
					case 6:
						System.out.println("Enter team id to be search");
						id=sc.nextInt();
						String playername=sc.next();
						boolean p=iplservice.searchById(id,playername);
						if(p)
						{
							System.out.println("Added Successfully");
						}
						else
						{
							System.out.println("Operation failed");
						}
						break;
						
					case 7:
						break;
						
					case 8:
						List<IplTeam> lst3=iplservice.displayTeams();
						if(lst3!=null)
						{
							lst3.forEach(System.out::println);
						}
						else
						{
							System.out.println("List is empty");
						}
						break;
						
					case 9:
						sc.close();
						System.out.println("Thank u For Visting us");
						break;
						
					default:
						System.out.println("Invalid Choice");
						break;
				}
		}while(choice!=9 );

	}

}
