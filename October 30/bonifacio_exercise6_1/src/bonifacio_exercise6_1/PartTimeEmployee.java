package bonifacio_exercise6_1;

public class PartTimeEmployee extends Employee {
	private int hoursWorked;

	public PartTimeEmployee(String name, int employeeId, double hourlyRate, int hoursWorked) {
		super(name, employeeId, hourlyRate);
		this.hoursWorked = hoursWorked;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculatePay() {
		return hourlyRate * hoursWorked;
	}
	
}
