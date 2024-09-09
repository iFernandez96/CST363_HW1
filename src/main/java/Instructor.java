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
	public Instructor() {
	}

	public Instructor(int ID, String name, String dept_name, int salary) {
		this.ID = ID;
		this.name = name;
		this.dept_name = dept_name;
		this.salary = salary;
	}


	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		if (!super.equals(object)) {
			return false;
		}
		Instructor that = (Instructor) object;
		return getID() == that.getID();
	}

	public int hashCode() {
		return Objects.hash(super.hashCode(), getID());
	}

	@Override
	public String toString() {
		return "Instructor{" +
				"ID=" + ID +
				", name='" + name + '\'' +
				", dept_name='" + dept_name + '\'' +
				", salary=" + salary +
				'}';
	}
}
