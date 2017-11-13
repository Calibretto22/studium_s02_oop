import javax.swing.JOptionPane;

public class SimpleGUI {
	String intString; 
	int ganzzahl;
	int qs;
	
	SimpleGUI (){}
	
	void showInputAufforderung() {
	this.intString = JOptionPane.showInputDialog(null,
				" Zahl eingeben ", //Text
				" Zahlenkontrolle ", //Titel
				JOptionPane.QUESTION_MESSAGE); //Bild
		//System.out.println("Das Wort: "+ intString);
	try {this.ganzzahl = Integer.parseInt(intString);}
	catch (Exception ex) {
		showResponse(ex);
	}
	qs = querSumme(ganzzahl);
	}

	void showResponse(Exception fehler) {//gib den fehler in einem Fenster aus, Überladung von showresponse
	JOptionPane.showMessageDialog(null, fehler.getMessage());
		}
	
	void showResponse(String message) {
	JOptionPane.showMessageDialog(null, message);
		}

	int querSumme (int zahl) {
	int querSum = 0 ;
	while (zahl  > 0 ) {
		querSum = querSum + zahl % 10;
		zahl = zahl / 10 ;
			}
	querSum = (querSum <10) ? querSum : querSumme(querSum);
	return querSum;
	}
	
	public int getQS() {
		return qs;
	}
}
