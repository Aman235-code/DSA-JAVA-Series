public class test {

    public static int[] inc(int arr[]){

        int size = arr.length;
        for (int i = size-1; i >=0 ; i--) {
            if(arr[i] < 9){
                arr[i]++;
                return arr;
            }
            arr[i]=0;
        }

        int nArray[] = new int[size+1];
        nArray[0] = 1;
        return nArray;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{9};
        int[] nArr= inc(arr);
        for (int i = 0; i < nArr.length; i++) {
            System.out.println(nArr[i]);
        }
    }
}

// 1,2,3
// 1,2,4

//9 => 1,0

// if it is [1,2,3]
// then take the last digit and inc it by 1 then return the array
// if it is less than 9 only in 
// if it's more than 9 create  new arr  insert 0 at that pos

