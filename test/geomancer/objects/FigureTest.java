package geomancer.objects;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Akenu
 */
public class FigureTest {
    
    public FigureTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of combine method, of class Figure.
     */
    @Test
    public void testCombine() {
        System.out.println("combine");
        Figure figure = new Figure(2, 2, 2, 2);
        Figure instance = new Figure(1, 2, 2, 2);
        Figure expResult = new Figure(1, 2, 2, 2);
        Figure result = instance.combine(figure);
        assertTrue(expResult.equals(result));
    }

    /**
     * Test of getHead method, of class Figure.
     */
    @Test
    public void testGetHead() {
        System.out.println("getHead");
        Figure instance = null;
        int expResult = 0;
        int result = instance.getHead();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHead method, of class Figure.
     */
    @Test
    public void testSetHead() {
        System.out.println("setHead");
        int head = 0;
        Figure instance = null;
        instance.setHead(head);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNeck method, of class Figure.
     */
    @Test
    public void testGetNeck() {
        System.out.println("getNeck");
        Figure instance = null;
        int expResult = 0;
        int result = instance.getNeck();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNeck method, of class Figure.
     */
    @Test
    public void testSetNeck() {
        System.out.println("setNeck");
        int neck = 0;
        Figure instance = null;
        instance.setNeck(neck);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBody method, of class Figure.
     */
    @Test
    public void testGetBody() {
        System.out.println("getBody");
        Figure instance = null;
        int expResult = 0;
        int result = instance.getBody();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBody method, of class Figure.
     */
    @Test
    public void testSetBody() {
        System.out.println("setBody");
        int body = 0;
        Figure instance = null;
        instance.setBody(body);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFeet method, of class Figure.
     */
    @Test
    public void testGetFeet() {
        System.out.println("getFeet");
        Figure instance = null;
        int expResult = 0;
        int result = instance.getFeet();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFeet method, of class Figure.
     */
    @Test
    public void testSetFeet() {
        System.out.println("setFeet");
        int feet = 0;
        Figure instance = null;
        instance.setFeet(feet);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Figure.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Figure instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
