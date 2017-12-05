
public class ABlatt7_A3_Buch {
	String isbn;
	String titel;
	String autor;
	int seitenzahl;
	String genre;
	
	ABlatt7_A3_Buch (){
		isbn = Tools.stringEingabe();
		titel = Tools.stringEingabe();
		autor = Tools.stringEingabe();
		seitenzahl = Tools.intEingabe();
		genre = Tools.stringEingabe();
	}
	
	ABlatt7_A3_Buch (String isbn, String titel, String autor, int seitenzahl, String genre){
		this.isbn = isbn;
		this.titel = titel;
		this.autor = autor;
		this.seitenzahl = seitenzahl;
		this.genre = genre;
	}
	
	void anzeigenBuch () {
		System.out.println("Titel (Genre): " + titel + " (" + genre + ") ");
		System.out.println("Autor: " + autor);
	}
	
}
