package Sirma_May_2024_14_InheritanceAndInterfaces;

public class FragileItem extends InventoryItem {

    private double weight;

    public FragileItem(String name, String category, double price, boolean breakable, boolean perishable, int itemId, int quantity, double weight) {
        super(name, category, price, breakable, perishable, itemId, quantity);
        this.weight = weight;
    }


    public double getWeight() {
        return weight;
    }


    @Override
    public double calculateValue() {
        return getPrice() * getQuantity();
    }
}
