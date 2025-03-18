import java.util.Scanner;

public class LinearSearch{

    public static int linearSearch(int arr[],int target){
        int index = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                index = i;
                break;
            }
        }
        return index;
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
                int index = linearSearch(arr,target);
                System.out.println(index);           
        }
    }
}