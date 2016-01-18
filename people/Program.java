package people;

import java.util.ArrayList;
import java.util.Collections;
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
		
		String name;
		int lastSpace = 0, age = 0;
		
		while(true) {
			System.out.print("Enter a name: ");
			name = scan.nextLine();
		
			lastSpace = name.lastIndexOf(' ');
			
			if(lastSpace == -1) { 
				break;
			}

			String givenName = name.substring(0, lastSpace);
			String surname = name.substring(lastSpace + 1);
		
			System.out.print("How old is " + givenName + " " + surname + "? ");

			name = scan.next();
			try {
				age = Integer.parseInt(name);
			} catch (NumberFormatException e) {
				System.out.println("That's not an integer");
				age = 0;
			} finally {
			if(age < 0) {
				System.out.println("That's negative");
			} else if (age == 0) {
			} else {
				personList.add(new Person(givenName, surname, age));
			}
			scan.nextLine();
			}
		}

		System.out.println("Unsorted:");
		printList(personList);
		
		Collections.sort(personList);
		System.out.println("Sorted by surname:");
		printList(personList);
		
		Collections.sort(personList, Person.givenNameComparator());
		System.out.println("Sorted by given name:");
		printList(personList);


		
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

	private static void printList(List<Person> personList) {
		for(Person p : personList) {
			System.out.println(p);
		}
	}

}
