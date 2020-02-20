package com.maven.cleancode;

public class ConstructionCost {
	public double constructionCost(String material, double area) {
		Cost c;
		if(material.equalsIgnoreCase("standard"))
		{
			c=new StandardMaterials();
		}
		else if(material.equalsIgnoreCase("above standard"))
		{
			c=new AboveStandardMaterials();
		}
		else if(material.equalsIgnoreCase("high standard"))
		{
			c=new HighStandardMaterial();
		}
		else
		{
			c=new FullyAutomatedHome();
		}
		double totalcost=c.cost();
		return (totalcost*area);

	}
}
