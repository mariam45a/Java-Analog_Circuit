/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package coe318.lab7;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author maria
 */
public class UnitTest {
    
    public UnitTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    
    @Test
    public void testCircuitConstructor()
    {
        Circuit circuit=new Circuit("v", 1, 0, 0.25);
        
        assertEquals("V", circuit.type_);
        assertEquals("DC", circuit.volt_type);
        assertEquals(1, circuit.n1);
        assertEquals(0, circuit.n2);
        assertEquals(0.25, circuit.value);
    }
    
    @Test
    public void testCircuitToString()
    {
        Circuit circuit=new Circuit("r", 1, 0, 30);
        
        assertEquals("R"+circuit.comp_id+" "+circuit.n1+" "+circuit.n2+" "+circuit.volt_type+" "+circuit.value, circuit.toString());
    }
    

}
