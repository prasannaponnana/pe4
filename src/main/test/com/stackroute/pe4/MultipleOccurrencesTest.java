package com.stackroute.pe4;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class MultipleOccurrencesTest
{
    public static MultipleOccurrences multipleO;
        @BeforeClass
        public static void setup()
        {
            multipleO = new MultipleOccurrences();
        }

        @AfterClass
        public static void tearDown()
        {
            multipleO = null;
        }

        @Test
        public void multiOccur_ExistingStringGiven_ShouldReturnPositionCount()
        {
            String str = "she sells seashells by the seashore" ;
            String p="se";
            String expected[]={"found_at:4-6","found_at:10-12","found_at:27-29"};
            assertEquals(expected, multipleO.multiple(str,p));
        }


    }








