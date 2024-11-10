//  maximum sum  if subarray of size K

import java.util.*;

class P1{
    public static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        // code here
        int i = 0;
        int j = 0;
        long max = Long.MIN_VALUE;
        long sum = 0;
        
        while(j<N){
            sum = sum + Arr.get(j);
            if(j-i+1 < K){
                j++;
            }
            else if(j-i+1 == K){
                max = Math.max(max,sum);
                sum = sum - Arr.get(i);
                i++;
                j++;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>(Arrays.asList(100, 200, 300, 400));
        System.out.println(maximumSumSubarray(2, l, l.size()));
    }
}