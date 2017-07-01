package session4;

public class Assignment4 {

	public static void main(String[] args) {
		//create Manager object 
		Manager manager = new Manager(10000, "Sudhir", 111);
		
		//create Trainee object
		Trainee trainee = new Trainee(1000,"Ram",888);
		
		//Display Manager details
		manager.ManagerDetails();
		
		//Display trainee details
		trainee.TraineeDetails();

	}

}
