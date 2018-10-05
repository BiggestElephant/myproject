package test;

public class TestThread2 {

	 String s="kakak";
	 public static void main(String[] args) {
		 TestThread2 t2=new TestThread2();
		Runnable runn=new TestRunnableThread(t2);
		runn.run();
		Runnable run2=new TestRunnableThread(t2);
		run2.run();
	}
}
