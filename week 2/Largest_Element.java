
import java.util.Scanner;

public class Largest_Element {

    public static int findLargest(int arr[]){
        int large = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(large < arr[i]){
                large = arr[i];
            }
        }
        return large;
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
            // int arr[] = {20,45,23,11,67};
            System.out.println(findLargest(arr));
        }
    }
}
