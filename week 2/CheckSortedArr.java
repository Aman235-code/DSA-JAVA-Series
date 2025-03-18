import java.util.Scanner;

public class CheckSortedArr {

    public static int checkSorted(int arr[]){
        boolean sorted = true;
        // if(arr[0]<arr[1]){
        //     for (int i = 0; i < arr.length-1; i++) {
        //         if(arr[i]<arr[i+1]){
        //             continue;
        //         }
        //         sorted = false;
        //         break;
        //     }
        // }
        // if(arr[0]>arr[1]){
        //     for (int i = 0; i < arr.length-1; i++) {
        //         if(arr[i]>arr[i+1]){
        //             continue;
        //         }
        //         sorted = false;
        //         break;
        //     }
        // }
        // int res = sorted?1:0;
        // System.out.println(res);
        // return res;

        // asc order 
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i+1] < arr[i]){
                sorted = false;
            }
        }
        System.out.println(sorted);
        return 1;
        
    }
    public static void main(String[] args) {
         try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter size: ");
                int size = sc.nextInt();
                int arr[] = new int[size];
                System.out.println("Enter the elements: ");
                for(int i = 0; i<size; i++){
                    arr[i] = sc.nextInt();
                }
                int checkS = checkSorted(arr);
                System.out.println(checkS);         
        }
    }
}


    
