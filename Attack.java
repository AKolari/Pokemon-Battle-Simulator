package PokemonGame;

public class Attack {
	private String attackName;
	private String attackType;
	private int pp;
	private int damage;
	
	
	
	
	
	
	
	public Attack(String name, String type, int p, int damage) {
		attackName=name;
		attackType=type;
		pp=p;
		this.damage=damage;

	}







	public String getAttackName() {
		return attackName;
	}







	public int getDamage() {
		return damage;
	}







	public String getAttackType() {
		return attackType;
	}

}
