package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void multipleSetsOfBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][][][][]"));
    }

    @Test
    public void multipleBracketsWithOtherCharsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[{dkdjaflk}], kasldfj [ adkslfj ]"));
    }

    @Test
    public void correctlyNestedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[[]]]]"));
    }

    @Test
    public void mismatchedBracketSetsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void allRightBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[[["));
    }

    @Test
    public void allLeftBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]]]]"));
    }

    @Test
    public void mismatchedNestedBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[[[[[[]]]]]]]"));
    }

}