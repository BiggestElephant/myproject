package frame;

public class Singleton2 {
//����ģʽ���ӳټ���ģʽ��ȱ���Ƕ��̷߳��ʵ�ʱ���п��ܴ����������
	private Singleton2() {}
	private static Singleton2 sin=null;
	public static Singleton2 getSingleton2Instance() {
		if(sin==null) {
			sin=new Singleton2();
		}
		return sin;
	}
}
