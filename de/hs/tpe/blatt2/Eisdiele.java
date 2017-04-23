package de.hs.tpe.blatt2;
import java.util.*;
class Eisdiele extends Eis {

	public Eisdiele() {
		// TODO Auto-generated constructor stub
	}
	//Eis dummValue= new Eis();
//	Eisdiele deinBecher= new Eisdiele();
	//Becher customerOrder;

	//Eisdiele lokal= new Eisdiele();
	Eis myEis= new Eis();
	public void bestellen(String typ){	// prepares the ice cream sunday	
	bestellen();
	}

	private String bestellen(){// practically the most important one
	
		Scanner input=new Scanner(System.in);
		System.out.println("wir haben");
		myEis.speisekate();
		begruessen();
		String bestellung= input.nextLine();
		myEis.rezept(bestellung);
		
		if (myEis.Eisbecher.equals("no")){
			endschuldigen();
			}
		else{
			myEis.vorbereiten();
			myEis.fuellen();
			myEis.dekorieren();
			kassieren();
		}
		verabschieden();
		
		input.close();
	
	
		return null;
	}
	
//	private boolean isValid(String order){
//		order=order.toLowerCase();
//		boolean ret=false;
//		for (Becher i: Becher.values()){
//			String becher =i.toString();
//			becher=becher.toLowerCase();
//			if (becher==order){
//				ret=true;
//			}
//		}
//		return ret;
//	}

	
	void begruessen(){	// outputt method
		
		System.out.println("Guten tag welchen Eisbecher möchten sie bestellen?");
	
	}
	

	void kassieren(){	// outputmethod
		double kosten= myEis.preis();
		System.out.println("Das macht"+kosten+"€ bitte.");
	}
	void verabschieden(){//output method
		System.out.println("Aufwidersehen lassen sie sich ihr Eis schmecken");
	}
	void endschuldigen(){	// outputmethod
		System.out.println("Bedaure diesen eissbecher gibt es bei uns nicht");
	}

}
