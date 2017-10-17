
import java.io.*;

public class Tools {

	public static int intEingabe(){
		String eingebs ="";
		InputStreamReader daten = new InputStreamReader(System.in);
		BufferedReader eingeb = new BufferedReader(daten);
		try {
			eingebs = eingeb.readLine();
		} catch (Exception e) {
			System.out.println("Falsche Eingabe");
		}
		int eingebi = 0;
		try {
			eingebi = Integer.valueOf(eingebs).intValue();
		} catch (Exception e) {
			System.out.println("Keine Zahl - es wird 0 zurückgegeben.");
			eingebi =0;
		}
	return eingebi;
	}
	
	public static String stringEingabe(){
		String eingebs ="";
		InputStreamReader daten = new InputStreamReader(System.in);
		BufferedReader eingeb = new BufferedReader(daten);
		try {
			eingebs = eingeb.readLine();
		} catch (Exception e) {
			System.out.println("Falsche Eingabe");
		}
	return eingebs;
	}
	
	public static double doubleEingabe(){
		String eingebs ="";
		InputStreamReader daten = new InputStreamReader(System.in);
		BufferedReader eingeb = new BufferedReader(daten);
		try {
			eingebs = eingeb.readLine();
		} catch (Exception e) {
			System.out.println("Falsche Eingabe");
		}
		double eingebi = 0;
		try {
			eingebi = Double.parseDouble(eingebs);
		} catch (Exception e) {
			System.out.println("Fließkommazahl - Punkt statt Komma");
			eingebi =0;
		}
	return eingebi;
	}
	
	public static boolean booleanEingabe(){
		String eingebs ="";
		InputStreamReader daten = new InputStreamReader(System.in);
		BufferedReader eingeb = new BufferedReader(daten);
		System.out.println("1 - true ... 2 - false");
		try {
			eingebs = eingeb.readLine();
		} catch (Exception e) {
			System.out.println("Falsche Eingabe - false wird zurueckgegeben");
		}
		if (eingebs.equals ("1")) return true;
		else return false;
	}
	
	public static int random(int zufall) {
		int zahl = 0;
		zahl = (int)Math.floor(Math.random() * zufall);
		zahl = zahl + 1;
		return zahl;	
	}
	
	
}