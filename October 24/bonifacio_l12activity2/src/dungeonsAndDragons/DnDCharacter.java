package dungeonsAndDragons;

public abstract class DnDCharacter {
	public String characterName;
	public String attackPattern;
	public int health;
    public int damage;

    public DnDCharacter(String characterName, String attackPattern, int health, int damage) {
        this.characterName = characterName;
        this.attackPattern = attackPattern;
        this.health = health;
        this.damage = damage;
    }
    public String getAttackPattern() {
		return attackPattern;
	}

	public void setAttackPattern(String attackPattern) {
		this.attackPattern = attackPattern;
	}

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public abstract void attack(DnDCharacter opponent);

    public abstract void receiveDamage(int damage);
    
    public abstract void restoreHealth(int restore);
    
    public abstract void buffAbility(int buff);

    public String toString(String weapon) {
        return weapon + "'s profile: " + "\nCharacter Name: " + characterName + "   Health: " + health + "   Damage: " + damage;
    }

    public boolean isAlive() {
        return health > 0;
    }
    
}
