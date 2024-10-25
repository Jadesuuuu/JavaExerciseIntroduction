package dungeonsAndDragons;

public class DnDGame {
	public static void main(String[] args) {
		DnDCharacter swordsman = new Swordsman("Furina");
		DnDCharacter catalyst = new Catalyst("Kokomi");
		DnDCharacter archer = new Archer("Yelan");
		DnDCharacter polearm = new Polearm("Hu Tao");
		
		System.out.println(swordsman.toString("Swordsman"));
		System.out.println("\n" + catalyst.toString("Catalyst"));
		System.out.println("\n" + archer.toString("Archer"));
		System.out.println("\n" + polearm.toString("Polearm"));
		
		battleCharacters(polearm, swordsman);
	}
	
	public static void battleCharacters(DnDCharacter char1, DnDCharacter char2) {
		System.out.println("\n" + char1.characterName + "health: " + char1.health);
		System.out.println(char2.characterName + "health: " + char2.health);
		
		while(char1.isAlive() && char2.isAlive()) {
			char1.attack(char2);
			System.out.println( char1.characterName + char1.attackPattern  + char2.characterName);
			if (char2.isAlive()) {
				char2.attack(char1);
				System.out.println( char2.characterName +  char2.attackPattern + char1.characterName);
			}
			System.out.println("\n" + char1.characterName + " health: " + char1.health);
			System.out.println(char2.characterName + " health: " + char2.health);
		}
		if (char1.isAlive()) {
			System.out.println("\n" + char1.characterName + " wins the game!");
		} else {
			System.out.println("\n" + char2.characterName + " wins the game!");
		}
	}
}
