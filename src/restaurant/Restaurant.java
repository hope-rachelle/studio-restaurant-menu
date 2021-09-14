package restaurant;

public class Restaurant {
    public static void main(String[] args) {
        MenuItem spaghetti = new MenuItem("Spaghetti", "Noodles with sauce","Main Course", 10.00);
        Menu restaurantMenu = new Menu();

        restaurantMenu.addItem(spaghetti);

        System.out.println(spaghetti.toString());
        System.out.println(restaurantMenu.toString());
    }
}
