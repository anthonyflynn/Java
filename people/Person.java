package people;

public class Person implements Comparable<Person> {

	private String givenNames;
	private String surname;
	private int age;

	public Person(String givenNames, String surname, int age) {
		this.givenNames = givenNames;
		this.surname = surname;
		this.age = age;
	}

	public String toString() {
		return this.givenNames + " " + this.surname + " (" + this.age + ")";
	}

	public String getGivenNames() {
		return givenNames;
	}

	public String getSurname() {
		return surname;
	}

	public int getAge() {
		return age;
	}

	public int compareTo(Person o) {
	    if(this.surname.compareTo(o.surname) != 0) {
	    	return this.surname.compareTo(o.surname);
	    }
	    else if(this.givenNames.compareTo(o.givenNames) != 0) {
	    	return this.givenNames.compareTo(o.givenNames);
	    }
	    else {
	    	return this.age - o.age;
	    }
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == null) {
			return false;
		}
		if(!(o instanceof Person)) {
			return false;
		}
		Person obj = (Person) o ;
		if((this.surname.compareTo(obj.surname) == 0) && (this.givenNames.compareTo(obj.givenNames) == 0) 
				&& (this.age == obj.age)) {
			return true;
		} else {
			return false;
		}
	}
	
	
	

}
