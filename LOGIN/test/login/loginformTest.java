/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hp
 */
public class loginformTest {
    
    public loginformTest() {
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
     * Test of main method, of class loginform.
     */
    
        @Test
    public void testCheck_Login() {
        System.out.println("Check_Login");
        String username = "hhasan";
        String password = "hh2020";
        loginform instance = new loginform();
        boolean expResult = true;
        boolean result = instance.Check_Login(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testCheck_Login1() {
        System.out.println("Check_Login1");
        String username = "aharb";
        String password = "ah2020";
        loginform instance = new loginform();
        boolean expResult = true;
        boolean result = instance.Check_Login(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        loginform.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Check_Login method, of class loginform.
     */
    
}
