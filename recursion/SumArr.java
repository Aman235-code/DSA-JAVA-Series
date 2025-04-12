public class SumArr {
    static int sum(int arr[], int n) {
        if (n <= 0) {
            return 0;
        }
        return arr[n - 1] + sum(arr, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(sum(new int[] { 1, 2, 3, 4, 5 }, 5));
    }
}
