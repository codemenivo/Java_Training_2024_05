package Sirma_May_2024_17_Generics.Ex_17_10_CustomList;

import java.util.ArrayList;
import java.util.List;

public class CustomList<T extends Comparable<T>>{
    private List<T> elements;

    public CustomList() {
        this.elements = new ArrayList<>();
    }

    public void add(T element) {
        this.elements.add(element);
    }

    public T remove(int index) {
        if (index >= 0 && index < this.elements.size()) {
            return this.elements.remove(index);
        } else {
            throw new IndexOutOfBoundsException("Invalid index");
        }

    }

    public boolean contains(T element) {
        return this.elements.contains(element);
    }

    public void swap(int firstIndex, int secondIndex) {
        if ((firstIndex >= 0 && firstIndex <= this.elements.size() - 1)
                && (secondIndex >= 0 && secondIndex <= this.elements.size() - 1)) {

            T firstElement = this.elements.get(firstIndex);
            T secondElement = this.elements.get(secondIndex);

            this.elements.set(firstIndex, secondElement);
            this.elements.set(secondIndex, firstElement);
        } else {
            throw new IndexOutOfBoundsException("Invalid index");
        }
    }
    
    public int countGreaterThan(T elementForCompare) {
        int counter = 0;
        for (T listElement : elements) {
            if (listElement.compareTo(elementForCompare) > 0) {
                counter++;
            }
        }
        return counter;
    }

    public T getMax() {
        return this.elements.stream().max((e1, e2) -> e1.compareTo(e2)).get();
    }

    public T getMin() {
        return this.elements.stream().min((e1, e2) -> e1.compareTo(e2)).get();
    }

    public void print(){
        for (T element : elements) {
            System.out.println(element);
        }
    }

}
