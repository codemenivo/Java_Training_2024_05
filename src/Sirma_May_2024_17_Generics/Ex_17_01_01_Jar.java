package Sirma_May_2024_17_Generics;

import java.util.ArrayDeque;

public class Ex_17_01_01_Jar<T> {

    private ArrayDeque<T> stack;

    public Ex_17_01_01_Jar() {
        this.stack = new ArrayDeque<>();
    }

    public void add(T element) {
        this.stack.push(element);
    }

    public T remove() {
        return stack.pop();
    }

    public ArrayDeque<T> getStack() {
        return stack;
    }
}
