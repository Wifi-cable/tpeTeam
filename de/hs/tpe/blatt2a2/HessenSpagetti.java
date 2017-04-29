package de.hs.tpe.blatt2a2;

//import de.hs.tpe.blatt2.Eis;

public class HessenSpagetti extends Eis {

	public HessenSpagetti() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Eis erstellen(String typ) {
		// TODO Auto-generated method stub
		return null;
	}
	public HessenSpagetti(String eisWahl){
		//System.out.println("constructor call "+ eisWahl+" argument");

		//SpagettiEis
		if(eisWahl.equalsIgnoreCase("SPAGETTIEIS")){
			this.gefaes="Schale";
			this.Eisbecher="Spagettieis";
			this.form="durch die nudelpresse gepresst";
			this.preis= 3.50;
			this.eisSorten= new String[1];
			this.eisSorten[0]="Vanille";
			this.extras=new String[3];
			this.extras[0]="Schlagsahne";
			this.extras[1]="Himbersauce";
			this.extras[2]="Cocus flocken";	
		}
		else {
			System.out.println(" this is not spagetti eis");
		}
			//System.out.println(" Eisbecher ist "+this.Eisbecher);
		}
		

}
