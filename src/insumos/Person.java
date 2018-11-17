package insumos;

public class Person implements Comparable<Person>{
	
	private String name;
	private int age;
	private Address address;
	private Gender gender;
	
	public Person(String name){
		this.name = name;
	}
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public Person(String name, int age, Gender gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Gender getGender() {
		return gender;
	}
	
	public Gender getGenero(Person person) {
		if(person.isMale())
			return Gender.MALE;
		else
			return Gender.FEMALE;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public boolean isMale() {
		return gender == Gender.MALE;
	}
	
	@Override
	public int compareTo(Person person) {
//		return person.getName().compareTo(name);
		return this.name.compareTo(person.getName());
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	public enum Gender {MALE, FEMALE}
}