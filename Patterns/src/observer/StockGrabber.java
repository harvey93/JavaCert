package observer;

import java.util.ArrayList;

public class StockGrabber implements Subject{

	private ArrayList<Observer> observers;
	
	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;
	
	public void setIbmPrice(double ibmPrice) {
		this.ibmPrice = ibmPrice;
		notifyObserver();
	}

	public void setAaplPrice(double aaplPrice) {
		this.aaplPrice = aaplPrice;
		notifyObserver();
	}

	public void setGoogPrice(double googPrice) {
		this.googPrice = googPrice;
		notifyObserver();
	}

	public StockGrabber() {
		this.observers = new ArrayList<>();
	}

	@Override
	public void register(Observer newObserver) {
		observers.add(newObserver);
		
	}

	@Override
	public void unRegister(Observer deleteObserver) {
		int oIndex = observers.indexOf(deleteObserver);
		System.out.println("Deleted Observer: " + ((StockObserver) deleteObserver).getObserverID());
		observers.remove(oIndex);
		
	}

	@Override
	public void notifyObserver() {
		 for(Observer observer : observers){
			 observer.update(ibmPrice, aaplPrice, googPrice);
		 }
		
	}
	
	

}
