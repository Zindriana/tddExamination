package org.example.db;

import org.example.models.Item;

public class ItemDB {
        Item[] items = new Item[10];

    public ItemDB() {

        items[0] = new Item("Die");
        items[1] = new Item("Candle");
        items[2] = new Item("Key");
    }

    public Item getItem(String itemName) {
        for(Item item : items){
            if(item != null && item.getName().equals(itemName)){
                return item;
            }
        }
        return null;
    }
}
