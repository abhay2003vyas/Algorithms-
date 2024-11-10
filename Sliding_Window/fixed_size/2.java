// First Negative Number in every Window size of K
// o/p array size : N - K + 1

import java.util.*;
class P2 {
    public static long[] printFirstNegativeInteger(long A[], int N, int K) {
        int i = 0;
        int j = 0;
        long[] ans = new long[A.length - K + 1];
        Queue<Long> queue = new LinkedList<>();
        long x = 0;
        while (j < A.length) {
            long flag = A[j];
            if (flag < 0) {
                queue.add(flag);
            }
            if (j - i + 1 < K) {
                j++;
            } else if (j - i + 1 == K) {
                if (queue.isEmpty()) {
                    ans[(int) x++] = 0;
                } else {
                    ans[(int) x++] = queue.peek();
                    if (A[i] == queue.peek()) {
                        queue.remove();
                    }
                }
                i++;
                j++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        long arr[] = { 12, -1, -7, 8, -15, 30, 16, 28 };
        long []nums = printFirstNegativeInteger(arr, arr.length, 3);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i] + " ");
        }
    }
}