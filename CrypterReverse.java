package com.hs_ma.tpe.thuerauf_barsalou.blatt_2;

import java.util.Arrays;

public class CrypterReverse implements Crypter{

	@Override
	public String encrypt(String message) {
		char[] cypher = new char[message.length()];
		int j=0;
		for(int i=message.length()-1;i>=0;i--){
			cypher[j]=message.charAt(i);
			j++;
		}
		String cypherText = Arrays.toString(cypher);
		return cypherText;
	}

	@Override
	public String decrypt(String cypherText) {
		char[] M = new char[cypherText.length()];
		int j=0;
		for(int i=M.length-1;i>=0;i--){
			M[j]=cypherText.charAt(i);
			j++;
		}
		String message = Arrays.toString(M);
		return message;
	}

}
