import java.util.Scanner;

public class RotateArray {
    @SuppressWarnings("ManualArrayToCollectionCopy")
    public static void rotate(int[] arr,int rotation,int size) {
        int[] b = new int[size];
        // b= [0,0,0,0,0]
        for (int i = 0; i < rotation ; i++) {
            b[size-rotation+i] = arr[i];
        }

        for (int i = rotation,j=0 ; i < size; i++,j++) {
            b[j] = arr[i];
        }

        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+"\t");
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
                System.out.println("Enter times to rotate: ");
                int rotation = sc.nextInt();
                rotate(arr,rotation,size);            
        }
    }
}

