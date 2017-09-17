package test2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C21Test {
    
    private C21 c21;
    
    @Before
    public void before() {
        c21 = new C21();
    }
    
    @Test
    public void m1() {
        assertEquals("m1", c21.m1());
    }
    
    @Test
    public void m2() {
        assertEquals("m2", c21.m2());
    }
    
    @Test
    public void m3() {
        assertEquals("m3", c21.m3());
    }
    
}
