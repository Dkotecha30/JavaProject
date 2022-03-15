public class Employee {

	private String firstName;
	private String lastName;
	private double salary = 0;
	
	public Employee() {
	}

	
	public Employee(String first, String last, double salary) {
		this.firstName = first;
		this.lastName = last;
		this.salary = salary;
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


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}

}
