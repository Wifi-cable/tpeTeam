package de.hs.tpe.blatt2a2;

//import de.hs.tpe.blatt2.Eis;

//import de.hs.tpe.blatt2.Becher;
//import de.hs.tpe.blatt2.Eisdiele;

abstract class Eis {

//
//	public static void main(String[] args) {
//	Eisdiele venzia= new Eisdiele();
//	venzia.bestellen(" ");
//		
//	}
	
	//fields
	String gefaes,Eisbecher,form;
	double preis;
	String[]eisSorten;
	String []extras;
	

	double preis(){	// getter
	return preis;
	}
	
	//getter
	String behaeltniss(){
		return gefaes;
	}
	//getter
	String art(){
		return form;
	}
	//getter
	String []sorten(){
		return eisSorten;
	}
	// getter
	String []extras(){	
		return extras;
	}
	public abstract Eis erstellen(String typ);
	//output methods
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
	
	// huge setter method. fills all fields according to the "recipe" string matching the user input.
	//if user input invalid Eisbecher is "no", leafes all fields at null.
	protected void rezept(String bestellung){
		if( bestellung.equals("Spagetieis")){
		 
		 gefaes="Schale";
		 Eisbecher="Spagetieis";
		 form="Durch die Nudelpresse gepresstes";
			preis=3.90;
			eisSorten=new String[1];
			eisSorten[0]="vanille eis";
			//String []eisSorten={"Vanille"};
			extras=new String[3];
			extras[0]="Sahne";
			extras[1]="Erdbeeresauce";
			extras[2]="Cocusraspel";
			
		}
		else if (bestellung.equals("Nussbecher")){
			//sorte= "Nuss, Vanille, Schokolade";
			gefaes=	"Kelch";
			Eisbecher="Nussbecher";
			form="kugel";
			preis=5.50;
			eisSorten=new String[3];
			eisSorten[0]="Nuss";
			eisSorten[1]="vannille";
			eisSorten[1]="Sokolade";
			
			extras=new String[2];
			extras[0]="schlagsahne";
			extras[1]="Wallnüsse";
		}	
		else if (bestellung.equals("Bananensplit")){
			
			gefaes=	"lange Schale";
			Eisbecher="Bananensplit";
			form= "kugel";
			preis= 4.50;
			eisSorten=new String[2];
			eisSorten[0]="Banane";
			eisSorten[1]="Schokolade";
			extras=new String[3];
			extras[0]=" aufgeschnittene Banane";
			extras[1]="schlagSahne";
			extras[2]="Schokosauce";
		
		}
		else if (bestellung.equals("Erdbeerbecher")){
		
			gefaes=	"Kelch";
			Eisbecher="Erdbeerbecher";
			form="Baellchen";
			preis=5.00;
			eisSorten=new String[2];
			eisSorten[0]="Erdbeer";
			eisSorten[1]="vanille";
			extras=new String[3];
			extras[0]="Erdbeeren";
			extras[1]="Schlagsahne";
			extras[2]="Erdbeersauce";
		
		}		else if (bestellung.equals("Pinoccio")){
		
			gefaes=	"Teller";
			Eisbecher="Pinoccio Eis";
			form="Kugel";
			preis=3.50;
			eisSorten=new String[3];
			eisSorten[0]="Bannane";
			eisSorten[1]="Erdbeer";
			eisSorten[2]="Schokolade";
			extras=new String[2];
			extras[0]="Waffelroellchen";
			extras[1]="Smarties";
			
		}
		else if (bestellung.equals("Pfirsichmelba")){
			
			gefaes=	"Kelch";
			Eisbecher="Pfirsichbecher";
			form= "kugel";
			preis=5.00;
			eisSorten=new String[3];
			eisSorten[0]="Vannille";
			eisSorten[1]="Mango";
			eisSorten[2]="Pfirsich";
			extras=new String[2];
			extras[0]="Pfirsiche";
			extras[1]="Schlagsahne";
				
		}
	else if (bestellung.equals("Exotikbecher")){
			
			gefaes=	" grosser Kelch";
			Eisbecher="Exotikbecher";
			form= "kugel";
			preis=6.00;
			eisSorten=new String[4];
			eisSorten[0]="Melone";
			eisSorten[1]="Mango";
			eisSorten[2]="Pfirsich";
			eisSorten[3]= "Cocus";
			extras=new String[3];
			extras[0]="tropische Früchte";
			extras[1]="Schlagsahne";
			extras[2]="Kiwisauce";
				
		}
		else{ 
			Eisbecher= "no";
			
		}
	
	}
	
		void speisekate(){ //contains the ennums Becher print them all in correct capitalisation prints the menue.
//		
//		for (Becher i: Becher.values()){
//			String becher =i.toString();
//			String be=becher.substring(1);
//			be=be.toLowerCase();
//			be=	becher.charAt(0)+be;
//			
//			System.out.println(be);		
		}
			
		
		}

