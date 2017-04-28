package de.hs.tpe.blatt2;

public class SpagettiEis extends Eis {
	
//public	String gefaes;
//public	String	Eisbecher;
//public	String form;
//public	double preis;
//public	String[]eisSorten;
//public 	String []extra;
	
	public SpagettiEis(String eisWahl){
	//System.out.println("constructor call "+ eisWahl+" argument");

	//SpagettiEis
	if(eisWahl.equalsIgnoreCase("SPAGETTIEIS")){
		this.gefaes="Schale";
		this.Eisbecher="Spagettieis";
		this.form="durch die nudelpresse gepresst";
		this.preis= 3.50;
		this.eisSorten= new String[1];
		this.eisSorten[0]="Vanille";
		this.extra=new String[3];
		this.extra[0]="Schlagsahne";
		this.extra[1]="Erdbeersauce";
		this.extra[2]="gemalene Mandeln";	
	}
	else {
		System.out.println(" this is not spagetti eis");
	}
		//System.out.println(" Eisbecher ist "+this.Eisbecher);
	}
	
	
	
	
//	public SpagettiEis(String gefaes,String Eisbecher,String form, String []eisSorten,String[]extras,double preis ) {
//		gefaes="Schale";
//		Eisbecher= "Spagettieis";
//		form= "durch die nudelpresse gepresst";
//		//eisSorten={"Vanille"};
//		eisSorten=new String[1];
//		eisSorten[0]="Vanille";
//		preis=3.50;
//		
//	}
	
	
	
	
	
	

}
