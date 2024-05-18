package com.demo.service;
import java.util.List;

import com.demo.bean.IplTeam;
import com.demo.dao.IplDAoInterface;
import com.demo.dao.IplDaoImpl;

public class IplServiceImpl implements IplServiceInterface{
	IplDAoInterface ipldao =new  IplDaoImpl();

	@Override
	public boolean addTeam(int id, String teamname, String coachname, List<List<String>> players) {
	
		return ipldao.insertTeam(id,teamname,coachname,players);
	}

	@Override
	public List<IplTeam> displayTeams() {
		return ipldao.showTeam();
	}

	@Override
	public boolean deleteTeam(int id) {
		return ipldao.removeTeam(id);
	}

	@Override
	public List<List<String>> displayBatsman() {
		return ipldao.showBatsman();
	}

	@Override
	public List<List<String>> displaySpecialist1() {
		return ipldao.showsp1();
	}

	@Override
	public List<List<String>> displaySpecialist2() {

		return ipldao.showsp3();
	}

	@Override
	public boolean searchById(int id,String playername) {
		return ipldao.findById(id,playername);
	}

}
