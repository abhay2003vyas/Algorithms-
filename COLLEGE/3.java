import java.util.Scanner;

class Cp3{
    public static void print(int [][]arr , int r, int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows");
        int r = sc.nextInt();
        System.out.println("Enter Columns");
        int c = sc.nextInt();
        int [][]arr = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix");
        print(arr, r, c);
        int nums[][] = new int[c][r];
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                nums[i][j] = arr[j][i];
            }
        }
        System.out.println("Transpose");
        print(nums, c,r);
    }
}