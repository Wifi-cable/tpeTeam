package de.hs.tpe.blatt2t2;

import java.util.Scanner;


	// Ceaser Chiffre
public class CrypterCaesar implements Crypter {	
	// constructor with parameters to choose the decrypt and encrypt key.
	CrypterCaesar(int key){
		quickInit(key);
	}
	//second constructor to get key from user
	CrypterCaesar(){
		init();
	}
	
	private char[] Alphabet = new char[52];
	private char[] keyAlphabet = new char[26];
	private int key;
// asks the user to enter a Key via the console
	private void getKey() {//make sure key is bigger than 0! never trust user data
		System.out.print("Bitte geben Sie ihren Schlüssel ein: \n");
		Scanner input = new Scanner(System.in);
		key = input.nextInt() % 26;
		//input.close();
	}
	// uses the key to shift an alphabet for the ammount of the key.
	protected void init() {
		getKey();
		for (int i = 0; i < 26; i++) {
			Alphabet[i] = (char) (65 + i);
		}
		for (int i = 26; i < 52; i++) {
			Alphabet[i] = Alphabet[i - 26];
		}
		for (int i = 0; i < 26; i++) {
			keyAlphabet[i] = Alphabet[i + key];
		}
	}
	// same as init() but without an input via the console
	protected void quickInit(int key){
		key %= 26;
		for (int i = 0; i < 26; i++) {
			Alphabet[i] = (char) (65 + i);
		}
		for (int i = 26; i < 52; i++) {
			Alphabet[i] = Alphabet[i - 26];
		}
		for (int i = 0; i < 26; i++) {
			keyAlphabet[i] = Alphabet[i + key];
		}
	}
	
	// gets the index of the char in the regular alphabet and puts the char out of the shifted alphabet with teh same inde at the end of the dcrypted string
	public String encrypt(String message) {
		String cypherText = "";
		message = message.toUpperCase();
		for (int i = 0; i < message.length(); i++) {

			for (int j = 0; j < 26; j++) {
				try {
					if (message.charAt(i) == Alphabet[j]) {
						cypherText += keyAlphabet[j];
					}
				} catch (ArrayIndexOutOfBoundsException e) {
					System.err.println("Ungültiges Zeichen gefunden");
				}
				catch(NullPointerException e){
					System.err.println("Not initialized");
				}
			}
		}
		return cypherText;
	}
	// works like encrypt, but the other way around.
	public String decrypt(String cypherText) {
		String message = "";
		cypherText = cypherText.toUpperCase();
		for (int i = 0; i < cypherText.length(); i++) {
			for (int j = 0; j < 26; j++) {
				try {
					if (cypherText.charAt(i) == keyAlphabet[j]) {	//the difference to encrypt 
						message += Alphabet[j];
					}
				} catch (ArrayIndexOutOfBoundsException e) {
					System.err.println("Ungültiges Zeichen gefunden.");
				}
				catch(NullPointerException e){
					System.err.println("Not initilized!");
				}
			}
		}
		return message;
	}

}
