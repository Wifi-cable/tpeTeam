package com.hs_ma.tpe.thuerauf_barsalou.blatt_2;

import java.util.Scanner;

public class CrypterCaesar implements Crypter {
	private char[] Alphabet = new char[52];
	private char[] keyAlphabet = new char[26];
	private int key;

	private void getKey() {
		System.out.print("Bitte geben Sie ihren Schlüssel ein: \n");
		Scanner UI = new Scanner(System.in);
		key = UI.nextInt() % 26;
		UI.close();
	}

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

	public String decrypt(String cypherText) {
		String message = "";
		cypherText = cypherText.toUpperCase();
		for (int i = 0; i < cypherText.length(); i++) {
			for (int j = 0; j < 26; j++) {
				try {
					if (cypherText.charAt(i) == keyAlphabet[j]) {
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
