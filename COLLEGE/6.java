import java.util.Scanner;

class Cp6{

    public static int getD(int [][]arr,int n,int i,int j){
         // det 
        if(n == 2){
            return arr[0][0]*arr[1][1] - arr[0][]
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        int [][]arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
    }
}