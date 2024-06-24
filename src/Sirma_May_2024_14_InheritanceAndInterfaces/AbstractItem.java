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

    @Override
    public double calculateValue() {

        return price;
    }

    @Override
    public void setCategory(String category) {

        this.category = category;
    }

    @Override
    public String getCategory() {
        return category;
    }

    @Override
    public boolean isBreakable() {

        return breakable;
    }

    @Override
    public void handlingBreakage() {
        if (breakable) {
            System.out.printf("%s Atention! Breakable Product", this.name);
        }
    }

    @Override
    public boolean isPerishable() {
        return perishable;
    }

    @Override
    public void handlingExpiration() {
        System.out.printf("%s The expiration date has expired");
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }
}
