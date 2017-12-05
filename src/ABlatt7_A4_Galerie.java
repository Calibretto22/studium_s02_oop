
public class ABlatt7_A4_Galerie {
	ABlatt7_A4_Kunstwerk [] mygallery;
	
	ABlatt7_A4_Galerie(){
		mygallery = new ABlatt7_A4_Kunstwerk[Tools.intEingabe()];
		for (int i = 0; i < mygallery.length; i++) {
			mygallery[i] = new ABlatt7_A4_Kunstwerk();
		}
	}
	
	ABlatt7_A4_Galerie(boolean autofill){
		mygallery = new ABlatt7_A4_Kunstwerk[3];
		mygallery[0] = new ABlatt7_A4_Kunstwerk("Gemälde","Der bunte Fluss", 1100);
		mygallery[1] = new ABlatt7_A4_Kunstwerk("Statue","Othello", 1000);
		mygallery[2] = new ABlatt7_A4_Kunstwerk("Gemälde","Frankenstein im Nebel", 1040);
	}

	void galerieausgabe () {
		for (int i = 0; i < mygallery.length ; i++) {
			mygallery[i].ausgeben();}
		gesamtWertBerechnen();
	}
	
	void gesamtWertBerechnen () {
		double gWert = 0;
		for (int i = 0; i < mygallery.length ; i++) {
			gWert += mygallery[i].wert;
			}
		versicherungErneuern(gWert);
		System.out.println("Die Galerie hat den Gesamtwert von " + gWert);
	}
	
	void versicherungErneuern (double gesamtWert) {
	//System.out.println("Welcher Versicherungswert ist angegeben? ");
	double versicherungswert = 1 /*Tools.doubleEingabe()*/;
	if (versicherungswert < gesamtWert) {
		System.out.println("Die Versicherung muss erneuert werden!");
		}/*end if*/
	}
}
