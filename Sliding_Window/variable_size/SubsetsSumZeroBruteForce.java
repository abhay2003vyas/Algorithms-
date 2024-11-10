//  Longest Substring Without Repeating Characters
 
import java.util.ArrayList;
import java.util.List;

public class SubsetsSumZeroBruteForce {
    
    // Function to generate all subsets and print those whose sum is zero
    public static void printSubsetsWithZeroSum(int[] nums) {
        int n = nums.length;
        
        // Generate all subsets using bit manipulation (from 0 to 2^n - 1)
        for (int mask = 0; mask < (1 << n); mask++) {
            List<Integer> subset = new ArrayList<>();
            int sum = 0;
            
            // For each bit, check if the element at that index is included in the subset
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {  // Check if the i-th element is included
                    subset.add(nums[i]);
                    sum += nums[i];
                }
            }
            
            // If the sum of the subset is 0, print it
            if (sum == 0 && !subset.isEmpty()) {
                System.out.println(subset);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {7, 3, -1, 0, 1, 4, -6};
        System.out.println("Subsets with sum zero:");
        printSubsetsWithZeroSum(nums);
    }
}
