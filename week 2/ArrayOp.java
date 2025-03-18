public class ArrayOp {
    public static void main(String[] args) {
        ArrayADTInter array = new ArrayADT(10);
        array.insert(20);
        array.insert(30);
        array.insert(50);
        System.out.println(array.getSize());

        array.traverse();

        array.update(1, 90);

        array.traverse();

        int s = array.search(90);
        System.out.println(s);

        array.delete(1);

        System.out.println(array.getSize());

        array.traverse();

        System.out.println(array.get(1));

        int val =array.get(4);
        System.out.println(val);
    }
}
