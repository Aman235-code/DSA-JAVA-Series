import java.util.*;

class NintyMatrix{

    public static void ninty(int[][] arr,int size1,int size2){
        int b[][] = new int[size1][size2];
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2;j++) {
                
                b[j][size1-i-1] = arr[i][j];
            }
        }
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                System.out.print(b[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter size 1: ");
            int size1 = sc.nextInt();
            System.out.println("Enter size 2: ");
            int size2 = sc.nextInt();
            int arr[][] = new int[size1][size2];
            System.out.println("Enter the elements : ");
            for (int i = 0; i < size1; i++) {
                for (int j = 0; j < size2; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            ninty(arr,size1,size2);
        }
    }
}