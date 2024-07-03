package Sirma_May_2024_17_Generics.Ex_17_08_GenCountMethodString;

import java.util.Scanner;

public class MainCountBiggerStr {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        CountBiggerStr<String> countBiggerStr = new CountBiggerStr<>();
        for (int i = 0; i < num; i++) {
            String input = scanner.nextLine();
            countBiggerStr.add(input);
        }
        String comparableElement = scanner.nextLine();

        countBiggerStr.counterForBiggerElements(comparableElement);

        System.out.println(countBiggerStr.counterForBiggerElements(comparableElement));

    }
}
