import java.util.ArrayList;
import java.util.Scanner;

public class Person {
	//data fields
	private String name;
	private String phone;
	private String email;
	private String liveInCity;
	private String liveInState;
	private CovidSymptom symptom;

	ArrayList<Person> person = new ArrayList<>();

	Scanner input = new Scanner(System.in);
	//constructors

	public Person() {
	}

	public Person(String name, String phone, String email, String liveInCity, String liveInState) {
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.liveInCity = liveInCity;
		this.liveInState = liveInState;
	}
	//accessors and mutators

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLiveInCity() {
		return liveInCity;
	}

	public void setLiveInCity(String liveInCity) {
		this.liveInCity = liveInCity;
	}

	public String getLiveInState() {
		return liveInState;
	}

	public void setLiveInState(String liveInState) {
		this.liveInState = liveInState;
	}

	public ArrayList<Person> getPerson() {
		return person;
	}

	//prompt user
	public void prompt() {
		// prompt and accept user input


		System.out.println("Contact Tracing Program\n" +
				"Enter a newly infected person's information\n" +
				"What is a patient's name?");

		this.name = input.nextLine();
		System.out.println("What is a patient's phone number?");
		phone = input.nextLine();
		System.out.println("What is a patient's email?");
		email = input.nextLine();
		System.out.println("What city does a patient live in?");
		liveInCity = input.nextLine();
		System.out.println("What state does a patient live in?");
		liveInState = input.nextLine();

		person.add(new Person(name,phone, email, liveInCity,liveInState));
	}

	public void promptContact() {

		System.out.println("Has Elsa met or run into anyone? (y/n)");
		if(input.nextLine().equalsIgnoreCase("y")){
			System.out.println("What is his/her name?");
			setName( input.nextLine());
			System.out.println("What is his/her phone number?");
			setPhone(input.nextLine());
			System.out.println("What is his/her email?");
			setEmail(input.nextLine());
			System.out.println("What city does he/her live in?");
			setLiveInCity(input.nextLine());
			System.out.println("What state does he/her live in?");
			setLiveInCity(input.nextLine());
			System.out.println("What city did Elsa see him/her?");
			setLiveInCity(input.nextLine());
			System.out.println("What state did Elsa see him/her?");
			setLiveInCity(input.nextLine());
			System.out.println("When did Elsa see him/her? (mm/dd/yyyy)");
			setLiveInCity(input.nextLine());

		}


		person.add(new Person(name,phone, email, liveInCity,liveInState));
	}


	//toString
	@Override
	public String toString() {
		return "Name: " + getName() + "\nPhone: " + getPhone() + "\nEmail: " + getEmail() +
				"\nCity: " + getLiveInCity() + "  State: " + getLiveInState();
	}
}
