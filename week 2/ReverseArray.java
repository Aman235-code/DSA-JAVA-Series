
import java.util.Scanner;

public class ReverseArray {

    public static void reverseArray(int arr[]){
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
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
                reverseArray(arr);
                for (int val : arr) {
                    System.out.print(val+ " \t");
                }
        }
    }
}
