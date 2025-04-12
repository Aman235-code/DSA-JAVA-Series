public class TowerOfHanoi {

    static void tow(int n, char source, char helper, char dest) {

        // base condition
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + dest);
            return;
        }

        tow(n - 1, source, dest, helper);
        System.out.println("Move disk " + n + " from " + source + " to " + dest);
        tow(n - 1, helper, source, dest);
    }

    public static void main(String[] args) {
        tow(3, 'A', 'B', 'C');
    }
}
