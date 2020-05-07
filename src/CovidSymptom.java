import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class CovidSymptom {

	private HashMap<String, Integer> symptom = new HashMap<>();

	public CovidSymptom() {}


	public void promptSymptom() {
		Scanner input = new Scanner(System.in);
		System.out.println("Does Elsa have any symptom for Fever? (y/n)");
		if (input.nextLine().equalsIgnoreCase("y")) {
			System.out.println("How long has  Elsa  had this symptom for?");
			this.symptom.put("Fever", input.nextInt());
			input.nextLine();
		}
		System.out.println("Does Elsa have any symptom for Cough? (y/n)");
		if(input.nextLine().equalsIgnoreCase("y")){
			System.out.println("How long has  Elsa  had this symptom for?");
			this.symptom.put("Cough", input.nextInt());
			input.nextLine();
		}
		System.out.println("Does Elsa have any symptom for Shortness of breath or difficulty breathing? (y/n)");
		if(input.nextLine().equalsIgnoreCase("y")){
			System.out.println("How long has  Elsa  had this symptom for?");
			this.symptom.put("Shortness of breath or difficulty breathing?", input.nextInt());
			input.nextLine();
		}
		System.out.println("Does Elsa have any symptom for Tiredness? (y/n)");
		if(input.nextLine().equalsIgnoreCase("y")){
			System.out.println("How long has  Elsa  had this symptom for?");
			this.symptom.put("Tiredness", input.nextInt());
			input.nextLine();
		}
		System.out.println("Does Elsa have any symptom for Aches? (y/n)");
		if(input.nextLine().equalsIgnoreCase("y")){
			System.out.println("How long has  Elsa  had this symptom for?");
			this.symptom.put("Aches", input.nextInt());
			input.nextLine();
		}
		System.out.println("Does Elsa have any symptom for Chills? (y/n)");
		if(input.nextLine().equalsIgnoreCase("y")){
			System.out.println("How long has  Elsa  had this symptom for?");
			this.symptom.put("Chills", input.nextInt());
			input.nextLine();
		}
		System.out.println("Does Elsa have any symptom for Sore throat? (y/n)");
		if(input.nextLine().equalsIgnoreCase("y")){
			System.out.println("How long has  Elsa  had this symptom for?");
			this.symptom.put("Sore throat", input.nextInt());
			input.nextLine();
		}
		System.out.println("Does Elsa have any symptom for Loss of smell? (y/n)");
		if(input.nextLine().equalsIgnoreCase("y")){
			System.out.println("How long has  Elsa  had this symptom for?");
			this.symptom.put("Loss of smell", input.nextInt());
			input.nextLine();
		}
		System.out.println("Does Elsa have any symptom for Loss of taste? (y/n)");
		if(input.nextLine().equalsIgnoreCase("y")){
			System.out.println("How long has  Elsa  had this symptom for?");
			this.symptom.put("Loss of taste", input.nextInt());
			input.nextLine();
		}
		System.out.println("Does Elsa have any symptom for Severe vomiting? (y/n)");
		if(input.nextLine().equalsIgnoreCase("y")){
			System.out.println("How long has  Elsa  had this symptom for?");
			this.symptom.put("Severe vomiting", input.nextInt());
			input.nextLine();
		}
		System.out.println("Does Elsa have any symptom for Headache? (y/n)");
		if(input.nextLine().equalsIgnoreCase("y")){
			System.out.println("How long has  Elsa  had this symptom for?");
			this.symptom.put("Headache", input.nextInt());
			input.nextLine();
		}
		System.out.println("Does Elsa have any symptom for Diarrhea? (y/n)");
		if(input.nextLine().equalsIgnoreCase("y")){
			System.out.println("How long has  Elsa  had this symptom for?");
			this.symptom.put("Diarrhea", input.nextInt());
			input.nextLine();
		}


	}

	public HashMap<String, Integer> getSymptom() {
		return symptom;
	}
}



















