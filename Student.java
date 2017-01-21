package fixcode;

/**
 * A simple model for a student with name and id.
 * 
 * @author Visurt Anuttivong
 */
public class Student extends Person {
	
	/** the Student's id. */
	private long id;
	
	/**
	 * Initialize a new Student object.
	 * @param name is the name of the student.
	 * @param id is the id of the student
	 */
	public Student(String name, long id) {
		super(name); // name is managed by Person class
		this.id = id;
	}

	/** 
	 *Return a string representation of this Student. 
	 */
	public String toString() {
		return String.format("Student %s (%d)", getName(), id);
	}

	/**
	 * Compare student's by id. 
	 * They are equal if the id matches.
	 * 
	 * @param other is another object to compare to this one.
	 * @return true if the id is same, false otherwise.
	 */
	public boolean equals(Object other) {
		if (other == null) 
			return false;
		
		if (other.getClass() != this.getClass())
	 		return false;
		
		Student stu = (Student) other;
		
		if (this.getID()==stu.getID())
			return true;
		
		return false; 
	}
	
	/*
	 * Get the student's id.
	 * @return id of the student.
	 */
	public long getID(){
		return id;
	}
	
	/*
	 * Set or change the student's id.
	 * @param id is the new id of the student.
	 */
	public void setID(long id){
		this.id = id;
	}
}
