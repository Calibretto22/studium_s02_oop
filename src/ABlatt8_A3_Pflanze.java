
public class ABlatt8_A3_Pflanze {
	private String lateinischerName;
	private String bluetezeit;
	private Boolean gepflueckt;
	
	ABlatt8_A3_Pflanze (){
		System.out.print("lateinischer Name der Pflanze: ");
		lateinischerName = Tools.stringEingabe();
		System.out.print("Blütezeit der Pflanze: ");
		bluetezeit = Tools.stringEingabe();
		System.out.print("Wurde die Pflanze bereits gepflückt? ");
		gepflueckt = false;
	}
	ABlatt8_A3_Pflanze (boolean autofill){//optional
		lateinischerName = "cannabis sativa";
		bluetezeit = "Oktober";
		gepflueckt = false;
	}
	
	ABlatt8_A3_Pflanze (String lateinischerName, String bluetezeit, boolean gepflueckt){
		this.lateinischerName = lateinischerName;
		this.bluetezeit = bluetezeit;
		this.gepflueckt = gepflueckt;
	}

	
	void anzeigen () {
		System.out.println("Name der Pflanze: " + lateinischerName);
		System.out.println("Blütezeit: " + bluetezeit);
		System.out.println("Bereits gepflückt? " + gepflueckt);
	}
	void anpflanzen () {
		System.out.println("Angepflanzt! ");
	}
	void pfluecken () {
		if (gepflueckt = true) {gepflueckt = false;}
		else {gepflueckt = false;};//endif  
	}//end pfluecken
}
