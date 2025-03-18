import java.util.Scanner;

public class MissingNumber {

    public static int missing(int[] arr,int size){
        int last = arr[size-1];

        int sumOfAll = (last*(last+1))/2;

        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sumOfAll-sum;
        
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
                int no = missing(arr,size);
                System.out.println(no);
                    
        }
    }
}

// 1,2,4,5,6 = 18

// 1,2,3,4,5,6 = 21 

// last elem = 6
// 6*7/2 = 42/2 = 21 



