public class Complex {

    static void linearTime(){
        int array[] = {1,2,3,4,5,6,7,8};
        for(int i=0;i<array.length;i++){
            System.out.println((i+1) + " times");
            System.out.print(array[i] + " "); // O(n)
        }
    }

    static void constantTime(){
        int array[] = {1,2,3,4,5,6,7,8};
        System.out.println(array[0]); // O(1)
    };

    public static void main(String[] args) {
        constantTime();
        linearTime();
    }
}
