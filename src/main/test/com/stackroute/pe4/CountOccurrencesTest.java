package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountOccurrencesTest
{ private static CountOccurrences sortlist;
    @Before
    public void setup(){
        sortlist=new CountOccurrences();
    }
    @After
    public void tearDown(){
        sortlist=null;
    }
    @Test
    public void countCharTest_ExistingStringGiven_ShouldReturnIntegerCount()
    {
        //arrange
        String str = "java is a programming language...";
        assertEquals(6, sortlist.sortlists(str)); //act and assert
    }
}