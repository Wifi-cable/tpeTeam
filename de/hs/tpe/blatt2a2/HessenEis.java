package de.hs.tpe.blatt2a2;

//import de.hs.tpe.blatt2.Eis;

public class HessenEis extends Eisdiele {

	@Override
	public Eis erstellen(String typ) {
		
		return null;
	}
@Override

	void begruessen(){	// outputt method
		
		System.out.println("Ei gude! was derfs 'n sei?");
	
	}
	
@Override
	void kassieren(){	// outputmethod
		double kosten= myEis.preis();
		System.out.println("Des macht denn"+kosten+"€ bidde.");
	}
@Override
	void verabschieden(){//output method
		System.out.println("Ei's OK, gudde hunger");
	}
@Override
	void endschuldigen(){	// outputmethod
		System.out.println("dut mer leid, dees ham'mer net");
	}


}
