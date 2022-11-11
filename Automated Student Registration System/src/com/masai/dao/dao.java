package com.masai.dao;

import java.sql.SQLException;
import java.util.List;

import com.masai.beanClass.Courses;
import com.masai.beanClass.Students;
import com.masai.exceptions.CoursesException;
import com.masai.exceptions.StudentsException;

public interface dao {

	
	public String registerStudent (Students student) throws StudentsException;
	public boolean registerBatch (int cid, String cname, String semail) throws CoursesException;
	public boolean checkStudent (String semail, String spassword) throws StudentsException;
	public List<Courses> ListOfCourse () throws CoursesException;
	public int getCourseId (String cname) throws CoursesException;
	public boolean checkCourse (String cname) throws CoursesException;
	public boolean EditStudentDetail (String semail, String spassword, String snewpassword, String snewname, String snewcourse) throws CoursesException;
	
	public void EditStudentProfile (String semail, String stdnewpassword, String stdnewname) throws StudentsException;
	public List<batchSeatDTO> getBatchSeatDetails() throws SQLException;
	public String getCoursename (int cid) throws CoursesException;
	public void displayCourseAvilabalityWithOrWithoutSeats (String option) throws SQLException;
	
}
