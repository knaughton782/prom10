package weekTen;

public class Coding_StoredProc {
	//THIS WEEK'S WORK STILL IN PROCESS 
	
	/*
	 * Write 5 stored procedures for the employees database. Write a description of what each stored procedure does 
	 * and how to use it. Procedures should use constructs you learned about from your research assignment and be 
	 * more than just queries.
	 * 
	 * 	1) delimiter //

			create procedure updateEmployees(
			IN emp_no int(11),
			IN bday DATE, 
			IN fname varchar(14), 
			IN lname varchar(16), 
			IN gender enum("M","F"), 
			IN hiredate DATE)
			BEGIN
				if EXISTS (select 1 from employees where fname = first_name && lname = last_name) THEN 
				select "Employee exists!";
				ELSE
				insert into employees(emp_no, birth_date, first_name, last_name, gender, hire_date)
				VALUES
				(emp_no, bday, fname, lname, gender, hiredate);
				end if;
				
				
			END //
			delimiter ; //
	 * 
	 * 		//I could not get this to work, but this is the essence
	 * 			of how I could use an if statement to add check for/add a new name to the employees table.
	 * 
	 * 	2)
	 * 	3)
	 * 	4)
	 * 	5)
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 *
	 * 
	 */
	

}
