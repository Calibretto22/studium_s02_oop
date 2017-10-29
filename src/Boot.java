public class Boot {

	String nameBoat;
	int length;
	int width;
	int displacement;
	int cristening; // taufe, unix-date
	boolean seatough; 
	String currrentlocation;
	String nameLotse; 
	static int anzahlBoote; // static macht die Variable zu einer Klassenvariable. sie ist in jeder INstanz der Klasse gleich
		//der aufruf erfolgt mit dem klassennamen: Boot.anzahlBoote

Boot(){ //parameterloser konstruktor - manuelle eingabe aller relevanten variablen	
	System.out.println("Eingabe Bootsname: " );
	nameBoat = Tools.stringEingabe();
	System.out.println("Eingabe Bootsl�nge: " );
	length = Tools.intEingabe();
	System.out.println("Eingabe Bootsbreite: " );
	width = Tools.intEingabe();
	System.out.println("Eingabe Wasserverdr�ngung: " );
	displacement = Tools.intEingabe();
	System.out.println("Eingabe des Bootstaufedatums (Unix-Zeit): " );
	cristening = Tools.intEingabe();
	System.out.println("Ist das Boot seetauglich? (true oder false): " );
	seatough = Tools.booleanEingabe();
	System.out.println("Eingabe aktueller Standort: " );
	currrentlocation = Tools.stringEingabe();
	anzahlBoote++;
}
	
Boot(String bootsname, int laenge, int breite, int verdraeng, int taufdatum, boolean seetauglichkeit, String aktuellePosition){
	//Konstruktor f�r das komplette Boot, ohne lotsen
	//String, 4int, bool, String
	nameBoat = bootsname;
	length = laenge;
	width = breite;
	displacement = verdraeng;
	cristening = taufdatum;
	seatough = seetauglichkeit; 
	currrentlocation = aktuellePosition;
	anzahlBoote++;
	}	

//Boot (String nameDerLotse){
//	nameLotse = nameDerLotse;
//}
	
void statusanzeigen() {
	System.out.println("Schiffsname: " + nameBoat);
	System.out.println("L�nge: " + length);
	System.out.println("Breite: " + width);
	System.out.println("Wasserverd�ngung: " + displacement);
	System.out.println("Schiffstaufe: " + cristening);
	System.out.println("Seetauglichkeit: " + seatough);
	System.out.println("aktueller Standort: " + currrentlocation);
	}

void einlaufen (String heimat) {
	// l�nge pr�fen: kleiner 6 ist okay
	// gr��er 15 wird automatisch abgelehnt
	// dazwischen wird breite gepr�ft
	// breite gr��er 10:  anforderung lotse
	if (length > 15){
		System.out.println("Sie sind zu gro�. Wir k�nnen sie nicht einlaufen lassen.");
		}
	else
		{	
		if (length < 6) {
			System.out.println("Sie sind klein genug. Herzlich willkommen.");
			currrentlocation = heimat;
			}
		}
	}

void lotseanfordern() {
	if (width > 10 ){
		System.out.println("Sie sind so breit, dass sie einen lotsen zum Einlaufen ben�tigen. ");
		lotseBenennen();
	}
	else {
				System.out.println("Sie sind so mittelgro� aber schmal genug um ohne lotsen einlaufen zu k�nnen. GoGo!");
	}
	
}
void lotseBenennen(){
	nameLotse = Tools.stringEingabe();
}

void auslaufen(String reiseZiel){
	currrentlocation = Tools.stringEingabe();
}

} // ganz am ende der boot-klasse

class Ruderboot extends Boot {
	int sitzplaetze;
	String typ_ruderboot;
	
	Ruderboot (){ //parameterloser konstrukter der subklasse
		super ();//ruft den variablenlosen konstrukor der superklasse auf
		System.out.println("Eingabe Sitzpl�tze: " );
		sitzplaetze = Tools.intEingabe();
		
		System.out.println("Eingabe Ruderboot-Typ: " );
		typ_ruderboot = Tools.stringEingabe();
		}//end of constructor
	Ruderboot (String bootsname_, int laenge_, int breite_, int verdraeng_, int taufdatum_, boolean seetauglichkeit_, String aktuellePosition_, int anzahlSitze, String ruderbootstyp){
		// ein konstruktor mit parameterangabe 
		super(bootsname_, laenge_, breite_, verdraeng_, taufdatum_, seetauglichkeit_, aktuellePosition_);
		sitzplaetze = anzahlSitze;
		typ_ruderboot = ruderbootstyp; 
		}

	
	void einlaufen(String heimat) {//�berschreiben der methode im boot, weil ruderboote anders einlaufen
		System.out.println("Sie sind klein genug, weil sie rudern. Herzlich willkommen.");
		currrentlocation = heimat;
		}//end of ruderboot einlaufen

	void statusanzeigen() {//erweiterung bzw. aktualisierung von statusanzeigen, speziell f�r ruderboote
		super.statusanzeigen();
		System.out.println("Anzahl der Sitzpl�tze: " + sitzplaetze);
		System.out.println("Typ des Ruderbootes: " + typ_ruderboot);
		}
	
	
	
} //end of subklasse ruderboot

class Segelboot extends Boot{
	int segelflaeche;
	int anzahlMaste;
	private int getrimmt; //für die methode trimmen
	
	Segelboot (){//parameterloser konstruktor
		super();
		System.out.println("Eingabe Segelfläche: " );
		segelflaeche = Tools.intEingabe();
		System.out.println("Eingabe Mast-Anzahl: " );
		anzahlMaste = Tools.intEingabe();	
	}//end of constructor
	Segelboot (String bootsname, int laenge, int breite, int verdraeng, int taufdatum, boolean seetauglichkeit, String aktuellePosition, int segelflaeche_, int anzahlmaste_){
		super(bootsname, laenge, breite, verdraeng, taufdatum, seetauglichkeit, aktuellePosition);
		segelflaeche = segelflaeche_; 
		anzahlMaste = anzahlmaste_;
	}
	void statusanzeigen() {//erweiterung bzw. aktualisierung von statusanzeigen
		super.statusanzeigen();
		System.out.println("Segelfläche: " + segelflaeche);
		System.out.println("Anzahl Masten: " + anzahlMaste);
		}
	
	void trimmen() {
		if (segelflaeche < 3) {
			System.out.println("Ihre Segelfläche ist zu klein. Trimmen lohnt sich nicht. " );
			}
		else {//wenn die segefläche >=3 ist
			getrimmt = 1;
			while (getrimmt <= anzahlMaste) {
				System.out.println("Mast Nr. " + getrimmt + " wurde getrimmt.");
				getrimmt++;
				}//end while
			System.out.println("Alle Masten wurden getrimmt.");
		}//end else
	}//end trimmen 	
} //end of subklasse segelboot
	
	

