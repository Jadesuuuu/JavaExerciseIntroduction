package dungeonsAndDragons;

public class Catalyst extends DnDCharacter {

	protected Catalyst(String characterName) {
		super(characterName, " tightly binds ", 100, 15);
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

}
