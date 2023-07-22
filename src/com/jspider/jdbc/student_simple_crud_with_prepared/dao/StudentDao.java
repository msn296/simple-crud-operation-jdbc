package com.jspider.jdbc.student_simple_crud_with_prepared.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jspider.jdbc.student_simple_crud_with_prepared.connection.StudentConnection;
import com.jspider.jdbc.student_simple_crud_with_prepared.dto.Student;

public class StudentDao {
	Connection connection = StudentConnection.getStudentConnection();

	/*
	 * Insert method for student started ...
	 */

	public Student inserStudent(Student student) {
		String inserQuery = "insert into student_details value(?,?,?,?)";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(inserQuery);

			preparedStatement.setInt(1, student.getStudentId());
			preparedStatement.setString(2, student.getStudentName());
			preparedStatement.setString(3, student.getStudentEmail());
			preparedStatement.setLong(4, student.getStudentPhone());

			preparedStatement.execute();
			System.out.println("Data-----Store-----");
			return student;
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}

	/*
	 * Insert method for student ended ...
	 */
	/*
	 * update student data methods started...
	 */
	/*
	 * For Student Name update started
	 */
	public int updateStudentname(int studentId, String studentName) {
		String updateStudentNameQuery = "update student_details set studentName=? where studentId=?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(updateStudentNameQuery);
			preparedStatement.setInt(2, studentId);
			preparedStatement.setString(1, studentName);

			return preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return 0;
	}
	/*
	 * For Student Name update ended
	 */
	/*
	 * For Student Email update started
	 */
	public int updateStudentEmail(int studentId,String studentEmail)
	{
		String updateStudentEmailQuery = "update student_details set studentEmail=? where studentId =?";
		
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(updateStudentEmailQuery);
			preparedStatement.setInt(2, studentId);
			preparedStatement.setString(1, studentEmail);
			
			return preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	/*
	 * For Student Email update ended
	 */
	/*
	 * For Student Phone update started
	 */
	public int updateStudentPhone(int studentId,String studentPhone)
	{
		String updateStudentPhoneQuery = "update student_details set studentEmail=? where studentId =?";
		
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(updateStudentPhoneQuery);
			preparedStatement.setInt(2, studentId);
			preparedStatement.setString(1, studentPhone);
			
			return preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	/*
	 * For Student Phone update started
	 */
	/*
	 * update student data methods started...
	 */
	/*
	 * display student data methods started...
	 */
	public void dislayStudentDetails() {
		String displayStudentQuery = "select * from student_details";
		
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(displayStudentQuery);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next())
			{
				int id =resultSet.getInt("studentId");
				String name =resultSet.getString("studentName");
				String email =resultSet.getString("studentEmail");
				long phone =resultSet.getLong("studentPhone");
				
				System.out.println("Student Id = "+id);
				System.out.println("Student Name = "+name);
				System.out.println("Student Email = "+email);
				System.out.println("Student Phone = "+phone);
				
				System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
				
			}
			
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	/*
	 * display student data methods started...
	 */
}
