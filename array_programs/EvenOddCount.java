import java.util.*;
class EvenOddCount{

    public static void evenOdd(int[] arr){
        int even = 0;
        int odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if(i%2 == 0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println(even + " "+ odd);


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
                evenOdd(arr);             
        }
    }
}

// 1,2,3,4,5,6