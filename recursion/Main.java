public class Main {

    public static void printData1(int n) {
        System.out.println(n);
    }

    public static void printData(int n) {
        System.out.println(n);
        printData1(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("Started");
        printData(5);
        System.out.println("Program ends");
    }
}