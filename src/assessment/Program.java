package assessment;

import java.util.Scanner;

/**
 * Run our program.
 * 
 * @author k1630994,k1631383
 */
public class Program {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		Person josephine = new Person(5,"Josephine");
		Person olaf = new Person(-10,"Olaf");
		Person sir = new Person(0,"Sir");
		Person uncleMonty = new Person(10,"Uncle Monty");
		
		Banker mrpoe = new Banker(5,"Mr.Poe");
		mrpoe.addRelative(josephine,100);
		mrpoe.addRelative(olaf,10);
		mrpoe.addRelative(sir,20);
		mrpoe.addRelative(uncleMonty,20);
	
		mrpoe.printL();
		System.out.println("<<Searching suitable relative....>>");
		mrpoe.searchRelatives();
		System.out.println("Would you like to add additional relatives?yes/no");
	
		String answer = scan.nextLine();
		
		while(true){
			if(answer.equals("no")){
				System.out.println("<<Searching suitable relative....>>");
				System.out.print("Guardian: ");
				mrpoe.searchRelatives();
				scan.close();
				break;
			}
			else if(answer.equals("yes")){
				
			System.out.println("Name: ");
				String name = scan.nextLine();
				System.out.println("Level of frienliness ");
				int level = scan.nextInt();
				System.out.println("Distance: ");
				int distance = scan.nextInt();
				mrpoe.addRelative(new Person(level,name),distance);
				mrpoe.printL();
				System.out.println("<<Searching suitable relative....>>");
			    mrpoe.searchRelatives();
			   System.out.println("Would you like to add additional relatives?yes/no");
			   
				
		}
			else{
				System.out.println("Please type only 'yes' or 'no'!");
				
			}
			answer = scan.nextLine();
	
		}		
	}

}
