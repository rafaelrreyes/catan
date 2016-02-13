package catan;

import java.util.ArrayList;
import java.util.List;

import catan.HexagonTile;

public class Player {

	private int numOfResourceCards;
	private int numOfDevelopmentCards;
	private int numOfPoints;
	private ArrayList<HexagonTile> nearbyTiles;
	private int playerNumber;
	private int numOfNearbyTiles = 0;
	
	//starting player constructor
	public Player() {
		
	}
	
	public Player(int playerNum) {
		this.playerNumber = playerNum;
		this.numOfNearbyTiles = 0;
		this.nearbyTiles = new ArrayList<HexagonTile>();
	}
	
	public void drawCard(int diceRoll) {
		for (HexagonTile hexagonTile : nearbyTiles) {
			if(hexagonTile.contains(diceRoll)) {
				this.numOfResourceCards++;
				System.out.println("Player #" + getPlayerNumber() + " draws a resource.");
			}
		}
	}

	public void addNearbyTile(HexagonTile tile) {
		try {
			nearbyTiles.add(numOfNearbyTiles, tile);
			numOfNearbyTiles++;
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}
	public int getPlayerNumber() {
		return playerNumber;
	}

	public void setPlayerNumber(int playerNumber) {
		this.playerNumber = playerNumber;
	}

	public List<HexagonTile> getNearbyTiles() {
		return nearbyTiles;
	}

	public void setNearbyTiles(ArrayList<HexagonTile> nearbyTiles) {
		this.nearbyTiles = nearbyTiles;
	}
}
