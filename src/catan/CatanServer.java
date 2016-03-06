package catan;

import java.io.IOException;

import catan.CatanPackets.PacketsBasic;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryonet.Server;

public class CatanServer {

	//Connection Information
	String ipAddress = "localhost";
	int serverPort = 0502;
	
	static Server server;
	static ServerNetworkListener serverNetworkListener;
	
	public CatanServer()  {
		
		server = new Server();
		serverNetworkListener = new ServerNetworkListener();
		
		//Add server network listener to current server
		server.addListener(serverNetworkListener);
		
		try {
			server.bind(serverPort);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		//Register Catan packets to Kryo server
		registerPackets();
		
		//Start the server object
		server.start();
	}
	
	//Listens for incoming traffic
	private void registerPackets() {
		Kryo kryo = server.getKryo();
		kryo.register(CatanPackets.PacketsBasic.class);
	}
	
	public static void main(String[] args) {
		
		//Create Catan Server
		new CatanServer();

		
	}

}
