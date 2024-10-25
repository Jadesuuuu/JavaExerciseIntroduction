package dungeonsAndDragons;

public class Archer extends DnDCharacter {

	protected Archer(String characterName) {
		super(characterName," sharply shoots ", 100, 20);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack(DnDCharacter opponent) {
	        opponent.receiveDamage(this.damage);
	}

	@Override
	public void receiveDamage(int damage) {
		this.health -= damage;
	    if (this.health < 0) {
	    	this.health = 0;
	    	}
	}

	@Override
	public void restoreHealth(int restore) {
		this.health += restore;
		// cannot heal if already defeated
		if(this.health < 0) {
			this.health = 0;
		}
	}

	@Override
	public void buffAbility(int buff) {
		this.damage += buff;
	}
}