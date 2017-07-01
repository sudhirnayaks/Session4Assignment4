package session4;

//Trainee class Extends Employee parent class.
public class Trainee extends Employee {
    double travel_allowance;
	public Trainee(double basicsalary, String name, int Empno) {
		super(basicsalary, name, Empno);
		//calculate travel allowance which is 10% of Basic for Trainee
		travel_allowance = (0.10*basicsalary);
		
	}
	
	public void TraineeDetails(){
		System.out.println("---------Details of Trainee------------- ");
		System.out.println("Emp No is "+Empno);
		System.out.println("Name is "+name);
		System.out.println("Basic Salary is "+basicsalary);
		System.out.println("Travel Allowance is 10% of Basic Salary "+travel_allowance);
	}
	
	
}
