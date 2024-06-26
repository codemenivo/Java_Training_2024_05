package Sirma_May_2024_14_InheritanceAndInterfaces;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class InventoryManager {

    private List<InventoryItem> items;

    public InventoryManager() {
        items = new ArrayList<>();
    }

    public void addItem(InventoryItem item) {
        items.add(item);
    }

    public void removeItemById(int itemId) {

        for (InventoryItem element : items) {
            if (element.getItemId() == itemId) {
                items.remove(element);
            }
        }

    }

    public void listItem() {
        for (InventoryItem item : items) {
            item.displayDescription();
        }
    }

    public void saveToFile(String ItemDetails) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ItemDetails))) {
            for (InventoryItem item : items) {
                writer.write(item.getDetails());
                System.out.println();
            }
        }
    }


    public void loadFromFile(String ItemDetails) throws IOException {
        items.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(ItemDetails))) {
            String line;
            while ((line = reader.readLine()) != null) {
                //TO DO
            }
        }
    }



}
