package PokemonGame;

public class Charmeleon extends EvolvingPokemon {

	public Charmeleon() {
	super("Charmander", "Fire", 90, 100, "Charmeleon");
		
		this.setAttackList(super.getInformation().getAttack("Ember"));
		this.setAttackList(super.getInformation().getAttack("Bite"));
		this.setAttackList(super.getInformation().getAttack("Flamethrower"));
		this.setAttackList(super.getInformation().getAttack("Tackle"));
		
	}

	@Override
	public void speak() {
		System.out.println("CHARMELEON");
		
	}

}
