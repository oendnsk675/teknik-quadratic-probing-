package hashTable;

public class HashTable {
    private Data[] hashArray;
    private int size;

    public HashTable(int size) {
        this.size = size;
        hashArray = new Data[size];
    }

    public void displayTable() {
        System.out.println("Table: ");
        for (int j = 0; j < size; j++) {
            if (hashArray[j] != null) {
                System.out.println(" | "+j+"\t | "+hashArray[j].getKey() + " |");
            } else {
                System.out.println(" | "+j+"\t | -- |");
            }
        }
        System.out.println("");
    }


    public int hashFunc(int key) {
        return key % size;
    }


    public void insert(int data) {
        Data item= new Data(data);
        int key = item.getKey();
        int hashVal = hashFunc(key);
        while (hashArray[hashVal] != null) {
            ++hashVal;
            hashVal %= size;
        }
        hashArray[hashVal] = item;
    }

    public void insert2(int data) {
        int i = 0;
        Data item = new Data(data);

        int key = item.getKey();
        int hashVal = hashFunc(key);
        System.out.println(data);
        while (hashArray[hashVal] != null) {
//            ++hashVal;
//            hashVal %= size;
//            System.out.println(hashArray[hashVal].getKey() + "indek ke["+hashVal+"]");
            hashVal += i*i;
            i++;
            hashVal %= size;
        }
        hashArray[hashVal] = item;
    }


    public Data delete(int key) {
        System.out.println("pertama mencari hashValnya.");
        int hashVal = hashFunc(key);
        System.out.println("hashVal sama dengan "+hashVal);
        while (hashArray[hashVal] != null) {
            if (hashArray[hashVal].getKey() == key) {
                System.out.println("key ditemukan pada index ke"+hashVal);
                System.out.println("kita tampung dulu data yang mau kita hapus");
                Data temp = hashArray[hashVal];
                System.out.println("kita hapus data hashArray index ke "+hashVal+" dengan mengisi nilainya dengan null");
                hashArray[hashVal] = null;
                System.out.println("kita kembalikan nilai yang kita tampung sebelumnya tersebut");
                return temp;
            }
            System.out.println("data hashArray dengan index ke "+hashVal+" tidak sama dengan key, jida kita telusuri lagi");
            System.out.println("dan hashVal kita increment dan moduluskan "+size);
            ++hashVal;
            hashVal %= size;
            System.out.println("hashVal sama dengan "+hashVal);
        }
        return null;
    }


    public Data find(int key) {
        System.out.println("pertama mencari hashValnya.");
        int hashVal = hashFunc(key);
        System.out.println("hashVal sama dengan "+hashVal);
        while (hashArray[hashVal] != null) {
            if (hashArray[hashVal].getKey() == key) {
                System.out.println("key ditemukan pada index ke"+hashVal);
                return hashArray[hashVal];
            }
            System.out.println("data hashArray dengan index ke "+hashVal+" tidak sama dengan key, jida kita telusuri lagi");
            System.out.println("dan hashVal kita increment dan moduluskan "+size);
            ++hashVal; hashVal %= size;
            System.out.println("hashVal sama dengan "+hashVal);
        }
        return null;
    }
} //akhir class HashTable
