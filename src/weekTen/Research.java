package weekTen;

public class Research {
	/*
	 * Research MySQL Stored Procedures and write about at least 5 constructs that can be utilized in stored procedures 
	 * and give examples of how you would use them. (i.e. loops, conditionals, parameters, etc...)
	 * 		
	 * 
	 * 1) if/else: creates the basic conditional statement and returns results based on those conditionals. This might look
	 * 		something like:
	 *			IF hire_date > 2000-01-01 
	 *			THEN UPDATE employee_info SET .....(probably I'd add a column for new employees vs seasoned
	 *												and keep them updated this way;
			ELSE UPDATE employee_info SET.... different timeframe category;
			END IF;
	 * 
	 * 2) case: A case is useful when you are checking one condition against a variety options. 

		CASE  case_expression
		   WHEN when_expression_1 THEN commands
		   WHEN when_expression_2 THEN commands
		   ...
		   ELSE commands
		END CASE;
	 * 
	 * 3) loop: execute a block of SQL code repeatedly based on a condition. While and repeat are a couple of the loop types. 
	 * While Loop:
	 * 			  
	 *  WHILE expression DO
			statements
		END WHILE
		******************************
		
		Repeat Loop:
		REPEAT
 			statements;
			UNTIL expression
		END REPEAT
		*****************************		   
				   
				   
	 * 
	 * 4) parameters: the addition of a parameter to a function or query can provide specific information, for example per customer
	 * 		or report type.  
	 * 
	 * Example of passing in a parameter when creating the stored procedure:
	 * DELIMITER //
		CREATE PROCEDURE GetOfficeByCountry(IN countryName VARCHAR(255)) ****(IN indicates the type of parameter,
 		BEGIN																	countryName is the column name of the
 		SELECT * 																parameter being passed in and then there is
 		FROM offices															the type and size allowed for the data)********
 		WHERE country = countryName;
 		END //
	   DELIMITER ;
	 * 
	 * 5) functions: while stored procs and functions have things in common, including many of their constructs, 
	 * 		a stored proc can also execute a function. 
	 * CREATE PROCEDURE simpleproc (OUT param1 INT)
    -> 		BEGIN
    ->   	SELECT COUNT(*) INTO param1 FROM t;    *******(this shows the built-in count function being used in the stored proc)******
    -> END//
	 * 
	 */

}
