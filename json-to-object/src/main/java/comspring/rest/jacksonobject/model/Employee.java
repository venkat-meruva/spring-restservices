package comspring.rest.jacksonobject.model;

import java.util.Date;

/**
 * Model class for Student
 * 
 * @author Venkat
 *
 */
public class Employee {
	private Integer id;
	private String firstName;
	private String lastName;

	public Employee() {
		super();
	}

	public Employee(Integer id, String firstName, String lastName, Date birthDate) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}
