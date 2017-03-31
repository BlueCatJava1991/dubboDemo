package cn.ikejie.api.service;

import java.io.Serializable;

import cn.ikejie.service.IProcessData;

public class ProcessDataImpl implements IProcessData,Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String hello(String name) {
		System.out.println(name);
		return "hello : " + name;
	}

}
