package Sirma_May_2024_14_InheritanceAndInterfaces;

public abstract class InventoryItem extends AbstractItem {

    private int itemId;
    private int quantity;

    public InventoryItem(String name, String category, double price, boolean breakable, boolean perishable, int itemId, int quantity) {
        super(name, category, price, breakable, perishable);
        this.itemId = itemId;
        this.quantity = quantity;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
