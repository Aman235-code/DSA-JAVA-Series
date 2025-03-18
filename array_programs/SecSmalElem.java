import java.util.Scanner;

public class SecSmalElem {
    public static void ssm(int arr[]){
        int fs = arr[0];
        int ss = arr[1];
        for (int i = 0; i < arr.length; i++) {
            if(fs > arr[i]){
                ss = fs;
                fs = arr[i];
            }
            else if(ss > arr[i] && arr[i] != fs){
                ss = arr[i];
            }
        }
        System.out.println(ss);
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
                ssm(arr);                        
        }
    }
}

