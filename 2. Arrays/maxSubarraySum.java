public class maxSubarraySum {
	public static void maxSubarraySums(int numbers[]) {
		int currSum = 0;
		int maxSum = Integer.MIN_VALUE;
		for(int i=0; i<numbers.length; i++) {
			for (int j=i; j<numbers.length; j++) {
				currSum = 0;
				for(int k=i; k<=j; k++) {
					//subarray sum
					currSum += numbers[k];
				}
				System.out.println(currSum);
				if(currSum > maxSum) {
					maxSum = currSum;
				}
			}
		}
		System.out.println("Max Sum =" + maxSum);
	}
	
	public static void main(String [] args) {
		int numbers[] = {2, 4, 6, 8, 10};
		maxSubarraySums(numbers);
	}

}

//Time complexity is O(n3)