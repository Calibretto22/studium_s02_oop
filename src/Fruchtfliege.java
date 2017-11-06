
public class Fruchtfliege {
	private String lateinischerName;
	private int alterInTagen;
	
	Fruchtfliege(){
		lateinischerName = "Petra"; //"drosophila melanogaster";
		alterInTagen = 2;
	}
	
	public void setFAlter(int alterInTagen){
		this.alterInTagen = alterInTagen;
	}
	
	public void setFLateinischerName(String lateinischerName){
		this.lateinischerName = lateinischerName;
	}
	
	public int getFAlter() {
		return alterInTagen;
	}
	
	public String getFLateinischerName() {
		return lateinischerName;
	}
}
