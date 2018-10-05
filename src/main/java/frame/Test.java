package frame;

public class Test {
	public static void main(String[] args) {
		Dog dog=(Dog) FactoryInstance.createAnimal("dog");
		dog.eat();
		Cat cat=(Cat) FactoryInstance.createAnimal("cat");
		cat.eat();
		
		//���Եڶ���ģʽÿ�������Ӧһ������
		DogFactory df=new DogFactory();
		Dog d=(Dog) df.createAnimal();
		d.eat();
		CatFactory cf=new CatFactory();
		Cat c=(Cat) cf.createAnimal();
		c.eat();

		//this is test file for github
	}
}
