package Sirma_May_2024_17_Generics.Ex_17_09_GenCountMethodDoubles;

import java.util.ArrayList;
import java.util.List;

public class CountBiggerDoubles<T extends Comparable<T>> {
    private List<T> elements;

    public CountBiggerDoubles() {
        this.elements = new ArrayList<>();
    }

    public void add(T element) {
        this.elements.add(element);
    }

    public int counterForBigger(T lastElement) {
        int counter = 0;
        for (T element : elements) {
            if (element.compareTo(lastElement) > 0) {
                counter++;
            }
        }
        return counter;
    }

}
