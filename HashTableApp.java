package hashTable;

public class HashTableApp {
    public static void main(String[] args) {
        HashTable theTable = new HashTable(15);

        theTable.insert2(16);
        theTable.insert2(10);
        theTable.insert2(9);
        theTable.insert2(8);
        theTable.insert2(4);
        theTable.insert2(31);
        theTable.insert2(1);
        theTable.displayTable();
//        theTable.insert(16);
//        theTable.insert(10);
//        theTable.insert(9);
//        theTable.insert(8);
//        theTable.insert(4);
//        theTable.insert(1);

//        theTable.insert(2);
//        theTable.insert(15);
//        theTable.insert(20);
//        theTable.insert(5);
//        System.out.println("penambahan data sebanyak 10");
//        theTable.displayTable();
//        theTable.insert(14);
//        theTable.insert(21);
//        theTable.insert(3);
//        theTable.insert(7);
//        theTable.insert(32);
//        System.out.println("penambahan data sebanyak 5");
//        theTable.displayTable();
//        System.out.println("data "+theTable.find(1).getKey()+" ditemukan");
//        System.out.println("data "+theTable.delete(1).getKey()+" ditemukan");
    }
}
