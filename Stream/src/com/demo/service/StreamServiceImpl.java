package com.demo.service;

import java.util.List;

import com.demo.beans.Stream;
import com.demo.dao.StreamDaoImpl;
import com.demo.dao.StreamDaoInterface;

public class StreamServiceImpl implements StreamServiceInterface {

	StreamDaoInterface sdao;
	public StreamServiceImpl() {
		super();
		sdao=new StreamDaoImpl();
	}
	@Override
	public List<Stream> getList() {
		// TODO Auto-generated method stub
		return sdao.getL();
	}

}
