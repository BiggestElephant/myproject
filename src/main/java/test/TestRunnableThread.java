package test;

public class TestRunnableThread implements Runnable{
	private TestThread2 t2;
	
	public TestRunnableThread(TestThread2 t2) {
		this.t2=t2;
	}
	
	public TestRunnableThread() {
		
	}

	
	public void run() {
		t2.s="lalalla";
		System.out.println(t2.s);
	}
	
	
}
