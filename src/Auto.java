
public class Auto {
	int kmStand;
	public static int allKMdriven;
	String typ;
	String farbe;
	boolean istKombi;

Auto (){
	kmStand = 0;
	typ = "Ente";
	farbe = "Himmelblau";
	istKombi = true;
}

Auto (int currKilometer, String kfzTyp, String ralFarbe, boolean kombiJaNein){
	kmStand = currKilometer;
	allKMdriven += currKilometer;
	farbe = ralFarbe;
	istKombi = kombiJaNein;
	}

public void fahnfahnfahn(int lastTrip){
	kmStand += lastTrip;
	allKMdriven += lastTrip;
}

}//end of auto


