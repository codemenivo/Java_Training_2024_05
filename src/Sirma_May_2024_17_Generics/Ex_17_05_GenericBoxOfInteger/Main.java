package Sirma_May_2024_17_Generics.Ex_17_05_GenericBoxOfInteger;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        BoxInt<Integer> box = new BoxInt<>();

        for (int i = 0; i < num; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            box.add(number);
        }

        System.out.println(box);
    }
}
