package com.class26.AbstractModifier;

public class PhoneTest {

public static void main(String[] args) {
		
		//Phone phone=new Phone(); CE: we cannot create an object of Abstract class
		Phone iphone=new IPhone();
		iphone.makeCall();
		iphone.sendText();
		iphone.navigate();
		iphone.playMusic();
		
		Phone samsung =new Samsung();
		samsung.makeCall();
		samsung.sendText();
		samsung.navigate();
		samsung.playMusic();
	}
}
abstract class Phone {

	public void makeCall() {
		System.out.println("Phone makes call");
	}
	
	public void sendText() {
		System.out.println("Phone can send text");
	}
	
	public abstract void navigate();
	
	public abstract void playMusic();
	
	//public abstract void takePicture();
}

class Samsung extends Phone {
	
	public void navigate() {
		System.out.println("Samsung navigates...");
	}
	
	public void playMusic() {
		System.out.println("Samsung plays music from google store");
	}
}

class IPhone extends Phone{
	
	public void navigate() {
		System.out.println("iPhone navigates gps from google apple store");
	}
	
	public void playMusic() {
		System.out.println("iPhone plays music in apple store");
	}
}

   