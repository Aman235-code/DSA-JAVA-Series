import java.util.Scanner;

public class Alternate {

    public static void alternate(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(i%2==0){
                // System.out.println(i);
                System.out.print(arr[i]+"\t");
            }
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
                alternate(arr);                         
        }
        
     }
}

