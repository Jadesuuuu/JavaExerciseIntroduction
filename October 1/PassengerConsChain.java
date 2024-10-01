package JavaProgAct;

public class PassengerConsChain {
	public String name;
	public char gender;
	public String nationality;
	public String dateOfBirth;
	public long pwdIDNumber;
	
	public PassengerConsChain(String name, char gender, String nationality, String dateOfBirth, long pwdIDNumber) {
		this(name, gender, nationality, dateOfBirth);
		this.pwdIDNumber = pwdIDNumber;
	}
	
	public PassengerConsChain() {
		this("Jada Mae Angela Bonifacio", 'F', "Filipino", "July 24, 2002", 1234567890L);	
	}
	
	public PassengerConsChain(String name, char gender, String nationality, String dateOfBirth) {
		this.name = name;
		this.gender = gender;
		this.nationality = nationality;
		this.dateOfBirth = dateOfBirth;
	}
	
	public String toString() {
		
		return pwdIDNumber == 0 ? "Name: " + name + 
				"\nGender: " + gender + 
				"\nNationality: " + nationality + 
				"\nDate of Birth: " + dateOfBirth : 
					"Name: " + name + 
					"\nGender: " + gender + 
					"\nNationality: " + nationality + 
					"\nDate of Birth: " + dateOfBirth + 
					"\nPWD ID Number: " + pwdIDNumber;
	}
	
	
	public static void main(String[] args) {
		
		PassengerConsChain passenger = new PassengerConsChain("Jade Mark Angelo Bonifacio", 'M', "Filipino", "July 24, 2002");
		System.out.println(passenger.toString());
		System.out.println();
		passenger = new PassengerConsChain("Jada Mae Angela Bonifacio", 'F', "Filipino", "July 24, 2002", 1234567890L);
		System.out.println(passenger.toString());
		
	}
}

