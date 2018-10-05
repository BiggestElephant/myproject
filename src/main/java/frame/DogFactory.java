package frame;

public class DogFactory implements Factory{

	public Animal createAnimal() {
		// TODO Auto-generated method stub
		return new Dog();
	}
	
}
