/**
 * 
 */
package com.jdbc;

import java.sql.*;
import java.util.Arrays;

public class DatabaseCode {

	public static void main(String[] args) 
	{
		//String str=""
		Connection con = null;
		Statement st = null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "system");
			st = con.createStatement();
			//st.executeQuery("create table Database(rollno number NOT NULL, name varchar2(20) NOT NULL, address varchar2(20) NOT NULL ,  age number NOT NULL)");
			//System.out.println("table is created ");
			//st.executeUpdate("insert into Database values(1,'sachin','pune',20)");
			//System.out.println("velues is insertated in tabale");
			ResultSet rs=st.executeQuery("select * from Database");
			System.out.println("value is present");
			//DatabaseCode cd=new DatabaseCode();
			//int count=0;
			StudentDB stt=null;
			StudentDB []ste=new StudentDB[5];
			int count=0;
			while(rs.next())
					{
				 stt=new StudentDB();
				 stt.setRollno(rs.getInt(1));
				 stt.setName(rs.getString(2));
				 stt.setAddress(rs.getString(3));
				 stt.setAge(rs.getInt(4));
				 
				 
				ste[count]=stt;
				count++;
				/*System.out.println("roll no:="+rs.getInt(1));
				System.out.println("name:="+rs.getString(2));
				System.out.println("address:="+rs.getString(3));
				System.out.println("age :="+rs.getInt(4));
				*/
					}
			System.out.println(Arrays.toString(ste));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		// String
		// sql="create table (rollno number NOT NULL, name varchar(20) NOT NULL.address varchar(20) NOT NULL ,  age number NOT NULL)"
		// st.executeQuery(sql);

		
	}

}
