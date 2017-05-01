package de.hs.tpe.blatt2a2;

//import de.hs.tpe.blatt2.Eis;

public class MainAbstractEis {

	public static void main(String[] args) {
		System.out.println("In Mannheim...");
		Eisdiele Adria= new MonnemEis();
		Adria.bestellen("SPAGETTIEIS");
		System.out.println(" ");
		
		System.out.println("Irgendwo in Hessen...");
		Eisdiele Venezia= new HessenEis();
		Venezia.bestellen("SPAGETTIEIS");
		System.out.println(" ");
		
		System.out.println("im Laendle...");
		Eisdiele Dolomiti=new SchwabenEis();
		Dolomiti.bestellen("SPAGETTIEIS");
	}

}
