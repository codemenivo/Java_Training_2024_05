package Sirma_May_2024_17_Generics.Ex_17_06_GenSwapMethodStr;

import java.util.ArrayList;
import java.util.List;

public class SwapBox<T> {

    private List<T> elements;

    public SwapBox() {
        this.elements = new ArrayList<>();
    }

    public void add(T elment) {
        this.elements.add(elment);
    }

    public void swapStr(int firstIndex, int secondIndex) {
        T firstElement = elements.get(firstIndex);
        T secondElement = elements.get(secondIndex);

        this.elements.set(firstIndex, secondElement);
        this.elements.set(secondIndex, firstElement);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T element : elements) {
            sb.append(String.format("%s: %s%n", element.getClass().getName(), element));
        }

        return sb.toString();
    }

}
