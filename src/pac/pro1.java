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
	allname.add("anika");
	allname.add("shontul");
	allname.add("amma");
	allname.add("abba");
	allname.add("fatima");
	allname.add("liza");
	allname.add("Meraz");
	allname.add("Babul");
	allname.add("Hasan");
	allname.add("Shama");
	allname.add("Rihan");
	allname.add("Sayed");
	allname.add("Tuhi");
	
	
	System.out.println("\nAvailable List name is : ");
	for (Object listname : allname) {
		System.out.print(listname+", ");
		
	}
	
	
}
}
