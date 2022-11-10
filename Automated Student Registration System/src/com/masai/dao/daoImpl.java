package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.masai.beanClass.Students;
import com.masai.exceptions.StudentsException;
import com.masai.utility.DButil;

public class daoImpl implements dao{

	@Override
	public String registerStudent(Students student) throws StudentsException {
		
		String result = "Student Already Exist";
		String semail = student.getSemail();
		String spassword = student.getSpassword();
		String sname = student.getSname();
		
		try (Connection conn = DButil.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("insert into Students values (?,?,?)");
			ps.setString(1, semail);
			ps.setString(2, spassword);
			ps.setString(3, sname);
			
			int x = ps.executeUpdate();
			result = "Student "+x+" inserted successfully";
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new StudentsException(e.getMessage());
		}
		
		return result;
	}

}
