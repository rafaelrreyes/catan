package catan;

import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil.ToStringAdapter;

import catan.Resource;
public class HexagonTile {

	private int rollNumber;
	private String resourceType;
	
	public HexagonTile() {
		this.resourceType = null;
		this.rollNumber = 0;
	}
	
	public void setResourceType(String resource) {
		this.resourceType = resource;
	}
	
	public void setRollNumber(int num) {
		this.rollNumber = num;
	}
	
	public boolean contains(int diceRoll) {
		if(this.getRollNumber() == diceRoll) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public String getResourceType() {
		return this.resourceType;
	}
	
	public int getRollNumber() {
		return this.rollNumber;
	}
	
	@Override
	public String toString() {
		String str;
		str = "Resource: " + this.getResourceType() + " | Roll number: " + getRollNumber(); 
		return str;
	}
}
