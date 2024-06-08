package com.juaraCoding;

import com.Testing.JavaTestNG.ATM;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ATMTest {
    private ATM atm;

    @BeforeMethod
    public void setUp(){
        atm = new ATM(1000.0);
    }

    @Test
    public void testLihatSaldo(){
        Assert.assertEquals(atm.lihatSaldo(), 1000.0);
    }

    @Test
    public void testSetorUang(){
        atm.setorUang(500.0);
        Assert.assertEquals(atm.lihatSaldo(), 1500.0);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testSetorUangNegatif(){
        atm.setorUang(-100.0);
    }

    @Test
    public void testTarikUang(){
        atm.tarikUang(300.0);
        Assert.assertEquals(atm.lihatSaldo(), 700.0);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testTarikUangLebihDariSaldo(){
        atm.tarikUang(1500.0);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testTarikUangNegatif(){
        atm.tarikUang(-100.0);
    }
}
