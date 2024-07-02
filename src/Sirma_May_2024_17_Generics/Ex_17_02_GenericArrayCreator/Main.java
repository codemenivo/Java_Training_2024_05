package Sirma_May_2024_17_Generics.Ex_17_02_GenericArrayCreator;

public class Main {
    public static void main(String[] args) {

        ArrayCreator arrayCreator = new ArrayCreator();

        String[] strArray = ArrayCreator.create(String.class, 5, "YYY");
        Integer[] intArray = ArrayCreator.create(5, 12);

        for (Integer integer : intArray) {
            System.out.printf("%d ", integer);
        }
        System.out.println();

        for (String s : strArray) {
            System.out.printf("%s ", s);
        }

    }
}
