class Box<T> {
    T value;

    void set(T val) {
        value = val;
    }

    T get() {
        return value;
    }
}

public class Exp7_Generics {
    public static <E> void printArray(E[] arr) {
        for (E element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.set(10);
        System.out.println("Box contains: " + intBox.get());

        String[] strArr = {"Java", "is", "fun"};
        printArray(strArr);
    }
}
