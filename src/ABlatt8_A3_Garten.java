
public class ABlatt8_A3_Garten {
	private String artGarten;
	private ABlatt8_A3_Pflanze [] pflanzenliste;
	
	ABlatt8_A3_Garten (){
		int anz = 0;
		System.out.print("Art des Gartens: ");
		artGarten = Tools.stringEingabe();
		System.out.println("wie viele Pflanzen hat der Garten?");
		anz = Tools.intEingabe();
		pflanzenliste = new ABlatt8_A3_Pflanze[anz];
		for (int i = 0; anz; i++) {
			pflanzenliste [i] = new ABlatt8_A3_Pflanze;
		}
	}

	ABlatt8_A3_Garten (boolean autofill){
		artGarten = "Plantage";
	}

void angucken () {
	System.out.println(artGarten);
	for (int i = 0; pflanzenliste.length; i++) {}
	//ausgabe der pflanzen
}
}
