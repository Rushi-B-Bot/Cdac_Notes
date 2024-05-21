package com.demo.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import com.demo.beans.Stream;


public class StreamDaoImpl implements StreamDaoInterface{
	static List<Stream> list;
	static {
		list=new ArrayList<>();
		list.add(new Stream("abra"));
		list.add(new Stream("ab"));
		list.add(new Stream("Aarti"));
	}
	
	public List<Stream> getL() {
		List<Stream> lst = list.stream()
				.filter(ob->ob.getName().length()<7&&ob.getName().startsWith("ab")).collect(Collectors.toList());
		if(lst.isEmpty()) {
			return null;
		}
		return lst;
	}

}
