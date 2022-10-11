package arrayTesting;

import org.example.Arrays.ArrayMethods;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayTesting {

    @Test
    public void findIndexTest()
    {
        ArrayMethods obj=new ArrayMethods();

        int result=obj.findIndex(new int[]{1,2,3,4,5,6,7},4);

        assertEquals(3,result);


    }

    @Test
    public void searchNumberTest(){
        ArrayMethods obj=new ArrayMethods();
        boolean result=obj.searchNumber(new int[]{1,2,3,4},4);
        System.out.println(result);
        assertEquals(true,result);
        assertTrue(result);//only checking for the true condition not checking with the expected value
        String str=null;
        assertNull(str);//checks for your null values
        assertEquals(null,str);
        String str1="js";
        assertNotNull(str1);

        fail("unfinished Method");//jaan bujkar taaki hmme pta challe ki task complete nhi hua



    }


    @Test
    public void findIndexEmpty()
    {
        ArrayMethods obj=new ArrayMethods();
        assertEquals(-1,obj.findIndex(new int[]{},2));
    }

    //Test Asserts
    @Test
    public void testAsserts()
    {
        boolean result=true;
        assertEquals(true,result);
        assertTrue(result);
    }

    @Test
    public void findIndexOutOfBound()
    {
        ArrayMethods obj=new ArrayMethods();
        assertThrows(ArrayIndexOutOfBoundsException.class,()->obj.printArrays(new int[]{1,2},4));
    }

    @Test
    public void multipleFindIndex()
    {
        ArrayMethods obj=new ArrayMethods();
        assertAll(
                ()->assertEquals(1,obj.findIndex(new int[]{1,2},2)),
                ()->assertEquals(1,obj.findIndex(new int[]{1},2))

                );
    }
//hi
}
