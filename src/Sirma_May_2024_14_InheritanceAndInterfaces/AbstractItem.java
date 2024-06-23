package Sirma_May_2024_14_InheritanceAndInterfaces;

public abstract class AbstractItem implements Item, Categorizable, Breakable, Perishable, Sellable {

    private String name;
    private String category;
    private double price;
    private boolean breakable;
    private  boolean perishable;

    public AbstractItem(String name, String category, double price, boolean breakable, boolean perishable) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.breakable = breakable;
        this.perishable = perishable;
    }

    @Override
    public String getDetails() {
        return String.format("Name: %s, Category: %s, Price: %.2f", this.name, this.category, this.price);
    }

    @Override
    public  void displayDescription() {
        System.out.println(getDetails());
    }

}
