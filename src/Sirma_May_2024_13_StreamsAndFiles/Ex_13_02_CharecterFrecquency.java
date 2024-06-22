package Sirma_May_2024_13_StreamsAndFiles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Ex_13_02_CharecterFrecquency {
    public static void main(String[] args) throws IOException {

        String path = "D:\\Иво1\\Java Course Projects\\2023_Sirma_Academy\\Sirma_2023_Java _Academy\\src\\Sirma_May_2024_13_StreamsAndFiles\\input_13_02.txt";
        Map<Character, Integer> countChar = new LinkedHashMap<>();

        BufferedReader br = new BufferedReader(new FileReader(path));
        String line = br.readLine();

        while (line != null) {
            for (int i = 0; i < line.length(); i++) {
                char temp = line.charAt(i);
                if (!countChar.containsKey(temp)) {
                    countChar.put(temp, 1);
                } else {
                    int currentCount = countChar.get(temp);
                    countChar.put(temp, currentCount + 1);
                }
            }

            line = br.readLine();
        }

        for (Map.Entry<Character, Integer> entry : countChar.entrySet()) {
            System.out.printf("%c: %d%n", entry.getKey(), entry.getValue());
        }

    }
}
