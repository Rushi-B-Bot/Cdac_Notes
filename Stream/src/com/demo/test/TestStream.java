package com.demo.test;

import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Stream;
import com.demo.service.StreamServiceImpl;
import com.demo.service.StreamServiceInterface;

public class TestStream {

	public static void main(String[] args) {
		
		StreamServiceInterface sservice=new StreamServiceImpl();
		
		List<Stream> list=sservice.getList();
		list.forEach(System.out::println);
	}

}
