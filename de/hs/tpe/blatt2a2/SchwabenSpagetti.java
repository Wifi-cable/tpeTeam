package de.hs.tpe.blatt2a2;

//import de.hs.tpe.blatt2.Eis;

public class SchwabenSpagetti extends Eis {

	public SchwabenSpagetti() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Eis erstellen(String typ) {
		// TODO Auto-generated method stub
		return null;
	}
	public SchwabenSpagetti(String eisWahl){
		//System.out.println("constructor call "+ eisWahl+" argument");

		//SpagettiEis
		if(eisWahl.equalsIgnoreCase("SPAGETTIEIS")){
			this.gefaes="Schale";
			this.Eisbecher="Spagettieis nach Spätzleart";
			this.form="durch die Knopfle reibe gerieben";
			this.preis= 3.50;
			this.eisSorten= new String[1];
			this.eisSorten[0]="Vanille";
			this.extras=new String[3];
			this.extras[0]="Schlagsahne";
			this.extras[1]="Annanas sauce";
			this.extras[2]="Krokant stückchen";	
		}
		else {
			System.out.println(" this is not spagetti eis");
		}
			//System.out.println(" Eisbecher ist "+this.Eisbecher);
		}

}
