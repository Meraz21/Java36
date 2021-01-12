package pac;

import java.util.ArrayList;

public class pro1 {
public static void main(String[] args) {
	String [] name = {"Khosruz", "Zaman", "Meraz", "Liza", "Amma", "Abba", "Vai", "Sister", "Anika", 
			"Rehan", "Shama", "Sayed", "Tuhi", "Ohi", "Tahmina"};
	System.out.println("Available name is: ");
	for (String lis : name) {
		System.out.print(lis+", ");
	}
	ArrayList allname = new ArrayList();
	allname.add("khosru");
	allname.add("foyshal");
	allname.add("lili");
	allname.add("bably");
	allname.add("lovely");
	allname.add(allname);
	allname.add("Bangladesh");
	allname.add("USA");
	
	System.out.println("\nFollowing Index Nmae is : " + allname.get(3));
	
	
	System.out.println("\nAvailable List name is : ");
	for (Object listname : allname) {
		System.out.print(listname+", ");
		
	}
	
	
}
}
