package assessment;
import java.util.Collections;
import java.util.Iterator;
/*
 * a Person in charge of children is a banker with list of relatives and their location.
 * 
 * @author k1630994, k1631383
 */
import java.util.Map;
import java.util.TreeMap;

public class Banker extends Person{
	
	private TreeMap<Person, Integer> relativeList;
	
	
	public Banker(int level_of_friendliness, String name) {
		
		super(level_of_friendliness,name);
	    this.relativeList = new TreeMap<Person,Integer>();
		
		
	}
	
	/*
	 * @param person,distance
	 * add relative to relative list
	 *
	 */
	
	public void addRelative(Person person, int distance){
		
		relativeList.put(person,distance);
	}
	/*
	 * remove relative from the relative list
	 */
	
	public void removeRelative(Person person, int distance){
		
		relativeList.remove(person,distance);
	}
	

	/*method searches the closest and friendly person from the list
	 * and removes unfriendly relatives
	 */
	
    public void searchRelatives(){
		
		
		int min = Collections.min(relativeList.values());
		
		for(Iterator<Map.Entry<Person,Integer>> entry = relativeList.entrySet().iterator(); entry.hasNext();) {
			
			Map.Entry<Person,Integer> map = entry.next();
			
		    if(map.getValue() == min && map.getKey().getFriendliness() >= 5 ){
				System.out.println(map.getKey()+", distance "+min+". This is the closest and friendly relative for children as a guardian");
				min = Collections.min(relativeList.values());
				}
		    if (map.getValue() == min && map.getKey().getFriendliness() < 5 ) {
		    	System.out.println(map.getKey()+". This person is unfriendly, therefore he/she is removed from the list!");
		    	entry.remove();
		    	min = Collections.min(relativeList.values());
		    }
		    
		
			
		}
	}
    /*
     * print relative list with full info about person with distance
     */
	public void printL(){
		System.out.println("******************\nList of relatives: ");
		for(Map.Entry<Person, Integer> entry:relativeList.entrySet()){
			System.out.println(entry.getKey()+", distance " + entry.getValue());
		}
		System.out.println("******************* ");
	}
	
	

}

