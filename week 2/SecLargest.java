import java.util.Scanner;

public class SecLargest {

    public static int secLargest(int arr[]){
        int l = arr[0];
        int sl = arr[1];
        for (int i = 0; i < arr.length; i++) {
            if(l < arr[i]){
                sl = l;
                l = arr[i];
                
            }
           else if (sl < arr[i] && arr[i] != l){
             
              sl = arr[i];
           }
        }
        return sl;
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
                int secL = secLargest(arr);
                System.out.println(secL);         
        }
    }
    
}
