package Sirma_May_2024_17_Generics.Ex_17_09_GenCountMethodDoubles;

import java.util.Scanner;

public class MainForDoubles {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        CountBiggerDoubles<Double> boxDouble = new CountBiggerDoubles<>();
        for (int i = 0; i < num; i++) {
            double number = Double.parseDouble(scanner.nextLine());
            boxDouble.add(number);
        }

        double comparableNum = Double.parseDouble(scanner.nextLine());

        boxDouble.counterForBigger(comparableNum);

        System.out.println(boxDouble.counterForBigger(comparableNum));

    }
}
