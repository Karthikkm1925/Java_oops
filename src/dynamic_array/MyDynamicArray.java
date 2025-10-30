package dynamic_array;

public class MyDynamicArray {
    private int[] data;   // internal storage
    private int size;     // number of elements added so far

    // Constructor — start with default capacity
    public MyDynamicArray() {
        data = new int[2]; // initial capacity
        size = 0;
    }

    // Add element — auto-resize if full
    public void add(int element) {
        if (size == data.length) {
            resize();
        }
        data[size] = element;
        size++;
    }

    // Get element by index
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        return data[index];
    }

    // Return current number of elements
    public int size() {
        return size;
    }

    // Internal method to double the capacity
    private void resize() {
        int newCapacity = data.length * 2;
        int[] newData = new int[newCapacity];
        // Copy old data to new array
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        data = newData;// dereferenced old array and now reference point is to new array
        System.out.println("Resized to capacity: " + newCapacity);
    }

    // Display all elements
    public void display() {
        System.out.print("[ ");
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("]");
    }

    // Main method for quick test
    public static void main(String[] args) {
        MyDynamicArray arr = new MyDynamicArray();

        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);

        arr.display();

        System.out.println("Element at index 2: " + arr.get(2));
        System.out.println("Current size: " + arr.size());
    }
}

