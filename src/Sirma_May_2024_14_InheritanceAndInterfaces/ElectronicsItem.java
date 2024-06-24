package Sirma_May_2024_14_InheritanceAndInterfaces;

public class ElectronicsItem extends InventoryItem {

    private int warrantyPeriod;

    public ElectronicsItem(String name, String category, double price, boolean breakable, boolean perishable, int itemId, int quantity, int warrantyPeriod) {
        super(name, category, price, breakable, perishable, itemId, quantity);
        this.warrantyPeriod = warrantyPeriod;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    @Override
    public double calculateValue() {
        return getPrice() * getQuantity();
    }
}
