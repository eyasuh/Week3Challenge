import java.util.ArrayList;
import java.util.Scanner;

public class Person {
	//data fields
	private String name;
	private String phone;
	private String email;
	private String liveInCity;
	private String liveInState;
	//private CovidSymptom symptom;

	//


	ArrayList<Person> person = new ArrayList<>();
	ArrayList<Person> location = new ArrayList<>();

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

	public Person(String name, String phone, String email, String liveInCity, String liveInState, String seeCity, String seeState, String date) {
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.liveInCity = liveInCity;
		this.liveInState = liveInState;
		this.seeCity = seeCity;
		this.seeState = seeState;
		this.date = date;
	}

	private String seeCity;
	private String seeState;
	private String date;

	public String getSeeCity() {
		return seeCity;
	}

	public void setSeeCity(String seeCity) {
		this.seeCity = seeCity;
	}

	public String getSeeState() {
		return seeState;
	}

	public void setSeeState(String seeState) {
		this.seeState = seeState;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void promptContact() {
		String answer;
		System.out.println("Has Elsa met or run into anyone? (y/n)");
		answer = input.nextLine();
		if(answer.equalsIgnoreCase("y")){
			while(answer.equalsIgnoreCase("y")) {
				System.out.println("What is his/her name?");
				name = input.nextLine();
				System.out.println("What is his/her phone number?");
				phone = input.nextLine();
				System.out.println("What is his/her email?");
				email = input.nextLine();
				System.out.println("What city does he/her live in?");
				liveInCity = input.nextLine();
				System.out.println("What state does he/her live in?");
				liveInState = input.nextLine();
				System.out.println("What city did Elsa see him/her?");
				seeCity = input.nextLine();
				System.out.println("What state did Elsa see him/her?");
				seeState = input.nextLine();
				System.out.println("When did Elsa see him/her? (mm/dd/yyyy)");
				date = input.nextLine();
				person.add(new Person(name,phone, email, liveInCity,liveInState,seeCity,seeState,date));
				System.out.println("Has Elsa met or run into anyone else? (y/n)");
				answer = input.nextLine();
			}
		}



	}

	private String vistPlace;
	private String visitCity;
	private String visitState;
	private String visitDate;

	public Person(String vistPlace, String visitCity, String visitState, String visitDate) {
		this.vistPlace = vistPlace;
		this.visitCity = visitCity;
		this.visitState = visitState;
		this.visitDate = visitDate;
	}

	public String getVistPlace() {
		return vistPlace;
	}

	public void setVistPlace(String vistPlace) {
		this.vistPlace = vistPlace;
	}

	public String getVisitCity() {
		return visitCity;
	}

	public void setVisitCity(String visitCity) {
		this.visitCity = visitCity;
	}

	public String getVisitState() {
		return visitState;
	}

	public void setVisitState(String visitState) {
		this.visitState = visitState;
	}

	public String getVisitDate() {
		return visitDate;
	}

	public void setVisitDate(String visitDate) {
		this.visitDate = visitDate;
	}

	public ArrayList<Person> getLocation() {
		return location;
	}

	public void setLocation(ArrayList<Person> location) {
		this.location = location;
	}

	//visited place
	public void visited() {
		String answer;
		System.out.println("Did Elsa visited anywhere in past 14 days? (y/n)");
		answer = input.nextLine();
		if(answer.equalsIgnoreCase("y")) {
			while(answer.equalsIgnoreCase("y")) {
				System.out.println("What is the name of a visited place?");
				vistPlace = input.nextLine();
				System.out.println("Which city is Frozen Kingdom located in?");
				visitCity =  input.nextLine();
				System.out.println("Which state is Frozen Kingdom located in?");
				visitState = input.nextLine();
				System.out.println("When did Elsa went to Frozen Kingdom? (mm/dd/yyyy)");
				visitDate = (input.nextLine());
				location.add(( new Person(vistPlace,visitCity, visitState,visitDate)));
				System.out.println("Did Elsa visited anywhere else in past 14 days?(y/n)");
				answer = input.nextLine();
			}

		}
	}

	//toString
	@Override
	public String toString() {
		return "Name: " + getName() + "\nPhone: " + getPhone() + "\nEmail: " + getEmail() +
				"\nCity: " + getLiveInCity() + "  State: " + getLiveInState();
	}
}














