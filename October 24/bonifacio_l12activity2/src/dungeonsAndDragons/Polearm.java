package dungeonsAndDragons;

public class Polearm extends DnDCharacter {

	protected Polearm(String characterName) {
		super(characterName, " precisely strikes ", 80, 35);
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
		super.restoreHealth(restore);
	}

	@Override
	public void buffAbility(int buff) {
		super.buffAbility(buff);
	}

}
