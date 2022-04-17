package GenericList;

import org.testng.annotations.*;
import static org.testng.Assert.*;


/**
 * @author Luana Andrade
 */

class GenericArrayListTest {
    //Declaring an array which will hold objects
    private GenericArrayList<String> arrStrList;
    private GenericArrayList<Integer> arrListInt;

    @BeforeSuite
    void base() {
        arrListInt = new GenericArrayList<>();
        arrStrList = new GenericArrayList<>();

    }

    @Test
    void contains() {
        arrStrList.add("test7");
        assertTrue(arrStrList.contains("test7"));
        assertFalse(arrStrList.contains("test8"));
    }

    @Test
    void rotate() {
        int i = 1;
        while (i <= 15){
            arrListInt.add(i);
            i++;
        }
        arrListInt.rotate2(1);
        assertEquals("15,1,2,3,4,5,6,7,8,9,10,11,12,13,14,", arrListInt.toString());
    }


}