
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Represents a table contains rows of Instructor
 *
 */
public class Table implements Iterable<Instructor> {
	
	private ArrayList<Instructor> instructors = new ArrayList<>();
	
	/**
	 * Add an instructor object to the table.
	 * If the ID of the instructor already exists in the table, then 
	 * do not add and return false.  Otherwise add the instructor object
	 * and return true.
	 * @param add object to be added to table
	 * @return whether or not the instructor object was successfully added
	 */
	public boolean insert(Instructor add) {
		// TO DO complete this method
		throw new  UnsupportedOperationException();
	}
	
	/**
	 * Remove the instructor object with ID value
	 * from the table.  Return false if no such object
	 * exists, other return true.
	 * @param ID the ID of the instructor to lok up
	 */
	public boolean delete(int ID) {
		// TO DO complete this method
		throw new UnsupportedOperationException();
	}
	
	/**
	 * Return the Instructor object with the value ID,
	 * Return null if no such object exists in the table
	 * @param ID the ID of the instructor to lok up
	 */
	public Instructor lookup(int ID) {
		// TO DO complete this method
		throw new UnsupportedOperationException();
	}
	
	/**
	 * Return a Table of Instructor objects filtered by the 
	 * predicate  attrName = value 
	 * @param attrName can beID, name, dept_name or salary
	 * @param value value of data type int or String
	 * @return a table containing the objects associated with the query (0, 1, or many)
	 */
	public Table eval(String attrName, Object value) {
		// TO DO complete this method
		throw new UnsupportedOperationException();
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
