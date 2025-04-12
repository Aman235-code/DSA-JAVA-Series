public class PrintNumber {

    public static void printNumber(int n) {
        // base condition
        if (n == 1) {
            System.out.println(n);
        } else {
            System.out.println(n);
            printNumber(n - 1);
        }
    }

    public static void printNumber2(int n) {
        if (n == 1) {
            System.out.println(n);
        } else {
            printNumber2(n - 1);
            System.out.println(n - 1);
            // System.out.println(n);
        }
    }

    public static void main(String[] args) {

        // 10 to 1
        int n = 10;
        // printNumber(n);

        // 1 to 10
        printNumber2(n);

    }
}
