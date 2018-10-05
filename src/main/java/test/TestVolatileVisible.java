package test;

public class TestVolatileVisible extends Thread{
	
	private  volatile  boolean stop=true;
	
	public   void stopMe() {
		System.out.println(Thread.currentThread());
		stop=false;
		System.out.println("change stop");
	}
	
	public static void main(String[] args) throws InterruptedException {
		TestVolatileVisible tv=new TestVolatileVisible();
		TestVolatileVisible tv1=new TestVolatileVisible();
		
		tv.start();
		tv.sleep(3000);
		tv1.start();
		
		
		
		
		
		
		
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread());
		if(stop) {
			stop=false;
		}else {
			stop=true;
		}
		System.out.println("change stop");
		
		int i=0;
		while(stop) {
			System.out.println(i++);
		}
		System.out.println("over");
		
	}
	
}
