package javaLab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class aTest18 extends Task18 {
    @Test
    void test(){
        assertTrue(checkBracket("(a)(b) c (d(efg))"));
        assertFalse(checkBracket("(a(b)c)d))"));
        assertTrue(checkBracket("()()()"));
        assertTrue(checkBracket("()(())"));
        assertFalse(checkBracket(")("));
        assertFalse(checkBracket("((())"));
        assertFalse(checkBracket("(()))"));
        assertFalse(checkBracket("( () )) (( () )"));
        assertTrue(checkBracket(" "));
    }
}
