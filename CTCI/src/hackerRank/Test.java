package hackerRank;

import java.util.Arrays;

public class Test {
	
	public static void main(String[] args) {
		BMaxHeap maxHeap = new BMaxHeap();
		
		maxHeap.add(10);
		maxHeap.add(15);
		maxHeap.add(20);
		maxHeap.add(6);
		maxHeap.add(40);
		maxHeap.heapSort();
		System.out.println(maxHeap);
		BMinHeap minHeap = new BMinHeap();
		minHeap.add(10);
		minHeap.add(15);
		minHeap.add(20);
		minHeap.add(6);
		minHeap.add(40);
		minHeap.heapSort();
		System.out.println(minHeap);
	}
}

