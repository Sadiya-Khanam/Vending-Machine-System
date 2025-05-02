import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<String, Item> items;
    private Map<String, Integer> stock;

    public Inventory() {
        items=new HashMap<>();
        stock=new HashMap<>();
    }

    public void addItem(Item item, int quantity){
        items.put(item.getName(), item);
        stock.put(item.getName(), quantity);
    }

    public Item getItem(String name){
        return items.get(name);
    }

    public boolean isItemAvailable(String name) {
        return stock.containsKey(name) && stock.get(name) > 0;
    }

    public void reduceStock(String name){
        if(stock.containsKey(name)){
            stock.put(name, stock.get(name) -1 );
        }
    }
    
}
