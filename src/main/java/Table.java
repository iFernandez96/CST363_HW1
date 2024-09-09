
import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashMap;

/**
 * Represents a table contains rows of Instructor
 *
 */
public class Table implements Iterable<Instructor> {
	
	private ArrayList<Instructor> instructors = new ArrayList<>();
	private HashMap<Integer, Instructor> instructors_map = new HashMap<>();
	/**
	 * Add an instructor object to the table.
	 * If the ID of the instructor already exists in the table, then 
	 * do not add and return false.  Otherwise add the instructor object
	 * and return true.
	 * @param add object to be added to table
	 * @return whether or not the instructor object was successfully added
	 */
	public boolean insert(Instructor add) {
		if (instructors_map.containsKey(add.getID())) {
			return false;
		}
		instructors_map.put(add.getID(), add);
		instructors.add(add);
		return true;

	}
	
	/**
	 * Remove the instructor object with ID value
	 * from the table.  Return false if no such object
	 * exists, other return true.
	 * @param ID the ID of the instructor to lok up
	 */
	public boolean delete(int ID) {
		if (!instructors_map.containsKey(ID)) {
			return false;
		}
		instructors.remove(instructors_map.get(ID));
		instructors_map.remove(ID);
		return true;
	}
	
	/**
	 * Return the Instructor object with the value ID,
	 * Return null if no such object exists in the table
	 * @param ID the ID of the instructor to lok up
	 */
	public Instructor lookup(int ID) {
		if (!instructors_map.containsKey(ID)) {
			return null;
		}
		return instructors_map.get(ID);
	}
	
	/**
	 * Return a Table of Instructor objects filtered by the 
	 * predicate  attrName = value 
	 * @param attrName can be ID, name, dept_name or salary
	 * @param value value of data type int or String
	 * @return a table containing the objects associated with the query (0, 1, or many)
	 */
	public Table eval(String attrName, Object value) {
		Table evaluated_table = new Table();
		switch(attrName) {
			case "ID":
				for (Instructor inst : instructors) {
					if (inst.getID() == (int)value) {
						evaluated_table.instructors.add(inst);
					}
				}
				break;
			case "name":
				for (Instructor inst : instructors) {
					if (inst.getName().equals(value)) {
						evaluated_table.instructors.add(inst);
					}
				}
				break;
			case "dept_name":
				for (Instructor inst : instructors) {
					if (inst.getDept_name().equals(value)) {
						evaluated_table.instructors.add(inst);
					}
				}
				break;
			case "salary":
				for (Instructor inst : instructors) {
					if (inst.getSalary() == (int)value) {
						evaluated_table.instructors.add(inst);
					}
				}
				break;
		}
		return evaluated_table;
	}
	
	public Iterator<Instructor> iterator() {
		return instructors.iterator();
	}
	
	public String toString() {
		if (instructors.isEmpty()) {
			return "Empty Table";
		} else {
			StringBuilder sb = new StringBuilder();
			for (Instructor t : this) {
				sb.append(t.toString());
				sb.append("\n");
			}
			return sb.toString();
		}
	}

}
