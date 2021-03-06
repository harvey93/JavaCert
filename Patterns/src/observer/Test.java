package observer;

public class Test {

	public static void main(String[] args) {
		StockGrabber stockGrabber = new StockGrabber();
		StockObserver observer1 = new StockObserver(stockGrabber);
		stockGrabber.setIbmPrice(15.21);
		stockGrabber.setAaplPrice(21.22);
		stockGrabber.setGoogPrice(98.23);
		
		StockObserver observer2 = new StockObserver(stockGrabber);
		stockGrabber.setIbmPrice(15.21);
		stockGrabber.setAaplPrice(21.22);
		stockGrabber.setGoogPrice(98.23);

		stockGrabber.unRegister(observer1);
		stockGrabber.setIbmPrice(15.21);
		stockGrabber.setAaplPrice(21.22);
		stockGrabber.setGoogPrice(98.23);
		
		Runnable getIBM = new GetTheStock(stockGrabber, "IBM", 1);
		Runnable getAAPL = new GetTheStock(stockGrabber, "AAPL", 2);
		Runnable getGOOG = new GetTheStock(stockGrabber, "GOOG", 3);
		
		new Thread(getIBM).start();
		new Thread(getAAPL).start();
		new Thread(getGOOG).start();

	}
}
