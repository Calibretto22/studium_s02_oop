public class Kunde{
	int kundennummer;
	String name;
	String vorname; 
	String GebDatum;
	int punkte;
	
	void ausgeben() {
// ich gebe die kundendaten aus	
		System.out.println("KdNr: " + kundennummer);
		System.out.println("Name: " + name	+ ", "+ vorname );
		System.out.println("Geburtsdatum: " + GebDatum);
		System.out.println("Punkte: " + punkte);
	}

	void einkaufen(int addpoints) {
		// ich schreibe dem kunden punkte gut		
		punkte = punkte + addpoints;
	}

	void stornieren(int subtractpoints) {
		// ich ziehe dem kunden punkte ab		
		punkte = punkte - subtractpoints; 	
	}

}
