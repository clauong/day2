/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.groundgurus.day2;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ongsa
 */
public class WineShopTest {
    
    public WineShopTest() {
    }
    
    @Test
    public void testSomeMethod(){
        WineShop wineShop = new WineShop("Clau's Wine Shop", 
                new String[]{"red wine", "white wine"},
                "123 Street, Mandaluyong City", 5,false);
        assertEquals(false, wineShop.isareMinorsAllowed());
    }
}
