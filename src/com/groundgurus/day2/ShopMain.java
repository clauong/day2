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
        System.out.println("***** break line *****");
        
        Shop cakeShop = new Shop();
        cakeShop.name = "Din's Cake Shop";
        cakeShop.setItems(new String[]{"choco", "strawberry", "ube"});
        cakeShop.setAddress("456XYZ, 2nd Street, Makati");
        cakeShop.setNoOfEmployees(-10);
        cakeShop.printDetails();
    }
}
