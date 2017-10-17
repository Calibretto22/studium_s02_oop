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
	System.out.println("Eingabe Bootslänge: " );
	length = Tools.intEingabe();
	System.out.println("Eingabe Bootsbreite: " );
	width = Tools.intEingabe();
	System.out.println("Eingabe Wasserverdrängung: " );
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
	//Konstruktor für das komplette Boot, ohne lotsen
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
	System.out.println("Länge: " + length);
	System.out.println("Breite: " + width);
	System.out.println("Wasserverdängung: " + displacement);
	System.out.println("Schiffstaufe: " + cristening);
	System.out.println("Seetauglichkeit: " + seatough);
	System.out.println("aktueller Standort: " + currrentlocation);
	}

void einlaufen (String heimat) {
	//länge prüfen: kleiner 6 ist okay
	// größer 15 wird automatisch abgelehnt
	// dazwischen wird breite geprüft
	// breite größer 10:  anforderung lotse
	if (length > 15){
		System.out.println("Sie sind zu groß. Wir können sie nicht einlaufen lassen.");
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
		System.out.println("Sie sind so breit, dass sie einen lotsen zum Einlaufen benötigen. ");
		lotseBenennen();
	}
	else {
				System.out.println("Sie sind so mittelgroß aber schmal genug um ohne lotsen einlaufen zu können. GoGo!");
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
		System.out.println("Eingabe Sitzplätze: " );
		sitzplaetze = Tools.intEingabe();
		
		System.out.println("Eingabe Ruderboot-Typ: " );
		typ_ruderboot = Tools.stringEingabe();
		}//end of constructor
// ein konstruktor mit parameterangabe wäre noch nett zum testen im main
	
	void einlaufen(String heimat) {//überschreiben der methode im boot, weil ruderboote anders einlaufen
		System.out.println("Sie sind klein genug, weil sie rudern. Herzlich willkommen.");
		currrentlocation = heimat;
		}//end of ruderboot einlaufen

	void statusanzeigen() {//erweiterung bzw. aktualisierung von statusanzeigen, speziell für ruderboote
		super.statusanzeigen();
		System.out.println("Anzahl der Sitzplätze: " + sitzplaetze);
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
	
	

