/**
 * 
 */
package de.hs.tpe.blatt2a2;

import java.util.Scanner;



/**
 * der vorteil dieser optopm ist das durch verernung genauere und spezifischere unterklassen gebaut werden können. das 
 * funktioniert so gut wie polimorphismus.  es erlaubt allerdings das die oberklasse von der alle unterklassen erben 
 * vage bleibt und die details erst später implementiert werden.
 * 
 * in der main erlaubt die abstrakte oberklase in schnelles switchen zwischen den unterklassen objecten durch
 *  dynamsische bindung. 
 *
 */
public abstract class Eisdiele  {

	public abstract Eis erstellen(String typ);
	
	Eisdiele(){

	}
		Eis myEis;

//abstract method because every subclass implements it differently
	protected abstract void bestellen(String typ);



	
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

