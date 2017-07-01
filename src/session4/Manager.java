package session4;

//Manager class Extends Employee parent class.
public class Manager extends Employee {
    double travel_allowance;
	public Manager(double basicsalary, String name, int Empno) {
		super(basicsalary, name, Empno);
		//calculate travel allowance which is 15% of Basic for Managers
		travel_allowance = (0.15 * basicsalary);
	}
	
	public void ManagerDetails(){
		System.out.println("---------Details of Manager------------- ");
		System.out.println("Emp No is "+Empno);
		System.out.println("Name is "+name);
		System.out.println("Basic Salary is "+basicsalary);
		System.out.println("Travel Allowance is 15% of Basic Salary "+travel_allowance);
	}

}
