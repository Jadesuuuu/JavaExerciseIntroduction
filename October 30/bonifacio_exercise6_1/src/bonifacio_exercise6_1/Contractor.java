package bonifacio_exercise6_1;

public class Contractor extends Employee {
	private int hoursWorked;
	
	public Contractor(String name, int employeeId, double hourlyRate, int hoursWorked) {
		super(name, employeeId, hourlyRate);
		this.hoursWorked = hoursWorked;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculatePay() {
		// TODO Auto-generated method stub
		return hoursWorked * hourlyRate;
	}
	
}
