package Sirma_May_2024_17_Generics.Ex_17_11_SmartIntegerList;

import java.util.function.Consumer;

public class SmartArray {
    public static final int INITIAL_CAPACITY = 4;
    public static final int INITIAL_SIZE = 0;

    private int[] data;
    private int size;
    private int capacity;

    public SmartArray() {
        this.size = INITIAL_SIZE;
        this.capacity = INITIAL_CAPACITY;
        this.data = new int[INITIAL_CAPACITY];
    }

    public void add(int element) {
        this.ensureCapacity();
        this.data[size] = element;
        this.size++;

    }

    private void resize() {
        this.capacity = this.capacity * 2;
        int[] temp = new int[capacity];
        for (int i = 0; i < this.size; i++) {
            temp[i] = this.data[i];
        }
        this.data = temp;

    }

    public int size() {
        return this.size;
    }

    public int get(int index) {
        this.checkIndex(index);
        return this.data[index];
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= this.size) {
            String errorMessage = String.format("Index %d is out of bounds for our SmartArray", index);
            throw new IndexOutOfBoundsException(errorMessage);
        }
    }

    public int remove(int index) {
        int numberToRemove = this.get(index);
        this.shiftLeft(index);
        this.size--;

        if (this.capacity / this.size > 4) {
            this.shrink();
        }

        return numberToRemove;
    }

    private void shrink() {
        this.capacity = this.capacity / 2;
        int[] temp = new int[this.capacity];
        for (int i = 0; i < this.size; i++) {
            temp[i] = this.data[i];
        }
        this.data = temp;
    }

    private void shiftLeft(int index) {
        for (int i = index + 1; i < this.size; i++) {
            this.data[i - 1] = this.data[i];
        }
    }

    public boolean contains(int element) {
        for (int i = 0; i < this.size; i++) {
            if (this.data[i] == element) {
                return true;
            }
        }
        return false;
    }

    public boolean isEmpty() {
        if (this.size == 0) {
            return true;
        }
        return false;
    }

    //Returns the index of the first occurrence of the specified element in this list,
    // or -1 if this list does not contain the element.
    public int indexOf(int element) {
        for (int i = 0; i < this.size; i++) {
            if (element == this.data[i]) {
                return i;
            }
        }
        return -1;
    }

    public int lastInfexOf(int element) {
        for (int i = this.size - 1; i >= 0 ; i--) {
            if (element == this.data[i]) {
                return i;
            }
        }
        return -1;
    }

    public void add(int index, int element) {

        this.checkIndex(index);
        this.ensureCapacity();
        this.size++;
        this.shiftRigth(index);
        this.data[index] = element;

    }

    private void shiftRigth(int index) {
        for (int i = this.size - 1; i > index ; i--) {
            this.data[i] = this.data[i - 1];
        }
    }

    private void ensureCapacity() {
        if (this.size == this.capacity) {
            this.resize();
        }
    }

    public void forEach(Consumer<Integer> consumer) {
        for (int i = 0; i < this.size; i++) {
            consumer.accept(this.data[i]);
        }
    }

}

