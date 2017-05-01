package de.hs.tpe.blatt2a2;

//import de.hs.tpe.blatt2.Eis;

public class MainAbstractEis {

	public static void main(String[] args) {
		Eisdiele adria= new MonnemEis();
		adria.bestellen("SPAGETTIEIS");
		
		Eisdiele Venezia= new HessenEis();
		Venezia.bestellen("SPAGETTIEIS");
	//Eis meinEis=adria.bestellen("SPAGETTIEIS");	// statischer typ ist  Eis. dynamischer sollte  monnemspageti sein
	
	//System.out.println(meinEis.Eis"SPAGETTIEIS"becher); 
	}

}
