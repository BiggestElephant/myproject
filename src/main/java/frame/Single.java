package frame;

public class Single {
	//����ģʽ��һ�����ȴ���һ������
	private Single() {}
	private static final Single single=new Single();
	public static Single getSingleInstance() {
		return single;
	}
}
