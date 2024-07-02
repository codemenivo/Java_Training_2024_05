package Sirma_May_2024_17_Generics.Ex_17_04_GenericBox;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {

    private List<T> elements;

    public Box() {
        this.elements = new ArrayList<>();
    }

    public void add(T element) {
        this.elements.add(element);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T element : elements) {
            sb.append(element.getClass().getName()).append(": ").append(element);
            System.out.println();
        }
        return sb.toString();
    }


}
