package com.syntax.class21;

public class AnimalTest {
public static void main(String[] args) {
		
		//object of parent class has an access to all var and methods of it is own class ONLY
		Animal a=new Animal();
		a.breed="Something";
		a.color="grey";
		a.paws=4;
		
		a.sleep();
		a.eat();
		
		//object of child class has an access to all var and methods of it is Parent and it is own Class
		Dog dog=new Dog();
		dog.breed="Husky";
		dog.color="Yellow";
		dog.paws=4;
		dog.tail=true;
		
		dog.eat();
		dog.sleep();
		dog.bark();
		
		//create an Object of Cat class
		Cat cat = new Cat();
		cat.breed = "Siamese";
		cat.color = "black";
		cat.paws = 4;
		cat.fur = "fluffy";
		cat.tail = true;
		
		cat.sleep();
		cat.eat();
		cat.purr();
		
		// //create object for Kitten class
		Kitten kit = new Kitten();
		kit.breed = "Siamese";
		kit.color = "black and white";
		kit.paws = 4;
		kit.fur = "soft";
		kit.tail = true;
		kit.age = 1;
		kit.number = 3;
		
		kit.sleep();
		kit.eat();
		kit.purr();
		kit.askForMilk();
		kit.play();
	}
}
