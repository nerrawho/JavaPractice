package com.example.activities.six.test;

import com.example.activities.six.model.Premium;
import com.example.activities.six.model.PremiumCustomer;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CustomerTest{


    @Test
    public void discountPriceTestPositive() {
        PremiumCustomer vip = new PremiumCustomer("Steve", 5000.0, "PS5 XBOX", 100.0, 1337, 20);
        assertEquals(85, 85, vip.discountPrice(100));
    }

    @Test
    public void discountPriceTestNegative() {
        PremiumCustomer vip = new PremiumCustomer("Steve", 5000.0, "PS5 XBOX", 100.0, 1337, 20);
        assertNotEquals(85.0, vip.discountPrice(90.0));
    }

    @Test
    public void addToCartMethodTestPositive() {
        PremiumCustomer vip = new PremiumCustomer();
        vip.addToCart("milk", 11.0);
        assertEquals(vip.getCart(), "milk");
        assertEquals(11.0, 11.0, vip.getCartCost());
    }

    @Test
    public void addToCartMethodTestNegative() {
        PremiumCustomer vip = new PremiumCustomer();
        vip.addToCart("milk", 11.0);
        assertNotEquals("CHEESE", vip.getCart());
        assertNotEquals(0.0, vip.getCartCost());
    }

    @Test
    public void buyMethodTestNegativePositive() {
        PremiumCustomer vip = new PremiumCustomer();
        vip.setCart("sussy baka");
        vip.setBalance(9999.0);
        assertEquals(vip.getCart(), "sussy baka");
        assertNotEquals("amogus", vip.getCart());
        assertEquals(9999.0, 9999.0, vip.getBalance());
        assertNotEquals(1111.0, vip.getBalance());

        vip.buy();
        assertEquals(vip.getCart(), "");
        assertNotEquals("sussy baka", vip.getCart());
        assertEquals(0.0, 0.0, vip.getBalance());
        assertNotEquals(9999.0, vip.getBalance());
    }


}
