package com.demo.service;

import java.util.List;

import com.demo.bean.IplTeam;

public interface IplServiceInterface {

	boolean addTeam(int id, String teamname, String coachname, List<List<String>> players);

	List<IplTeam> displayTeams();

	boolean deleteTeam(int id);

	List<List<String>> displayBatsman();

	List<List<String>> displaySpecialist1();

	List<List<String>> displaySpecialist2();

	boolean searchById(int id,String playername);

	

}
