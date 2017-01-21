package fixcode;

/**
 * A simple model for a person with a name.
 * 
 * @author Visurt Anuttivong
 */
public class Person {
	/** the person's name. */
	public String name;

	/**
	 * Initialize a new Person object.
	 * @param name is the name of the person
	 */
	public Person(String name) {
		this.name = name;
	}

	/*
	 * Get the person's name.
	 * @return name of the person
	 */
	public String getName() {
		return name;
	}

	/*
	 * Set or change the person's name.
	 * @param newname is the new name of the person.
	 */
	public void setname(String newname) {
		this.name = newname;
	}

	/**
	 * Compare person's by name. 
	 * They are equal if the name matches.
	 * 
	 * @param other is another object to compare to this one.
	 * @return true if the name is same, false otherwise.
	 */
	public boolean equals(Object other) {
		if(other == null) 
			return false;
		
		if( other.getClass() != this.getClass() )
			return false;
		
		Person per = (Person) other;
		
		if(this.getName().equals(per.getName()))
			return true;
		
		return false; 
	}

	/**
	 * Get a string representation of this Person.
	 */
	public String toString() {
		return "Person " + name;
	}
}
