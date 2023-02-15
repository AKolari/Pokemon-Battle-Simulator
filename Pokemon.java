package PokemonGame;
import java.util.ArrayList;
import java.lang.Math;
public abstract class Pokemon {
	private String name;
	private String nickName;
	private String type;
	private int hp;
	private ArrayList<Attack> attackList =new ArrayList<Attack>();; 
	private Data information=new Data();
	public Pokemon(String name, String type, int hp) {
		this.name=name;
		this.setNickName(name);
		this.type=type;
		this.setHp(hp);
		
		
		
	}
	
	public void printMoves() {
		System.out.println(nickName+"'s Moves:\n");
		for(int i=0; i<attackList.size(); i++) {
			System.out.println((i+1) +": " + attackList.get(i).getAttackName()+"\n");
		}
		
	}
	
	

	
	public void attack(Pokemon other, int attackIndex) {
		System.out.println(getNickName()+ " used "+ attackList.get(attackIndex-1).getAttackName());
		other.setHp(other.getHp()-(int)Math.floor(information.getTypeEffect(other.getType(), 	attackList.get(attackIndex-1).getAttackType())	*attackList.get(attackIndex-1).getDamage()));
		if(other.getHp()>0)
		System.out.println(other.getNickName()+" has "+ other.getHp()+" hit points remaining");
		else {
			System.out.println(other.getNickName()+" has fainted");
		}
	}
	
	
	
	

	
	
	
	
	public abstract void speak();







	public String getName() {
		return name;
	}








	public String getNickName() {
		return nickName;
	}








	public void setNickName(String nickName) {
		this.nickName = nickName;
	}








	public String getType() {
		return type;
	}








	public int getHp() {
		return hp;
	}








	public void setHp(int hp) {
		this.hp = hp;
	}








	public ArrayList<Attack> getAttackList() {
		return attackList;
	}

	







	public void setAttackList(Attack at) {
		attackList.add(at);
	}

	
	
	
	public Data getInformation() {
		return information;
	}
		
	
	
	
	}



