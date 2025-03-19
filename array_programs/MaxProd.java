import java.util.*;

public class MaxProd {

    public static void prod(int[] arr){
        int prod = 0;
        for(int i=0; i< arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                int nProd = arr[i]*arr[j];
                if(nProd > prod){
                    prod = nProd;
                }
            }
        }
        System.out.println(prod);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter size: ");
            int size = sc.nextInt();
            int arr[] = new int[size];
            System.out.println("Enter the elements : ");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            prod(arr);
        }
    }
}
