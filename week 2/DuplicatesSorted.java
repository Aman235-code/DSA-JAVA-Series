import java.util.Scanner;

public class DuplicatesSorted {
    public static void removeDup(int arr[],int size){
        // int b[] = new int[size];
        int t = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=arr[t]){
                t++;
                arr[t] = arr[i];
            }
        }
        for (int val : arr) {
            System.out.println(val + "\t");
        }
        
    }
    public static void main(String[] args) {
         try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter size: ");
                int size = sc.nextInt();
                int arr[] = new int[size];
                System.out.println("Enter the elements in sorted manner: ");
                for(int i = 0; i<size; i++){
                    arr[i] = sc.nextInt();
                }
                removeDup(arr,size);     
        }
    }
}





