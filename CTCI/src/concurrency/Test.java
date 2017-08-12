package concurrency;

public class Test {

	public static void main(String[] args) {
		Race race = new Race();
		Runner john = new Runner("john", race);
		Runner hrant = new Runner("hrant", race);
		Runner jane = new Runner("jane", race);
		Runner vuzh = new Runner("vuzh", race);
		Runner khacho = new Runner("khacho", race);
		Runner papa = new Runner("papa", race);
		Runner mama = new Runner("mama", race);
		Runner nush = new Runner("nush", race);
		Runner winner = null;
		john.start();
		hrant.start();
		jane.start();
		vuzh.start();
		khacho.start();
		papa.start();
		mama.start();
		nush.start();
	}
}

class Thread2 implements Runnable{
	String name;
	public Thread2(String name){
		this.name = name;
	}
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}

class myThread extends Thread{
	public static int count;
	public void run(){
		System.out.println(count);
		count++;
	}
}