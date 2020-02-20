package com.maven.cleancode;
import static org.junit.Assert.*;

import org.junit.Test;

import com.maven.cleancode.CompoundInterest;

public class CompoundInterestTest {
	
	@Test
    public void testSimple() {
		CompoundInterest c = new CompoundInterest();
		assertEquals(5025.05, c.compoundInterest(5000.00, 0.05, 10.00), 0.1);
	}

}
