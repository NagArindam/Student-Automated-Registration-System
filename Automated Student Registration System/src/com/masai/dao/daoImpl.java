package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.masai.beanClass.Courses;
import com.masai.beanClass.Students;
import com.masai.exceptions.CoursesException;
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

	@Override
	public boolean registerBatch(int cid, String cname, String semail) throws CoursesException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkStudent(String semail, String spassword) throws StudentsException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Courses> ListOfCourse() throws CoursesException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getCourseId(String cname) throws CoursesException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean checkCourse(String cname) throws CoursesException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean EditStudentDetail(String semail, String spassword, String snewpassword, String snewname,
			String snewcourse) throws CoursesException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void EditStudentProfile(String semail, String stdnewpassword, String stdnewname) throws StudentsException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getCoursename(int cid) throws CoursesException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void displayCourseAvilabalityWithOrWithoutSeats(String option) throws SQLException{
		
		dao daoObjecDao = new daoImpl();
		List<batchSeatDTO> listOfBatchSeats;
		
		listOfBatchSeats = daoObjecDao.getBatchSeatDetails();
		int n = listOfBatchSeats.size();
		int[] cidIndex = new int[n];
		int[] filledSeats = new int[n];
		int[] totalSeats = new int[n];
		
		for(int i=0;i<n;i++) {
			cidIndex[i] = listOfBatchSeats.get(i).getcid();
			filledSeats[i] = listOfBatchSeats.get(i).getfilledSeats();
			totalSeats[i] = listOfBatchSeats.get(i).getTotalSeats();
		}
		
		
		
	}

}
