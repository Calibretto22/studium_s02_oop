
public class Tier {
	private String name;
	
	Tier (String name_){
		name = name_;
	}
	void anzeige(){//Tier
		System.out.println("Name Tier: " + name );
	}
}// end Tier

class Hund extends Tier{
	private int hechelFrequenz;
	
	Hund (){
		super("Fifi");
		hechelFrequenz = Tools.intEingabe();
	}

	Hund (int hechelFrequenz_){
		super("Fifi");
		hechelFrequenz = hechelFrequenz_;
	}
	void anzeige(){//Hund
		super.anzeige();
		System.out.println("hechelFrequenz: " + hechelFrequenz );
	}
}//end Hund	

class Daemonenhund extends Hund{
	private int verderbtheit;
	private int anzahlSeelen; 
	
	Daemonenhund (int anzahlSeelen_, int hechelFrequenz__){//unspezifischer DH conjurer
		super(hechelFrequenz__);
		verderbtheit = anzahlSeelen_ * hechelFrequenz__;
	}
	
	Daemonenhund (int anzahlSeelen_, int hechelFrequenz__ , int verderbtheit__){//Hoellenhund conjurer
		super(hechelFrequenz__);
		verderbtheit = verderbtheit__;
	}
	void anzeige(){//Daemonenhund
		super.anzeige();
		System.out.println("Verderbtheit: " + verderbtheit );
		System.out.println("Anzahl Seelen: " + anzahlSeelen );
	}
}//end Daemonenhund

class Hoellenhund extends Daemonenhund{
	private int verderbtheitsfaktor;
	private int gefaehrlichkeit;
	
	Hoellenhund(int verderbtheitsfaktor_ , int anzSeelen__, int hechelFrequenz_){
		super(anzSeelen__,hechelFrequenz_,17);
		verderbtheitsfaktor = verderbtheitsfaktor_;
		gefaehrlichkeit = verderbtheitsfaktor_ * 17;
	}
	void anzeige(){//Hoellenhund
		super.anzeige();
		System.out.println("Verderbtheitsfaktor: " + verderbtheitsfaktor );
		System.out.println("Gefährlichkeit: " + gefaehrlichkeit );
	}
}//end Hoellenhund
