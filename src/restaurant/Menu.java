package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> menuItems = new ArrayList<>();

    public void addItem(MenuItem item){
        if (!menuItems.contains(item)) {
            menuItems.add(item);
            this.lastUpdated = new Date();
        } else System.out.println(item +  "already on the Menu.");
    }
    public void removeItem(MenuItem item){
        menuItems.remove(item);
    }

    @Override
    public String toString() {
        String retString = "The menu was last updated on " + this.lastUpdated + "\n";
        for(MenuItem item : menuItems){
            retString = retString + item.toString() + "\n";
        }
        return retString;
    }
}
