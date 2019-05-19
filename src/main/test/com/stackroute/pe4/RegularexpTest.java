package com.stackroute.pe4;
import org.junit.AfterClass;
        import org.junit.BeforeClass;
        import org.junit.Test;
        import static org.junit.Assert.assertEquals;

public class RegularexpTest
{
    public static Regularexp expression;

    @BeforeClass
    public static void setup()
    {
        expression = new Regularexp();
    }

    @AfterClass
    public static void teardown()
    {
        expression = null;
    }

    @Test
    public void countCharTestTrue_ExistingStringGiven_ShouldReturnIntegerCount()
    {
        String str = "This is Harry";
        String name = "Harry";
        assertEquals(true, expression.regularexpression(str, name));
    }

    @Test
    public void countCharTestFalse_ExistingStringGiven_ShouldReturnIntegerCount()
    {
        //arrange
        String str = "This is Henry";
        String name = "Harry";
        //act and assert
        assertEquals(false, expression.regularexpression(str, name));
    }
}