package com.maven.cleancode;

public class CompoundInterest {
	public double compoundInterest(double principle, double interestrate, double timeperiod) {
		double compoundinterest = principle*(Math.pow(1+(interestrate/100), timeperiod));
		return compoundinterest;
	}
}
