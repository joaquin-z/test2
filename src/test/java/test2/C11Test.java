package test2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C11Test {

private C11 c11;
    
    @Before
    public void before() {
        c11 = new C11();
    }
    
    @Test
    public void m1() {
        assertEquals("m1", c11.m1());
    }
    
    @Test
    public void m2() {
        assertEquals("m2", c11.m2());
    }

}
