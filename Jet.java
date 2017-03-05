import javax.swing.*;
import java.awt.Graphics;
import java.util.*;
import java.awt.Color;


public class Jet extends JPanel{
	public static Scanner scan = new Scanner(System.in);
	JFrame w;
	public ArrayList<Player> players = new ArrayList<Player>();
	static int playerAmount;


	public Jet(int playerAmt){
		w = new JFrame();
		w.setSize(800,600);
		addPlayers(playerAmt);
		w.setContentPane(this);
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		w.setVisible(true);
	}

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		int pos = 200;
		for(Player j : players){
			g.setColor(j.c);
			pos += 50;
			g.fillRect(pos, 300, 20, 20);
		}
	}

	class Player{
		Color c;
		public Player(){

		}
	}

	class Player1 extends Player{
		public Player1(){
			super.c = Color.GREEN;
		}
	}
	class Player2 extends Player{
		public Player2(){
			super.c = Color.RED;
		}
	}
	class Player3 extends Player{
		public Player3(){
			super.c = Color.BLUE;
		}
	}
	class Player4 extends Player{
		public Player4(){
			super.c = Color.YELLOW;
		}
	}



	public void addPlayers(int amount){
		switch(amount){
			case 1:
			players.add(new Player1());
			break;
			case 2:
			players.add(new Player1());
			players.add(new Player2());
			break;
			case 3:
			players.add(new Player1());
			players.add(new Player2());
			players.add(new Player3());
			break;
			case 4:
			players.add(new Player1());
			players.add(new Player2());
			players.add(new Player3());
			players.add(new Player4());
			break;
		}
	}


	public static void main(String[] args){
		System.out.println("How many players?");
		playerAmount = scan.nextInt();
		new Jet(playerAmount);
	}

}
