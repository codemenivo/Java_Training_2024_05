package Sirma_May_2024_17_Generics.Ex_17_05_GenericBoxOfInteger;

import java.util.ArrayList;
import java.util.List;

public class BoxInt<T> {
    private List<T> intElements;

    public BoxInt() {
        this.intElements = new ArrayList<>();
    }

    public void add(T intElement) {
        this.intElements.add(intElement);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T intElement : intElements) {
            sb.append(intElement.getClass().getName()).append(": ").append(intElement).append("\n");
        }
        return sb.toString();
    }

}
