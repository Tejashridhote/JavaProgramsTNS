package com.tns.dayseven.overriding;
//subclass
public class SBI extends RBI{
	@Override
	public float getRateOfIneterst()
	{
		return 7.0f;
	}
	
	public SBI getObject()
	{
		return this;
	}

}
