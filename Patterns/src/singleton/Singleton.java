package singleton;
import java.util.concurrent.locks.ReentrantLock;

public class Singleton {
	
	private static Singleton instance;
	
	public static Singleton getIntance(){
		ReentrantLock lock = new ReentrantLock();
		
		if(instance == null){
			lock.lock();
			if(instance == null){
				instance = new Singleton();
			}
			lock.unlock();
			
		}

//		if(instance == null){
//			synchronized(Singleton.class){
//				if(instance == null){
//					instance = new Singleton();
//				}
//			}
//		}
		
		return instance;
	}

	private Singleton(){
		
	}
}
