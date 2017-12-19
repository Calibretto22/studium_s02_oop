
abstract public class ABlatt8_A2_Vogel {
	String vogellatname;
	String farbe; 
	
	ABlatt8_A2_Vogel (){
		System.out.print("Eingabe lat. Name des Vogels: ");
		vogellatname = Tools.stringEingabe();
		System.out.print("Eingabe Farbe des Vogels: ");
		farbe = Tools.stringEingabe();
	}

	abstract void singen();

	void anzeigen() {
	System.out.println("lateinischer Name des Vogels: " + vogellatname);
	System.out.println("Farbe des Vogels: " + farbe);
	}

}//end ABlatt8_A2_Vogel

 class Amsel extends ABlatt8_A2_Vogel {
	String schnabelform;
	
	Amsel (){
		super();//müsste nicht geschrieben werden, wird auch automatisch aufgerufen
		System.out.print("Eingabe der Schnabelform: ");
		schnabelform = Tools.stringEingabe();
	}
	
	void singen() {
		System.out.println("Tirili ich bin eine Amsel. ");
	}
	
	void anzeigen() {
		super.anzeigen();
		System.out.println("Die Amsel hat einen Schnabel der Form: " + schnabelform);
	}
}//end Amsel
	
 class Sperling extends ABlatt8_A2_Vogel{
	void singen() {
		System.out.println("Tirila ich bin ein Sperling. ");
	}
}//end Sperling	

abstract  class Raubvogel extends ABlatt8_A2_Vogel{
	double spannweite;
	
	Raubvogel (){
		System.out.print("Eingabe Spannweite des Vogels: ");
		spannweite = Tools.doubleEingabe();
	}
	void anzeigen () {
		super.anzeigen();
		System.out.println("Der Raubvogel hat eine Spannweite von: (Metern)" + spannweite);
	}
	
}//end Raubvogel

 class Adler extends Raubvogel {
	String schnabelform;
	
	Adler (){
		super();//müsste nicht geschrieben werden, wird auch automatisch aufgerufen
		System.out.print("Eingabe Schnabelform des Vogels: ");
		schnabelform = Tools.stringEingabe();
	}
	
	void singen() {
		System.out.println("Tirilo ich bin ein Adler. ");
	}
}//end Adler
