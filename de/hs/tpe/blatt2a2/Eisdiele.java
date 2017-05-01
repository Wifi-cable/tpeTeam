/**
 * 
 */
package de.hs.tpe.blatt2a2;

import java.util.Scanner;



/**
 * @author wifi-cable
 *
 */
public abstract class Eisdiele  {

	public abstract Eis erstellen(String typ);
	
	Eisdiele(){

	}
		Eis myEis;

	
//	public Eis bestellen(String typ){	// prepares the ice cream sunday	
//	bestellen();
//	}
	protected abstract void bestellen(String typ);
	abstract Eis realBestellen(String Typ); // practically the most important one
	
//		Scanner input=new Scanner(System.in);
//	
//		begruessen();
//		myEis=new SpagettiEis("spagetti");
//		if (myEis.preis==0.0){
//			endschuldigen();
//			}
//		else{
//			myEis.vorbereiten();
//			myEis.fuellen();
//			myEis.dekorieren();
//			kassieren();
//		}
//		verabschieden();
//		
//		input.close();
//	
//	
//		return myEis;
//	}
	
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
		double kosten= myEis.preis;
		System.out.println("Das macht"+kosten+"€ bitte.");
	}
	void verabschieden(){//output method
		System.out.println("Aufwidersehen lassen sie sich ihr Eis schmecken");
	}
	void endschuldigen(){	// outputmethod
		System.out.println("Bedaure diesen eissbecher gibt es bei uns nicht");
	}

}
