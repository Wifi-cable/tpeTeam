package de.hs.tpe.blatt2;



public class Eis {

	public Eis() {
	
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Eis myEis= new Eis();
		myEis.speisekate();

	}
	
	
	String gefaes,Eisbecher,form;
	double preis;
	String[]eisSorten;
	String []extras;
	

	double preis(){	// getter methode????
	return preis;
	}
	
	
	String behaeltniss(){
		return gefaes;
	}
	String art(){// bällchen spagetti eis etc
		return form;
	}
	String []sorten(){
		return eisSorten;
	}
	String []extras(){	// sahne streusel sauce etc
		return extras;
	}
	void vorbereiten(){
		//behältniss nehmen
	}
	void fuellen(){// behältniss mit sorte nach art
		
	}
	void dekorieren(){}
	// konsolen angabe soll immermit satz zeichen enden.
	
	private void rezept(String bestellung){
		if( bestellung.equals("Spagetieis")){
		 
		 gefaes="Schale";
		 Eisbecher="Spagetieis";
		 form="Durch die Nudelpresse gepresst";
			preis=3.90;
			eisSorten=new String[1];
			eisSorten[0]="vanille";
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
			form="kugeln";
			preis=5.50;
			eisSorten=new String[3];
			eisSorten[0]="Nuss";
			eisSorten[1]="vannille";
			eisSorten[1]="Sokolade";
			
			extras=new String[2];
			extras[0]="schlagsahne";
			extras[0]="Wallnüsse";
		}	
		else if (bestellung.equals("Bananensplit")){
			
			gefaes=	"lange Schale";
			Eisbecher="Bananensplit";
			form= "kugeln";
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
		/*	sorte=
			gefaes=	
			Eisbecher=
			form=
			preis=
			eisSorten=new String[1];
			extras=new String[3];
		*/	
		}		else if (bestellung.equals("Pinoccio")){
		/*	sorte=
			gefaes=	
			Eisbecher=
			form=
			preis=
			eisSorten=new String[1];
			extras=new String[3];
		*/	
		}
		else if (bestellung.equals("Pfirsichbecher")){
		/*	sorte=
			gefaes=	
			Eisbecher=
			form=
			preis=
			eisSorten=new String[1];
			extras=new String[3];
		*/	
		}
		else{}
	
	}
	
	String speisekate(){ //contains the ennums Becher print them all in correct capitalisation
		
		for (Becher i: Becher.values()){
			String becher =i.toString();
			String be=becher.substring(1);
			be=be.toLowerCase();
			be=	becher.charAt(0)+be;
			
			System.out.println(be);		
		}
			
			return null;
		}
	
}
