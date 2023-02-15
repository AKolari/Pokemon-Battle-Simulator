package PokemonGame;
import java.util.HashMap;
import java.util.Collections;
import java.util.Random;

public abstract class Player {
	private Pokemon mon;
	private HashMap<String, Pokemon> PokeMap= new HashMap<>();
	private HashMap<String, Pokemon> PokeDex= new HashMap<>();
	private Object[] keyList;
	
	

	public Player() {
		//Add Pokemon
		PokeMap.put("Venusaur", new Venusaur());
		PokeDex.put("Venusaur", new Venusaur());
		
		PokeMap.put("Ivysaur", new Ivysaur());
		PokeDex.put("Ivysaur", new Ivysaur());
		
		PokeMap.put("Bulbasaur", new Bulbasaur());
		PokeDex.put("Bulbasaur", new Bulbasaur());
		
		
		
		keyList=PokeMap.keySet().toArray();
		
	}

	
	
	public Pokemon getMon() {
		return mon;
	}
	


	public void setMon(Pokemon mon) {
		this.mon = mon;
	}
	
	public Pokemon getMonFromMap(String name) {
		return PokeMap.get(name);
	}
	
	public Pokemon getMonFromDex(String name) {
		return PokeDex.get(name);
	}
	
	
	
	public Pokemon randMon() {
		Object key = keyList[new Random().nextInt(keyList.length)];
		return PokeMap.get(key);
	}
	
	public void printPokemon() {
		
		for (int i=0; i<keyList.length; i++) {
			System.out.println(keyList[i]);
		}
	
		
	
	}
	
	public void resetMon() {
		getMon().setHp(getMonFromDex(getMon().getName()).getHp());
		
		
	}

	
	public abstract void chooseMon();
	public abstract void chooseAttack(Pokemon other );
	public abstract void run();
	
	
	

}
