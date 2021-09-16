package restaurant;

import java.util.Date;

public class Restaurant {
    public static void main(String[] args) {
        Menu restaurantMenu = new Menu();
        MenuItem spaghetti = new MenuItem("Spaghetti", "Noodles with sauce","Main Course", 10.00);
        MenuItem garlicBread = new MenuItem("Garlic Bread", "toasted garlic bread", "Appetizer", 7.25);
        MenuItem cheesecake = new MenuItem("Cheesecake", "cheesecake", "Dessert", 6.50);
        MenuItem chicken = new MenuItem("Chicken Parmesan", "breaded chicken", "Main Course", 15.00);
        restaurantMenu.addItem(spaghetti);
        restaurantMenu.addItem(garlicBread);
        restaurantMenu.addItem(cheesecake);
        restaurantMenu.addItem(chicken);
        restaurantMenu.removeItem(spaghetti);

        //Setting cheescake to be an old item on the menu
        Date testDate = new Date();
        testDate.setYear(100);
        cheesecake.setDateAdded(testDate);


        System.out.println(spaghetti.toString());
        System.out.println(restaurantMenu.toString());
    }
}
