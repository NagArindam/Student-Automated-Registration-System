package com.masai.dao;

import com.masai.beanClass.Students;
import com.masai.exceptions.StudentsException;

public interface dao {

	
	public String registerStudent (Students student) throws StudentsException;
}
