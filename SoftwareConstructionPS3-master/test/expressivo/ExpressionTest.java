/* Copyright (c) 2015-2016 MIT 6.005 course staff, all rights reserved.
 * Redistribution of original or derived work requires permission of course staff.
 */
package expressivo;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Tests for the Expression abstract data type.
 */
public class ExpressionTest {

    // Testing strategy
    //   TODO
    
    @Test(expected=AssertionError.class)
    public void testAssertionsEnabled() {
        assert false; // make sure assertions are enabled with VM argument: -ea
    }
    
    @Test
    public void testToString() {
        Expression node1 = new Value(2);
        Expression node2 = new Value(3);
        Expression node3 = new Addition(node1, node2);
        Expression node4 = new Variable("a");
        Expression node5= new Multiplication(node3,node4);
        assertEquals("2.0+3.0xa",node5.toString());
    }
    
    @Test
    public void testEquals() {
    	Expression node1 = new Value(2);
        Expression node2 = new Value(3);
        Expression node3 = new Addition(node1, node2);
        Expression node4 = new Variable("a");
        Expression node5= new Multiplication(node3,node4);
        
        Expression node6 = new Value(2);
        Expression node7= new Value(3);
        Expression node8 = new Addition(node6, node7);
        Expression node9 = new Variable("a");
        Expression node10= new Multiplication(node8,node9);

        assertEquals(true,node10.toString().equals(node5.toString()));
    }
    
    @Test
    public void testUnEquals() {
    	Expression node11 = new Value(2);
        Expression node12 = new Value(3);
        Expression node13 = new Addition(node11, node12);
        Expression node14 = new Variable("a");
        Expression node15= new Multiplication(node13,node14);
        
        Expression node21 = new Value(2);
        Expression node22 = new Value(3);
        Expression node23 = new Addition(node21, node22);
        Expression node24 = new Variable("a");
        Expression node25= new Multiplication(node23,node24);
        
        assertEquals(false,node15.equals(node23));
    }
    
    
    
    
    // TODO tests for Expression
    
}
