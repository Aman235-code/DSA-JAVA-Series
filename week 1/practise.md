int print() {
    System.out.println("say hello");
    int a = 89;
    int b = 101;
    System.out.println("sum "+(a+b));
}
o(k) = o(1) = constant (doesn't depend on ip, executing fixed no of times regardless of ip)

int sumArray(int[] arr){
    int sum = 0; // O(1)
    for(int i = 0; i< arr.length; i++){
        sum+=arr[i]; // O(1)
    }  // O(n)
    return sum;
}
= O(1) + O(n) 
= O(n)

for(int i =0; i< n; i++) {
    for(int j =0; j< 100; j++){
        // O(1)
    } // O(1)
} // O(n)
=> O(n)

for (int i = 0; i< n/2; i++){
    System.out.println("v1"); // O(1)
    System.out.println("v2");
} // O(n/2)
=> O(n/2) => O(n)

for(int i =0; i< n;i++){
    for(int j =0; j< m; j++){
        //O(1)
    } O(m)
} // O(n)
=> O(n)*O(m)

for(int i=0, j=n; i< j;i++, j--){
    //O(1)
}

suppose n = 6
itr 1:- 
i = 0, j = 6, 0 < 6 t 
i = 1, j = 5, 1 < 5 t
i = 2, j = 4, 2 < 4 t
i = 3, j = 3, 3 < 3 f 
loop 3 times (half)
n/2 times
o(n/2) => O(n)

