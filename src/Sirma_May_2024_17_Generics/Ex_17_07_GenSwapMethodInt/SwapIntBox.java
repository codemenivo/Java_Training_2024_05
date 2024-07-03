package Sirma_May_2024_17_Generics.Ex_17_07_GenSwapMethodInt;

import java.util.ArrayList;
import java.util.List;

public class SwapIntBox<T> {
    private List<T> intElements;
    public SwapIntBox() {
        this.intElements = new ArrayList<>();
    }

    public void add(T element) {
        this.intElements.add(element);
    }

    public void swapInt(int firstIndex, int secondIndex) {
        T firstElement = intElements.get(firstIndex);
        T secondElement = intElements.get(secondIndex);

        this.intElements.set(firstIndex, secondElement);
        this.intElements.set(secondIndex, firstElement);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T intElement : intElements) {
            sb.append(String.format("%s: %d%n", intElement.getClass().getName(), intElement));
        }
        return sb.toString();
    }



}
