package de.hs.tpe.blatt2t2;

public class MyString {
	String content;
	public MyString(String text){
		this.content=text;
	}
	public String getContent(){
		return content;
}

	public int compareTo(MyString o) {

		String st=o.getContent();
		return content.compareTo(st);
	}
	public String toString(){
		return content;
	}
}