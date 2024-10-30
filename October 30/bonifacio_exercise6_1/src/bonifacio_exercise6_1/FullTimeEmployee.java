package bonifacio_exercise6_1;

public class FullTimeEmployee extends Employee{
	private double monthlySalary;

	public FullTimeEmployee(String name, int employeeId, int hourlyRate, double monthlySalary) {
		super(name, employeeId, 0);
		this.monthlySalary = monthlySalary;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculatePay() {
		return monthlySalary;
	}

}
