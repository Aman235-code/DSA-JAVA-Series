import java.util.Scanner;

public class OccurElement {


    public static int OccuredTimes(int arr[], int tElem){
        int times = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == tElem){
                times++;
            }
        }
        return times;
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
                System.out.println("Target element: ");
                int tElem = sc.nextInt();
                int o = OccuredTimes(arr, tElem);
                System.out.println(o);
                
        }
    }
}
