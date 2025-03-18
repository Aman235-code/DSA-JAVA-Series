import java.util.Scanner;

public class Freq {
    public static void freq(int[] arr){
        int k = 0;
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            int elem = arr[k];
            int count = 1;
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i] == arr[j]){
                    count++;
                }
                else{
                    k = j;
                    i = k-1;
                    
                }
            }
            System.out.print(elem +" : "+count + "\t");
        }
        System.out.print("}");

    }
     public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
                System.out.println("Enter size: ");
                int size = sc.nextInt();
                int arr[] = new int[size];
                System.out.println("Enter the elements : ");
                for(int i = 0; i<size; i++){
                    arr[i] = sc.nextInt();
                } 
                
                freq(arr);                        
        }
    }
}

// 3,3,4,4,4,5,6,6,6,6
   

