package PokemonGame;

public class Venusaur extends Pokemon {

	public Venusaur() {
		super("Venusaur", "Grass", 180);
		this.setAttackList(super.getInformation().getAttack("Sludge Bomb"));
		this.setAttackList(super.getInformation().getAttack("Petal Dance"));
		this.setAttackList(super.getInformation().getAttack("Vine Whip"));
		this.setAttackList(super.getInformation().getAttack("Cut"));
		
	}


	@Override
	public void speak() {
		System.out.println("VENUSAURRRRR");

	}

}
