package PokemonGame;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Scanner;
public class Data {

	
	private HashMap<String, ArrayList<ArrayList<String>>> typeChart= new HashMap<>();
	private HashMap<String, Attack> AttackMap= new HashMap<>();
	
	
	private Scanner input;
	private String typeName;
	private String next;
	
	

	public Data() {
		
		try {
			input = new Scanner(new File("/Users/andi/eclipse-workspace/Pokemanz/src/PokemonGame/typeData.txt"));
		} catch(Exception e) {
			System.out.println("Reading the file has failed. Armogeddon is upon you!");
			input = new Scanner(System.in);
		}
		
		
		//While loop that reads each correct answer from answers.txt and adds that data to an ArrayList where each item is a correct answer
		while(input.hasNext()) {
			next=input.next();
			if(next.compareTo("X")==0) {
				typeName=input.next();
				
				typeChart.put(typeName, new ArrayList<ArrayList<String>>());
				typeChart.get(typeName).add(new ArrayList<String>());
				typeChart.get(typeName).add(new ArrayList<String>());
				typeChart.get(typeName).add(new ArrayList<String>());
			}
			else {
				
				if(next.compareTo("SE")==0) {
					typeChart.get(typeName).get(0).add(input.next());
			
				}
				if(next.compareTo("NV")==0) {
					typeChart.get(typeName).get(1).add(input.next());
			
				}
				if(next.compareTo("NE")==0) {
					typeChart.get(typeName).get(2).add(input.next());
					
				}
				
				
				
			}
			
		
		}
		input.close();
		
		
		
		
		
		//CHECK FOR TYPOS YOU IDIOT
		
		//Normal
		AttackMap.put("Tackle", new Attack("Tackle", "Normal", 15, 20));
		AttackMap.put("Body Slam", new Attack("Body Slam", "Normal", 5, 60));
		AttackMap.put("Cut", new Attack("Cut", "Normal", 10, 35));
		AttackMap.put("Double Slap", new Attack("Double Slap", "Normal", 10, 30));
		AttackMap.put("Guillotine", new Attack("Guillotine", "Normal", 5, 60));
		AttackMap.put("Bite", new Attack("Bite", "Normal", 15, 25));
		//Water
		AttackMap.put("Bubble Beam", new Attack("Bubble Beam", "Water", 10, 30));
		AttackMap.put("Surf", new Attack("Surf", "Water", 5, 50));
		AttackMap.put("Water Gun", new Attack("Water Gun", "Water", 10, 25));
		AttackMap.put("Hydro Pump", new Attack("Hydro Pump", "Water", 5, 65));
		//Ice
		AttackMap.put("Ice Beam", new Attack("Ice Beam", "Ice", 10, 40));
		AttackMap.put("Blizzard", new Attack("Blizzard", "Ice", 5, 65));
		AttackMap.put("Aurora Beam", new Attack("Aurora Beam", "Ice", 10, 35));
		//Poison
		AttackMap.put("Acid", new Attack("Acid", "Poison", 10, 40));
		AttackMap.put("Poison Sting", new Attack("Poison Sting", "Poison", 20, 20));
		AttackMap.put("Sludge Bomb", new Attack("Sludge Bomb", "Poison", 5, 45));
		//Grass
		AttackMap.put("Razor Leaf", new Attack("Razor Leaf", "Grass", 10, 35));
		AttackMap.put("Vine Whip", new Attack("Vine Whip", "Grass", 10, 30));
		AttackMap.put("Solar Beam", new Attack("Solar Beam", "Grass", 5, 60));
		AttackMap.put("Petal Dance", new Attack("Petal Dance", "Grass", 5, 70));
		
		//Fire
		AttackMap.put("Fire Blast", new Attack("Fire Blast", "Fire", 5, 75));
		AttackMap.put("Flamethrower", new Attack("Flamethrower", "Fire", 10, 35));
		AttackMap.put("Ember", new Attack("Ember", "Fire", 20, 10));
		AttackMap.put("Fire Spin", new Attack("Fire Spin", "Fire", 15, 30));
		
		//Electric
		AttackMap.put("Thunder Shock", new Attack("Thunder Shock", "Electric", 20, 20));
		AttackMap.put("Thunderbolt", new Attack("Thunderbolt", "Electric", 10, 40));
		AttackMap.put("Thunder", new Attack("Thunder", "Electric", 5, 80));
		AttackMap.put("Thunder Punch", new Attack("Thunder Punch", "Electric", 15, 30));
	
		//Rock
		AttackMap.put("Rock Slide", new Attack("Rock Slide", "Rock", 5, 45));
		AttackMap.put("Rock Throw", new Attack("Rock Throw", "Rock", 15, 25));
		
		//Ground
		AttackMap.put("Bonemerang", new Attack("Bonemerang", "Ground", 20, 20));
		AttackMap.put("Bone Club", new Attack("Bone Club", "Ground", 10, 45));
		AttackMap.put("Earthquake", new Attack("Earthquake", "Ground", 5, 100));
		
		//Flying
		AttackMap.put("Drill Peck", new Attack("Drill Peck", "Flying", 10, 35));
		AttackMap.put("Gust", new Attack("Gust", "Flying", 5, 55));
		
		//Ghost
		AttackMap.put("Lick", new Attack("Lick", "Ghost", 10, 30));
		
		//Psychic
		AttackMap.put("Confusion", new Attack("Confusion", "Psychic", 10, 30));
		AttackMap.put("Dream Eater", new Attack("Dream Eater", "Psychic", 5, 65));
		
		//Fighting
		AttackMap.put("Double Kick", new Attack("Double Kick", "Fighting", 10, 30));
		AttackMap.put("High Jump Kick", new Attack("High Jump Kick", "Fighting", 5, 90));
		AttackMap.put("Karate Chop", new Attack("Karate Chop", "Fighting", 15, 20));
		
		//Bug
		AttackMap.put("Pin Missle", new Attack("Pin Missle", "Bug", 20, 25));
		AttackMap.put("Twinnedle", new Attack("Twinnedle", "Bug", 15, 35));
		
		//Dragon
		AttackMap.put("Dragon Rage", new Attack("Dragon Rage", "Dragon", 10, 40));
		
		
		//Special
		AttackMap.put("Morb", new Attack("Morb", "Normal", 1, 350));
	
	
		
		
		
		
		
		
		
		
		//Add Pokemon
		//PokeMap.put("Venusaur", new Venusaur());
		//PoleMap.put("Ivysaur", new Ivysaur());
		//PokeMap.put("Bulbasaur", new Bulbasaur());
		
		//keyList=PokeMap.keySet().toArray();
		
	
		
		
	}	
	
	
	/*
	public Pokemon randMon() {
		Object key = keyList[new Random().nextInt(keyList.length)];
		return PokeMap.get(key);
		
	}
	
	public void printPokemon() {
		
		for (int i=0; i<keyList.length; i++) {
			System.out.println(keyList[i]);
		}
	
	
	}
	*/
	
	
	public void test() {
		
		for(Map.Entry<String, ArrayList<ArrayList<String>>> entry : typeChart.entrySet()) {
			String x=entry.getKey();
			System.out.println("\nBASE TYPE: "+x);
			System.out.println("\nSUPER EFFECTIVE:");
				for(int j=0; j<entry.getValue().get(0).size(); j++) {
					System.out.println("\n"+entry.getValue().get(0).get(j));
				}
				System.out.println("\nNOT VERY EFFECTIVE:");
				for(int j=0; j<entry.getValue().get(1).size(); j++) {
					System.out.println("\n"+entry.getValue().get(1).get(j));
				}
				System.out.println("\nNO EFFECT:");
				for(int j=0; j<entry.getValue().get(2).size(); j++) {
					System.out.println("\n"+entry.getValue().get(2).get(j));
				}
				
		}
		
		}
		
		
		
	
	
	
		public Attack getAttack(String n){
			return AttackMap.get(n);
		}
		
		
		
		
		public double getTypeEffect(String monType, String attackType) {
			
			
			
					for(int j=0; j<typeChart.get(monType).get(0).size(); j++) {
						if(attackType.compareTo(typeChart.get(monType).get(0).get(j))==1) {
							System.out.println("\nSUPER EFFECTIVE:");
							return 2;
						}
						
					}
					
					for(int j=0; j<typeChart.get(monType).get(1).size(); j++) {
						if(attackType.compareTo(typeChart.get(monType).get(1).get(j))==1) {
							System.out.println("\nNOT VERY EFFECTIVE:");
							return .5;
						}
					}
					
					for(int j=0; j<typeChart.get(monType).get(2).size(); j++) {
						if(attackType.compareTo(typeChart.get(monType).get(2).get(j))==1) {
							System.out.println("\nNO EFFECT:");
							return 0;
						}
							
					}
					
					
			
					System.out.println("\nIT HITS:");
			return 1;	
				

			
			}
		
		
		
		
	}
		
		















