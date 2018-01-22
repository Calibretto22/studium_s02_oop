
public class ABlatt9_1_DreieckGleichseitig extends ABlatt9_1_DreiecksArten{

	
	ABlatt9_1_DreieckGleichseitig(double a){
		super(a,a,a);
		//super ... alles paletti
	}
		
	public double berechneHoehe() {
	return a/2 * Math.sqrt(3);
	// h = a durch 2 mal wurzel 3
}

}
