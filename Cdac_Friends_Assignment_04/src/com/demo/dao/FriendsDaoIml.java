package com.demo.dao;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.FriendsData;

public class FriendsDaoIml implements FriendsDaoInterface{
	static List<String> hobbies1=List.of("Play-Boy","Writing","Running","Travelling","Trecking");
	static List<String> hobbies2=List.of("Singing","Comic" ,"Dancing","Cooking","Trecking");
	static List<String> hobbies3=List.of("Comic Reading","Listening","Fighting","arguing");
	static List<String> hobbies4=List.of("Cricket","Teaching","Drawing","Travelling","Trecking");
	static List<String> hobbies5=List.of("Singing","Writing","Running","Travelling","Painting");
	static List<FriendsData> lst;
	static {
		lst=new ArrayList<>();
		lst.add(new FriendsData(101,"Rushi","Bhondave",hobbies1,12345,"rushi@123",LocalDate.of(2001, 04,19),"Shirur"));
		lst.add(new FriendsData(102,"Aarti","Bhasme",hobbies2,54321,"aarti@123",LocalDate.of(2000, 07,28),"Ambajogai"));
		lst.add(new FriendsData(103,"Nazmin","Shaikh",hobbies3,75295,"nazmin@123",LocalDate.of(1996, 04,26),"Latur"));
		lst.add(new FriendsData(104,"Vivek","Shitole",hobbies4,67856,"Vivek@123",LocalDate.of(2000, 04,22),"Tat-Borgaon"));
		lst.add(new FriendsData(105,"Reeva","Kakade",hobbies5,80975,"Reeva@123",LocalDate.of(2019, 12,26),"Pune"));
	}
	
	@Override
	public List<FriendsData> showData() {
		return lst;
	}

	@Override
	public FriendsData findById(int id) {
		for(FriendsData f:lst)
		{
			if(f!=null)
			{
				if(f.getId()==id)
				{
					return f;
				}
					
			}
		}
		return null;
	}

	@Override
	public List<FriendsData> findByName(String name) {
		List<FriendsData> list=new ArrayList<>();
		for(FriendsData f:lst)
		{
			if(f!=null)
			{
				if(f.getName().equals(name))
				{
					list.add(f);
				}
					
			}
		}
		if(list.isEmpty())
			return null;
		else
			return list;
	}

	@Override
	public List<FriendsData> findByhobby(String hobby) {
		List<FriendsData> list=new ArrayList<>();
		for(FriendsData f:lst)
		{
			if(f!=null)
			{
				if(f.getHobbies().contains(hobby))
				{
					list.add(f);
				}		
			}
		}
		if(list.isEmpty())
			return null;
		else
			return list;
	}
	
}
