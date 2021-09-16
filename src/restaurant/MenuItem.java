package restaurant;

import java.util.Date;

public class MenuItem {
    private String category;
    private double price;
    private String description;
    private String name;
    private boolean isNew;
    private Date dateAdded;

    public MenuItem(String name, String description, String category, double price){
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        this.dateAdded = new Date();
    }

    @Override
    public String toString() {
            return this.name + " is a " + this.category + ". It is " + this.description + " and costs $" + price;
            /* return "MenuItem{" +
                "category='" + category + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", name='" + name + '\'' +
                ", isNew=" + isNew +
                '}';

         */
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }
}
