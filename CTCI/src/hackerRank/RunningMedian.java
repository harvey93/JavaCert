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
		return 0.0;
	}
}
