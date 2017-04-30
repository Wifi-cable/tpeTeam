package de.hs.tpe.blatt2;

class Eisdiele {

	public Eisdiele() {
	}

	protected Eis myeis;

	
	public void bestellen(String bestellung){
			begruessen();
			
			 myeis=new SpagettiEis(bestellung);
			System.out.println("sie wollten ein "+myeis.getClass());
		
			if (myeis.preis==0.0){//if checks weather fields are uninitiated. (if object does not exist this happens)
				System.out.println(myeis.preis);
				System.out.println(myeis.Eisbecher);
				//appologises because something obviously went wrong
				endschuldigen();
			}
			else{//the fields of the subclass are initiated, a correct string was endered. 
			kassieren();
			verabschieden();
			}
	}
	
	void begruessen(){	// outputt method
		System.out.println("Guten tag welchen Eisbecher möchten sie bestellen?");
	}
	

	void kassieren(){	// output method
		double kosten= myeis.preis;
		System.out.println( "ein "+myeis.Eisbecher+" Das macht "+kosten+"€ bitte. ");
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
