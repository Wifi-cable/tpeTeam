package de.hs.tpe.blatt2a2;

//import de.hs.tpe.blatt2.Eis;

public class SchwabenEis extends Eisdiele {

	@Override
	public Eis erstellen(String typ) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override

	void begruessen(){	// outputt method
		
		System.out.println("Griass Godd?, was moechda sie beschtella");
	
	}
	
@Override
	void kassieren(){	// outputmethod
		double kosten= myEis.preis();
		System.out.println("Des machd noh"+kosten+"eiro bidde.");
	}//des machd noh oi eiro
@Override
	void verabschieden(){//output method
		System.out.println("Adele, gudde abbedied");
	}
@Override
	void endschuldigen(){	// outputmethod
		System.out.println("Dud mir leid, des han mir ned");
	}
}
