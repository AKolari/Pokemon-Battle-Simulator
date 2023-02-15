package PokemonGame;

public class Bulbasaur extends EvolvingPokemon {
	



	public Bulbasaur() {
		super("Bulbasaur", "Grass", 90, 100, "Venusaur");
		
		
		
		this.setAttackList(super.getInformation().getAttack("Poison Sting"));
		this.setAttackList(super.getInformation().getAttack("Razor Leaf"));
		this.setAttackList(super.getInformation().getAttack("Vine Whip"));
		this.setAttackList(super.getInformation().getAttack("Tackle"));
		
		
		
	}

	
		
		
		
		
		public void speak() {
			System.out.println("BULBA BULBA");

		}
	}