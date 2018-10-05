package frame;

public class Single {
	//饿汉模式，一来就先创建一个对象；
	private Single() {}
	private static final Single single=new Single();
	public static Single getSingleInstance() {
		return single;
	}
}
