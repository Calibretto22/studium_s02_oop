
public class ABlatt9_1_DreieckGleichschenklig extends ABlatt9_1_DreiecksArten{
	
	ABlatt9_1_DreieckGleichschenklig(double basis, double schenkel){
		super(schenkel, schenkel, basis);
		//super ... alles paletti
	}
	
	public double berechneHoehe() {
		return Math.sqrt(Math.pow(a, 2)- Math.pow((c/2), 2));
		// h = wurzel aus a quadrat minus c halbe quadrat
}
}
