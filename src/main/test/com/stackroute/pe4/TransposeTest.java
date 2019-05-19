package com.stackroute.pe4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TransposeTest {
    Transpose obj = new Transpose();
    @Test
    public void transpose()
    {
        String s="a quick brown fox jumps over the lazy dog";
        String res=obj.transposesort(s);
        String res1="a kciuq nworb xof spmuj revo eht yzal god";
        assertEquals("a kciuq nworb xof spmuj revo eht yzal god" , obj.transposesort(s));
    }
}
