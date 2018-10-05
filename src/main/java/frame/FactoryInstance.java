package frame;

public class FactoryInstance {
	public static Animal createAnimal(String animalName) {
		//����������������ʽ�����ı䡣��Ҫ�޸Ĵ��룬�����ں���ά��������˵���Σ�
		if("cat".equals(animalName)) {
			return new Cat();
		}else if("dog".equals(animalName)) {
			return new Dog();
		}else {
			return null;
		}
	}
}
