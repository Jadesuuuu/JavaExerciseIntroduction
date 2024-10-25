package dungeonsAndDragons;

import java.util.Random;

public class DnDGame {
	public static void main(String[] args) {
		DnDCharacter swordsman = new Swordsman("Furina");
		DnDCharacter catalyst = new Catalyst("Kokomi");
		DnDCharacter archer = new Archer("Yelan");
		DnDCharacter polearm = new Polearm("Hu Tao");
		
		System.out.println("---------------Choose your fighter!---------------");
		
		System.out.println(swordsman.toString("Swordsman"));
		System.out.println("\n" + catalyst.toString("Catalyst"));
		System.out.println("\n" + archer.toString("Archer"));
		System.out.println("\n" + polearm.toString("Polearm"));
		System.out.println();
		System.out.println("---------------BATTLE START---------------");
		System.out.println();
		
		battleCharacters(archer, swordsman);
	}
	
	public static void battleCharacters(DnDCharacter char1, DnDCharacter char2) {
		int phaseCounter = 1;
		
		while(char1.isAlive() && char2.isAlive()) {
			System.out.println("-----------------PHASE " + phaseCounter++ + "-----------------");
			if (getRandomBoolean()) {
				int buffDamage = getRandomInt();
				System.out.println(char1.characterName + " earned buff damage of " + buffDamage);
				char1.buffAbility(buffDamage);
			}
			if (getRandomBoolean()) {
				int buffHealth = getRandomInt();
				System.out.println(char1.characterName + " gained health of " + buffHealth);
				char1.restoreHealth(buffHealth);
			}
			System.out.println(char1.characterName + "'s total health: " + char1.health + ", total damage: " + char1.damage);
			if (getRandomBoolean()) {
				char1.attack(char2);
				System.out.println( char1.characterName + char1.attackPattern  + char2.characterName);
			} else {
				System.out.println(char1.characterName + " tried to attack but missed.");
			}
			if (char2.isAlive()) {
				if (getRandomBoolean()) {
					int buffDamage = getRandomInt();
					System.out.println(char2.characterName + " earned buff damage of " + buffDamage);
					char2.buffAbility(buffDamage);
				}
				if (getRandomBoolean()) {
					int buffHealth = getRandomInt();
					System.out.println(char2.characterName + " gained health of " + buffHealth);
					char2.restoreHealth(buffHealth);
				}
				System.out.println(char2.characterName + "'s total health: " + char2.health + ", total damage: " + char2.damage);
				if (getRandomBoolean()) {
					char2.attack(char1);
					System.out.println( char2.characterName +  char2.attackPattern + char1.characterName);
				} else {
					System.out.println(char2.characterName + " tried to attacked but missed.");
				}
			}
			System.out.println("\n" + char1.characterName + " health: " + char1.health);
			System.out.println(char2.characterName + " health: " + char2.health);
		}
		if (char1.isAlive()) {
			System.out.println("\n" + char1.characterName.toUpperCase() + " WINS THE GAME!");
		} else {
			System.out.println("\n" + char2.characterName.toUpperCase() + " WINS THE GAME!");
		}
	}
	
	public static boolean getRandomBoolean() {
		Random random = new Random();
		return random.nextBoolean();
	}
	
	public static int getRandomInt() {
		int maxInt = 10; //max heal and damage buff
		int minInt = 2; // min heal and damage buff
		Random random = new Random();
		return random.nextInt(maxInt - minInt + 1) + minInt;
	}
}
