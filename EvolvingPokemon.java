package PokemonGame;

public abstract class EvolvingPokemon extends Pokemon {
	private int xp;
	private int evCost;
	private String evTarget;

	public EvolvingPokemon(String name, String type, int hp, int evCost, String evTarget) {
		super(name, type, hp);
		this.xp=0;
		this.evCost=evCost;
		this.evTarget=evTarget;
	}

	

	
	public abstract void speak();

	public int getXp() {
		return xp;
	}

	public void setXp(int xp) {
		this.xp = xp;
	}

	public int getEvCost() {
		return evCost;
	}

	public String getEvTarget() {
		return evTarget;
	}
	
	
	

		
	
	


}
