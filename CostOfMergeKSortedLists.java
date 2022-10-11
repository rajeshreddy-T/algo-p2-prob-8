import java.util.*;

public class CostOfMergeKSortedLists {
	public static void main(String[] args) {
  		int[] a = new int[75000];

		for (int i = 0; i < a.length; i++) {
			a[i] = getRandomVal(1, 10);
		}
		
	
		long startTime = System.currentTimeMillis();
		placeAinMinHeap(a);
		long endTime = System.currentTimeMillis();
		System.out.println("Time taken: " + (endTime - startTime) + "ms");

	}


	public static void placeAinMinHeap(int[] a) {
		Queue<Integer> minHeap = new PriorityQueue<>();
		
		int noOfComparisions = 0;

		if(a.length == 1) {
			System.out.println("There is  only element in a=>" + a[0]);
			return;
		}
		System.out.println("a.length =>" + a.length);
		for (int i = 0; i < a.length; i++) {
			minHeap.add(a[i]);
		}

	
	
		System.out.println("-------------- while loop starts------------------" );
		while (!minHeap.isEmpty()&&minHeap.size() > 1) {
			
            int sumOfTwoSmallestValues = minHeap.poll() + minHeap.poll();		
			noOfComparisions = noOfComparisions + sumOfTwoSmallestValues;
            minHeap.add(sumOfTwoSmallestValues);
			
		}
        System.out.println("no of comparision-->"+noOfComparisions);

	}

	private static int getRandomVal(int min, int max) {
		return (int) (Math.random() * (max - min)) + min;
	}



}