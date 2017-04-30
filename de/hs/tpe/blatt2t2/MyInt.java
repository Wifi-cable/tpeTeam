package de.hs.tpe.blatt2t2;

public class MyInt implements Comparable<MyInt> {
	int value;
	public MyInt(int value){
		this.value=value;
	}
	
	int getValue(){
		return value;
	}

	public int compareTo(MyInt o) {
		int ret=0;
		if (value <((MyInt)o).value ){
	
			ret=-1;
		}
		else if((value >((MyInt)o).value )){
			ret=1;
		}
	
		 return ret;
	}

}
