package com.seeburger.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTables {

	public void createTable(Connection conn) throws SQLException {

		Statement stmt = conn.createStatement();
		String sql = "CREATE TABLE IF NOT EXISTS FACULTY " + 
		"(ID INT PRIMARY KEY NOT NULL,"	+ 
		" NAME TEXT NOT NULL, " + 
		" FAMILY TEXT NOT NULL, " + 
		" F_NUM INT) ";
		stmt.execute(sql);
		stmt.close();

		System.out.println("Table created successfully");
	}

	public void deleteTable(Connection conn) throws SQLException {
		Statement st = conn.createStatement();
		String sql = "drop table FACULTY";
		st.execute(sql);
		st.close();
		conn.close();
		System.out.println("Table was droped!");
	}

}