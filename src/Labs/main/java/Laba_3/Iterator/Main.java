package Laba_3.Iterator;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        TreasureChest chest = new TreasureChest();
        ArrayList<Item> allItems = chest.getItems();
        System.out.println(allItems);
    }
}