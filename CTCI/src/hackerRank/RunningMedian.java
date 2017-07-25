package hackerRank;

import java.util.Comparator;
import java.util.PriorityQueue;

public class RunningMedian {

	public static double getMedians(int [] arr){
		PriorityQueue<Integer> lowers = new PriorityQueue<>(new Comparator<Integer>() {
			public int compare(Integer a, Integer b){
				return -1 * a.compareTo(b);
			}
		});
		
		PriorityQueue<Integer> highers = new PriorityQueue<>();
		double[] medians = new double[arr.length];
		for(int i = 0; i < arr.length; i++){
			int number = arr[i];
			addNumber(number, lowers, highers);
		}
		return 0.0;
	}
	
	public static void addNumber(int number, PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers){
		
	}
	
	public static void rebalance(PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers){
		
	}
	
}
