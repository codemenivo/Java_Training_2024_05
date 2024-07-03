package Sirma_May_2024_17_Generics.Ex_17_10_CustomList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CustomList<String> customList = new CustomList<>();

        String command = scanner.nextLine();

        while (!"end".equals(command)) {
            String commandTyp = command.split("\\s+")[0];

            switch (commandTyp) {

                case "Add":
                    String addElement = command.split("\\s+")[1];
                    customList.add(addElement);
                    break;
                case "Remove":
                    int indexToRemove = Integer.parseInt(command.split("\\s+")[1]);
                    customList.remove(indexToRemove);
                    break;
                case "Contains":
                    String checkForElement = command.split("\\s+")[1];
                    System.out.println(customList.contains(checkForElement));
                    break;
                case "Swap":
                    int firstIndex = Integer.parseInt(command.split("\\s+")[1]);
                    int secondIndex = Integer.parseInt(command.split("\\s+")[2]);
                    customList.swap(firstIndex, secondIndex);
                    break;
                case "Greater":
                    String comparableElement = command.split("\\s+")[1];
                    System.out.println(customList.countGreaterThan(comparableElement));
                    break;
                case "Max":
                    System.out.println(customList.getMax());
                    break;
                case "Min":
                    System.out.println(customList.getMin());
                    break;
                case "Print":
                    customList.print();
                    break;

            }


            command = scanner.nextLine();
        }

    }
}
