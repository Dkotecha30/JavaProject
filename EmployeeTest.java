public class EmployeeTest{
	
	
	public void display(Employee emp){
		System.out.println("The yearly salary of " + emp.getFirstName() + " " + emp.getLastName() + " is: \t" + emp.getSalary()*12);
	}
	

	public void setRaise(Employee emp){
		emp.setSalary(emp.getSalary()*1.1);
	}
	public static void main(String[] args) {
		Employee employee1=new Employee("Archangel", "Macsika",1000);
		Employee employee2=new Employee("Nsikak", "Imoh",2000);
		EmployeeTest emptest=new EmployeeTest();
		emptest.display(employee1);
		emptest.display(employee2);
		emptest.setRaise(employee1);
		emptest.setRaise(employee2);
		emptest.display(employee1);
		emptest.display(employee2);
		
	}
}