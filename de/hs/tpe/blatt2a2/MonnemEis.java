package de.hs.tpe.blatt2a2;

import de.hs.tpe.blatt2.Eis;

public class MonnemEis extends AbstractEisdiele {

	@Override
	public Eis erstellen(String typ) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override

	void begruessen(){	// outputt method
		
		System.out.println("morsche");
	
	}
	
@Override
	void kassieren(){	// outputmethod
		double kosten= myEis.preis();
		System.out.println("Des mocht"+kosten+"eiro bidde.");
	}//des machd noh oi eiro
@Override
	void verabschieden(){//output method
		System.out.println("Alla gut");
	}
@Override
	void endschuldigen(){	// outputmethod
		System.out.println("alla schue,des hamer net");
	}
}


