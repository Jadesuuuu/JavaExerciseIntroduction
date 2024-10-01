package JavaProgAct;

import java.util.Arrays;

public class Passenger {
	public String name;
	public char gender;
	public String nationality;
	public String dateOfBirth;
	public String[] passport;
	
	public Passenger(String name, char gender, String nationality, String dateOfBirth, String[] passport) {
		
		this.name = name;
		this.gender = gender;
		this.nationality = nationality;
		this.dateOfBirth = dateOfBirth;
		this.passport = passport;
	}
	
	
	public static void main(String[] args) {
		String name = "Jade Bonifacio";
		char gender = 'M';
		String nationality = "Filipino";
		String dateOfBirth = "July 24, 2002";
		String[] passportArray = {name, nationality, dateOfBirth};
		
		Passenger passenger = new Passenger(name, gender, nationality, dateOfBirth, passportArray);
		
		System.out.println(passenger.name);
		System.out.println(passenger.gender);
		System.out.println(passenger.nationality);
		System.out.println(passenger.dateOfBirth);
		System.out.println(Arrays.toString(passenger.passport));
	}
}

