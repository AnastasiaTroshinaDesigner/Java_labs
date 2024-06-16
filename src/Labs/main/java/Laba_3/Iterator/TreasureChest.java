package Laba_3.Iterator;

import java.util.ArrayList;

class TreasureChest {

    private final ArrayList<Item> items;

    public TreasureChest() {
        ArrayList<Item> tempList = new ArrayList<>();
        tempList.add(new Item(ItemType.POTION, "Potion of courage"));
        tempList.add(new Item(ItemType.RING, "Ring of shadows"));
        tempList.add(new Item(ItemType.POTION, "Potion of wisdom"));
        tempList.add(new Item(ItemType.POTION, "Potion of blood"));
        tempList.add(new Item(ItemType.WEAPON, "Sword of silver +1"));
        tempList.add(new Item(ItemType.POTION, "Potion of rust"));
        tempList.add(new Item(ItemType.POTION, "Potion of healing"));
        tempList.add(new Item(ItemType.RING, "Ring of armor"));
        tempList.add(new Item(ItemType.WEAPON, "Steel halberd"));
        tempList.add(new Item(ItemType.WEAPON, "Dagger of poison"));

        items = tempList;
    }

    public ArrayList<Item> getItems() {
        return new ArrayList<>(items);
    }
}

