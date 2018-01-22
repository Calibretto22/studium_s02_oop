
abstract public class ABlatt9_1_DreiecksArten implements ABlatt9_1_interfaceDreieck {
	double a, b, c;
	// die klasse muss abstract sein, weil sie die höhenberechnung aus dem interfaceDreieck noch nicht umsetzt. 
	// es fehlt die berechnung der Höhe
	
ABlatt9_1_DreiecksArten (){
		System.out.println("Kantenlängen des Dreiecks eingeben");
		a = Tools.doubleEingabe();
		b = Tools.doubleEingabe();
		c = Tools.doubleEingabe();
	}
	
ABlatt9_1_DreiecksArten (double a, double b, double c){
	this.a = a;
	this.b = b;
	this.c = c;
	}	

public double berechneFlaechenInhalt (double h) {
	return Math.round(1/2.0)*c*h;//nur 1/2 würde 0 ergeben - ein java-bug
	}

public double berechneUmfang() {
	return a + b + c;
}
}//end dreiecksarten
