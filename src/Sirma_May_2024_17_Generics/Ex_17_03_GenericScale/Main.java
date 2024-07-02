package Sirma_May_2024_17_Generics.Ex_17_03_GenericScale;

public class Main {
    public static void main(String[] args) {

        Scale<Integer> intScale = new Scale<>(15, 18);
        System.out.println(intScale.getHeavier());

        Scale<String> strScale = new Scale<>("Gosho", "Gosho");
        System.out.println(strScale.getHeavier());


    }
}
