package com.demo.service;

import java.util.List;

import com.demo.beans.FriendsData;

public interface FriendsServiceInterface {

	List<FriendsData> DisplayAllData();

	FriendsData searchById(int id);

	List<FriendsData> searchByName(String name);

	List<FriendsData> searchByhobby(String hobby);

}
