package frame;

public class FactoryInstance {
	public static Animal createAnimal(String animalName) {
		//如果创建按对象的形式有所改变。需要修改代码，不利于后期维护；比如说传参；
		if("cat".equals(animalName)) {
			return new Cat();
		}else if("dog".equals(animalName)) {
			return new Dog();
		}else {
			return null;
		}
	}
}
