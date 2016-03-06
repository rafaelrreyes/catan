package catan;

import catan.CatanPackets.PacketsBasic;

import com.esotericsoftware.kryonet.Connection;
import com.esotericsoftware.kryonet.Listener;

public class ServerNetworkListener extends Listener {

	public ServerNetworkListener() {
		
	}
	
	public void connected(Connection connection) {
		String currentClient = "";
		System.out.println("A client has connected.");
	}
	
	public void Disconnected(Connection connection) {
		String currentClient = "";
		System.out.println("A client has disconnected");
	}
	
	public void received(Connection connection, Object obj) {
		
		if(obj instanceof PacketsBasic) {
			PacketsBasic basicPacket = (PacketsBasic)obj;
			System.out.println("[CLIENT] >> " + basicPacket.message);
		}
	}
}
