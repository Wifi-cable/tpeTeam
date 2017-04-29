package de.hs.tpe.blatt2a2;

//import de.hs.tpe.blatt2.Eis;

public class MainAbstractEis {

	public static void main(String[] args) {
		Eisdiele adria= new MonnemEis();
	Eis meinEis=adria.erstellen("SPAGETTIEIS");	// statischer typ ist  Eis. dynamischer sollte  monnemspageti sein
	System.out.println(meinEis.Eisbecher); 
	}

}
