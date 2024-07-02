package Sirma_May_2024_17_Generics;

public class Ex_17_01_02_Main {
    public static void main(String[] args) {

        Ex_17_01_01_Jar<Integer> jarInt = new Ex_17_01_01_Jar<>();
        jarInt.add(8);
        jarInt.add(9);
        jarInt.add(10);

        Ex_17_01_01_Jar<String> jarStr = new Ex_17_01_01_Jar<>();
        jarStr.add("ttt");
        jarStr.add("yyy");
        jarStr.add("ooo");

        while (!jarInt.getStack().isEmpty()) {
            System.out.println(jarInt.remove());
        }

        while (!jarStr.getStack().isEmpty()) {
            System.out.println(jarStr.remove());
        }

    }
}
