
public class ABlatt7_A3_Buchverwaltung {
	ABlatt7_A3_Buch [] bucharray;
	
	ABlatt7_A3_Buchverwaltung (){//nur ein buch
		bucharray = new ABlatt7_A3_Buch [1];
	}

	ABlatt7_A3_Buchverwaltung (int buchanzahl){//gimme amnt of books
		bucharray = new ABlatt7_A3_Buch [buchanzahl];
	}

	ABlatt7_A3_Buchverwaltung (boolean autofill){//autofill 5 books
		bucharray = new ABlatt7_A3_Buch [5];
		bucharray[0]= new ABlatt7_A3_Buch("unknownisbn","The wonderful wizard of Oz","Frank L. Baum",642, "Roman");
		bucharray[1]= new ABlatt7_A3_Buch("unknownisbn","Raskolnikow","Dostojewski",1532, "Roman");
		bucharray[2]= new ABlatt7_A3_Buch("unknownisbn","Krieg und Frieden","Tolstoi",3132, "Roman");
		bucharray[3]= new ABlatt7_A3_Buch("unknownisbn","Gripsholm","Tucholski",132, "Roman");
		bucharray[4]= new ABlatt7_A3_Buch("unknownisbn","Die neuen Leiden des jungen W.","Plenzdorf",243, "Roman");
	}

	void showLibrary () {
		for (int i = 0; i < bucharray.length; i++) {
			bucharray[i].anzeigenBuch();
		}
	}
	
	int getAllSeiten() {
		int pages = 0;
		for (int i = 0; i < bucharray.length; i++) {
			pages += bucharray[i].seitenzahl;
		}
		return pages;
	}
	
	void showDickeBuecher (int whatIsDick) {
		for (int i = 0; i < bucharray.length; i++) {
			if (bucharray[i].seitenzahl > whatIsDick) {
				bucharray[i].anzeigenBuch();}
		}/*end for-loop*/}/*end method*/
	
	void showGenre (String genre) {
		for (int i = 0; i < bucharray.length; i++) {
			if (bucharray[i].genre.equals(genre)) {
				bucharray[i].anzeigenBuch();}
		}/*end for-loop*/}/*end method*/
	
		
}/*end class*/


