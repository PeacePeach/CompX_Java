import java.util.ArrayList;

public class ZooBuilder {
	public static void main(String args[]) {
		Zoo myZoo = new Zoo();
		Animal myAnimal1 = new Animal();
		Animal myAnimal2 = new Panda();
		Animal myAnimal3 = new Elephant();
		Animal myAnimal4 = new Panda("Mei Shiang", 14);
		Animal myAnimal5 = new Elephant("Jumbo", 5);
		Animal myAnimal6 = new Lion();
		Lion myAnimal7 = new Lion("Scar", 12);
		
		// Add all the animals in the zoo
		myZoo.addAnimal(myAnimal1);
		myZoo.addAnimal(myAnimal2);
		myZoo.addAnimal(myAnimal3);
		myZoo.addAnimal(myAnimal4);
		myZoo.addAnimal(myAnimal5);
		
		myZoo.printAllInfo();
		myAnimal6.printInfo();
		myAnimal7.printInfo();
		
		// Testing polymorphism of method
		
	}
}

class Animal {
    String name;
    String species;
    int age;
    
    // Default constructor
    Animal() {
    	this.name = "Momo";
    	this.species = "Cat";
    	this.age = 5;
    }
    
    // Alternate constructor
    Animal(String name, String species, int age) {
    	this.name = name;
    	this.species = species;
    	this.age = age;
    }
    
    public void printInfo() {
    	System.out.println(this.name + ", " + this.species + ", " + this.age);
    }

}
 
class Panda extends Animal{
    // Default panda constructor
	Panda() {
		super("Spot", "Panda", 0);
	}
	
	//Alternate panda constructor
	Panda(String name, int age) {
		super(name, "Panda", age);
	}
}
 
class Elephant extends Animal{
    // Default elephant constructor
	Elephant() {
		super("Elle", "Elephant", 0);
	}
	
	// Alternate elephant constructor
	Elephant(String name, int age) {
		super(name, "Elephant", age);
	}
	
	
}

class Lion extends Animal{
    // Default panda constructor
	Lion() {
		super("Simba", "Lion", 1);
	}
	
	//Alternate panda constructor
	Lion(String name, int age) {
		super(name, "Lion", age);
	}
	
	 public void printInfo() {
	    	System.out.println("Roar!!!");
	    }
	
}

