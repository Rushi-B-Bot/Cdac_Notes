package com.demo.dao;

import java.util.List;

import com.demo.beans.FriendsData;

public interface FriendsDaoInterface {

	List<FriendsData> showData();

	FriendsData findById(int id);

	List<FriendsData> findByName(String name);

	List<FriendsData> findByhobby(String hobby);

}
