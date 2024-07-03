package Sirma_May_2024_17_Generics.GenCountMethodString;

import java.util.ArrayList;
import java.util.List;

public class CountBiggerStr<T extends Comparable<T>> {
    private List<T> elements;

    public CountBiggerStr() {
        this.elements = new ArrayList<>();
    }

    public void add(T element) {
        this.elements.add(element);
    }

    public int counterForBiggerElements (T element) {
        int counter = 0;
        for (T listElement : elements) {
            if (listElement.compareTo(element) == 1) {
                counter++;
            }
        }
        return counter;
    }


}
