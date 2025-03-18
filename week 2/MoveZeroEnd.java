import java.util.Scanner;

public class MoveZeroEnd {

    public static void moveZeroEnd(int arr[]){
        int track = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                arr[track] = arr[i];
                track++;
            }
        }
        while(track<arr.length){
            arr[track] = 0;
            track++;
        }
        for (int val : arr) {
            System.out.print(val+"\t");
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
                moveZeroEnd(arr);        
        }
    }
}




