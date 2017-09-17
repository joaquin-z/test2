package test2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C51Test {

private C51 c51;
    
    @Before
    public void before() {
        c51 = new C51();
    }
    
    @Test
    public void m1() {
        assertEquals("m1", c51.m1());
    }
    
    @Test
    public void m2() {
        assertEquals("m2", c51.m2());
    }

}
