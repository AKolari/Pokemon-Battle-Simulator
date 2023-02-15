package PokemonGame;

public class Charmander extends EvolvingPokemon {
	

	public Charmander(String name, String type, int hp, int evCost, String evTarget) {
		super("Charmander", "Fire", 90, 100, "Charmeleon");
		
		this.setAttackList(super.getInformation().getAttack("Ember"));
		this.setAttackList(super.getInformation().getAttack("Bite"));
		this.setAttackList(super.getInformation().getAttack("Flamethrower"));
		this.setAttackList(super.getInformation().getAttack("Tackle"));
		
	}

	public void speak() {
		System.out.println("CHARRRRRRRRR");
	}

}
