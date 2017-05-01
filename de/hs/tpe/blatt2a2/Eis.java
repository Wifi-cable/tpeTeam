package de.hs.tpe.blatt2a2;



abstract class Eis {

	
	//fields
	String gefaes,Eisbecher,form;
	double preis;
	String[]eisSorten;
	String []extras;
	
	public abstract Eis erstellen(String typ);
	
	void vorbereiten(){
	System.out.println("Der Eisverkäufer, säubert den eislöffel und  nimmt "+gefaes+".");
	}
	void fuellen(){	// output method
		System.out.println("");
		System.out.print(gefaes+ " wird mit einer ");
		for (String s:eisSorten){
			System.out.print(form+" "+s+", ");
		}
		System.out.println("gefüllt.");
	}
	void dekorieren(){	// output method
		System.out.print("das eis wird mit ");
		for (String s:extras){
			System.out.print(s+", ");
		}
		System.out.print("dekoriert.");
		System.out.println(" ");
	}
	
		}

