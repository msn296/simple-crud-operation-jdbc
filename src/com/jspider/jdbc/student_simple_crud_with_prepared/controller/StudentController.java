package com.jspider.jdbc.student_simple_crud_with_prepared.controller;

import java.util.Scanner;

import com.jspider.jdbc.student_simple_crud_with_prepared.dto.Student;
import com.jspider.jdbc.student_simple_crud_with_prepared.service.StudentService;

public class StudentController {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Student student = null;

		StudentService studentService = new StudentService();

		System.out.println("1.insert\n2.update\n3.Display");
		System.out.println("Enter your option");

		int ch = scanner.nextInt();

		switch (ch) {
		/*
		 * case 1 :- for insertion data start
		 */
		case 1: {
			System.out.println("Enter student id");
			int id = scanner.nextInt();
			System.out.println("Enter student name");
			String name = scanner.next();
			System.out.println("Enter student email");
			String email = scanner.next();
			System.out.println("Enter student phone");
			long phone = scanner.nextLong();

			student = new Student(id, name, email, phone);

			studentService.insertStudentService(student);
		}
			break;
			/*
			 * case 1 :- for insertion data 
			 */
		/*
		 * case 2 :- for update data started 
		 */
		case 2: {
			System.out.println("1.Name\n2.Email\n3.Phone");
			System.out.println("Plaese Choose Your Data---");

			int ch1 = scanner.nextInt();
			switch (ch1) {
			/*
			 * case 1 :- for Name update started
			 */
			case 1: {
				System.out.println("Enter student id");
				int id = scanner.nextInt();
				System.out.println("Enter Student name");
				String name = scanner.next();

				int id1 = studentService.updateStudentNameService(id, name);
				if (id1 == 1) {
					System.out.println("Data----Update");
				} else {
					System.out.println("id not found please check once---");
				}
			}
				break;
				/*
				 * case 1 :- for Name update ended
				 */
				/*
				 * case 2 :- for Email update started
				 */
			case 2: {
				System.out.println("Enter student id");
				int id = scanner.nextInt();
				System.out.println("Enter Student Email");
				String email = scanner.next();

				int id1 = studentService.updateStudentEmailService(id, email);
				if (id1 == 1) {
					System.out.println("Data----Update");
				} else {
					System.out.println("id not found please check once---");
				}
			}
				break;
				/*
				 * case 2 :- for Email update ended
				 */
				/*
				 * case 3 :- for Phone update started
				 */
			case 3: {
				System.out.println("Enter student id");
				int id = scanner.nextInt();
				System.out.println("Enter Student Phone");
				String phone = scanner.next();

				int id1 = studentService.updateStudentPhoneService(id,phone);
				if (id1 == 1) {
					System.out.println("Data----Update");
				} else {
					System.out.println("id not found please check once---");
				}
			}
				break;
				/*
				 * case 3 :- for Phone update ended
				 */
			}
		}
		break;
		/*
		 * case 2 :- for update data ended
		 */
		/*
		 * case 3 :- for display data started
		 */
		case 3: {
			studentService.displayStudentDetails();
			
		}
		/*
		 * case 3 :- for display data ended
		 */
		}
		
	}
}
