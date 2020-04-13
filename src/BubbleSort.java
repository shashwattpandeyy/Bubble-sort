public class BubbleSort {
    public static void main(String[] args) {
        arrayBUb arr;
        arr = new arrayBUb(100);
        arr.insert(77);
        arr.insert(34);
        arr.insert(12);
        arr.insert(9);
        arr.insert(43);
        arr.insert(21);
        arr.insert(58);
        arr.insert(98);
        arr.insert(100);
        arr.insert(24);
        arr.display();

        arr.bubbleSort();
        arr.display();
    }
}
