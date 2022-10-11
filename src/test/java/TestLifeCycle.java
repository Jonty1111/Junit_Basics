import org.example.Arrays.ArrayMethods;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.fail;

public class TestLifeCycle {
    private ArrayMethods obj;
    @Test
    public void findIndexTest()
    {


        int result=obj.findIndex(new int[]{1,2,3,4,5,6,7},4);

        assertEquals(3,result);


    }

    @Test
    public void searchNumberTest(){

        boolean result=obj.searchNumber(new int[]{1,2,3,4},4);
        System.out.println(result);
        assertEquals(true,result);

    }

    @BeforeEach
    public void beforeEachTest()
    {
        System.out.println("2.First Initialized method before test");
        obj=new ArrayMethods();
    }

    @AfterEach
    public void afterEachTest()
    {
        System.out.println("3.Cleaning up test");
    }

    @BeforeAll
    public static void beforeAllTest()
    {
        System.out.println("1.Before Running all the test");
    }

    @AfterAll
    public static void afterAllTest()
    {
        System.out.println("4.After Running all The tests");
    }


}
