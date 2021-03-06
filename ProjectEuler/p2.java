public class p2 {
public static void main(String[]args) {
	int result = 0;
	int[] nums= new int[100000];	            //placing a high array limit
		nums[0] = 1;		// starting off the array
		nums[1] = 2;		// starting off the array

		for(int i = 2; i <= 10000; i++) {
			nums[i] = (nums[i-2]) + (nums[i-1]);			// setting up an array with a loop
			}

		for(int i = 0; i <= 10000; i++) {
			if(nums[i]%2 == 0 && result < 4000000) {			// even number <4million
				result += nums[i];
				}
			}

	System.out.println("The sum of the even valued terms where the Fibonacci sequence value does not exceed 4 Million = " + result);
  // Prints the sum of the even valued terms (Answer = 4613732)
    }
}