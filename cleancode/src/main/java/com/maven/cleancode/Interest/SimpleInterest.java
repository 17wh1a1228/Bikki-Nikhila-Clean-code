package com.maven.cleancode;


public class SimpleInterest 
{
    public double simpleInterest(double principle, double interestrate, double timeperiod)
    {
        double simpleinterest = (principle*interestrate*timeperiod)/100;
        return simpleinterest;
    }
}
