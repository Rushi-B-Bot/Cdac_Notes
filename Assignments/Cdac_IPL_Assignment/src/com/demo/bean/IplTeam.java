package com.demo.bean;

import java.util.List;
import java.util.Objects;

public class IplTeam {
	private int teamid;
	private String tname;
	private String coachname;
	private List<List<String>> listofplayers;
	

	public IplTeam() {
			super();
		}

	public IplTeam(int teamid, String tname, String coachname, List<List<String>> listofplayers) {
		super();
		this.teamid = teamid;
		this.tname = tname;
		this.coachname = coachname;
		this.listofplayers = listofplayers;
	}

	public IplTeam(int id) {
		super();
		this.teamid = id;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IplTeam other = (IplTeam) obj;
		return teamid == other.teamid;
	}

	public int getTeamid() {
		return teamid;
	}

	public void setTeamid(int teamid) {
		this.teamid = teamid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getCoachname() {
		return coachname;
	}

	public void setCoachname(String coachname) {
		this.coachname = coachname;
	}

	public List<List<String>> getListofplayers() {
		return listofplayers;
	}

	public void setListofplayers(List<List<String>> listofplayers) {
		this.listofplayers = listofplayers;
	}

	@Override
	public String toString() {
		return "IplTeam [teamid=" + teamid + ", tname=" + tname + ", coachname=" + coachname + ", listofplayers="
				+ listofplayers + "]";
	}

	 
	 
}






