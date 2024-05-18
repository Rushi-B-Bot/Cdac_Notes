package com.demo.dao;

import java.util.List;
import java.util.ArrayList;
import com.demo.bean.IplTeam;

public class IplDaoImpl implements IplDAoInterface {
	IplTeam p;
	static List<String> batsman1=List.of("Virat Kohli","Du-plessis");
	static List<String> batsman2=List.of("Dhoni","Gaikwad");
	static List<String> batsman3=List.of("Rohit Sharma","Suryakumar Yadav");
	
	static List<String> bowler1=List.of("Siraj","Joseph");
	static List<String> bowler2=List.of("Pratina","Richared");
	static List<String> bowler3=List.of("Pandya","Bumrah");
	
	static List<String> allrounder1=List.of("Will Jacks","Akash Deep");
	static List<String> allrounder2=List.of("Mitchell","Jadeja");
	static List<String> allrounder3=List.of("Arjun Tendulkar","Nehal");
	
	static List<List<String>> players1=List.of(batsman1,bowler1,allrounder1);
	static List<List<String>> players2=List.of(batsman2,bowler2,allrounder2);
	static List<List<String>> players3=List.of(batsman3,bowler3,allrounder3);
	
	static List<List<String>> lbatsman=List.of(batsman1,batsman2,batsman3);
	
	static List<List<String>> lbowler=List.of(bowler1,bowler2,bowler3);
	
	static List<List<String>> lallrounder=List.of(allrounder1,allrounder2,allrounder3);
	
	static List<IplTeam> list;
	static {
		list=new ArrayList<>();
		list.add(new IplTeam(101,"RCB","Rahul Dravid",players1));
		list.add(new IplTeam(102,"CSK","Sakshi Dhoni",players2));
		list.add(new IplTeam(103,"Mumbai","Sachin Tendulkar",players3));
	}
	@Override
	public boolean insertTeam(int id, String teamname, String coachname, List<List<String>> players) {
		return list.add(new IplTeam(id,teamname,coachname,players));
	}
	@Override
	public List<IplTeam> showTeam() {
		return list;
	}
	@Override
	public boolean removeTeam(int id) {
		return list.remove(new IplTeam(id));
	}
	@Override
	public List<List<String>> showBatsman() {
		return lbatsman;
	}
	@Override
	public List<List<String>> showsp1() {
		return lbowler;
	}
	
	@Override
	public List<List<String>> showsp3() {
		return lallrounder;
	}
	@Override
	public boolean findById(int id,String playername) {
		for(IplTeam p:list)
		{
			if(p.getTeamid()==id)
			{
				System.out.println("found");
			}
		}
		return false;
	}
	
}
