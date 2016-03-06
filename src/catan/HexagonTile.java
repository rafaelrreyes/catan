package catan;

import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil.ToStringAdapter;

import catan.Resource;
public class HexagonTile {

	private int rollNumber;
	private String resourceType;
	
	//main constructor for a hexagon tile, usually created at the beginning of game
	public HexagonTile() {
		this.resourceType = null;
		this.rollNumber = 0;
	}
	
	//sets the resource type located on this tile
	public void setResourceType(String resource) {
		this.resourceType = resource;
	}
	
	//sets the roll number located on this tile
	public void setRollNumber(int num) {
		this.rollNumber = num;
	}
	
	//checks if the current tile contains the number rolled by current player
	public boolean contains(int diceRoll) {
		if(this.getRollNumber() == diceRoll) {
			return true;
		} else {
			return false;
		}
		
	}
	
	//gets the resource type located on this tile
	public String getResourceType() {
		return this.resourceType;
	}
	
	//gets the roll number located on this tile
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
