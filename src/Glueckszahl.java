import java.util.Random; 

public class Glueckszahl {
	String vorname;
	String nachname;
	int glueckszahl; 
	
	Glueckszahl(){}//do nassing
	
	Glueckszahl (String vorname, String nachname){
		this.vorname = vorname;
		this.nachname = nachname;
		berechnen();
	}
	
	public void berechnen () {
		int z1 = nachname.toUpperCase().charAt(nachname.length() - 1);
		//System.out.println("last char Nachname " + nachname.toUpperCase().charAt(nachname.length() - 1) + z1);
		int z2 = vorname.toUpperCase().charAt(0);
		//System.out.println("last char Vorname " + vorname.toUpperCase().charAt(0) + z2);
		this.glueckszahl = (z1 + z2) / Tools.random(100);
	};
}
/*Die Methode berechnen () ermittelt vom 
 * 1. Buchstaben (Großschreibweise) des Vornamens und vom

letzten Buchstaben (Großschreibweise) des Nachnamens die Dezimalzahlen des ASCII-Wertes (Explizite
Typumwandlung). Diese Summe wird durch eine Zufallszahl zwischen 0 und 100 dividiert. */