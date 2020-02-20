package com.maven.cleancode;

import static org.junit.Assert.*;

import org.junit.Test;

import com.maven.cleancode.ConstructionCost;

public class ConstructionCostTest {

	@Test
    public void test() {
		ConstructionCost c = new ConstructionCost();
		assertEquals(12000.00,c.constructionCost("standard",10.00),0.1);
		assertEquals(22500.00,c.constructionCost("above standard",15.00),0.1);
		assertEquals(36000.00,c.constructionCost("high standard",20.00),0.1);
		assertEquals(62500.00,c.constructionCost("AutomatedHome",25.00),0.1);	}
    
}

