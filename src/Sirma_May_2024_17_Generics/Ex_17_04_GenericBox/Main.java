package Sirma_May_2024_17_Generics.Ex_17_04_GenericBox;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        Box<String> strBox = new Box<>();

        for (int i = 0; i < num; i++) {
            String input = scanner.nextLine();
            strBox.add(input);
        }
        System.out.println(strBox);




    }
}
