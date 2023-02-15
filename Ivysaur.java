package PokemonGame;

public class Ivysaur extends EvolvingPokemon {




public Ivysaur() {
	super("Ivysaur", "Grass", 120, 100, "Venusaur");
	super.setAttackList(super.getInformation().getAttack("Poison Sting"));
	super.setAttackList(super.getInformation().getAttack("Razor Leaf"));
	super.setAttackList(super.getInformation().getAttack("Vine Whip"));
	super.setAttackList(super.getInformation().getAttack("Tackle"));
}


	
	
	
	
	public void speak() {
		System.out.println("IVYSAURRRRRRR");

	}
}
