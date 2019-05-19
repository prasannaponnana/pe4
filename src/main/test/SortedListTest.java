import com.stackroute.pe4.SortedList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class SortedListTest
{
    private static SortedList sortString;
    @Before
    public void setup(){
        sortString=new SortedList();
    }
    @After
    public void tearDown(){
        sortString=null;
    }
    @Test
    public void sort(){
        String[] string={"prasanna","hi","hello"};
         String[] res=sortString.sortCheck(string);
         String[] expected={"hello","hi","prasanna"};
         assertEquals(expected,res);
    }
}
