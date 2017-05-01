package de.hs.tpe.blatt2a2;

//import de.hs.tpe.blatt2.Eis;

public class HessenEis extends Eisdiele {

	Eis dasEis;
	@Override
	public Eis erstellen(String typ) {
		 dasEis = new HessenSpagetti(typ);
			//Eis spagetti =bestellen(typ);
			return dasEis;
		
	}
@Override

	void begruessen(){	// outputt method
		
		System.out.println("Ei gude! was derfs 'n sei?");
	
	}
	
@Override
	void kassieren(){	// outputmethod
		double kosten= dasEis.preis;
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
Eis realBestellen(String Typ) {
	// TODO Auto-generated method stub
	return null;
}

protected void zubereitung(){ //method to output some strings, mainly to show that supercalss fields have been initiated
	System.out.println("der Eisverkäufer nimmt "+dasEis.gefaes);
	System.out.println( "und  "+dasEis.form+" "+dasEis.eisSorten[0]+" ");
	System.out.println("decoriert mit "); 
	for( String ex:dasEis.extras){
		String topping=ex;
		System.out.print(" "+topping);
	}
	System.out.println(" ");	
	System.out.println("hier is ihr "+ dasEis.Eisbecher);
}

}
