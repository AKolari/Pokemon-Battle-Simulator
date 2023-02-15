package PokemonGame;
import java.util.Scanner;

public class PlayerOne extends Player {

	public PlayerOne() {
		
		
	}

	public void chooseMon() {
		Scanner input = new Scanner(System.in);
		System.out.println("Below is a list of Pokemon. Please choose who you would like to be your Pokemon\n\n");
		this.printPokemon();
		String inputString= input.nextLine();
		setMon(getMonFromMap(inputString));
		System.out.println("Enter your Pokemon's name:\n\n");
		inputString= input.nextLine();
		getMon().setNickName(inputString);
	}
	
	public void chooseAttack( Pokemon other) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Pick your move:\n\n");
		getMon().printMoves();
		String inputString= input.nextLine();
		getMon().attack(other, Integer.parseInt(inputString));
		
	}

	
	public void run() {
		System.out.println("\n You ran away like the pathetic coward you are. You should be ashamed of yourself. Never play this game again. What kind of Pokemon\n "
				+ "trainer are you? How dare you waste my time, my valuable time, my time which is infinitely more important than your pathetic and meaningless\n "
				+ "existense you pretentious piece of garbage. You're nothing. You're less than nothing. I hope you fall into a canyon and get trampled to death\n "
				+ "by a stampede of Rapidashes as you run from this battle you pathetic coward.\n"
				+ "\n This message is an appended version of the originally intended message, which was so long and so vulgar that it was no longer conveyable by\n "
				+ "any written language which exists on this planet.\n");
		
	}

	
	

}
