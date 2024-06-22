package Sirma_May_2024_13_StreamsAndFiles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Ex_13_01_WordLengths {
    public static void main(String[] args) {

        String path = "D:\\Иво1\\Java Course Projects\\2023_Sirma_Academy\\Sirma_2023_Java _Academy\\src\\Sirma_May_2024_13_StreamsAndFiles\\input_13_01.txt";
        List<Integer> wordsLength = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    int size = word.length();
                    wordsLength.add(size);
                }

                line = br.readLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("FileNotFoundException");

        }catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO Exeption");
        }

        for (int i = 0; i < wordsLength.size(); i++) {
            if (i < wordsLength.size() - 1) {
                System.out.printf("%d, ", wordsLength.get(i));
            } else {
                System.out.printf("%d%n", wordsLength.get(i));
            }
        }

    }
}
