package com.rmuti;

public class Lab1 {


	String MK35;
	public Lab1(String MK){
		MK35 = MK;
	}
	public static void main (String[] args){
		Lab1 t = new Lab1("Roben");
		Lab1 t2 = new Lab1("LM");
		Lab1 t3 = new Lab1("Ribery,Muller,Gotze");
		t.names();
		t2.posit();
		t3.Friendss();
	}
	void names(){
		System.out.println("name :"+MK35);
	}
	void posit(){
		System.out.println("position :"+MK35);
	}
	void Friendss(){
		System.out.println("Friend :"+MK35);
	}
	
}