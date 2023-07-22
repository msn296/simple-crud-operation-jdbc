package com.jspider.jdbc.student_simple_crud_with_prepared.service;

import com.jspider.jdbc.student_simple_crud_with_prepared.dao.StudentDao;
import com.jspider.jdbc.student_simple_crud_with_prepared.dto.Student;

public class StudentService {
	StudentDao studentDao = new StudentDao();

	/*
	 * insert method for student started
	 */

	public Student insertStudentService(Student student) {
		if (student.getStudentId() <= 9999) {
			Student student2 = studentDao.inserStudent(student);
			return student2;
		} else {
			System.out.println("Please pass your id with 4 digits or less than id");
		}

		return null;
	}

	/*
	 * insert method for student ended
	 */
	/*
	 * update student data method for student ended
	 */
	/*
	 * update for student Name Started
	 */
	public int updateStudentNameService(int studentId, String studentName) {
		return studentDao.updateStudentname(studentId, studentName);
	}
	/*
	 * update for student Name ended
	 */
	/*
	 * update for student Email Started
	 */
	public int updateStudentEmailService(int studentId,String studentEmail) {
		return studentDao.updateStudentEmail(studentId, studentEmail);
	}
	/*
	 * update for student Email ended
	 */
	/*
	 * update for student Phone Started
	 */
	public int updateStudentPhoneService(int studentId,String studentPhone) {
		return studentDao.updateStudentEmail(studentId, studentPhone);
	}
	/*
	 * update for student phone ended
	 */
	/*
	 * insert student data method for student ended
	 */
	/*
	 * Display method (All data of students)
	 */
	public void displayStudentDetails() {
		studentDao.dislayStudentDetails();
	}
	/*
	 * Display method (All data of students)
	 */
}
