class Fernseher {
	private String name;
	private String groesse;
	private int preis_euro;
	// int preis_cent;
	static int einnahmen; //erzielte einnahmen (global)
	static int anzahl; //anzahl der verkauften ger�te (global)

Fernseher (){
	System.out.println("Eingabe Markenname: " );
	name = Tools.stringEingabe();

	System.out.println("Eingabe Ger�tegr��e: " );
	groesse = Tools.stringEingabe();
	
	System.out.println("Eingabe Markenname: " );
	preis_euro = Tools.intEingabe();
	}

Fernseher (String nameDerMarke, String groesseDesFernsehers, int vollerEuroPreis/*, int separateCent*/){
	name = nameDerMarke;
	groesse = groesseDesFernsehers;
	preis_euro = vollerEuroPreis;
	}

void anzeigen() {
	System.out.println("Markenname: " + name);
	System.out.println("Ger�tegroesse: " + groesse);	
	System.out.println("Verkaufspreis: " + preis_euro);
	}

void verkaufen() {
	anzahl++;
	einnahmen = einnahmen + preis_euro;
	}


}
