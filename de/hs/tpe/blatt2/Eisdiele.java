package de.hs.tpe.blatt2;
import java.util.*;
class Eisdiele extends Eis {

	public Eisdiele() {
		// TODO Auto-generated constructor stub
	}
	Eis dummValue= new Eis();
	Eisdiele deinBecher= new Eisdiele();
	Becher customerOrder;
	
	public void bestellen(String typ){	// most important method theoretichally
	deinBecher.bestellen();
	} 
	private String bestellen(){// practically the most important one
		return null;
	}
	
	private boolean isValid(String order){
		order=order.toLowerCase();
		boolean ret=false;
		for (Becher i: Becher.values()){
			String becher =i.toString();
			becher=becher.toLowerCase();
			if (becher==order){
				ret=true;
			}
		}
		return ret;
	}

	
	void begruessen(){
		Scanner input= new Scanner(System.in);
		System.out.println("Guten tag welchen Eisbecher möchten sie bestellen?");
		String order=input.nextLine();
		//setCustomerOrder(order);
		input.close();
	}
	

	void Kassieren(){
		int a=0;
		System.out.println("Das macht"+a+"€ bitte.");
	}
	void verabschieden(){
		System.out.println("Aufwidersehen lassen sie sich ihr Eis schmecken");
	}
	void endschuldigen(){
		System.out.println("Bedaure diesen eissbecher gibt es bei uns nicht");
	}

}
