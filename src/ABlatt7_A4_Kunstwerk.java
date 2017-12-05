
public class ABlatt7_A4_Kunstwerk {
	String artkunstwerk;
	String namekunstwerk;
	double wert;
	
	ABlatt7_A4_Kunstwerk(){
		this.artkunstwerk = Tools.stringEingabe();
		this.namekunstwerk = Tools.stringEingabe();
		this.wert = Tools.doubleEingabe();
	}
	
	ABlatt7_A4_Kunstwerk(boolean autofill){
		this.artkunstwerk = "Installation";
		this.namekunstwerk = "Fettecke";
		this.wert = 850000;
	}
	
	ABlatt7_A4_Kunstwerk(String artkunstwerk, String namekunstwerk, double wert ){
		this.artkunstwerk = artkunstwerk;
		this.namekunstwerk = namekunstwerk;
		this.wert = wert; 
	}
	
	void ausgeben () {
		String pronomen;
			switch (this.artkunstwerk) {
			case "Gemälde": pronomen = "Das ";
			case "Statue": pronomen = "Die ";
			default: pronomen = "Das ";
			}
		System.out.println(pronomen + this.artkunstwerk + " trägt den Namen \"" + this.namekunstwerk + "\"");
	}


}
