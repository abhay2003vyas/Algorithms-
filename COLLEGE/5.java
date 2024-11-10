import java.util.Scanner;

class Cp4{
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
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Diagonal 1");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i == j){
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
        System.out.println("Diagonal 2");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if((i + j) == (r + c + 1)){
                    System.out.println(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}