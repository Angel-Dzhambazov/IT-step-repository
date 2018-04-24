package com.seeburger.run;

import com.seeburger.sort.FindMinMax;
import com.seeburger.jdbc.CreateTables;
import com.seeburger.jdbc.DatabaseConnection;
import java.sql.Connection;
import java.sql.SQLException;


public class RunApp {
	public static void main(String[] args) {
		//FindMinMax findMinMax = new FindMinMax(23);
		
		//System.out.println(findMinMax.toString());
		
		
        Connection conn = null;
        try{
        DatabaseConnection db = DatabaseConnection.getInstance();
        conn  = db.connectToDatabase();
        CreateTables ct = new CreateTables();
        ct.createTable(conn);
        //ct.deleteTable(conn);
        }catch(SQLException sqle){
            sqle.printStackTrace();
        }finally{
            try{
            if(conn != null)conn.close();
            }catch(SQLException sqle){
                sqle.printStackTrace();
            }
        }
	}
}








