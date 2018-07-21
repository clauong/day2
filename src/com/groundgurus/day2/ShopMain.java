package com.groundgurus.day2;

/**
 *
 * @author ongsa
 */
public class ShopMain {

    public static void main(String[] args) {
        /*Shop flowerShop = new Shop("JC's Flower Shop", new String[]{"rose, tulip"}, "789, 3rd Street, Antipolo", 5);
        flowerShop.printDetails();*/
        
        Shop wineShop = new WineShop("Clau's Wine Shop", 
                new String[]{"red wine", "white wine"},
                "123 Street, Mandaluyong City", 5,false);
        wineShop.printDetails();
    }
}
