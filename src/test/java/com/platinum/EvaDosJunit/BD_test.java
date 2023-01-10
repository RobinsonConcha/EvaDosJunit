package com.platinum.EvaDosJunit;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BD_test {
Connection connection;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/integracion","root","1234");
	}

	@After
	public void tearDown() throws Exception {
		connection.close();
	}

	@Test
	public void test() {

			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public Connection getConnection()
		{
			Connection con = null;
			try {
				con = DriverManager.getConnection("dbUrl", "dbUname", "dbPassword");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return con;
		}

}
