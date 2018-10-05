package frame;

public class SingletonPattern {
		private SingletonPattern(){}
		
		private static SingletonPattern s=null;
		//优化加一个锁；不会浪费空间；浪费时间；
		public static synchronized SingletonPattern getInstance() {
			if(s==null) {
				s=new SingletonPattern();
			}
			return s; 
		}
}
