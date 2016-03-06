package catan;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.InputStream;
import java.io.OutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.Timer;

public class GameClientController {

	public final static int WIDTH = 500;
	public final static int HEIGHT = 400;
	public static void main(String[] args) {
		Player player1 = new Player(1);
		Player player2 = new Player(2);
		
		Timer timer = new Timer(1000, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println();
				
			}
		});
		JFrame board = new JFrame();
		JButton jbtn = new JButton("Start Game");
		jbtn.setSize(new Dimension(50, 50));
		jbtn.setLocation(250, 200);
		jbtn.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				timer.start();
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		board.setSize(WIDTH, HEIGHT);
		
		board.add(jbtn);
		
		board.show();
		//game tiles
		HexagonTile tile1 = new HexagonTile();
		HexagonTile tile2 = new HexagonTile();
		HexagonTile tile3 = new HexagonTile();
		
		//set tile traits
		tile1.setResourceType(Resource.WHEAT);
		tile1.setRollNumber(5);
		
		tile2.setResourceType(Resource.ORE);
		tile2.setRollNumber(8);
		
		tile3.setResourceType(Resource.LUMBER);
		tile3.setRollNumber(12);
		
		System.out.println(tile1.toString());
		System.out.println(tile2.toString());
		System.out.println(tile3.toString());
		
		player1.addNearbyTile(tile1);
		player1.addNearbyTile(tile2);
		player1.addNearbyTile(tile3);
		player1.drawCard(5);
		
	}
}
