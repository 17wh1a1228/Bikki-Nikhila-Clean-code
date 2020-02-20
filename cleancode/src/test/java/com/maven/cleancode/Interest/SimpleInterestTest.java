package com.maven.cleancode;

import static org.junit.Assert.*;

import org.junit.Test;

import com.maven.cleancode.SimpleInterest;

public class SimpleInterestTest {
    
	@Test
    public void test() {
		SimpleInterest s = new SimpleInterest();
		assertEquals(100.00, s.simpleInterest(100.00, 10.00, 10.00), 0.1);
	}
    
}
