import java.util.*;

public class ContactTracingApp {
	public static void main(String[] args) {

		// instance of person and CovidSymptom class

		Person person = new Person();
		CovidSymptom symptom = new CovidSymptom();

		ArrayList<Person> personList;
		ArrayList<Person> visitList;
		HashMap<String, Integer> symptomMap;
		//ask patient personal info
		person.prompt();
		// access info from person class or stored place
		personList = person.getPerson();
		visitList = person.getLocation();
		// ask for symptoms and store result in hashmap
		symptom.promptSymptom(person.getName());
		// access or bring the map
		symptomMap = symptom.getSymptom();
		//ask contacted person
		person.promptContact();
		// ask visited places
		person.visited();

		// iterate on person arraylist and symptom hashMap
		Iterator personIterator = personList.iterator();
		Iterator symptomItr = symptomMap.entrySet().iterator();
		Iterator visitItr = visitList.iterator();
		System.out.println(person.getName());

		// print out results
		System.out.println("****** Contact Tracing Report **********");
		System.out.println(personIterator.next() + "\n\n**\t Sypmptoms:" );

		while (symptomItr.hasNext()) {
			Map.Entry elemnt = (Map.Entry)symptomItr.next();
			int days = (int)elemnt.getValue();
			System.out.println("had " + elemnt.getKey() + " for " +  days + " days");
		}

		System.out.println("\n** \tContacts: ");
		while (personIterator.hasNext())
			System.out.println(personIterator.next() + "\n");
		System.out.println("******************************************");


		while (visitItr.hasNext())
			System.out.println(visitItr.next() + "\n");


	}
}







