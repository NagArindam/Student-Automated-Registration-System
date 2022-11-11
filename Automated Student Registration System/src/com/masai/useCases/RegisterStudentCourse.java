package com.masai.useCases;

import java.util.Scanner;

import com.masai.beanClass.Students;
import com.masai.dao.dao;
import com.masai.dao.daoImpl;
import com.masai.exceptions.StudentsException;

public class RegisterStudentCourse {

	public RegisterStudentCourse() {
		
		Scanner sc = new Scanner(System.in);
		Students s = null;
		
		
		System.out.println("Enter Email/Username: ");
		String semail = sc.next();
		
		System.out.println("Enter Password: ");
		String spassword = sc.next();
		
		System.out.println("Enter Name: ");
		String sname = sc.next();
		
		s = new Students(semail, spassword, sname);
		dao daoObject = new daoImpl();
		
		try {
			Boolean res = daoObject.checkStudent(semail, spassword);
			
			if(!res) {
				daoObject.registerStudent(s);
				System.out.println();
				System.out.println("Student"+ sname+" with Email "+semail+" registered successfully");
				
				System.out.println("Type yes to join a new course. ");
				System.out.println("Type no to end the process. ");
				String option = sc.next();
				
				if(option.equalsIgnoreCase("yes")) {
					System.out.println("All the list of course that are available: ");
					
				}
			}
			
			
		} catch (StudentsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
