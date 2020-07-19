package restaurant;

import java.util.Arrays;

public class MenuItem {
    private double price;
    private String name;
    private String description;
    private String category = null;
    private boolean isNew;

    public MenuItem(String name, double price, String description, String category, boolean isNew) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.setCategory(category);
        this.isNew = isNew;
    }

    public String getName() {
        return name;
    }

    public boolean isNew() {
        return isNew;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        String[] allowedCategories = {"appetizer", "dessert", "main course"};

        if (Arrays.stream(allowedCategories).anyMatch(category.toLowerCase()::equals)) {
            this.category = category;
        } else {
            System.out.println("Invalid entry. Please resubmit with a valid category");
        }

    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", isNew=" + isNew +
                '}';
    }

    @Override
    public boolean equals(Object item) {
        if (this == item) return true;
        if (!(item instanceof MenuItem)) return false;
        MenuItem menuItem = (MenuItem) item;
        return Double.compare(menuItem.getPrice(), getPrice()) == 0 &&
                isNew() == menuItem.isNew() &&
                getName().equals(menuItem.getName()) &&
                getDescription().equals(menuItem.getDescription()) &&
                getCategory().equals(menuItem.getCategory());
    }

}