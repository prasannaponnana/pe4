package com.stackroute.pe4;


import org.junit.Test;
import static org.junit.Assert.*;



public class ReplaceTest {
    Replace obj = new Replace();

    @Test
public void maintest()
    {
        String str="daily dry";
        String expected="faity fry";
        assertEquals("faity fry", obj.replace(str));
    }
}