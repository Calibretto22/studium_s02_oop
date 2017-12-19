class Main {
	public static void main (String [] args) {
/*	//kundenkram
	Kunde kunde1 = new Kunde();
	kunde1.vorname = "Hans";
	kunde1.name = " Meiser";
	kunde1.GebDatum = "31.02.2001";
	kunde1.kundennummer =005;
	kunde1.punkte=2;
	kunde1.ausgeben();
	
	kunde1.einkaufen(kunde1.kundennummer);
	kunde1.ausgeben();*/
	
/*	//bootskram	
	Boot boot1 = new Boot("Boaty McBoatface",14,11,500,0, true, "Atlantis");
	boot1.statusanzeigen();
	boot1.einlaufen("Hamburg");
	boot1.statusanzeigen();
	System.out.println();
	Segelboot boot2 = new Segelboot("Boaty McSegelface",14,11,500,0, true, "Segelhafen", 5, 2);
	boot2.statusanzeigen();
	boot2.trimmen();
	System.out.println();
	Ruderboot boot3 = new Ruderboot("Boaty McRuderboot", 3, 1, 2, 600, false, "Ruderhafen", 2, "Zweisitzer");
	boot3.statusanzeigen();
	boot3.einlaufen("Humbug");
	*/

/*	//spaß mit höllenhhunden
	Hoellenhund evilFifi = new Hoellenhund(2, 1, 50);
	evilFifi.anzeige();
	*/

/*	//Fruchtfliege
	Fruchtfliege dromel = new Fruchtfliege();
	System.out.println("dromel.getFLateinischerName(): " + dromel.getFLateinischerName());
	System.out.println("dromel.getFAlter(): " + dromel.getFAlter());
	dromel.setFLateinischerName("drosophila melanogaster");
	System.out.println("Namenskorrektur: " + dromel.getFLateinischerName());*/
	
/*	//Glückszahl
	Glueckszahl gz = new Glueckszahl("Hans-Peter","Petrowisch");
	System.out.println("Die heutige Glückszahl von " + gz.vorname + " " + gz.nachname + " lautet " + gz.glueckszahl);*/
	
/*	//Ausgabefenster
	SimpleGUI fenster = new SimpleGUI();
	fenster.showInputAufforderung();
	fenster.showResponse("Die Quersumme lautet: " + fenster.getQS());*/
		
/*	//durchschnitt aus array - ABlatt7_A1
	ABlatt7_A1 arraySpass = new ABlatt7_A1();
	arraySpass.duchschnitt();
	arraySpass.stellensumme();*/
		
/*	//ABlatt7_A3_Buchverwaltung
	ABlatt7_A3_Buchverwaltung mylib = new ABlatt7_A3_Buchverwaltung(true);
	mylib.showLibrary();
	//mylib.showDickeBuecher(300);
	mylib.showGenre("Roman");
	System.out.println("alle Seiten: " + mylib.getAllSeiten());*/
	
/*	// ABlatt7_A4 Kunstgalerie
		new ABlatt7_A4_Galerie(true).galerieausgabe();//constructor with true makes my autofill go round
		*/

	// ABlatt8_A2_Vogel
	Adler piepmatz = new Adler();
	piepmatz.anzeigen();
	piepmatz.singen();
	}
}