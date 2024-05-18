package com.demo.dao;

import java.util.List;

import com.demo.bean.IplTeam;

public interface IplDAoInterface {

	boolean insertTeam(int id, String teamname, String coachname, List<List<String>> players);

	List<IplTeam> showTeam();

	boolean removeTeam(int id);

	List<List<String>> showBatsman();

	List<List<String>> showsp1();

	List<List<String>> showsp3();

	boolean findById(int id,String playername);
}
