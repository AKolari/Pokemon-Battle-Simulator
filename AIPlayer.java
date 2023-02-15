package PokemonGame;

import java.util.Random;

public class AIPlayer extends Player {

	public AIPlayer() {
	}

	@Override
	public void chooseMon() {
		setMon(randMon());

	}

	@Override
	public void run() {
		System.out.println("\n Your opponent ran away crying like a coward lmao\n");
	}

	

	@Override
	public void chooseAttack(Pokemon other) {
		if(getMon().getHp()>0) {
		int randInt=(new Random()).nextInt(getMon().getAttackList().size());
		getMon().attack(other, 1+randInt);
		}
	}
	
	
	
	
	
	
	

}
