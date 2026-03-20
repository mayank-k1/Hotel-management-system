package com.ty;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetData {

	public static void main(String[] args) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
					Statement statement=connection.createStatement();
					ResultSet resultSet =statement.executeQuery("select * from student1");//where id=105
					while(resultSet.next())
					{
						System.out.println("the student id is "+resultSet.getInt(1));
						System.out.println("the student name is "+resultSet.getString(2));
						System.out.println("the student age is "+resultSet.getInt(3));
						System.out.println("the student gender is "+resultSet.getString(4));
						System.out.println("---------------------------------------");
					}
					connection.close();
					System.out.println("Data Saved");
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
}
