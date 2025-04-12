public class MainRecursion {

    public static void printNum(int n) {
        // base condition
        if (n == 1) {
            System.out.println(n);
        } else {
            System.out.println(n);
            printNum(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Program started");
        printNum(5);
        System.out.println("End");
    }
}
