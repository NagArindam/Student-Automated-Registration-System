package com.masai.clientSide;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.masai.beanClass.Course;
import com.masai.beanClass.Student;
import com.masai.dao.dao;
import com.masai.dao.daoImpl;
import com.masai.useCases.AdminAddNewCourse;
import com.masai.useCases.AdminAllocateStudentsInaBatchUnderaCourse;
import com.masai.useCases.AdminCreatBatchunderaCourse;
import com.masai.useCases.AdminDeleteCourse;
import com.masai.useCases.AdminDisplayCourseInfo;
import com.masai.useCases.AdminUpdateFeesOfCourse;
import com.masai.useCases.AdminUpdateTotalSeatsOfaBatch;
import com.masai.useCases.AdminViewStudentsOfEveryBatch;
import com.masai.useCases.LoginStudent;
import com.masai.useCases.RegisterStudentCourseBatch;

public class ClientSide {

	public static void main(String[] args) throws Exception {
		System.out.println();
		System.out.println("     						Welcome to Automated Student registration system!");
		dao daoObj = new daoImpl();

		Scanner sc = new Scanner(System.in);
		
		daoObj.displayHomePageOptionToUser();

		try {
			
		int profile = sc.nextInt(); 
		
		if(profile == 1){
			
			if(daoObj.checkForAdmin()) {
				daoObj.displayOptionsForAdmin();
				
				int aOpt = sc.nextInt();
				
				switch (aOpt) {
				case 1: {
					AdminAddNewCourse a = new AdminAddNewCourse();
					break;
				}
				case 2: {
					AdminUpdateFeesOfCourse a = new AdminUpdateFeesOfCourse();
					break;

				}
				case 3: {
					AdminDeleteCourse a = new AdminDeleteCourse();
					break;

				}
				case 4: {
					AdminDisplayCourseInfo a = new AdminDisplayCourseInfo();
					break;

				}
				case 5: {
					AdminCreatBatchunderaCourse a = new AdminCreatBatchunderaCourse();		
					break;
				}
				case 6: {
					AdminAllocateStudentsInaBatchUnderaCourse a = new AdminAllocateStudentsInaBatchUnderaCourse();
					break;
				}
				case 7: {
					AdminUpdateTotalSeatsOfaBatch a = new AdminUpdateTotalSeatsOfaBatch();
					break;
				}
				case 8: {
					AdminViewStudentsOfEveryBatch a = new AdminViewStudentsOfEveryBatch();
					break;
				}
				
				default:
					throw new IllegalArgumentException("Unexpected value: " + aOpt+ " enter valid options please.");
				}
			}
			else System.out.println("Please enter correct ID and Password!");
			
		}
		
		else if(profile == 2) {
			RegisterStudentCourseBatch rscb = new RegisterStudentCourseBatch();
		}
		else if(profile == 3) {
			LoginStudent ls = new LoginStudent();
		}

		else System.out.println("Please enter valid input 1, 2 or 3");
		
		}
		catch(InputMismatchException ime) {
			System.out.println("Please enter valid input");
		}
		
		
	}

}

