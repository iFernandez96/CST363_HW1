import java.util.Objects;

/**
 * Represents a row in an Instructor Table
 *   ID is the primary key value
 *
 */
public class Instructor {
	
	private int ID;
	private String name;
	private String dept_name;
	private int salary;

	public Instructor(int ID, String name, String dept_name, int salary) {
		this.ID = ID;
		this.name = name;
		this.dept_name = dept_name;
		this.salary = salary;
	}


	// TODO 
	
	/* 
	 * use generate function to
	 *    generate constructor using fields
	 *    generate getter/setters
	 *    generate toString 
	 *    generate equals
	 */

}
