package frame;

public class Singleton2 {
//单例模式的延迟加载模式；缺点是多线程访问的时候有可能创建多个对象；
	private Singleton2() {}
	private static Singleton2 sin=null;
	public static Singleton2 getSingleton2Instance() {
		if(sin==null) {
			sin=new Singleton2();
		}
		return sin;
	}
}
