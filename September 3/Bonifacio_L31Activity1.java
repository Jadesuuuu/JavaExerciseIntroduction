package biography;

public class Bonifacio_L31Activity1 {
	public static void main(String[] args) {
		
		String name = "Jade Mark Angelo Bonifacio";
		int age = 22;
		String country = "Philippines";
		String sport = "Track & Field";
		double hours = 2.3;
		String game = "Valorant";
		String subject = "Math and Recess";
		int grade = 99;
		
		System.out.print(printParagraph(name, age, country, sport, hours, game, subject, grade));
	}
	
	public static String printParagraph(String name, int age, String country, String sport, double hours, String game, String subject, int grade) {
		
		String paragraph = "My name is " + name + ". I'm " + age + " years old and from " + country + ". \n"
				+ "My favorite sport is " + sport + ". I play for " + hours + " hour(s) a day. \n"
						+ "I like to play " + game + " when I'm tired. \n"
								+ "In school, my favorite subject was " + subject + " I scored a " + grade + ".";
		return paragraph;
	}
}
