import java.util.Scanner;

public class MergeArr {

    public static void merge(int arr[],int brr[], int n1, int n2){
        int ns = n1+n2;
        int crr[] = new int[ns];
        int tracking = 0;
        
        for (int i = 0; i < arr.length; i++) { 

            crr[tracking] = arr[i];
            tracking++;
        }
        for (int i = 0; i < brr.length; i++) {
            crr[tracking] = brr[i];
            tracking++;
        }
        for (int i = 0; i < crr.length; i++) {
            System.out.print(crr[i] + "\t");
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
                System.out.println("Enter size a: ");
                int size1 = sc.nextInt();
                int arr[] = new int[size1];
                System.out.println("Enter size b: ");
                int size2 = sc.nextInt();
                int brr[] = new int[size2];
                System.out.println("Enter the elements of a : ");
                for(int i = 0; i<size1; i++){
                    arr[i] = sc.nextInt();
                } 
                System.out.println("Enter the elements of b: ");
                for(int i = 0; i<size2; i++){
                    brr[i] = sc.nextInt();
                } 
                merge(arr, brr,size1,size2);                        
        }
    }
}
