package com.masai.useCases;

import com.masai.dao.dao;
import com.masai.dao.daoImpl;

public class AdminViewStudentsOfEveryBatch {
	public AdminViewStudentsOfEveryBatch() {
		dao daoObj = new daoImpl();
		daoObj.adminViewStudentsOfEveryBatch();

	}
}
