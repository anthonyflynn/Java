package people;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Person> personList;
		personList = new ArrayList();
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("Enter a name: ");
		String name = scan.nextLine();
		
		int lastSpace = name.lastIndexOf(' ');

		String givenName = name.substring(0, lastSpace);
		String surname = name.substring(lastSpace + 1);
		
		System.out.print("How old is " + givenName + " " + surname + "? ");
		int age = scan.nextInt();
		
		personList.add(new Person(givenName, surname, age));
		System.out.println("Current List:");
		
		for(Person p : personList) {
			System.out.println(p);
		}
		
		
		
		/*//TESTS FOR compareTo() and equals()
		Person aaa = new Person("Ann", "Aarvark", 22);
		Person aba = new Person("Ann", "Abrvark", 22);
		Person baa = new Person("Az", "Aarvark", 22);
		Person baz = new Person("Az", "Aarvark", 21);
		Person aaz = new Person("Ann", "Aarvark", 10);
		Person aab = new Person("Ann", "Aarvark", 23);
		Person aaa2 = new Person("Ann", "Aarvark", 22);
		
		String test = "Hello";
		System.out.println(aaa.compareTo(aaa)); // 0
		System.out.println(aaa.compareTo(aba)); // -1
		System.out.println(aaa.compareTo(baa)); // -12
		System.out.println(baa.compareTo(aaa)); // 12
		System.out.println(baz.compareTo(baa)); // -1
		System.out.println(aab.compareTo(aaz)); // 13
		System.out.println(aab.compareTo(aaa)); // 1

		System.out.println(aab.equals(aaa)); 
		System.out.println(aab.compareTo(aaa) == 0); 
		

		System.out.println(aaa.equals(null));
		System.out.println(aaa.equals(test));
		
		System.out.println(aaa2.equals(aaa));
		System.out.println(aaa2.compareTo(aaa) == 0); 
		*/
		
		
	}

}
