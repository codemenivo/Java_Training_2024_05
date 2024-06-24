package Sirma_May_2024_14_InheritanceAndInterfaces;

public class GroceryItem extends InventoryItem {

    private String expirationDate;

    public GroceryItem(String name, String category, double price, boolean breakable, boolean perishable, int itemId, int quantity, String expirationDate) {
        super(name, category, price, breakable, perishable, itemId, quantity);
        this.expirationDate = expirationDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    @Override
    public double calculateValue() {
        return getPrice() * getQuantity();
    }
}
