
public class ABlatt7_A1 {
	int [] myArray = new int [5];
	
	ABlatt7_A1 () {
		for (int i=0; i < myArray.length; i++) {
			myArray [i] = Tools.random(5); // keine .intEingabe(); - ich bin faul ^^
			}//end if
	}//end eingabe-constructor
	
	void duchschnitt() {
		double sum = 0;
		for (int i=0; i < myArray.length; i++) {
			sum = sum + myArray[i];
			System.out.println("Das Element "+ i + " hat den Wert: " + myArray[i]);
		}//end if
		System.out.println("Das Array hat den durchschnittlichen Wert " + (sum / myArray.length));
		System.out.println("Das Array hat Summe " + (sum));
	}//end durchschnitt

	void stellensumme() {// hier ist noch was falsch
		int arrayfieldsum = 0; 
		int globalsum = 0;
		
		for (int i=0; i < myArray.length; i++) {
			arrayfieldsum = 0;
			for (int j = 0; j < i+1 ; j++) {
				arrayfieldsum =+ myArray[i];
				System.out.print(myArray[i] + " + ");
				}//end arrayfieldsum loop
			globalsum =+ arrayfieldsum;
			}//end globalsum-loop
		System.out.print(" = " + globalsum);
	}//end stellensumme
	
}
