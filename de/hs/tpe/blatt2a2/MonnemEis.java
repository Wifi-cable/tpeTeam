package de.hs.tpe.blatt2a2;

//import de.hs.tpe.blatt2.Eis;

public class MonnemEis extends Eisdiele {

Eis dasEis;
	@Override
	public Eis erstellen(String typ) {
		 dasEis = new MonnemSpagetti(typ);
	
		return dasEis;
	}
	// method to budle all helper methods
	@Override
	protected void bestellen(String typ) {
		begruessen();
		Eis e=erstellen(typ);
		if(e.preis==0){
			endschuldigen();
		}
		else{
			zubereitung();
			kassieren();
			
		}
		verabschieden();
	}

	@Override

	void begruessen(){	// outputt method
		System.out.println("morsche Mir kenne a Monnemerisch raedde.");
	}
	
@Override
	void kassieren(){	// outputmethod
		double kosten= dasEis.preis;
		System.out.println("Des mocht "+kosten+" eiro bidde.");
	}//des machd noh oi eiro
@Override
	void verabschieden(){//output method
		System.out.println("Alla gut !");
	}
@Override
	void endschuldigen(){	// outputmethod
		System.out.println("alla schue, des hamer net.");
	}

protected void zubereitung(){ //method to output some strings, mainly to show that supercalss fields have been initiated
	System.out.println("der Eisverkäufer nimmt "+dasEis.gefaes);
	System.out.println( "und  "+dasEis.form+" "+dasEis.eisSorten[0]+", "+dasEis.eisSorten[1]+".");
	System.out.println("decoriert mit "); 
	for( String ex:dasEis.extras){
		String topping=ex;
		System.out.print(" "+topping+",");
	}
	System.out.println(" ");	
	System.out.println("hier ist ihr "+ dasEis.Eisbecher+". ");
}

}


