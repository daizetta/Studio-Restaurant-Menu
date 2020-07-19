package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> items;
    private Date lastUpdated;

    public static Date getTime() {
        return new Date();
    }

    public Date getlastUpdated() {
        return lastUpdated;
    }

    public Menu(ArrayList<MenuItem> aItems) {
        items = aItems;
        lastUpdated = new Date();
    }

    public Menu() {
        items = new ArrayList<MenuItem>();
        lastUpdated = new Date();
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public ArrayList<MenuItem> getMenus() {
        return items;
    }

    public void setMenus(ArrayList<MenuItem> aItems) {
        items = aItems;
    }

    public void addMenuItem(MenuItem aMenuItem) {
        items.add(aMenuItem);
        setLastUpdated(new Date());
    }

    @Override
    public String toString() {
        return "Menu{" +
                "items=" + items +
                ", lastUpdated=" + lastUpdated +
                '}';
    }

    public void removeMenuItem(String name) {
        ArrayList<MenuItem> tempMenu = new ArrayList<MenuItem>(this.items);

        if (items.size() > 0){
            for (MenuItem item: tempMenu){
                if(item.getName().toLowerCase().equals(name.toLowerCase())){
                    items.remove(item);
                    setLastUpdated(new Date());
                }
            }
        }
    }

}