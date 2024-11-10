// Given an array containing N positive integers and an integer K. Your task is to find the length of the longest Sub-Array with sum of the elements equal to the given value K.
import java.util.*;
class VS1{
    public static int subarraySum(int[] nums, int k) {
        int i = 0;
        int j = 0;
        int sum = 0;
        int count = 0;
        while (j < nums.length) {
            sum += nums[j];
            if (sum == k) {
                count++;
            }
            if (sum <= k) {
                j++;
            } else {
                while (sum > k) {
                    sum -= nums[i];
                    i++;
                    if (sum == k) {
                        count++;
                    }
                }
                j++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        int k = 3;
        System.out.println(subarraySum(arr, k));
    }
}