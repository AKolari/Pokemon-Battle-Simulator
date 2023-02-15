package PokemonGame;
import java.util.Scanner;

public class PokemonRunner {
	
	
	public static void main(String[] args) {
	boolean playing=true;
	Scanner input = new Scanner(System.in);
	String userInput;
	PlayerOne player= new PlayerOne();
	AIPlayer simon= new AIPlayer();
	
	
	
	
	
	
	player.chooseMon();
	System.out.println(player.getMon().getNickName());
	
	
	
	while(playing==true) {
		
	simon.chooseMon();
	while(player.getMon().getHp()>=0 && simon.getMon().getHp()>=0  ) {
	player.chooseAttack(simon.getMon());
	simon.chooseAttack(player.getMon());
	}
	
	System.out.println("\nSomeone won, but I don't know who, and I don't really care\n");
	System.out.println("\nWell looks like that's that. Up for another round of Pokemanz amigo?\n");
	System.out.println("\n (y/n)");
	
	
	
	
	userInput=input.nextLine();
	if((char)userInput.toLowerCase().compareTo("y")!=0)
		playing=false;
	
	player.resetMon();
	simon.resetMon();
	}
	
	
	System.out.println("Thanks for playing!");
	}

}
