package bonifacio_exercise6_1;

public abstract class Employee {
	String name;
	int employeeId;
	double hourlyRate;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	
	public Employee(String name, int employeeId, double hourlyRate) {
		this.name = name;
		this.employeeId = employeeId;
		this.hourlyRate = hourlyRate;
	}
	
	public abstract double calculatePay();
	
}
