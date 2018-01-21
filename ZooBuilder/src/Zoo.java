import java.util.ArrayList;

public class Zoo {
	ArrayList<Animal> myAnimals = new ArrayList<Animal>();
	
	void addAnimal (Animal a) {
		myAnimals.add(a);
	}
	
	void printAllInfo() {
		for(int i = 0; i < myAnimals.size(); i++) {
			myAnimals.get(i).printInfo(); 
		}
	}
}
