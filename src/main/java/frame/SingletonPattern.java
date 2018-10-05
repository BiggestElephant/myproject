package frame;

public class SingletonPattern {
		private SingletonPattern(){}
		
		private static SingletonPattern s=null;
		//�Ż���һ�����������˷ѿռ䣻�˷�ʱ�䣻
		public static synchronized SingletonPattern getInstance() {
			if(s==null) {
				s=new SingletonPattern();
			}
			return s; 
		}
}
