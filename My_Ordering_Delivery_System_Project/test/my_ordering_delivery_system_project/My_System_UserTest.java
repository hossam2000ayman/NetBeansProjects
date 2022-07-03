/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_ordering_delivery_system_project;

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
public class My_System_UserTest {
    
    public My_System_UserTest() {
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
     * Test of color_complete_inputs method, of class My_System_User.
     */
    @Test
    public void testColor_complete_inputs() {
        System.out.println("color_complete_inputs");
        My_System_User instance = new My_System_User();
        instance.color_complete_inputs();
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of main method, of class My_System_User.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        My_System_User.main(args);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of Check_Login method, of class My_System_User.
     */
    @Test
    public void testCheck_Login() {
        System.out.println("Check_Login");
        String national_id = "12345678909876";
        String password = "12345";
        String national_id2 ="12345678909876";
        My_System_User instance = new My_System_User();
        boolean expResult = true; //as the flag
        boolean result = instance.Check_Login(national_id, password, national_id2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    @Test
    public void testCheck_Login1() {
        System.out.println("Check_Login");
        String national_id = "24680864224680";
        String password = "24680";
        String national_id2 ="24680864224680";
        My_System_User instance = new My_System_User();
        boolean expResult = true; //as the flag
        boolean result = instance.Check_Login(national_id, password, national_id2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    @Test
    public void testCheck_Login2() {
        System.out.println("Check_Login");
       String national_id = "09876543212345";
        String password = "54321";
        String national_id2 ="09876543212345";
        My_System_User instance = new My_System_User();
        boolean expResult = true; //as the flag
        boolean result = instance.Check_Login(national_id, password, national_id2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
