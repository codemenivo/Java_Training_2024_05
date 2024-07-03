package Sirma_May_2024_17_Generics.Ex_17_07_GenSwapMethodInt;

import Sirma_May_2024_17_Generics.Ex_17_06_GenSwapMethodStr.SwapBox;

import java.util.Scanner;

public class MainSwapInt {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        SwapIntBox<Integer> swapIntBox = new SwapIntBox<>();

        for (int i = 0; i < num; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            swapIntBox.add(number);
        }

        String[] indexes = scanner.nextLine().split("\\s+");
        int firstIndex = Integer.parseInt(indexes[0]);
        int secondIndex = Integer.parseInt(indexes[1]);

        swapIntBox.swapInt(firstIndex, secondIndex);

        System.out.println(swapIntBox);

    }
}
