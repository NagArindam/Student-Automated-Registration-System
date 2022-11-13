package com.masai.useCases;

import com.masai.dao.dao;
import com.masai.dao.daoImpl;

public class AdminAddNewCourse {

	public AdminAddNewCourse() {
		dao daoObj = new daoImpl();
		daoObj.adminAddNewCourse();
	}
	
}
