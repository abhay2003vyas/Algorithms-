// Maximum of all the subarrays of size k 
import java.util.*;
class P4{
    public static int[] slidingMaximum(final int[] A, int B) {
        int n = A.length;
        if (n == 0 || B <= 0) return new int[0];

        int[] result = new int[n - B + 1];
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            // Remove elements from the queue that are out of the sliding window range
            while (!queue.isEmpty() && queue.peek() <= i - B)
                queue.poll();

            // Remove elements from the queue that are smaller than the current element
            while (!queue.isEmpty() && A[i] >= A[queue.peekLast()])
                queue.pollLast();

            // Add the current element to the queue
            queue.offer(i);

            // If the sliding window size has been reached, add the maximum element to the result
            if (i >= B - 1)
                result[i - B + 1] = A[queue.peek()];
        }

        return result;
    }
    public static void main(String[] args) {
        int arr[] = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int []nums = slidingMaximum(arr, k);
        for(int i : nums){
            System.out.print(i+" ");
        }
    }
}