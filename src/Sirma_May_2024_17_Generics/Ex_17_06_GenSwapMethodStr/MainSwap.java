package Sirma_May_2024_17_Generics.Ex_17_06_GenSwapMethodStr;

import java.util.Scanner;

public class MainSwap {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        SwapBox<String> swapBoxStr = new SwapBox<>();

        for (int i = 0; i < num; i++) {
            String input = scanner.nextLine();
            swapBoxStr.add(input);
        }

        String[] indexes = scanner.nextLine().split("\\s+");
        int index_1 = Integer.parseInt(indexes[0]);
        int index_2 = Integer.parseInt(indexes[1]);

        swapBoxStr.swapStr(index_1, index_2);

        System.out.println(swapBoxStr);

    }
}
