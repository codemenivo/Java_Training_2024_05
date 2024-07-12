package Sirma_May_2024_17_Generics.Ex_17_11_SmartIntegerList;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        SmartArray smartArray = new SmartArray();
        smartArray.add(1);
        smartArray.add(2);
        smartArray.add(2);
        smartArray.add(4);
        smartArray.add(2);
        smartArray.add(5);
        int num = 2;
        System.out.println(smartArray.printAllIndexesForElements(num));

        //ArrayList<String> str = new ArrayList<>();


    }
}
