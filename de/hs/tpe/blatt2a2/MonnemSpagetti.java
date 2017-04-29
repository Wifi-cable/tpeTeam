package de.hs.tpe.blatt2a2;

//import de.hs.tpe.blatt2.Eis;

public class MonnemSpagetti extends Eis {

	public MonnemSpagetti() {
		// TODO Auto-generated constructor stub
	
	}

	@Override
	public Eis erstellen(String typ) {
		// TODO copy-paste spageties change one thing
		return null;
	}
	public MonnemSpagetti(String eisWahl){
		//System.out.println("constructor call "+ eisWahl+" argument");

		//SpagettiEis
		if(eisWahl.equalsIgnoreCase("SPAGETTIEIS")){
			this.gefaes="Schale";
			this.Eisbecher="Spagettieis";
			this.form="durch die nudelpresse gepresst";
			this.preis= 3.50;
			this.eisSorten= new String[2];
			this.eisSorten[0]="Vanille";
			this.eisSorten[1]="Zitrone";
			this.extras=new String[4];
			this.extras[0]="Schlagsahne";
			this.extras[1]="Erdbeer sauce";
			this.extras[2]="Monnemer dreck";	
			this.extras[3]="waffel";
		}
		else {
			System.out.println(" this is not spagetti eis");
		}
			//System.out.println(" Eisbecher ist "+this.Eisbecher);
		}


}
