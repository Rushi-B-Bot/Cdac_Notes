package com.demo.service;
import com.demo.dao.FriendsDaoInterface;

import java.util.List;

import com.demo.beans.FriendsData;
import com.demo.dao.FriendsDaoIml;

public class FriendsServiceImpl implements FriendsServiceInterface {
	
		FriendsDaoInterface fdao;
		public FriendsServiceImpl() {
			fdao=new FriendsDaoIml();
		}


	public List<FriendsData> DisplayAllData() {
		return fdao.showData();
	}

	@Override
	public FriendsData searchById(int id) {
		return fdao.findById(id);
	}


	@Override
	public List<FriendsData> searchByName(String name) {
		return fdao.findByName(name);
	}


	@Override
	public List<FriendsData> searchByhobby(String hobby) {
		return fdao.findByhobby(hobby);
	}


}
