package com.demo.dao;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


import com.demo.beans.TreeCity;

public class CityDaoImpl implements CityDao {
	List<TreeCity> lst;
Scanner sc=new Scanner(System.in);
	//static List<String> treeList =new ArrayList<>();
	
	//TreeCity t1=new TreeCity("Mango",5);
	static Map<String,List> ctData;
	static {
		ctData=new TreeMap<>();
		///treeList.add("Neem");
		///treeList.add("Mango");
	//	ctData.put("Pune",lst1);
		//List<TreeCity> lst;
		List<TreeCity> lst1=new ArrayList<>();
		List<TreeCity> lst2=new ArrayList<>();
		lst1.add(new TreeCity("Peepal", 50));
		lst1.add(new TreeCity("Banana", 450));
		lst1.add(new TreeCity("Lemon", 800));
		lst2.add(new TreeCity("Orange", 75));
		lst1.add(new TreeCity("Coconut", 500));
		lst2.add(new TreeCity("Apricot", 800));
		lst2.add(new TreeCity("Strawberry", 75));
		lst2.add(new TreeCity("Jamun", 500));
		lst2.add(new TreeCity("Apple", 500));
//		lst1.add("Mango");
//		lst1.add("coconut");
		ctData.put("Pune",lst2);
		ctData.put("Mumbai",lst1);
	} 
	@Override
	public List<String> getTreeByCity(String city) {

		return 	ctData.get(city);
	}
	@Override
	public List<String> ShowAll() {
		System.out.println(ctData);
		return null;	
	}
	@Override
	public void AddCity(String c){
		System.out.println("no of tree types:");
		int i,n,q;
		String t;
		n=sc.nextInt();
		lst=new ArrayList<>();
		for(i=0;i<=n-1;i++){
			System.out.println("Enter Tree");
			t=sc.next();
			System.out.println("Enter Quantity");
			q=sc.nextInt();
			lst.add(new TreeCity(t,q));
		}
		ctData.put(c,lst);
		System.out.println("City Added Succeesfully");
	}
	@Override
	public Boolean RemoveCity(String c) {
		List v= ctData.remove(c);
		if(v!=null) {
			System.out.println("Deleted");
			return true;
		}
		return false;
	}
	
}