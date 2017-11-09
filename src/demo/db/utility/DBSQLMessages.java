package demo.db.utility;


public interface DBSQLMessages {
	
	String ADD_ORDER = "INSERT INTO buryo (burger, bsize, froyo, fsize) values (?, ?, ?, ?)";

	String VIEW_ORDERS = "SELECT * FROM buryo";
}