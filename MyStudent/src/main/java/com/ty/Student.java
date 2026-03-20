package com.ty;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Student{
		public static void main(String[] args) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
				Statement statement=connection.createStatement();
				statement.execute("insert into student1 values(105,'nandini',23,'Female')");
				statement.execute("insert into student1 values(106,'Divya',22,'Female')");
				statement.execute("insert into student1 values(107,'Vaisnavi',21,'Female')");
				statement.execute("insert into student1 values(108,'Akshata',24,'male')");
				connection.close();
				System.out.println("Data Saved");
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

}
