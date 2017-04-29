package com.hs_ma.tpe.thuerauf_barsalou.blatt_2;

// reverse crrypter methode turning the string around
public class CrypterReverse implements Crypter{

	@Override
	public String encrypt(String message) {
		char[] cypher = new char[message.length()];	//creates a char[] the same length as the message;
		int j=0;
		for(int i=message.length()-1;i>=0;i--){		// turns the message around
			cypher[j]=message.charAt(i);
			j++;
		}
		String cypherText = toString(cypher);	// calls a toString method
		return cypherText;												
	}

	@Override
	public String decrypt(String cypherText) {		// decrypt works the same as encrypt
		char[] M = new char[cypherText.length()];
		int j=0;
		for(int i=M.length-1;i>=0;i--){
			M[j]=cypherText.charAt(i);
			j++;
		}
		String message = toString(M);
		return message;
	}
	private String toString(char[] array){		// builds a String out of the charArray. 
		String ret = "";
		for(int i=0; i<array.length;i++){
			ret += array[i];
		}
		return ret;
	}
}
