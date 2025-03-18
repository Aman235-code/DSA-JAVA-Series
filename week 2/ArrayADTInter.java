
interface ArrayADTInter {

    // insert data to array
    void insert(int value);

    // delete data
    void delete(int deleteIndex);

    // search 
    int search(int value);

    // get the data 
    int get(int index);

    // traverse 
    void traverse();

    void update(int updateIndex, int value);

    // get the size 
    int getSize();

}