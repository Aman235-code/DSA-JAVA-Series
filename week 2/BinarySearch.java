import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int arr[], int target){
        int low = 0;
        int high = arr.length;

        while(low<=high){
            int mid =(low+high)/2;

            if(arr[mid] == target){
                return mid;
            }
            if(target < arr[mid]){
                high = mid - 1;
            }
            if(target > arr[mid]){
                low = mid + 1;
            }
        }
        return -1;
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
                System.out.println("Enter the target: ");
                int target = sc.nextInt();
                int index = binarySearch(arr,target);
                System.out.println(index);           
        }
    }
}
