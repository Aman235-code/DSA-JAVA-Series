class ArrayADT implements ArrayADTInter{

    private final int[] array;

    private int index; 

    private final int size;

    public ArrayADT(int size){
        this.size = size;
        this.array = new int[this.size];
        this.index = 0;
    }

    // insert data to array
    @Override
    public void insert(int value){
        if(index == size-1){
            System.out.println("Array is full");
            return;
        }
        array[index] = value;
        index++;
        System.out.println(index);
    }


    // delete data
    @Override
    public void delete(int deleteIndex){
        if(deleteIndex < 0 || deleteIndex>= index ){
            System.out.println("Invalid index");
        }
        for (int i = deleteIndex; i < index-1; i++) {
            array[i] = array[i+1];
        }
        index--;
    }

    // search 
    @Override
    public int search(int value){
        int indexResult = -1;
        for (int i = 0; i < index; i++) {
            if(array[i] == value){
                indexResult = i;
                break;
            }
        }
        return indexResult;
    }

    // get the data 
    @Override
    public int get(int index){
        if(index< 0 || index >= size){
            System.out.println("Invalid index");
            return -1;
        }
        return array[index];
    }

    // traverse 
    @Override
    public void traverse(){
        for (int i = 0; i < index; i++) {
            System.out.print(array[i]+"\t");
        }
        System.out.println();
    }

    @Override
    public void update(int updateIndex, int value){
        if(updateIndex<0 || updateIndex >= index){
            System.out.println("Invalid index");
            return;
        }
        array[updateIndex] = value;
    }

    // get the size 
    @Override
    public int getSize(){
        return this.index;
    }
}