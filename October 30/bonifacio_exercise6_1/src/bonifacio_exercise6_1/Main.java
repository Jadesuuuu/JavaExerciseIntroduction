package bonifacio_exercise6_1;

public class Main {
	public static void main(String[] args) {
		FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Alice", 123, 5000, 2000);
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Bob", 456, 15.0, 20);
        Contractor contractor = new Contractor("Charlie", 789, 20.0, 40);

        // Calculate and print pay for each employee
        System.out.println("Full-time employee pay: " + fullTimeEmployee.calculatePay());
        System.out.println("Part-time employee pay: " + partTimeEmployee.calculatePay());
        System.out.println("Contractor pay: " + contractor.calculatePay());
	}
}
