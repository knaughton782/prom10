package weekTen;

public class Notes {

	public static void main(String[] args) {
	/*
	 * Views
	 * 		access to some data but not all,
	 * 		like a virtual table
	 * 		result set: complex query results and then query that view
	 * 		CREATE VIEW [viewname] AS [query]	
	 * 
	 * 
	 * Index
	 * 		can't see them or interact with them
	 * 		identify columns that are used in where statements more frequently
	 * 		speeds up queries on those columns
	 * 		not the best answer for write intensive db's
	 * 		CREATE INDEX [indexname] on table_name(column1, column2,....);
	 * 
	 * Stored Procedures
	 * 		similar to a function or method to redo complex or often used tasks
	 * 		semi colons can cause an issue
	 * 		tell mysql to NOT use the semicolon as the delimiter by DELIMITER // (pick whatever the end is, the // is example)
	 * 		CREATE PROCEDURE procname() query-info
	 * 		then return delimiter
	 * 		call procedure
	 * 		drop procedure to redo
	 * 		a way to write code in SQL
	 * 
	 * 
	 * A construct is a building block. Its just a concept.
	 * 
	 * Checks
	 * 		constraints to validate data
	 * 		mysql allows it but doesn't enforce it
	 * 
	 * Trigger
	 * 		alternative to check
	 * 		
	 * Set up connection from Java to DB
	 * 		have to have a driver, can't just connect
	 * 		JDBC driver goes in class path
	 * 		
	 * List is in interface (contract) and ArrayList is the class that implements the List interface;
	 * 
	 * 
	 * 		
	 * 		
	 */
		

	}

}
