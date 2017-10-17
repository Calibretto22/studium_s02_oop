//test

class Main {
	public static void main (String [] args) {
/*	Kunde kunde1 = new Kunde();
	kunde1.vorname = "Hans";
	kunde1.name = " Meiser";
	kunde1.GebDatum = "31.02.2001";
	kunde1.kundennummer =005;
	kunde1.punkte=2;
	kunde1.ausgeben();
	
	kunde1.einkaufen(kunde1.kundennummer);
	kunde1.ausgeben();*/
		
	Boot boot1 = new Boot("Boaty McBoatface",14,11,500,0, true, "Atlantis");
	boot1.statusanzeigen();
	boot1.einlaufen("Hamburg");
	boot1.statusanzeigen();
	Segelboot boot2 = new Segelboot("Boaty McSegelface",14,11,500,0, true, "Segelhafen", 5, 2);
	boot2.statusanzeigen();
	boot2.trimmen();
	}
}