class Box<T> {
    private T value;
    public Box(T value) {
        this.value = value;
    }
    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
    public void display() {
        System.out.println("Value in box: " + value);
    }
}
public class Generic{
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
                Box<Integer> integerBox = new Box<>(100);
        integerBox.display(); 
        integerBox.setValue(200);
        integerBox.display();
        
        Box<String> stringBox = new Box<>("Hello, Generics!");
        stringBox.display(); 
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Printing Integer array:");
        printArray(intArray);
        String[] strArray = {"Apple", "Banana", "Cherry"};
        System.out.println("\nPrinting String array:");
        printArray(strArray);
    }
}
/*

*/

*/
