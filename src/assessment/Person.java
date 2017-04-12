package assessment;
/*
 * Relative is a person with his name and level of friendliness
 * 
 * 
 * @author k1630994,k1631383
 */

public class Person implements Comparable<Person>{
	
	private int level_of_friendliness;
	private String name;
	
	public Person(int level_of_friendliness, String name){
		
		this.level_of_friendliness = level_of_friendliness;
		this.name = name;
	}
	
	@Override
	public int compareTo(Person person){
		
		return name.compareTo(person.name);
	}
	
	public int getFriendliness(){
		
		return level_of_friendliness;
	}
	
	public String getName(){
		
		return name;
	}
	@Override
	public String toString(){
		
		return "Name of relative: " + name + ", " + "Relative's friendliness: " + level_of_friendliness;
		
		
	}


}