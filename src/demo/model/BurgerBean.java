package demo.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import demo.db.utility.DBSQLMessages;

public class BurgerBean implements DBSQLMessages {
	
	private String burgertype;
	private String burgersize;
	private String froyotype;
	private String froyosize;
	public String getBurgertype() {
		return burgertype;
	}
	public void setBurgertype(String burgertype) {
		this.burgertype = burgertype;
	}
	public String getBurgersize() {
		return burgersize;
	}
	public void setBurgersize(String burgersize) {
		this.burgersize = burgersize;
	}
	public String getFroyotype() {
		return froyotype;
	}
	public void setFroyotype(String froyotype) {
		this.froyotype = froyotype;
	}
	public String getFroyosize() {
		return froyosize;
	}
	public void setFroyosize(String froyosize) {
		this.froyosize = froyosize;
	}
	
	public void insert(Connection connection) {
		try {
			PreparedStatement prep 
				= connection.prepareStatement(
				ADD_ORDER);
			
			prep.setString(1, burgertype);
			prep.setString(2, burgersize);
			prep.setString(3, froyotype);
			prep.setString(4, froyosize);
			
			
			//commit this to the database
			prep.executeUpdate();
		} catch (SQLException sqle) {
			System.err.println(sqle.getMessage());
		}
	}
	
	public static ResultSet getAllRecords(Connection 
		connection) {
		
		ResultSet records = null;
		
		try {
			PreparedStatement prep = connection
				.prepareStatement(VIEW_ORDERS);
			
			records = prep.executeQuery();
		} catch (SQLException sqle) {
			System.err.println(sqle.getMessage());
		}
		return records;
	}

}
