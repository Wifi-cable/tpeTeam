package de.hs.tpe.blatt2;
//import java.util.*;
class Eisdiele {

	public Eisdiele() {
		// TODO Auto-generated constructor stub
	}

	protected Eis myeis;
	//SpagettiEis mySpagetti= new SpagettiEis();
	//Eis myEis= new Eis();
	//public void bestellen(String typ){	// prepares the ice cream sunday	
		// make the type 
	//bestellen();
//	}
	
	public void bestellen(String bestellung){
			begruessen();
			
			 myeis=new SpagettiEis(bestellung);
			System.out.println(myeis.getClass());
			System.out.println(myeis.preis);
			if (myeis.preis==0.0){
				System.out.println(myeis.preis);
				System.out.println(myeis.Eisbecher);
				
				endschuldigen();
			}
			//Eis	e=this.bestellen(bestellung);	// will proff so, funst aber net weil constructor noch  nicht string nimmt
			else{
			System.out.println("in bestellen sorte="+myeis.Eisbecher);
		//	System.out.println("in bestellen sorte="+mySpagetti.Eisbecher); geht
			kassieren();
			verabschieden();
			
			//endschuldigen();
		
			}
	}
//		Scanner input=new Scanner(System.in);
//		System.out.println("wir haben");
//		speisekate();
//		Eis myEis= new Eis();
//		begruessen();
//		String bestellung= input.nextLine();	// muss dann in die methode oben. das macht so keinen sinn
//		//myEis.rezept(bestellung);
//		
//		if (myEis.Eisbecher==null){
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
//		return null;	// i have no clue why this is string
//	}
//	
	
	void begruessen(){	// outputt method
		
		System.out.println("Guten tag welchen Eisbecher möchten sie bestellen?");
	}
	

	void kassieren(){	// outputmethod
		double kosten= myeis.preis;
		System.out.println( "ein "+myeis.Eisbecher+" Das macht"+kosten+"€ bitte.");
	}
	void verabschieden(){//output method
		System.out.println("Aufwidersehen lassen sie sich ihr Eis schmecken");
	}
	void endschuldigen(){	// outputmethod
		System.out.println("Bedaure diesen eissbecher gibt es bei uns nicht");
	}
	void speisekate(){ //contains the ennums Becher print them all in correct capitalisation prints the menue.
		
		for (Becher i: Becher.values()){
			String becher =i.toString();
			String be=becher.substring(1);
			be=be.toLowerCase();
			be=	becher.charAt(0)+be;
			
			System.out.println(be);		
		}
			
		}
}
